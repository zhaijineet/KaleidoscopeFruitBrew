package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBBlock;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public BlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, KaleidoscopeFruitBrew.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        wine(KFBBlock.BAYBERRY_WINE.get(), "bayberry");
        wine(KFBBlock.BLUEBERRY_WINE.get(), "blueberry");
        wine(KFBBlock.CRANBERRY_WINE.get(), "cranberry");
        wine(KFBBlock.DURIAN_WINE.get(), "durian");
        wine(KFBBlock.FIG_WINE.get(), "fig");
        wine(KFBBlock.GLOWBERRY_WINE.get(), "glowberry");
        wine(KFBBlock.HAMIMELON_WINE.get(), "hamimelon");
        wine(KFBBlock.HAWBERRY_WINE.get(), "hawberry");
        wine(KFBBlock.KIWI_WINE.get(), "kiwi");
        wine(KFBBlock.LEMON_WINE.get(), "lemon");
        wine(KFBBlock.LYCHEE_WINE.get(), "lychee");
        wine(KFBBlock.MANGO_WINE.get(), "mango");
        wine(KFBBlock.MANGOSTEEN_WINE.get(), "mangosteen");
        wine(KFBBlock.ORANGE_WINE.get(), "orange");
        wine(KFBBlock.PEACH_WINE.get(), "peach");
        wine(KFBBlock.PEAR_WINE.get(), "pear");
        wine(KFBBlock.PERSIMMON_WINE.get(), "persimmon");
        wine(KFBBlock.PINEAPPLE_WINE.get(), "pineapple");
        wine(KFBBlock.TEQUILA.get(), "tequila");
    }

    private void wine(Block block, String name) {
        if (block instanceof DrinkBlock drinkBlock) {
            horizontalBlock(block, blockState -> {
                int count = blockState.getValue(drinkBlock.getCountProperty());
                ResourceLocation file = modLoc("block/brew/drink/%s/count%d".formatted(name, count));
                return new ModelFile.UncheckedModelFile(file);
            });
        }
    }
}
