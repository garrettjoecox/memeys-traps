package dev.memeythemoose.traps.registry;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.damagesource.DamageType;

/**
 * Damage types are a datapack registry: declare a {@code ResourceKey<DamageType>} here, register the entry in
 * {@link #bootstrap} (datagen writes the JSON), and build a {@code DamageSource} from it at runtime.
 * <p>
 * Example:
 * <pre>{@code
 * public static final ResourceKey<DamageType> EXAMPLE = ResourceKey.create(Registries.DAMAGE_TYPE,
 *         Identifier.fromNamespaceAndPath(MemeysTraps.MOD_ID, "example"));
 *
 * // in bootstrap: the death message key becomes "death.attack.memeys_traps.example"
 * context.register(EXAMPLE, new DamageType(MemeysTraps.MOD_ID + ".example", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1F));
 *
 * public static DamageSource example(Level level) {
 *     return new DamageSource(level.registryAccess().lookupOrThrow(Registries.DAMAGE_TYPE).getOrThrow(EXAMPLE));
 * }
 * }</pre>
 */
public final class ModDamageTypes {

    private ModDamageTypes() {
    }

    public static void bootstrap(BootstrapContext<DamageType> context) {
        // TODO: register damage types here.
    }
}
