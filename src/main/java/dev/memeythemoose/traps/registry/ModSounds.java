package dev.memeythemoose.traps.registry;

import dev.memeythemoose.traps.MemeysTraps;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Sound events. The matching .ogg files go in {@code src/main/resources/assets/memeys_traps/sounds/} and are wired up
 * in {@code data/ModSoundDefinitionsProvider}.
 * <p>
 * Example:
 * <pre>{@code
 * public static final DeferredHolder<SoundEvent, SoundEvent> EXAMPLE = SOUND_EVENTS.register("block.example", SoundEvent::createVariableRangeEvent);
 * }</pre>
 */
public final class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, MemeysTraps.MOD_ID);

    // TODO: add sound events here.

    private ModSounds() {
    }
}
