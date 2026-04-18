package net.zhaiji.kaleidoscope_fruit_brew.register;

import com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.invoke.VolatileCallSite;

import static net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew.MOD_ID;

public class KFBBlock {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static VoxelShape[] SHAPE_GEN(int size, int height){
        return new VoxelShape[]{
                Block.box(8 - size, 0, 8 - size, 8 + size, height, 8 + size),
        Block.box(8 - size - 4, 0, 8 - size, 8 + size + 4, height, 8 + size),
        Shapes.or(
                Block.box(8 - size - 4, 0, 8 + 1, 8 + size + 4, height, 8 + size + 4),
                Block.box(8 - size, 0, 8 - size - 4, 8 + size, height, 8 + size + 4)
        ),
        Block.box(8 - size - 4, 0, 8 - size - 4, 8 + size + 4, height, 8 + size + 4),
        };
    }
    public static final RegistryObject<Block> BAYBERRY_WINE = BLOCK.register(
        "bayberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,12)).build()
    );
    public static final RegistryObject<Block> BLUEBERRY_WINE = BLOCK.register(
        "blueberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2,16)).build()
    );
    public static final RegistryObject<Block> CRANBERRY_WINE = BLOCK.register(
        "cranberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,14)).build()
    );
    public static final RegistryObject<Block> DURIAN_WINE = BLOCK.register(
        "durian_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,11)).build()
    );
    public static final RegistryObject<Block> FIG_WINE = BLOCK.register(
        "fig_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,11)).build()
    );
    public static final RegistryObject<Block> GLOWBERRY_WINE = BLOCK.register(
        "glowberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,11)).build()
    );
    public static final RegistryObject<Block> HAMIMELON_WINE = BLOCK.register(
        "hamimelon_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2,14)).build()
    );
    public static final RegistryObject<Block> HAWBERRY_WINE = BLOCK.register(
        "hawberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,13)).build()
    );
    public static final RegistryObject<Block> KIWI_WINE = BLOCK.register(
        "kiwi_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,11)).build()
    );
    public static final RegistryObject<Block> LEMON_WINE = BLOCK.register(
        "lemon_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2,11)).build()
    );
    public static final RegistryObject<Block> LYCHEE_WINE = BLOCK.register(
        "lychee_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,15)).build()
    );
    public static final RegistryObject<Block> MANGO_WINE = BLOCK.register(
        "mango_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,14)).build()
    );
    public static final RegistryObject<Block> MANGOSTEEN_WINE = BLOCK.register(
        "mangosteen_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2,15)).build()
    );
    public static final RegistryObject<Block> ORANGE_WINE = BLOCK.register(
        "orange_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,14)).build()
    );
    public static final RegistryObject<Block> PEACH_WINE = BLOCK.register(
        "peach_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,14)).build()
    );
    public static final RegistryObject<Block> PEAR_WINE = BLOCK.register(
        "pear_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,14)).build()
    );
    public static final RegistryObject<Block> PERSIMMON_WINE = BLOCK.register(
        "persimmon_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2,15)).build()
    );
    public static final RegistryObject<Block> PINEAPPLE_WINE = BLOCK.register(
        "pineapple_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(2,14)).build()
    );
    public static final RegistryObject<Block> TEQUILA = BLOCK.register(
        "tequila",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_GEN(3,16)).build()
    );
}
