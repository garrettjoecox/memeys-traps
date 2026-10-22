package dev.memeythemoose.traps.data;

import dev.memeythemoose.traps.registry.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

/**
 * Block drops. Datagen fails if a registered block has no entry, so every block needs a line such as
 * {@code dropSelf(ModBlocks.EXAMPLE.get())}, {@code add(block, this::createDoorTable)} or
 * {@code add(block, this::createNameableBlockEntityTable)}.
 */
public class ModBlockLootSubProvider extends BlockLootSubProvider {

    public ModBlockLootSubProvider(LootTableSubProvider.Context context) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, context);
    }

    @Override
    protected void generate() {
        // TODO: one loot table per block.
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(holder -> (Block) holder.get()).toList();
    }
}
