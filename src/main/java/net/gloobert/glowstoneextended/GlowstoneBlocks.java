package net.gloobert.glowstoneextended;

import net.minecraft.block.Block

public final class GlowstoneBlocks {
    public static final Block POLISHED_GLOWSTONE = register("polished_glowstone", new Block(Block.Settings.create().strength(4.0f)));
    
    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("glowstone-extended", path), block);
        Registry.register(Registries.ITEM, Identifier.of("glowstone-extended", path), new BlockItem(block, new Item.Settings()));
        return block;
    }
    
    public static void initialize() {
    }
}
