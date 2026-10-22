# Memey's Traps (bare)

The empty shell of a NeoForge 26.3 mod: the project setup, the registration framework and the data generators are
in place, but no traps are implemented yet. The finished reference lives in `../wyatts-traps-neoforge`.

Requires **Java 25**.

```sh
./gradlew build                       # jar in build/libs/
./gradlew runClient                   # dev client (run/client)
./gradlew runClient -PquickPlay=NAME  # jump straight into the singleplayer world folder NAME
./gradlew runServer                   # dev server (run/server)
./gradlew runData                     # regenerate src/generated/resources
```

## Adding a trap

1. Write the block class (and block entity, if it needs to tick or remember something) in a new `block/` package.
2. Register it in `registry/ModBlocks`, its item in `registry/ModItems`, and the block entity type in
   `registry/ModBlockEntities`. Sounds go in `registry/ModSounds`, damage types in `registry/ModDamageTypes`.
3. Give it data: a model in `data/ModModelProvider`, a name in `data/ModLanguageProvider`, a loot table in
   `data/ModBlockLootSubProvider`, a recipe in `data/ModRecipeProvider`, tool tags in `data/ModBlockTagsProvider`,
   and sound definitions in `data/ModSoundDefinitionsProvider`.
4. Drop textures in `src/main/resources/assets/memeys_traps/textures/{block,item}/` and run `./gradlew runData`.
5. `./gradlew runClient` and try it.

Each registry and provider class carries a short example in its Javadoc. There are no textures or sounds yet:
add them under `src/main/resources/assets/memeys_traps/textures/{block,item}/` and `.../sounds/` as each trap is
built (the mod icon referenced by `neoforge.mods.toml`'s `iconFile` is optional too).

## Layout

```
src/main/java/dev/memeythemoose/traps/
  MemeysTraps.java          @Mod entry point: hooks the DeferredRegisters to the mod bus
  registry/                 ModBlocks, ModItems, ModBlockEntities, ModSounds, ModCreativeTabs, ModDamageTypes
  data/                     data generators (client-only, run by `gradlew runData`)
src/main/resources/         hand-made files only (textures, sounds, mod icon), none yet
src/main/templates/         neoforge.mods.toml, expanded from gradle.properties at build time
src/generated/resources/    everything datagen writes
```
