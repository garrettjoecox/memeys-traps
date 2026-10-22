package dev.memeythemoose.traps.registry;

import dev.memeythemoose.traps.MemeysTraps;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/** One creative tab that automatically lists every item registered in {@link ModItems}. */
public final class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MemeysTraps.MOD_ID);

    public static final String TITLE_KEY = "itemGroup." + MemeysTraps.MOD_ID;

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TRAPS = CREATIVE_MODE_TABS.register("traps", () -> CreativeModeTab.builder()
            .title(Component.translatable(TITLE_KEY))
            // TODO: switch the icon to one of the mod's own items once it exists, e.g. new ItemStack(ModItems.BEAR_TRAP.get()).
            .icon(() -> new ItemStack(Items.TRIPWIRE_HOOK))
            .displayItems((parameters, output) -> ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get())))
            .build());

    private ModCreativeTabs() {
    }
}
