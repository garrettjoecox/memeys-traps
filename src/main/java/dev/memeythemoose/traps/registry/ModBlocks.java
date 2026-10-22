package dev.memeythemoose.traps.registry;

import dev.memeythemoose.traps.MemeysTraps;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Every block of the mod is declared here as a {@code DeferredBlock} field.
 * <p>
 * Example (a plain block with its own class):
 * <pre>{@code
 * public static final DeferredBlock<ExampleBlock> EXAMPLE = BLOCKS.registerBlock("example", ExampleBlock::new, p -> p
 *         .mapColor(MapColor.METAL)
 *         .strength(3.0F, 6.0F)
 *         .sound(SoundType.METAL)
 *         .requiresCorrectToolForDrops());
 * }</pre>
 * The registry name ("example") is also the texture, model, loot table and translation name, so choose it once.
 */
public final class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MemeysTraps.MOD_ID);

    // TODO: add the trap blocks here.

    private ModBlocks() {
    }
}
