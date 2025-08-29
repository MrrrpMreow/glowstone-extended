package net.gloobert.glowstoneextended;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.gloobert.glowstoneextended.GlowstoneBlocks;

public class GlowstoneCreativeGUI {
        public static final ItemGroup GLOWSTONE_EXTENDED = Registry.register(Registries.ITEM_GROUP, new Identifier("glowstone-extended", "glowstone_extended_creative"), FabricItemGroup.builder()
        .icon(() -> new ItemStack(GlowstoneBlocks.POLISHED_GLOWSTONE))
        .displayName(Text.translatable("itemGroup.glowstone-extended.glowstone_extended_creative"))
        .entries((context, entries) -> {
            entries.add(Items.GLOWSTONE);
            entries.add(GlowstoneBlocks.SOUL_GLOWSTONE);
            entries.add(GlowstoneBlocks.WHITE_GLOWSTONE);
            entries.add(GlowstoneBlocks.LIGHT_GRAY_GLOWSTONE);
            entries.add(GlowstoneBlocks.GRAY_GLOWSTONE);
            entries.add(GlowstoneBlocks.BLACK_GLOWSTONE);
            entries.add(GlowstoneBlocks.BROWN_GLOWSTONE);
            entries.add(GlowstoneBlocks.RED_GLOWSTONE);
            entries.add(GlowstoneBlocks.ORANGE_GLOWSTONE);
            entries.add(GlowstoneBlocks.YELLOW_GLOWSTONE);
            entries.add(GlowstoneBlocks.LIME_GLOWSTONE);
            entries.add(GlowstoneBlocks.GREEN_GLOWSTONE);
            entries.add(GlowstoneBlocks.CYAN_GLOWSTONE);
            entries.add(GlowstoneBlocks.LIGHT_BLUE_GLOWSTONE);
            entries.add(GlowstoneBlocks.BLUE_GLOWSTONE);
            entries.add(GlowstoneBlocks.PURPLE_GLOWSTONE);
            entries.add(GlowstoneBlocks.MAGENTA_GLOWSTONE);
            entries.add(GlowstoneBlocks.PINK_GLOWSTONE);
            entries.add(GlowstoneBlocks.POLISHED_GLOWSTONE);
            entries.add(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE);
            entries.add(GlowstoneBlocks.POLISHED_GLOWSTONE_BRICKS);
            entries.add(GlowstoneBlocks.GLOWSTONE_BRICKS);
        })
        .build());
    public static void initialize() {
    }
}
