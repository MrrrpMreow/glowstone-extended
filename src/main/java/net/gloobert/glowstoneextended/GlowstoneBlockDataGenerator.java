package net.gloobert.glowstoneextended;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;

public class GlowstoneBlockDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
      final FabricDataGenerator.Pack pack = generator.createPack();
      pack.addProvider(GlowstoneBlockModels::new);
    }
}
