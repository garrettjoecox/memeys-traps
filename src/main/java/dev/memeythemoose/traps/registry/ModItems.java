package dev.memeythemoose.traps.registry;

import dev.memeythemoose.traps.MemeysTraps;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Items, mostly the {@code BlockItem}s for {@link ModBlocks}.
 * <p>
 * Example (block item named after its block, with the block's translation key):
 * <pre>{@code
 * public static final DeferredItem<BlockItem> EXAMPLE = ITEMS.registerSimpleBlockItem(ModBlocks.EXAMPLE);
 * }</pre>
 * Blocks that need a special item class (doors, for instance) use {@code ITEMS.registerItem(name, props -> new ..., props -> props)}.
 */
public final class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MemeysTraps.MOD_ID);

    // TODO: add one block item per block here.

    private ModItems() {
    }
}
