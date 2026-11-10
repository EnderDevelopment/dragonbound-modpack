package com.enderdevelopment.dragonbound;

import com.enderdevelopment.dragonbound.registry.DragonboundBlocks;
import com.enderdevelopment.dragonbound.registry.DragonboundItems;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Dragonbound.MOD_ID)
public final class Dragonbound {
    public static final String MOD_ID = "dragonbound";

    public Dragonbound() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        DragonboundBlocks.register(modBus);
        DragonboundItems.register(modBus);
        modBus.addListener(this::addCreativeTabItems);
    }

    private void addCreativeTabItems(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == net.minecraft.world.item.CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(DragonboundItems.DRAGON_ALTAR);
        }
        if (event.getTabKey() == net.minecraft.world.item.CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(DragonboundItems.DRAGON_CODEX);
        }
    }
}
