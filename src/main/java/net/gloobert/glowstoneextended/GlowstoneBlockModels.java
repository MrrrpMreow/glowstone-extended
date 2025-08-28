package net.gloobert.glowstoneextended;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;

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
import net.minecraft.data.client.TextureMap;

public class GlowstoneBlockModels extends FabricModelProvider {
  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        final Identifier polishedSoulGlowstoneModel = Models.CUBE_ALL.upload(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE, TextureMap.all(Identifier.of("glowstone-extended", "blocks/polished_glowstone/polished_soul_glowstone")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(GlowstoneBlocks.POLISHED_SOUL_GLOWSTONE, polishedSoulGlowstoneModel);
  }
}


