package net.zhaiji.kaleidoscope_fruit_brew.register;

import com.github.ysbbbbbb.kaleidoscopetavern.block.brew.DrinkBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew.MOD_ID;

public class KFBBlock {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    // ==================== 标准碰撞箱（4个count等级） ====================
    private static final VoxelShape SHAPE_1 = Block.box(6, 0, 6, 10, 16, 10);
    private static final VoxelShape SHAPE_2 = Block.box(2, 0, 6, 14, 16, 10);
    private static final VoxelShape SHAPE_3 = Shapes.or(
        Block.box(2, 0, 10, 14, 16, 14),
        Block.box(6, 0, 2, 10, 16, 14)
    );
    private static final VoxelShape SHAPE_4 = Block.box(2, 0, 2, 14, 16, 14);

    public static final RegistryObject<Block> BAYBERRY_WINE = BLOCK.register(
        "bayberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> BLUEBERRY_WINE = BLOCK.register(
        "blueberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> CRANBERRY_WINE = BLOCK.register(
        "cranberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> DURIAN_WINE = BLOCK.register(
        "durian_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> FIG_WINE = BLOCK.register(
        "fig_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> GLOWBERRY_WINE = BLOCK.register(
        "glowberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> HAMIMELON_WINE = BLOCK.register(
        "hamimelon_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> HAWBERRY_WINE = BLOCK.register(
        "hawberry_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> KIWI_WINE = BLOCK.register(
        "kiwi_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> LEMON_WINE = BLOCK.register(
        "lemon_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> LYCHEE_WINE = BLOCK.register(
        "lychee_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> MANGO_WINE = BLOCK.register(
        "mango_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> MANGOSTEEN_WINE = BLOCK.register(
        "mangosteen_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> ORANGE_WINE = BLOCK.register(
        "orange_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> PEACH_WINE = BLOCK.register(
        "peach_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> PEAR_WINE = BLOCK.register(
        "pear_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> PERSIMMON_WINE = BLOCK.register(
        "persimmon_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> PINEAPPLE_WINE = BLOCK.register(
        "pineapple_wine",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
    public static final RegistryObject<Block> TEQUILA = BLOCK.register(
        "tequila",
        DrinkBlock.create().maxCount(4).shapes(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4).build()
    );
}
