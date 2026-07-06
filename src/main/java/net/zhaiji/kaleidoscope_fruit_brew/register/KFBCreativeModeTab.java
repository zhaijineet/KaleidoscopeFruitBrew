package net.zhaiji.kaleidoscope_fruit_brew.register;

import com.github.ysbbbbbb.kaleidoscopetavern.item.BottleBlockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew.MOD_ID;

public class KFBCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final String TAB_TRANSLATABLE = "itemGroup." + MOD_ID + ".tab";

    public static final RegistryObject<CreativeModeTab> KALEIDOSCOPE_FRUIT_BREW_TAB = CREATIVE_MODE_TAB.register(
        "kaleidoscope_fruit_brew_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> KFBItem.BAYBERRY_WINE.get().getDefaultInstance())
            .title(Component.translatable(TAB_TRANSLATABLE))
            .displayItems((parameters, output) -> {
                KFBItem.ITEM.getEntries().forEach(item -> {
                    // 果酒（BottleBlockItem 子类）以典藏品质（Lv6）展示
                    if (item.get() instanceof BottleBlockItem) {
                        output.accept(BottleBlockItem.getMaxLevelDrink(item));
                    } else {
                        output.accept(item.get());
                    }
                });
            })
            .build()
    );
}
