package net.gloobert.glowstoneextended;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.Hand;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.BlockItem;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.EquipmentSlot;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;

import java.util.HashMap;

public final class GlowstoneBlocks {
    // Glowstone variants
    public static final Block RED_GLOWSTONE = register("red_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_GLOWSTONE = register("orange_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_GLOWSTONE = register("yellow_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_GLOWSTONE = register("green_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_GLOWSTONE = register("blue_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_GLOWSTONE = register("pink_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_GLOWSTONE = register("purple_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_GLOWSTONE = register("brown_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_GLOWSTONE = register("black_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_GLOWSTONE = register("gray_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_GLOWSTONE = register("light_gray_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_GLOWSTONE = register("white_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_GLOWSTONE = register("magenta_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_GLOWSTONE = register("lime_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_GLOWSTONE = register("cyan_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block SOUL_GLOWSTONE = register("soul_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10).sounds(BlockSoundGroup.GLASS)));
    
    // Polished Glowstone and variants
    public static final Block POLISHED_GLOWSTONE = register("polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_POLISHED_GLOWSTONE = register("red_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_POLISHED_GLOWSTONE = register("orange_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_POLISHED_GLOWSTONE = register("yellow_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_POLISHED_GLOWSTONE = register("green_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_POLISHED_GLOWSTONE = register("blue_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_POLISHED_GLOWSTONE = register("light_blue_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_POLISHED_GLOWSTONE = register("pink_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_POLISHED_GLOWSTONE = register("purple_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_POLISHED_GLOWSTONE = register("brown_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_POLISHED_GLOWSTONE = register("black_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_POLISHED_GLOWSTONE = register("gray_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_POLISHED_GLOWSTONE = register("light_gray_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_POLISHED_GLOWSTONE = register("white_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_POLISHED_GLOWSTONE = register("magenta_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_POLISHED_GLOWSTONE = register("lime_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_POLISHED_GLOWSTONE = register("cyan_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block POLISHED_SOUL_GLOWSTONE = register("polished_soul_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10).sounds(BlockSoundGroup.GLASS)));

    // Stripped Polished Glowstone and variants
    public static final Block STRIPPED_POLISHED_GLOWSTONE = register("stripped_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_RED_POLISHED_GLOWSTONE = register("stripped_red_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_ORANGE_POLISHED_GLOWSTONE = register("stripped_orange_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_YELLOW_POLISHED_GLOWSTONE = register("stripped_yellow_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_GREEN_POLISHED_GLOWSTONE = register("stripped_green_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_BLUE_POLISHED_GLOWSTONE = register("stripped_blue_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_LIGHT_BLUE_POLISHED_GLOWSTONE = register("stripped_light_blue_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_PINK_POLISHED_GLOWSTONE = register("stripped_pink_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_PURPLE_POLISHED_GLOWSTONE = register("stripped_purple_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_BROWN_POLISHED_GLOWSTONE = register("stripped_brown_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_BLACK_POLISHED_GLOWSTONE = register("stripped_black_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_GRAY_POLISHED_GLOWSTONE = register("stripped_gray_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_LIGHT_GRAY_POLISHED_GLOWSTONE = register("stripped_light_gray_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_WHITE_POLISHED_GLOWSTONE = register("stripped_white_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_MAGENTA_POLISHED_GLOWSTONE = register("stripped_magenta_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_LIME_POLISHED_GLOWSTONE = register("stripped_lime_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_CYAN_POLISHED_GLOWSTONE = register("stripped_cyan_polished_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block STRIPPED_POLISHED_SOUL_GLOWSTONE = register("stripped_polished_soul_glowstone", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10).sounds(BlockSoundGroup.GLASS)));

    // Polished Glowstone Bricks and variants
    public static final Block POLISHED_GLOWSTONE_BRICKS = register("polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_POLISHED_GLOWSTONE_BRICKS = register("red_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_POLISHED_GLOWSTONE_BRICKS = register("orange_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_POLISHED_GLOWSTONE_BRICKS = register("yellow_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_POLISHED_GLOWSTONE_BRICKS = register("green_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_POLISHED_GLOWSTONE_BRICKS = register("blue_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_POLISHED_GLOWSTONE_BRICKS = register("light_blue_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_POLISHED_GLOWSTONE_BRICKS = register("pink_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_POLISHED_GLOWSTONE_BRICKS = register("purple_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_POLISHED_GLOWSTONE_BRICKS = register("brown_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_POLISHED_GLOWSTONE_BRICKS = register("black_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_POLISHED_GLOWSTONE_BRICKS = register("gray_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_POLISHED_GLOWSTONE_BRICKS = register("light_gray_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_POLISHED_GLOWSTONE_BRICKS = register("white_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_POLISHED_GLOWSTONE_BRICKS = register("magenta_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_POLISHED_GLOWSTONE_BRICKS = register("lime_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_POLISHED_GLOWSTONE_BRICKS = register("cyan_polished_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 15).sounds(BlockSoundGroup.GLASS)));
    public static final Block POLISHED_SOUL_GLOWSTONE_BRICKS = register("polished_soul_glowstone_bricks", new Block(Block.Settings.create().strength(0.3f).luminance(value -> 10).sounds(BlockSoundGroup.GLASS)));

    // Glowstone Bricks and variants
    // these are basically gonna be like. super compressed glowstone. so they wont sound like glass
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
    
    // Miscellaneous items
    public static final Item GLOWSTONE_BRICK =
      Registry.register(Registries.ITEM, new Identifier("glowstone-extended", "glowstone_brick"),
        new Item(new Item.Settings()));
    public static final Item SOUL_GLOWSTONE_BRICK =
      Registry.register(Registries.ITEM, new Identifier("glowstone-extended", "soul_glowstone_brick"),
        new Item(new Item.Settings()));
    public static final Item SOUL_GLOWSTONE_DUST =
      Registry.register(Registries.ITEM, new Identifier("glowstone-extended", "soul_glowstone_dust"),
        new Item(new Item.Settings()));

    public static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("glowstone-extended", path), block);
        Registry.register(Registries.ITEM, Identifier.of("glowstone-extended", path), new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void registerBlockInteractEvents(HashMap<Block, Block> conversionMap, HashMap<Block, Item> converterItemMaps, HashMap<Block, String> toolTypes) {
        conversionMap.forEach(
            (originBlock, convertedBlock) -> {
                UseBlockCallback.EVENT.register((player, world, hand, hitresult) -> {
                    String tool = toolTypes.get(convertedBlock);
                    if (tool == "Other") {
                        Object converterItem = converterItemMaps.get(convertedBlock);
                        BlockPos pos = hitresult.getBlockPos();
                        if (player.getEquippedStack(EquipmentSlot.MAINHAND).getItem() == converterItem && world.getBlockState(pos).isOf(originBlock)) {
                            world.setBlockState(pos, convertedBlock.getDefaultState());
                            return ActionResult.valueOf("SUCCESS");
                        } else {
                            return ActionResult.valueOf("PASS");
                        }
                    } else if (tool == "Axe") {
                        BlockPos pos = hitresult.getBlockPos();
                        if (player.getEquippedStack(EquipmentSlot.MAINHAND).getItem() instanceof AxeItem && world.getBlockState(pos).isOf(originBlock)) {
                            world.setBlockState(pos, convertedBlock.getDefaultState());
                            return ActionResult.valueOf("SUCCESS");
                        } else {
                            return ActionResult.valueOf("PASS");
                        }
                    } else {
                        return ActionResult.valueOf("PASS");
                    }
                });
            }
        );
    }
    
    public static void initialize() {
        HashMap<Block, Block> blockConversions = new HashMap<>();
        // Stripping polished glowstone
        blockConversions.put(POLISHED_GLOWSTONE, STRIPPED_POLISHED_GLOWSTONE);
        blockConversions.put(RED_POLISHED_GLOWSTONE, STRIPPED_RED_POLISHED_GLOWSTONE);
        blockConversions.put(ORANGE_POLISHED_GLOWSTONE, STRIPPED_ORANGE_POLISHED_GLOWSTONE);
        blockConversions.put(YELLOW_POLISHED_GLOWSTONE, STRIPPED_YELLOW_POLISHED_GLOWSTONE);
        blockConversions.put(LIME_POLISHED_GLOWSTONE, STRIPPED_LIME_POLISHED_GLOWSTONE);
        blockConversions.put(GREEN_POLISHED_GLOWSTONE, STRIPPED_GREEN_POLISHED_GLOWSTONE);
        blockConversions.put(CYAN_POLISHED_GLOWSTONE, STRIPPED_CYAN_POLISHED_GLOWSTONE);
        blockConversions.put(LIGHT_BLUE_POLISHED_GLOWSTONE, STRIPPED_LIGHT_BLUE_POLISHED_GLOWSTONE);
        blockConversions.put(BLUE_POLISHED_GLOWSTONE, STRIPPED_BLUE_POLISHED_GLOWSTONE);
        blockConversions.put(PURPLE_POLISHED_GLOWSTONE, STRIPPED_PURPLE_POLISHED_GLOWSTONE);
        blockConversions.put(MAGENTA_POLISHED_GLOWSTONE, STRIPPED_MAGENTA_POLISHED_GLOWSTONE);
        blockConversions.put(PINK_POLISHED_GLOWSTONE, STRIPPED_PINK_POLISHED_GLOWSTONE);
        blockConversions.put(BROWN_POLISHED_GLOWSTONE, STRIPPED_BROWN_POLISHED_GLOWSTONE);
        blockConversions.put(BLACK_POLISHED_GLOWSTONE, STRIPPED_BLACK_POLISHED_GLOWSTONE);
        blockConversions.put(GRAY_POLISHED_GLOWSTONE, STRIPPED_GRAY_POLISHED_GLOWSTONE);
        blockConversions.put(LIGHT_GRAY_POLISHED_GLOWSTONE, STRIPPED_LIGHT_GRAY_POLISHED_GLOWSTONE);
        blockConversions.put(WHITE_POLISHED_GLOWSTONE, STRIPPED_WHITE_POLISHED_GLOWSTONE);
        blockConversions.put(POLISHED_SOUL_GLOWSTONE, STRIPPED_POLISHED_SOUL_GLOWSTONE);
        // Unstripping polished glowstone
        blockConversions.put(STRIPPED_POLISHED_GLOWSTONE, POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_RED_POLISHED_GLOWSTONE, RED_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_ORANGE_POLISHED_GLOWSTONE, ORANGE_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_YELLOW_POLISHED_GLOWSTONE, YELLOW_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_LIME_POLISHED_GLOWSTONE, LIME_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_GREEN_POLISHED_GLOWSTONE, GREEN_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_CYAN_POLISHED_GLOWSTONE, CYAN_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_LIGHT_BLUE_POLISHED_GLOWSTONE, LIGHT_BLUE_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_BLUE_POLISHED_GLOWSTONE, BLUE_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_PURPLE_POLISHED_GLOWSTONE, PURPLE_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_MAGENTA_POLISHED_GLOWSTONE, MAGENTA_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_PINK_POLISHED_GLOWSTONE, PINK_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_BROWN_POLISHED_GLOWSTONE, BROWN_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_BLACK_POLISHED_GLOWSTONE, BLACK_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_GRAY_POLISHED_GLOWSTONE, GRAY_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_LIGHT_GRAY_POLISHED_GLOWSTONE, LIGHT_GRAY_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_WHITE_POLISHED_GLOWSTONE, WHITE_POLISHED_GLOWSTONE);
        blockConversions.put(STRIPPED_POLISHED_SOUL_GLOWSTONE, POLISHED_SOUL_GLOWSTONE);
        HashMap<Block, Item> converterItems = new HashMap<>();
        converterItems.put(POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(RED_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(ORANGE_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(YELLOW_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(LIME_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(GREEN_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(CYAN_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(LIGHT_BLUE_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(BLUE_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(PURPLE_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(MAGENTA_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(PINK_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(BROWN_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(BLACK_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(GRAY_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(LIGHT_GRAY_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(WHITE_POLISHED_GLOWSTONE, GLOWSTONE_BRICK);
        converterItems.put(POLISHED_SOUL_GLOWSTONE, GLOWSTONE_BRICK);
        HashMap<Block, String> toolTypes = new HashMap<>();
        toolTypes.put(STRIPPED_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_RED_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_ORANGE_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_YELLOW_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_LIME_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_GREEN_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_CYAN_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_LIGHT_BLUE_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_BLUE_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_PURPLE_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_MAGENTA_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_PINK_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_BROWN_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_BLACK_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_GRAY_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_LIGHT_GRAY_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_WHITE_POLISHED_GLOWSTONE, "Axe");
        toolTypes.put(STRIPPED_POLISHED_SOUL_GLOWSTONE, "Axe");


        toolTypes.put(POLISHED_GLOWSTONE, "Other");
        toolTypes.put(RED_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(ORANGE_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(YELLOW_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(LIME_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(GREEN_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(CYAN_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(LIGHT_BLUE_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(BLUE_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(PURPLE_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(MAGENTA_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(PINK_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(BROWN_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(BLACK_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(GRAY_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(LIGHT_GRAY_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(WHITE_POLISHED_GLOWSTONE, "Other");
        toolTypes.put(POLISHED_SOUL_GLOWSTONE, "Other");
        registerBlockInteractEvents(blockConversions, converterItems, toolTypes);
    }
}
