package net.gloobert.glowstoneextended;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;

import net.gloobert.glowstoneextended.GlowstoneBlocks;

public class GlowstoneBlockModels extends FabricModelProvider {
  public GlowstoneBlockModels(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Glowstone Variants
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.RED_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.ORANGE_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.YELLOW_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.GREEN_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.BLUE_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.LIGHT_BLUE_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.PINK_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.PURPLE_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.BROWN_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.BLACK_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.GRAY_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.LIGHT_GRAY_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.WHITE_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.MAGENTA_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.LIME_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.CYAN_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.SOUL_GLOWSTONE);
        // Polished Glowstone and variants
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.POLISHED_GLOWSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE);
        // Polished Glowstone Bricks and variants
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.POLISHED_GLOWSTONE_BRICKS);
        // Glowstone Bricks and variants
        blockStateModelGenerator.registerSimpleCubeAll(GlowstoneBlocks.GLOWSTONE_BRICKS);
  }
  
  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    // i have no item models to generate... *yet*
  }
}


