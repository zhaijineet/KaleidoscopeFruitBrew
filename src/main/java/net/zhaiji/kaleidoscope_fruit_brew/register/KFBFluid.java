package net.zhaiji.kaleidoscope_fruit_brew.register;

import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zhaiji.kaleidoscope_fruit_brew.fluid.KFBFluidType;

import static net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew.MOD_ID;

public class KFBFluid {
    public static final DeferredRegister<FluidType> FLUID_TYPE = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MOD_ID);
    public static final DeferredRegister<Fluid> FLUID = DeferredRegister.create(ForgeRegistries.FLUIDS, MOD_ID);

    // ==================== Bayberry ====================
    public static final RegistryObject<FluidType> BAYBERRY_JUICE_TYPE = registerFluidType("bayberry_juice");
    public static final RegistryObject<Fluid> BAYBERRY_JUICE = FLUID.register(
        "bayberry_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.BAYBERRY_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_BAYBERRY_JUICE = FLUID.register(
        "flowing_bayberry_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.BAYBERRY_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties BAYBERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        BAYBERRY_JUICE_TYPE, BAYBERRY_JUICE, FLOWING_BAYBERRY_JUICE
    ).bucket(KFBItem.BAYBERRY_BUCKET);

    // ==================== Blueberry ====================
    public static final RegistryObject<FluidType> BLUEBERRY_JUICE_TYPE = registerFluidType("blueberry_juice");
    public static final RegistryObject<Fluid> BLUEBERRY_JUICE = FLUID.register(
        "blueberry_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.BLUEBERRY_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_BLUEBERRY_JUICE = FLUID.register(
        "flowing_blueberry_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.BLUEBERRY_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties BLUEBERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        BLUEBERRY_JUICE_TYPE, BLUEBERRY_JUICE, FLOWING_BLUEBERRY_JUICE
    ).bucket(KFBItem.BLUEBERRY_BUCKET);

    // ==================== Cactus ====================
    public static final RegistryObject<FluidType> CACTUS_JUICE_TYPE = registerFluidType("cactus_juice");
    public static final RegistryObject<Fluid> CACTUS_JUICE = FLUID.register(
        "cactus_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.CACTUS_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_CACTUS_JUICE = FLUID.register(
        "flowing_cactus_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.CACTUS_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties CACTUS_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        CACTUS_JUICE_TYPE, CACTUS_JUICE, FLOWING_CACTUS_JUICE
    ).bucket(KFBItem.CACTUS_BUCKET);

    // ==================== Cranberry ====================
    public static final RegistryObject<FluidType> CRANBERRY_JUICE_TYPE = registerFluidType("cranberry_juice");
    public static final RegistryObject<Fluid> CRANBERRY_JUICE = FLUID.register(
        "cranberry_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.CRANBERRY_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_CRANBERRY_JUICE = FLUID.register(
        "flowing_cranberry_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.CRANBERRY_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties CRANBERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        CRANBERRY_JUICE_TYPE, CRANBERRY_JUICE, FLOWING_CRANBERRY_JUICE
    ).bucket(KFBItem.CRANBERRY_BUCKET);

    // ==================== Durian ====================
    public static final RegistryObject<FluidType> DURIAN_JUICE_TYPE = registerFluidType("durian_juice");
    public static final RegistryObject<Fluid> DURIAN_JUICE = FLUID.register(
        "durian_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.DURIAN_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_DURIAN_JUICE = FLUID.register(
        "flowing_durian_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.DURIAN_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties DURIAN_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        DURIAN_JUICE_TYPE, DURIAN_JUICE, FLOWING_DURIAN_JUICE
    ).bucket(KFBItem.DURIAN_BUCKET);

    // ==================== Fig ====================
    public static final RegistryObject<FluidType> FIG_JUICE_TYPE = registerFluidType("fig_juice");
    public static final RegistryObject<Fluid> FIG_JUICE = FLUID.register(
        "fig_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.FIG_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_FIG_JUICE = FLUID.register(
        "flowing_fig_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.FIG_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties FIG_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        FIG_JUICE_TYPE, FIG_JUICE, FLOWING_FIG_JUICE
    ).bucket(KFBItem.FIG_BUCKET);

    // ==================== Hamimelon ====================
    public static final RegistryObject<FluidType> HAMIMELON_JUICE_TYPE = registerFluidType("hamimelon_juice");
    public static final RegistryObject<Fluid> HAMIMELON_JUICE = FLUID.register(
        "hamimelon_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.HAMIMELON_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_HAMIMELON_JUICE = FLUID.register(
        "flowing_hamimelon_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.HAMIMELON_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties HAMIMELON_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        HAMIMELON_JUICE_TYPE, HAMIMELON_JUICE, FLOWING_HAMIMELON_JUICE
    ).bucket(KFBItem.HAMIMELON_BUCKET);

    // ==================== Hawberry ====================
    public static final RegistryObject<FluidType> HAWBERRY_JUICE_TYPE = registerFluidType("hawberry_juice");
    public static final RegistryObject<Fluid> HAWBERRY_JUICE = FLUID.register(
        "hawberry_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.HAWBERRY_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_HAWBERRY_JUICE = FLUID.register(
        "flowing_hawberry_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.HAWBERRY_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties HAWBERRY_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        HAWBERRY_JUICE_TYPE, HAWBERRY_JUICE, FLOWING_HAWBERRY_JUICE
    ).bucket(KFBItem.HAWBERRY_BUCKET);

    // ==================== Kiwi ====================
    public static final RegistryObject<FluidType> KIWI_JUICE_TYPE = registerFluidType("kiwi_juice");
    public static final RegistryObject<Fluid> KIWI_JUICE = FLUID.register(
        "kiwi_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.KIWI_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_KIWI_JUICE = FLUID.register(
        "flowing_kiwi_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.KIWI_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties KIWI_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        KIWI_JUICE_TYPE, KIWI_JUICE, FLOWING_KIWI_JUICE
    ).bucket(KFBItem.KIWI_BUCKET);

    // ==================== Lemon ====================
    public static final RegistryObject<FluidType> LEMON_JUICE_TYPE = registerFluidType("lemon_juice");
    public static final RegistryObject<Fluid> LEMON_JUICE = FLUID.register(
        "lemon_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.LEMON_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_LEMON_JUICE = FLUID.register(
        "flowing_lemon_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.LEMON_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties LEMON_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        LEMON_JUICE_TYPE, LEMON_JUICE, FLOWING_LEMON_JUICE
    ).bucket(KFBItem.LEMON_BUCKET);

    // ==================== Lychee ====================
    public static final RegistryObject<FluidType> LYCHEE_JUICE_TYPE = registerFluidType("lychee_juice");
    public static final RegistryObject<Fluid> LYCHEE_JUICE = FLUID.register(
        "lychee_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.LYCHEE_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_LYCHEE_JUICE = FLUID.register(
        "flowing_lychee_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.LYCHEE_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties LYCHEE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        LYCHEE_JUICE_TYPE, LYCHEE_JUICE, FLOWING_LYCHEE_JUICE
    ).bucket(KFBItem.LYCHEE_BUCKET);

    // ==================== Mango ====================
    public static final RegistryObject<FluidType> MANGO_JUICE_TYPE = registerFluidType("mango_juice");
    public static final RegistryObject<Fluid> MANGO_JUICE = FLUID.register(
        "mango_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.MANGO_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_MANGO_JUICE = FLUID.register(
        "flowing_mango_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.MANGO_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties MANGO_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        MANGO_JUICE_TYPE, MANGO_JUICE, FLOWING_MANGO_JUICE
    ).bucket(KFBItem.MANGO_BUCKET);

    // ==================== Mangosteen ====================
    public static final RegistryObject<FluidType> MANGOSTEEN_JUICE_TYPE = registerFluidType("mangosteen_juice");
    public static final RegistryObject<Fluid> MANGOSTEEN_JUICE = FLUID.register(
        "mangosteen_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.MANGOSTEEN_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_MANGOSTEEN_JUICE = FLUID.register(
        "flowing_mangosteen_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.MANGOSTEEN_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties MANGOSTEEN_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        MANGOSTEEN_JUICE_TYPE, MANGOSTEEN_JUICE, FLOWING_MANGOSTEEN_JUICE
    ).bucket(KFBItem.MANGOSTEEN_BUCKET);

    // ==================== Orange ====================
    public static final RegistryObject<FluidType> ORANGE_JUICE_TYPE = registerFluidType("orange_juice");
    public static final RegistryObject<Fluid> ORANGE_JUICE = FLUID.register(
        "orange_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.ORANGE_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_ORANGE_JUICE = FLUID.register(
        "flowing_orange_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.ORANGE_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties ORANGE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        ORANGE_JUICE_TYPE, ORANGE_JUICE, FLOWING_ORANGE_JUICE
    ).bucket(KFBItem.ORANGE_BUCKET);

    // ==================== Peach ====================
    public static final RegistryObject<FluidType> PEACH_JUICE_TYPE = registerFluidType("peach_juice");
    public static final RegistryObject<Fluid> PEACH_JUICE = FLUID.register(
        "peach_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.PEACH_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_PEACH_JUICE = FLUID.register(
        "flowing_peach_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.PEACH_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties PEACH_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        PEACH_JUICE_TYPE, PEACH_JUICE, FLOWING_PEACH_JUICE
    ).bucket(KFBItem.PEACH_BUCKET);

    // ==================== Pear ====================
    public static final RegistryObject<FluidType> PEAR_JUICE_TYPE = registerFluidType("pear_juice");
    public static final RegistryObject<Fluid> PEAR_JUICE = FLUID.register(
        "pear_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.PEAR_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_PEAR_JUICE = FLUID.register(
        "flowing_pear_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.PEAR_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties PEAR_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        PEAR_JUICE_TYPE, PEAR_JUICE, FLOWING_PEAR_JUICE
    ).bucket(KFBItem.PEAR_BUCKET);

    // ==================== Persimmon ====================
    public static final RegistryObject<FluidType> PERSIMMON_JUICE_TYPE = registerFluidType("persimmon_juice");
    public static final RegistryObject<Fluid> PERSIMMON_JUICE = FLUID.register(
        "persimmon_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.PERSIMMON_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_PERSIMMON_JUICE = FLUID.register(
        "flowing_persimmon_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.PERSIMMON_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties PERSIMMON_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        PERSIMMON_JUICE_TYPE, PERSIMMON_JUICE, FLOWING_PERSIMMON_JUICE
    ).bucket(KFBItem.PERSIMMON_BUCKET);

    // ==================== Pineapple ====================
    public static final RegistryObject<FluidType> PINEAPPLE_JUICE_TYPE = registerFluidType("pineapple_juice");
    public static final RegistryObject<Fluid> PINEAPPLE_JUICE = FLUID.register(
        "pineapple_juice",
        () -> new ForgeFlowingFluid.Source(KFBFluid.PINEAPPLE_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_PINEAPPLE_JUICE = FLUID.register(
        "flowing_pineapple_juice",
        () -> new ForgeFlowingFluid.Flowing(KFBFluid.PINEAPPLE_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties PINEAPPLE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
        PINEAPPLE_JUICE_TYPE, PINEAPPLE_JUICE, FLOWING_PINEAPPLE_JUICE
    ).bucket(KFBItem.PINEAPPLE_BUCKET);

    // ==================== Apple ====================
    public static final RegistryObject<FluidType> APPLE_JUICE_TYPE = registerFluidType("apple_juice");
    public static final RegistryObject<Fluid> APPLE_JUICE = FLUID.register(
            "apple_juice",
            () -> new ForgeFlowingFluid.Source(KFBFluid.APPLE_JUICE_PROPERTIES)
    );
    public static final RegistryObject<Fluid> FLOWING_APPLE_JUICE = FLUID.register(
            "flowing_apple_juice",
            () -> new ForgeFlowingFluid.Flowing(KFBFluid.APPLE_JUICE_PROPERTIES)
    );
    public static final ForgeFlowingFluid.Properties APPLE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
            APPLE_JUICE_TYPE, APPLE_JUICE, FLOWING_APPLE_JUICE
    ).bucket(KFBItem.APPLE_BUCKET);
    public static RegistryObject<FluidType> registerFluidType(String name) {
        return FLUID_TYPE.register(name, () -> new KFBFluidType(name));
    }
}
