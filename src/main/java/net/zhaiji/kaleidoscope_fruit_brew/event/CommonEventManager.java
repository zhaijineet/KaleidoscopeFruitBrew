package net.zhaiji.kaleidoscope_fruit_brew.event;

import net.minecraftforge.eventbus.api.IEventBus;
import net.zhaiji.kaleidoscope_fruit_brew.datagen.DataGenHandler;

public class CommonEventManager {
    public static void init(IEventBus modBus, IEventBus forgeBus) {
        modBusListener(modBus);
        forgeBusListener(forgeBus);
    }

    public static void modBusListener(IEventBus modBus) {
        modBus.addListener(DataGenHandler::handlerGatherDataEvent);
    }

    public static void forgeBusListener(IEventBus forgeBus) {
    }
}
