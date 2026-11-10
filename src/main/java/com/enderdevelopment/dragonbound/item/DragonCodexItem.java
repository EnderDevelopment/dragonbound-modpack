package com.enderdevelopment.dragonbound.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public final class DragonCodexItem extends Item {
    public DragonCodexItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            player.sendSystemMessage(Component.translatable("message.dragonbound.codex.title"));
            player.sendSystemMessage(Component.translatable("message.dragonbound.codex.ice_and_fire"));
            player.sendSystemMessage(Component.translatable("message.dragonbound.codex.mounts"));
            player.sendSystemMessage(Component.translatable("message.dragonbound.codex.survival"));
            player.sendSystemMessage(Component.translatable("message.dragonbound.codex.altar"));
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
