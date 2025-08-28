package net.gloobert.glowstoneextended;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.AbstractBlockState;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;

public static class GlowstoneBlockModels extends FabricModelProvider {
  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        final Identifier polishedSoulGlowstoneModel = Models.CUBE_ALL.upload(TutorialBlocks.EXAMPLE_BLOCK, TextureMap.all(Identifier.of("glowstone-extended", "blocks/polished_glowstone/polished_soul_glowstone")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(TutorialBlocks.EXAMPLE_BLOCK, polishedSoulGlowstoneModel);
  }
}


