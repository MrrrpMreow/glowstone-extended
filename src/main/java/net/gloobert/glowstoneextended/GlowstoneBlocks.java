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
    // Glowstone variants
    public static final Block RED_GLOWSTONE = register("red_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block ORANGE_GLOWSTONE = register("orange_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block YELLOW_GLOWSTONE = register("yellow_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block GREEN_GLOWSTONE = register("green_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block BLUE_GLOWSTONE = register("blue_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block PINK_GLOWSTONE = register("pink_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block PURPLE_GLOWSTONE = register("purple_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block BROWN_GLOWSTONE = register("brown_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block BLACK_GLOWSTONE = register("black_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block GRAY_GLOWSTONE = register("gray_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block LIGHT_GRAY_GLOWSTONE = register("light_gray_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block WHITE_GLOWSTONE = register("white_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block MAGENTA_GLOWSTONE = register("magenta_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block LIME_GLOWSTONE = register("lime_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block CYAN_GLOWSTONE = register("cyan_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block SOUL_GLOWSTONE = register("soul_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10)));
    
    // Polished Glowstone and variants
    public static final Block POLISHED_GLOWSTONE = register("polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block POLISHED_SOUL_GLOWSTONE = register("polished_soul_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10)));

    // Polished Glowstone Bricks and variants
    public static final Block POLISHED_GLOWSTONE_BRICKS = register("polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block POLISHED_SOUL_GLOWSTONE_BRICKS = register("polished_soul_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10)));

    // Glowstone Bricks and variants
    public static final Block GLOWSTONE_BRICKS = register("glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block RED_GLOWSTONE_BRICKS = register("red_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block ORANGE_GLOWSTONE_BRICKS = register("orange_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block YELLOW_GLOWSTONE_BRICKS = register("yellow_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block GREEN_GLOWSTONE_BRICKS = register("green_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block BLUE_GLOWSTONE_BRICKS = register("blue_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block LIGHT_BLUE_GLOWSTONE_BRICKS = register("light_blue_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block PINK_GLOWSTONE_BRICKS = register("pink_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block PURPLE_GLOWSTONE_BRICKS = register("purple_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block BROWN_GLOWSTONE_BRICKS = register("brown_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block BLACK_GLOWSTONE_BRICKS = register("black_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block GRAY_GLOWSTONE_BRICKS = register("gray_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block LIGHT_GRAY_GLOWSTONE_BRICKS = register("light_gray_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block WHITE_GLOWSTONE_BRICKS = register("white_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block MAGENTA_GLOWSTONE_BRICKS = register("magenta_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block LIME_GLOWSTONE_BRICKS = register("lime_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block CYAN_GLOWSTONE_BRICKS = register("cyan_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15)));
    public static final Block SOUL_GLOWSTONE_BRICKS = register("soul_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10)));
    
    public static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("glowstone-extended", path), block);
        Registry.register(Registries.ITEM, Identifier.of("glowstone-extended", path), new BlockItem(block, new Item.Settings()));
        return block;
    }
    
    public static void initialize() {
    }
}
