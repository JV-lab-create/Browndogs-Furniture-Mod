
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.browndogfurniture.world.features.ores.TitaniumOreFeature;
import net.browndogfurniture.world.features.ores.SteelOreFeature;
import net.browndogfurniture.world.features.ores.AetheriumOreFeature;
import net.browndogfurniture.BrowndogFurnitureMod;

import java.util.function.Predicate;

public class BrowndogFurnitureModFeatures {
	public static void load() {
		register("titanium_ore", TitaniumOreFeature.feature(), TitaniumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("aetherium_ore", AetheriumOreFeature.feature(), AetheriumOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("steel_ore", SteelOreFeature.feature(), SteelOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(BrowndogFurnitureMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(BrowndogFurnitureMod.MODID, registryName)));
	}
}
