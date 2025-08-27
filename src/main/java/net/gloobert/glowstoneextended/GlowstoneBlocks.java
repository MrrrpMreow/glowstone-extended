package net.gloobert.glowstoneextended;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;

public final class GlowstoneBlocks {
    public static final Block POLISHED_GLOWSTONE = register("polished_glowstone", new Block(AbstractBlock.AbstractBlockState.Settings.create().luminance(15)));
    public static final Block POLISHED_GLOWSTONE_BRICKS = register("polished_glowstone_bricks", new Block(AbstractBlock.Settings.create().luminance(15)));
    public static final Block GLOWSTONE_BRICKS = register("glowstone_bricks", new Block(AbstractBlock.Settings.create().luminance(15)));
    
    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("glowstone-extended", path), block);
        Registry.register(Registries.ITEM, Identifier.of("glowstone-extended", path), new BlockItem(block, new Item.Settings()));
        return block;
    }
    
    public static void initialize() {
    }
}
