package dev.memeythemoose.traps.data;

import dev.memeythemoose.traps.MemeysTraps;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

/**
 * Generates block states, block models, item models and client item definitions for every block and item of the mod.
 * Datagen fails if a registered block or item is left without a model, so each new block needs a line here.
 * <p>
 * Useful helpers on {@link BlockModelGenerators}:
 * <ul>
 *   <li>{@code createTrivialCube(block)} - same texture on all sides ({@code textures/block/<name>.png})</li>
 *   <li>{@code createTrivialBlock(block, TexturedModel.CUBE_BOTTOM_TOP)} - {@code <name>_top/_bottom/_side.png}</li>
 *   <li>{@code createHorizontallyRotatedBlock(block, TexturedModel.ORIENTABLE_ONLY_TOP)} - furnace-like</li>
 *   <li>{@code registerSimpleFlatItemModel(item)} - a flat sprite from {@code textures/item/<name>.png}</li>
 *   <li>{@code blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(createBooleanModelDispatch(PROPERTY, onModel, offModel)))}
 *       for blocks that switch model on a boolean property</li>
 *   <li>NeoForge's {@code ExtendedModelTemplateBuilder} for custom element geometry</li>
 * </ul>
 */
public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, MemeysTraps.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // TODO: generate models for each block and item.
    }
}
