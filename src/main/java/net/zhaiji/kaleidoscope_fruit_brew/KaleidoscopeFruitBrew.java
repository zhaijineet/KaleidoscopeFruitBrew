package net.zhaiji.kaleidoscope_fruit_brew;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KaleidoscopeFruitBrew.MODID)
public class KaleidoscopeFruitBrew {
    public static final String MODID = "kaleidoscope_fruit_brew";

    public KaleidoscopeFruitBrew() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
