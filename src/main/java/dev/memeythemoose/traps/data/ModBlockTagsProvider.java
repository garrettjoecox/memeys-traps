package dev.memeythemoose.traps.data;

import dev.memeythemoose.traps.MemeysTraps;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

/**
 * Block tags, most importantly the {@code mineable/...} tags that decide which tool breaks a block quickly.
 * Entries are resource keys: {@code tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.EXAMPLE.getKey())}.
 */
public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, MemeysTraps.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // TODO: tag each block with the tool that mines it, plus any vanilla tags it should join (doors, beds, ...).
    }
}
