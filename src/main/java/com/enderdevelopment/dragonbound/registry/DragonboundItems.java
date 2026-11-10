package com.enderdevelopment.dragonbound.registry;

import com.enderdevelopment.dragonbound.Dragonbound;
import com.enderdevelopment.dragonbound.item.DragonCodexItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class DragonboundItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dragonbound.MOD_ID);
    public static final RegistryObject<Item> DRAGON_ALTAR = ITEMS.register("dragon_altar", () -> new BlockItem(DragonboundBlocks.DRAGON_ALTAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_CODEX = ITEMS.register("dragon_codex", () -> new DragonCodexItem(new Item.Properties().stacksTo(1)));

    private DragonboundItems() {}

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
