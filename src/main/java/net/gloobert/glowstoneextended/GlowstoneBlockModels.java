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
        final Identifier polishedSoulGlowstoneModel = Models.CUBE_ALL.upload(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE, TextureMap.all(Identifier.of("glowstone-extended","block/polished_glowstone/polished_soul_glowstone")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE, polishedSoulGlowstoneModel);
        blockStateModelGenerator.registerSingleton(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE, TextureMap.all(Identifier.of("glowstone-extended","block/polished_glowstone/polished_soul_glowstone"))) 
  }
  
  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    // i have no item models to generate... *yet*
  }
}


