package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

/**
 * 接入森罗物语酒馆 1.2.0 新增的「雪克杯调酒系统」。
 */
public class KFBItemTagsProvider extends ItemTagsProvider {
    public KFBItemTagsProvider(
        PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
        CompletableFuture<TagLookup<net.minecraft.world.level.block.Block>> blockTags,
        @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, blockTags, KaleidoscopeFruitBrew.MOD_ID, existingFileHelper);
    }

    /**
     * 构造酒馆的调酒原料颜色子 tag。
     */
    private static TagKey<Item> cocktail(String color) {
        return ItemTags.create(new ResourceLocation("kaleidoscope_tavern", "cocktail_ingredient_" + color));
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // RED —— 正红 / 橙红
        tag(cocktail("red")).add(
            KFBItem.CRANBERRY_WINE.get(),
            KFBItem.PERSIMMON_WINE.get()
        );

        // DARK_RED —— 深酒红
        tag(cocktail("dark_red")).add(
            KFBItem.BAYBERRY_WINE.get(),
            KFBItem.HAWBERRY_WINE.get()
        );

        // DARK_PURPLE —— 深紫
        tag(cocktail("dark_purple")).add(
            KFBItem.BLUEBERRY_WINE.get()
        );

        // LIGHT_PURPLE —— 粉紫 / 粉橙调
        tag(cocktail("light_purple")).add(
            KFBItem.LYCHEE_WINE.get(),
            KFBItem.MANGOSTEEN_WINE.get(),
            KFBItem.PEACH_WINE.get()
        );

        // GOLD —— 琥珀 / 橙金
        tag(cocktail("gold")).add(
            KFBItem.APPLE_CIDER.get(),
            KFBItem.FIG_WINE.get(),
            KFBItem.HAMIMELON_WINE.get(),
            KFBItem.MANGO_WINE.get(),
            KFBItem.ORANGE_WINE.get(),
            KFBItem.PINEAPPLE_WINE.get()
        );

        // YELLOW —— 黄 / 淡金黄
        tag(cocktail("yellow")).add(
            KFBItem.DURIAN_WINE.get(),
            KFBItem.GLOWBERRY_WINE.get(),
            KFBItem.LEMON_WINE.get(),
            KFBItem.PEAR_WINE.get()
        );

        // GREEN —— 亮绿 / 青绿
        tag(cocktail("green")).add(
            KFBItem.KIWI_WINE.get(),
            KFBItem.TEQUILA.get()
        );
    }
}
