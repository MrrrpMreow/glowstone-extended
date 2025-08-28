package net.gloobert.glowstoneextended;

public class GlowstoneBlockDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
      // ...
      pack.addProvider(GlowstoneBlockModels::new);
    }
}
