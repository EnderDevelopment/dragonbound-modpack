package com.enderdevelopment.dragonbound.registry;

import com.enderdevelopment.dragonbound.Dragonbound;
import com.enderdevelopment.dragonbound.world.DragonAltarBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public final class DragonboundBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dragonbound.MOD_ID);
    public static final RegistryObject<Block> DRAGON_ALTAR = BLOCKS.register("dragon_altar", () -> new DragonAltarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(3.5F).requiresCorrectToolForDrops().lightLevel(state -> 5)));

    private DragonboundBlocks() {}

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
