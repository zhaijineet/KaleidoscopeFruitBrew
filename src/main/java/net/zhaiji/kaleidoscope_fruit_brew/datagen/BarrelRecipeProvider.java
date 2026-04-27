package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import com.github.ysbbbbbb.kaleidoscopetavern.datagen.builder.BarrelBuilder;
import com.github.ysbbbbbb.kaleidoscopetavern.datagen.builder.PressingTubBuilder;
import com.github.ysbbbbbb.kaleidoscopetavern.init.ModFluids;
import dev.xkmc.fruitsdelight.init.food.FruitType;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
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
        addPressingTubRecipe(consumer, FruitType.BAYBERRY.getFruit(), KFBFluid.BAYBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.BLUEBERRY.getFruit(), KFBFluid.BLUEBERRY_JUICE.get());
        addPressingTubRecipe(consumer, Items.CACTUS, KFBFluid.CACTUS_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.CRANBERRY.getFruit(), KFBFluid.CRANBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.DURIAN.getFruit(), KFBFluid.DURIAN_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.FIG.getFruit(), KFBFluid.FIG_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.HAMIMELON.getFruit(), KFBFluid.HAMIMELON_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.HAWBERRY.getFruit(), KFBFluid.HAWBERRY_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.KIWI.getFruit(), KFBFluid.KIWI_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.LEMON.getFruit(), KFBFluid.LEMON_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.LYCHEE.getFruit(), KFBFluid.LYCHEE_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.MANGO.getFruit(), KFBFluid.MANGO_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.MANGOSTEEN.getFruit(), KFBFluid.MANGOSTEEN_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.ORANGE.getFruit(), KFBFluid.ORANGE_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.PEACH.getFruit(), KFBFluid.PEACH_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.PEAR.getFruit(), KFBFluid.PEAR_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.PERSIMMON.getFruit(), KFBFluid.PERSIMMON_JUICE.get());
        addPressingTubRecipe(consumer, FruitType.PINEAPPLE.getFruit(), KFBFluid.PINEAPPLE_JUICE.get());
        addPressingTubRecipe(consumer, Items.APPLE, KFBFluid.APPLE_JUICE.get());

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

    private void addPressingTubRecipe(Consumer<FinishedRecipe> consumer, ItemLike ingredient, Fluid fluid) {
        PressingTubBuilder.builder()
            .setIngredient(ingredient)
            .setFluid(fluid)
            .save(consumer);
    }
}
