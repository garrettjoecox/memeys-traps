package dev.memeythemoose.traps.registry;

import dev.memeythemoose.traps.MemeysTraps;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Block entity types for blocks that need to tick or store data.
 * <p>
 * Example:
 * <pre>{@code
 * public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ExampleBlockEntity>> EXAMPLE =
 *         BLOCK_ENTITY_TYPES.register("example", () -> new BlockEntityType<>(ExampleBlockEntity::new, false, ModBlocks.EXAMPLE.get()));
 * }</pre>
 * The block entity's constructor then calls {@code super(ModBlockEntities.EXAMPLE.get(), pos, state)}.
 */
public final class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MemeysTraps.MOD_ID);

    // TODO: add block entity types here.

    private ModBlockEntities() {
    }
}
