package net.zhaiji.kaleidoscope_fruit_brew.register;

import com.github.ysbbbbbb.kaleidoscopetavern.item.DrinkBlockItem;
import com.github.ysbbbbbb.kaleidoscopetavern.item.JuiceBucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew.MOD_ID;

public class KFBItem {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    // ==================== 果汁桶（18种） ====================
    public static final RegistryObject<Item> BAYBERRY_BUCKET = ITEM.register(
        "bayberry_bucket",
        () -> new JuiceBucketItem(KFBFluid.BAYBERRY_JUICE)
    );
    public static final RegistryObject<Item> BLUEBERRY_BUCKET = ITEM.register(
        "blueberry_bucket",
        () -> new JuiceBucketItem(KFBFluid.BLUEBERRY_JUICE)
    );
    public static final RegistryObject<Item> CACTUS_BUCKET = ITEM.register(
        "cactus_bucket",
        () -> new JuiceBucketItem(KFBFluid.CACTUS_JUICE)
    );
    public static final RegistryObject<Item> CRANBERRY_BUCKET = ITEM.register(
        "cranberry_bucket",
        () -> new JuiceBucketItem(KFBFluid.CRANBERRY_JUICE)
    );
    public static final RegistryObject<Item> DURIAN_BUCKET = ITEM.register(
        "durian_bucket",
        () -> new JuiceBucketItem(KFBFluid.DURIAN_JUICE)
    );
    public static final RegistryObject<Item> FIG_BUCKET = ITEM.register(
        "fig_bucket",
        () -> new JuiceBucketItem(KFBFluid.FIG_JUICE)
    );
    public static final RegistryObject<Item> HAMIMELON_BUCKET = ITEM.register(
        "hamimelon_bucket",
        () -> new JuiceBucketItem(KFBFluid.HAMIMELON_JUICE)
    );
    public static final RegistryObject<Item> HAWBERRY_BUCKET = ITEM.register(
        "hawberry_bucket",
        () -> new JuiceBucketItem(KFBFluid.HAWBERRY_JUICE)
    );
    public static final RegistryObject<Item> KIWI_BUCKET = ITEM.register(
        "kiwi_bucket",
        () -> new JuiceBucketItem(KFBFluid.KIWI_JUICE)
    );
    public static final RegistryObject<Item> LEMON_BUCKET = ITEM.register(
        "lemon_bucket",
        () -> new JuiceBucketItem(KFBFluid.LEMON_JUICE)
    );
    public static final RegistryObject<Item> LYCHEE_BUCKET = ITEM.register(
        "lychee_bucket",
        () -> new JuiceBucketItem(KFBFluid.LYCHEE_JUICE)
    );
    public static final RegistryObject<Item> MANGO_BUCKET = ITEM.register(
        "mango_bucket",
        () -> new JuiceBucketItem(KFBFluid.MANGO_JUICE)
    );
    public static final RegistryObject<Item> MANGOSTEEN_BUCKET = ITEM.register(
        "mangosteen_bucket",
        () -> new JuiceBucketItem(KFBFluid.MANGOSTEEN_JUICE)
    );
    public static final RegistryObject<Item> ORANGE_BUCKET = ITEM.register(
        "orange_bucket",
        () -> new JuiceBucketItem(KFBFluid.ORANGE_JUICE)
    );
    public static final RegistryObject<Item> PEACH_BUCKET = ITEM.register(
        "peach_bucket",
        () -> new JuiceBucketItem(KFBFluid.PEACH_JUICE)
    );
    public static final RegistryObject<Item> PEAR_BUCKET = ITEM.register(
        "pear_bucket",
        () -> new JuiceBucketItem(KFBFluid.PEAR_JUICE)
    );
    public static final RegistryObject<Item> PERSIMMON_BUCKET = ITEM.register(
        "persimmon_bucket",
        () -> new JuiceBucketItem(KFBFluid.PERSIMMON_JUICE)
    );
    public static final RegistryObject<Item> PINEAPPLE_BUCKET = ITEM.register(
        "pineapple_bucket",
        () -> new JuiceBucketItem(KFBFluid.PINEAPPLE_JUICE)
    );

    // ==================== 果酒物品（18种） ====================
    public static final RegistryObject<Item> BAYBERRY_WINE = ITEM.register(
        "bayberry_wine",
        () -> new DrinkBlockItem(KFBBlock.BAYBERRY_WINE.get())
    );
    public static final RegistryObject<Item> BLUEBERRY_WINE = ITEM.register(
        "blueberry_wine",
        () -> new DrinkBlockItem(KFBBlock.BLUEBERRY_WINE.get())
    );
    public static final RegistryObject<Item> CRANBERRY_WINE = ITEM.register(
        "cranberry_wine",
        () -> new DrinkBlockItem(KFBBlock.CRANBERRY_WINE.get())
    );
    public static final RegistryObject<Item> DURIAN_WINE = ITEM.register(
        "durian_wine",
        () -> new DrinkBlockItem(KFBBlock.DURIAN_WINE.get())
    );
    public static final RegistryObject<Item> FIG_WINE = ITEM.register(
        "fig_wine",
        () -> new DrinkBlockItem(KFBBlock.FIG_WINE.get())
    );
    public static final RegistryObject<Item> GLOWBERRY_WINE = ITEM.register(
        "glowberry_wine",
        () -> new DrinkBlockItem(KFBBlock.GLOWBERRY_WINE.get())
    );
    public static final RegistryObject<Item> HAMIMELON_WINE = ITEM.register(
        "hamimelon_wine",
        () -> new DrinkBlockItem(KFBBlock.HAMIMELON_WINE.get())
    );
    public static final RegistryObject<Item> HAWBERRY_WINE = ITEM.register(
        "hawberry_wine",
        () -> new DrinkBlockItem(KFBBlock.HAWBERRY_WINE.get())
    );
    public static final RegistryObject<Item> KIWI_WINE = ITEM.register(
        "kiwi_wine",
        () -> new DrinkBlockItem(KFBBlock.KIWI_WINE.get())
    );
    public static final RegistryObject<Item> LEMON_WINE = ITEM.register(
        "lemon_wine",
        () -> new DrinkBlockItem(KFBBlock.LEMON_WINE.get())
    );
    public static final RegistryObject<Item> LYCHEE_WINE = ITEM.register(
        "lychee_wine",
        () -> new DrinkBlockItem(KFBBlock.LYCHEE_WINE.get())
    );
    public static final RegistryObject<Item> MANGO_WINE = ITEM.register(
        "mango_wine",
        () -> new DrinkBlockItem(KFBBlock.MANGO_WINE.get())
    );
    public static final RegistryObject<Item> MANGOSTEEN_WINE = ITEM.register(
        "mangosteen_wine",
        () -> new DrinkBlockItem(KFBBlock.MANGOSTEEN_WINE.get())
    );
    public static final RegistryObject<Item> ORANGE_WINE = ITEM.register(
        "orange_wine",
        () -> new DrinkBlockItem(KFBBlock.ORANGE_WINE.get())
    );
    public static final RegistryObject<Item> PEACH_WINE = ITEM.register(
        "peach_wine",
        () -> new DrinkBlockItem(KFBBlock.PEACH_WINE.get())
    );
    public static final RegistryObject<Item> PEAR_WINE = ITEM.register(
        "pear_wine",
        () -> new DrinkBlockItem(KFBBlock.PEAR_WINE.get())
    );
    public static final RegistryObject<Item> PERSIMMON_WINE = ITEM.register(
        "persimmon_wine",
        () -> new DrinkBlockItem(KFBBlock.PERSIMMON_WINE.get())
    );
    public static final RegistryObject<Item> PINEAPPLE_WINE = ITEM.register(
        "pineapple_wine",
        () -> new DrinkBlockItem(KFBBlock.PINEAPPLE_WINE.get())
    );
    public static final RegistryObject<Item> TEQUILA = ITEM.register(
        "tequila",
        () -> new DrinkBlockItem(KFBBlock.TEQUILA.get())
    );
}
