package dev.memeythemoose.traps.data;

import dev.memeythemoose.traps.MemeysTraps;
import dev.memeythemoose.traps.registry.ModCreativeTabs;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

/** English translations. Use {@code addBlock(ModBlocks.X, "Name")} for blocks and {@code add(key, value)} for anything else. */
public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, MemeysTraps.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModCreativeTabs.TITLE_KEY, "Memey's Traps");
        // TODO: block names, death messages ("death.attack.memeys_traps.<id>") and sound subtitles.
    }
}
