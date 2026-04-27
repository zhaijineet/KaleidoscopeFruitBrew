package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import com.github.ysbbbbbb.kaleidoscopetavern.KaleidoscopeTavern;
import com.github.ysbbbbbb.kaleidoscopetavern.datamap.data.DrinkEffectData;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.Util;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.ToIntFunction;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class DrinkEffectDataProvider implements DataProvider {
    private static final ToIntFunction<String> ORDER_FIELDS = Util.make(new Object2IntOpenHashMap<>(), map -> {
        map.put("item", 0);
        map.defaultReturnValue(1);
    });

    private final Map<String, DrinkEffectData> data = Maps.newLinkedHashMap();
    private final PackOutput output;

    public DrinkEffectDataProvider(PackOutput output) {
        this.output = output;
    }

    /**
     * 生成 5 个等级（Lv3-Lv7）的单效果列表
     */
    private static List<DrinkEffectData.Entry>[] generateSingleLevels(MobEffect effect, int baseDuration, int amplifier, boolean capLv7) {
        @SuppressWarnings("unchecked")
        List<DrinkEffectData.Entry>[] levels = new List[5];
        int dur = baseDuration;
        for (int i = 0; i < 5; i++) {
            if (capLv7 && i == 4) {
                dur = 999999;
            }
            levels[i] = List.of(new DrinkEffectData.Entry(effect, dur, amplifier, 1f));
            if (!(capLv7 && i == 4)) {
                dur *= 2;
            }
        }
        return levels;
    }

    /**
     * 生成 5 个等级（Lv3-Lv7）的双效果列表
     */
    private static List<DrinkEffectData.Entry>[] generateDualLevels(
        MobEffect effect1,
        MobEffect effect2,
        int baseDur1,
        int baseDur2,
        boolean capLv7
    ) {
        @SuppressWarnings("unchecked")
        List<DrinkEffectData.Entry>[] levels = new List[5];
        int dur1 = baseDur1;
        int dur2 = baseDur2;
        for (int i = 0; i < 5; i++) {
            if (capLv7 && i == 4) {
                dur1 = 999999;
                dur2 = 999999;
            }
            levels[i] = List.of(
                new DrinkEffectData.Entry(effect1, dur1, 0, 1f),
                new DrinkEffectData.Entry(effect2, dur2, 0, 1f)
            );
            if (!(capLv7 && i == 4)) {
                dur1 *= 2;
                dur2 *= 2;
            }
        }
        return levels;
    }

    /**
     * 获取fruitsdelight的Effect
     * 不要问我为什么不直接拿静态成员，他们用了registrate，而我不喜欢用
     */
    private static MobEffect getEffect(String namespace, String path) {
        ResourceLocation rl = new ResourceLocation(namespace, path);
        MobEffect effect = ForgeRegistries.MOB_EFFECTS.getValue(rl);
        if (effect == null) {
            throw new IllegalArgumentException("Unknown mob effect: " + rl);
        }
        return effect;
    }

    private static MobEffect getFruitsDelightEffect(String path) {
        return getEffect("fruitsdelight", path);
    }

    /**
     * 单效果，duration 从 baseDuration 开始每级 ×2
     */
    private void addSingle(RegistryObject<Item> item, MobEffect effect, int baseDuration, int amplifier) {
        addSingle(item, effect, baseDuration, amplifier, false);
    }

    /**
     * 单效果，可选 Lv7 封顶为 999999
     */
    private void addSingle(RegistryObject<Item> item, MobEffect effect, int baseDuration, int amplifier, boolean capLv7) {
        var entries = generateSingleLevels(effect, baseDuration, amplifier, capLv7);
        add(item, entries);
    }

    /**
     * 双效果，相同 baseDuration，每级同步 ×2
     */
    private void addDual(RegistryObject<Item> item, MobEffect effect1, MobEffect effect2, int baseDuration) {
        var entries = generateDualLevels(effect1, effect2, baseDuration, baseDuration, false);
        add(item, entries);
    }

    /**
     * 双效果，各自独立的 baseDuration，可选封顶
     */
    private void addDual(RegistryObject<Item> item, MobEffect effect1, int baseDur1, MobEffect effect2, int baseDur2, boolean capLv7) {
        var entries = generateDualLevels(effect1, effect2, baseDur1, baseDur2, capLv7);
        add(item, entries);
    }

    @SafeVarargs
    public final void add(RegistryObject<Item> key, List<DrinkEffectData.Entry>... levelAbove2) {
        var itemKey = ForgeRegistries.ITEMS.getKey(key.get());
        if (itemKey == null) {
            throw new IllegalArgumentException("Item not registered: " + key.getId());
        }
        this.add(itemKey.getPath(), key, levelAbove2);
    }

    @SafeVarargs
    public final void add(String fileName, RegistryObject<Item> key, List<DrinkEffectData.Entry>... levelAbove2) {
        int length = levelAbove2.length;
        if (length == 0) {
            throw new IllegalArgumentException("At least one level above 2 must be provided");
        }
        this.add(fileName, new DrinkEffectData(key.get(), List.of(
            List.of(new DrinkEffectData.Entry(MobEffects.CONFUSION, 35, 0, 1f)),
            List.of(new DrinkEffectData.Entry(MobEffects.CONFUSION, 10, 0, 1f)),
            levelAbove2[0],
            levelAbove2[Math.min(1, length - 1)],
            levelAbove2[Math.min(2, length - 1)],
            levelAbove2[Math.min(3, length - 1)],
            levelAbove2[Math.min(4, length - 1)]
        )));
    }

    public void add(String fileName, DrinkEffectData value) {
        data.put(fileName, value);
    }

    private void addEntry() {
        // 杨梅酒 - fruitsdelight:leaf_piercing, base=20
        addSingle(KFBItem.BAYBERRY_WINE, getFruitsDelightEffect("leaf_piercing"), 20, 0);

        // 蓝莓酒 - fruitsdelight:brightening + night_vision, base=20
        addDual(KFBItem.BLUEBERRY_WINE, getFruitsDelightEffect("brightening"), MobEffects.NIGHT_VISION, 20);

        // 蔓越莓酒 - fruitsdelight:shrinking, base=80, cap
        addSingle(KFBItem.CRANBERRY_WINE, getFruitsDelightEffect("shrinking"), 80, 0, true);

        // 榴莲酒 - alienating(40) + suspicious_smell(80), cap
        addDual(KFBItem.DURIAN_WINE,
            getFruitsDelightEffect("alienating"), 40,
            getFruitsDelightEffect("suspicious_smell"), 80,
            true
        );

        // 无花果酒 - fruitsdelight:digesting, base=80, cap
        addSingle(KFBItem.FIG_WINE, getFruitsDelightEffect("digesting"), 80, 0, true);

        // 发光莓酒 - minecraft:glowing, base=80, cap
        addSingle(KFBItem.GLOWBERRY_WINE, MobEffects.GLOWING, 80, 0, true);

        // 哈密瓜酒 - minecraft:health_boost, base=20
        addSingle(KFBItem.HAMIMELON_WINE, MobEffects.HEALTH_BOOST, 20, 0);

        // 山楂酒 - fruitsdelight:appetizing, base=20
        addSingle(KFBItem.HAWBERRY_WINE, getFruitsDelightEffect("appetizing"), 20, 0);

        // 猕猴桃酒 - fruitsdelight:cycling, base=4
        addSingle(KFBItem.KIWI_WINE, getFruitsDelightEffect("cycling"), 4, 0);

        // 柠檬酒 - minecraft:haste + fruitsdelight:refreshing, base=20
        addDual(KFBItem.LEMON_WINE, MobEffects.DIG_SPEED, getFruitsDelightEffect("refreshing"), 20);

        // 荔枝酒 - minecraft:strength(amp=2), base=10
        addSingle(KFBItem.LYCHEE_WINE, MobEffects.DAMAGE_BOOST, 10, 2);

        // 芒果酒 - minecraft:strength(amp=2) + fruitsdelight:rage_aura, base=20
        add(
            KFBItem.MANGO_WINE,
            List.of(
                new DrinkEffectData.Entry(MobEffects.DAMAGE_BOOST, 20, 2, 1f),
                new DrinkEffectData.Entry(getFruitsDelightEffect("rage_aura"), 20, 0, 1f)
            ),
            List.of(
                new DrinkEffectData.Entry(MobEffects.DAMAGE_BOOST, 40, 2, 1f),
                new DrinkEffectData.Entry(getFruitsDelightEffect("rage_aura"), 40, 0, 1f)
            ),
            List.of(
                new DrinkEffectData.Entry(MobEffects.DAMAGE_BOOST, 80, 2, 1f),
                new DrinkEffectData.Entry(getFruitsDelightEffect("rage_aura"), 80, 0, 1f)
            ),
            List.of(
                new DrinkEffectData.Entry(MobEffects.DAMAGE_BOOST, 160, 2, 1f),
                new DrinkEffectData.Entry(getFruitsDelightEffect("rage_aura"), 160, 0, 1f)
            ),
            List.of(
                new DrinkEffectData.Entry(MobEffects.DAMAGE_BOOST, 320, 2, 1f),
                new DrinkEffectData.Entry(getFruitsDelightEffect("rage_aura"), 320, 0, 1f)
            )
        );

        // 山竹酒 - fruitsdelight:sliding, base=80, cap
        addSingle(KFBItem.MANGOSTEEN_WINE, getFruitsDelightEffect("sliding"), 80, 0, true);

        // 橙子酒 - minecraft:regeneration + fruitsdelight:recovering, base=20
        addDual(KFBItem.ORANGE_WINE, MobEffects.REGENERATION, getFruitsDelightEffect("recovering"), 20);

        // 桃子酒 - fruitsdelight:heal_aura, base=10
        addSingle(KFBItem.PEACH_WINE, getFruitsDelightEffect("heal_aura"), 10, 0);

        // 梨子酒 - fruitsdelight:lozenge, base=20
        addSingle(KFBItem.PEAR_WINE, getFruitsDelightEffect("lozenge"), 20, 0);

        // 柿子酒 - fruitsdelight:astringent, base=80, cap
        addSingle(KFBItem.PERSIMMON_WINE, getFruitsDelightEffect("astringent"), 80, 0, true);

        // 菠萝酒 - minecraft:speed + fruitsdelight:sweetening, base=20
        addDual(KFBItem.PINEAPPLE_WINE, MobEffects.MOVEMENT_SPEED, getFruitsDelightEffect("sweetening"), 20);

        // 龙舌兰 - minecraft:regeneration, base=20
        addSingle(KFBItem.TEQUILA, MobEffects.REGENERATION, 20, 0);

        addSingle(KFBItem.APPLE_CIDER, MobEffects.ABSORPTION, 20, 1);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        addEntry();

        List<CompletableFuture<?>> futures = Lists.newArrayList();
        PackOutput.PathProvider pathProvider = output.createPathProvider(PackOutput.Target.DATA_PACK, "datamap/drink_effect");
        for (Map.Entry<String, DrinkEffectData> entry : data.entrySet()) {
            DrinkEffectData.CODEC
                .encodeStart(JsonOps.INSTANCE, entry.getValue())
                .resultOrPartial(KaleidoscopeTavern.LOGGER::error)
                .ifPresent(json -> {
                    var filePath = pathProvider.json(KaleidoscopeTavern.modLoc(entry.getKey()));
                    var future = this.saveStable(cache, json, filePath);
                    futures.add(future);
                });
        }

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    @Override
    public String getName() {
        return "Kaleidoscope Fruit Brew Drink Effect Data";
    }

    @SuppressWarnings("all")
    private CompletableFuture<?> saveStable(CachedOutput output, JsonElement json, Path path) {
        return CompletableFuture.runAsync(() -> {
            try {
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                HashingOutputStream hashing = new HashingOutputStream(Hashing.sha1(), stream);

                try (JsonWriter writer = new JsonWriter(new OutputStreamWriter(hashing, StandardCharsets.UTF_8))) {
                    writer.setSerializeNulls(false);
                    writer.setIndent("  ");
                    GsonHelper.writeValue(writer, json, Comparator.comparingInt(ORDER_FIELDS));
                }

                output.writeIfNeeded(path, stream.toByteArray(), hashing.hash());
            } catch (IOException ioexception) {
                LOGGER.error("Failed to save file to {}", path, ioexception);
            }
        }, Util.backgroundExecutor());
    }
}
