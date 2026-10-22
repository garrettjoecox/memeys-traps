package dev.memeythemoose.traps;

import com.mojang.logging.LogUtils;
import dev.memeythemoose.traps.registry.ModBlockEntities;
import dev.memeythemoose.traps.registry.ModBlocks;
import dev.memeythemoose.traps.registry.ModCreativeTabs;
import dev.memeythemoose.traps.registry.ModItems;
import dev.memeythemoose.traps.registry.ModSounds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Memey's Traps: bear traps, wind traps, landmines, motion detectors, alarms, instant TNT and booby-trapped furniture.
 * <p>
 * All content is registered through {@link net.neoforged.neoforge.registries.DeferredRegister}s hooked to the mod bus here,
 * and every JSON asset/data file is produced by the generators in {@code dev.memeythemoose.traps.data} (run {@code gradlew runData}).
 */
@Mod(MemeysTraps.MOD_ID)
public final class MemeysTraps {

    public static final String MOD_ID = "memeys_traps";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MemeysTraps(IEventBus modBus) {
        ModSounds.SOUND_EVENTS.register(modBus);
        ModBlocks.BLOCKS.register(modBus);
        ModItems.ITEMS.register(modBus);
        ModBlockEntities.BLOCK_ENTITY_TYPES.register(modBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modBus);
    }
}
