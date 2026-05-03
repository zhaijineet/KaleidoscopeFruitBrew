package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import com.github.ysbbbbbb.kaleidoscopetavern.datagen.builder.BarrelBuilder;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.builder.PressingTubBuilder;
import com.github.ysbbbbbb.kaleidoscopetavern.init.ModFluids;
import dev.xkmc.fruitsdelight.init.food.FruitType;
import dev.xkmc.fruitsdelight.init.plants.FDBushes;
import dev.xkmc.fruitsdelight.init.plants.FDTrees;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBFluid;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;

import java.util.function.Consumer;

public class BarrelRecipeProvider extends RecipeProvider {
    public BarrelRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // ==================== 果盆挤压配方（水果 → 果汁） ====================
        // 有 tag 的水果 — 通过 FDTrees / FDBushes 的 getFruitTag() 获取 TagKey
        addPressingTubRecipe(consumer, FDTrees.BAYBERRY.getFruitTag(), KFBFluid.BAYBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FDBushes.BLUEBERRY.getFruitTag(), KFBFluid.BLUEBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FDBushes.CRANBERRY.getFruitTag(), KFBFluid.CRANBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.FIG.getFruitTag(), KFBFluid.FIG_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.HAWBERRY.getFruitTag(), KFBFluid.HAWBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.KIWI.getFruitTag(), KFBFluid.KIWI_JUICE.get());
        addPressingTubRecipe(consumer, FDBushes.LEMON.getFruitTag(), KFBFluid.LEMON_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.LYCHEE.getFruitTag(), KFBFluid.LYCHEE_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.MANGO.getFruitTag(), KFBFluid.MANGO_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.MANGOSTEEN.getFruitTag(), KFBFluid.MANGOSTEEN_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.ORANGE.getFruitTag(), KFBFluid.ORANGE_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.PEACH.getFruitTag(), KFBFluid.PEACH_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.PEAR.getFruitTag(), KFBFluid.PEAR_JUICE.get());
        addPressingTubRecipe(consumer, FDTrees.PERSIMMON.getFruitTag(), KFBFluid.PERSIMMON_JUICE.get());
        // 菠萝 — forge:fruits/pineapple tag 匹配完整菠萝
        addPressingTubRecipe(consumer, ItemTags.create(new ResourceLocation("forge", "fruits/pineapple")), KFBFluid.PINEAPPLE_JUICE.get());
        // 哈密瓜 — forge:fruits/cantaloupe tag（本项目定义，包含 fruitsdelight:hamimelon_slice）
        addPressingTubRecipe(consumer, ItemTags.create(new ResourceLocation("forge", "fruits/cantaloupe")), KFBFluid.HAMIMELON_JUICE.get());

        // 无 tag 的水果 — 使用 ItemLike
        addPressingTubRecipe(consumer, Items.APPLE, KFBFluid.APPLE_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.DURIAN.getFruit(), KFBFluid.DURIAN_JUICE.get());
        addPressingTubRecipe(consumer, Items.CACTUS, KFBFluid.CACTUS_JUICE.get());

        // ==================== 酒桶酿造配方（果汁 → 果酒） ====================
        addBarrelRecipe(consumer, KFBFluid.BAYBERRY_JUICE.get(), KFBItem.BAYBERRY_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.BLUEBERRY_JUICE.get(), KFBItem.BLUEBERRY_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.CRANBERRY_JUICE.get(), KFBItem.CRANBERRY_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.DURIAN_JUICE.get(), KFBItem.DURIAN_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.FIG_JUICE.get(), KFBItem.FIG_WINE.get());
        addBarrelRecipe(consumer, ModFluids.GLOW_BERRIES_JUICE.get(), KFBItem.GLOWBERRY_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.HAMIMELON_JUICE.get(), KFBItem.HAMIMELON_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.HAWBERRY_JUICE.get(), KFBItem.HAWBERRY_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.KIWI_JUICE.get(), KFBItem.KIWI_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.LEMON_JUICE.get(), KFBItem.LEMON_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.LYCHEE_JUICE.get(), KFBItem.LYCHEE_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.MANGO_JUICE.get(), KFBItem.MANGO_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.MANGOSTEEN_JUICE.get(), KFBItem.MANGOSTEEN_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.ORANGE_JUICE.get(), KFBItem.ORANGE_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.PEACH_JUICE.get(), KFBItem.PEACH_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.PEAR_JUICE.get(), KFBItem.PEAR_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.PERSIMMON_JUICE.get(), KFBItem.PERSIMMON_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.PINEAPPLE_JUICE.get(), KFBItem.PINEAPPLE_WINE.get());
        addBarrelRecipe(consumer, KFBFluid.CACTUS_JUICE.get(), KFBItem.TEQUILA.get());
        addBarrelRecipe(consumer, KFBFluid.APPLE_JUICE.get(), KFBItem.APPLE_CIDER.get());
    }

    private void addBarrelRecipe(Consumer<FinishedRecipe> consumer, Fluid fluid, ItemLike result) {
        BarrelBuilder.builder()
            .setFluid(fluid)
            .setResult(result)
            .save(consumer);
    }

    private void addPressingTubRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> tag, Fluid fluid) {
        PressingTubBuilder.builder()
            .setIngredient(tag)
            .setFluid(fluid)
            .save(consumer);
    }

    private void addPressingTubRecipe(Consumer<FinishedRecipe> consumer, ItemLike ingredient, Fluid fluid) {
        PressingTubBuilder.builder()
            .setIngredient(ingredient)
            .setFluid(fluid)
            .save(consumer);
    }
}
