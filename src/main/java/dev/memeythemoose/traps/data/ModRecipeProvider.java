package dev.memeythemoose.traps.data;

import net.minecraft.advancements.Advancement;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.Recipe;

/**
 * Crafting recipes. Recipes are a reloadable registry in 26.x, so this provider is hooked up through
 * {@code GatherDataRegistryEntriesEvent#recipe} in {@link ModDataGenerators}.
 * <pre>{@code
 * shaped(RecipeCategory.REDSTONE, ModItems.EXAMPLE.get())
 *         .pattern("I I").pattern("ITI").pattern("III")
 *         .define('I', Items.IRON_INGOT).define('T', Items.TRIPWIRE_HOOK)
 *         .unlockedBy("has_tripwire_hook", has(Items.TRIPWIRE_HOOK))
 *         .save(output);
 * shapeless(RecipeCategory.REDSTONE, ModItems.EXAMPLE.get()).requires(Items.TNT).requires(Items.REDSTONE)
 *         .unlockedBy("has_tnt", has(Items.TNT)).save(output);
 * }</pre>
 */
public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    protected void buildRecipes() {
        // TODO: one recipe per block.
    }
}
