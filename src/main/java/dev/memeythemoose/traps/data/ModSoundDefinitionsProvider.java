package dev.memeythemoose.traps.data;

import dev.memeythemoose.traps.MemeysTraps;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

/**
 * Writes assets/memeys_traps/sounds.json. Each registered sound event is mapped to one or more .ogg files:
 * <pre>{@code
 * add(ModSounds.EXAMPLE, definition().with(sound(file("example"))).subtitle("subtitles.memeys_traps.example"));
 * }</pre>
 * Sound files must be mono OGG Vorbis, otherwise they play at full volume everywhere.
 */
public class ModSoundDefinitionsProvider extends SoundDefinitionsProvider {

    public ModSoundDefinitionsProvider(PackOutput output) {
        super(output, MemeysTraps.MOD_ID);
    }

    @Override
    public void registerSounds() {
        // TODO: map sound events to .ogg files.
    }

    private static Identifier file(String name) {
        return Identifier.fromNamespaceAndPath(MemeysTraps.MOD_ID, name);
    }
}
