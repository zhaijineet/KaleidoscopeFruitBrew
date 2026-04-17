package net.zhaiji.kaleidoscope_fruit_brew;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.zhaiji.kaleidoscope_fruit_brew.event.CommonEventManager;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBBlock;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBCreativeModeTab;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBFluid;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;
import org.slf4j.Logger;

@Mod(KaleidoscopeFruitBrew.MOD_ID)
public class KaleidoscopeFruitBrew {
    public static final String MOD_ID = "kaleidoscope_fruit_brew";
    public static final Logger LOGGER = LogUtils.getLogger();

    public KaleidoscopeFruitBrew() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        KFBFluid.FLUID_TYPE.register(modBus);
        KFBFluid.FLUID.register(modBus);
        KFBBlock.BLOCK.register(modBus);
        KFBItem.ITEM.register(modBus);
        KFBCreativeModeTab.CREATIVE_MODE_TAB.register(modBus);

        CommonEventManager.init(modBus, forgeBus);
    }

    public static ResourceLocation of(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
