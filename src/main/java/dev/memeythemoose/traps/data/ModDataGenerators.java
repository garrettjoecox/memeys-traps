package dev.memeythemoose.traps.data;

import dev.memeythemoose.traps.MemeysTraps;
import dev.memeythemoose.traps.registry.ModDamageTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;

/**
 * Entry point for {@code gradlew runData}. Everything under assets/ and data/ except textures and sounds is generated here.
 * Datagen only ever runs on the client distribution, so this class is client-only and never loaded by a dedicated server.
 */
@EventBusSubscriber(modid = MemeysTraps.MOD_ID, value = Dist.CLIENT)
public final class ModDataGenerators {

    private ModDataGenerators() {
    }

    /** Datapack registry content: recipes (+ their advancements), block loot tables and the bear trap damage type. */
    @SubscribeEvent
    public static void gatherRegistryEntries(GatherDataRegistryEntriesEvent event) {
        event.add(Registries.DAMAGE_TYPE, ModDamageTypes::bootstrap)
                .recipe(ModRecipeProvider::new)
                .lootTable(new LootTableProvider.SubProviderEntry(ModBlockLootSubProvider::new, LootContextParamSets.BLOCK));
    }

    /** Resource pack files (models, block states, client items, language, sound definitions) and block tags. */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModLanguageProvider::new);
        event.createProvider(ModSoundDefinitionsProvider::new);
        event.createProvider(ModBlockTagsProvider::new);
    }
}
