package net.gloobert.glowstoneextended;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.gloobert.glowstoneextended.GlowstoneBlocks;

public class GlowstoneCreativeGUI {
        public static final ItemGroup GLOWSTONE_EXTENDED = Registry.register(Registries.ITEM_GROUP, new Identifier("glowstone-extended", "glowstone_extended_creative"), FabricItemGroup.builder()
        .icon(() -> new ItemStack(GlowstoneBlocks.POLISHED_GLOWSTONE))
        .displayName(Text.translatable("itemGroup.glowstone-extended.glowstone_extended_creative"))
        .entries((context, entries) -> {
            entries.add(GlowstoneBlocks.POLISHED_GLOWSTONE);
        })
        .build());
}
