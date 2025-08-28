package net.gloobert.glowstoneextended;

public class GlowstoneBlockDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
      final FabricDataGenerator.Pack pack = generator.createPack();
      pack.addProvider(GlowstoneBlockModels::new);
    }
}
