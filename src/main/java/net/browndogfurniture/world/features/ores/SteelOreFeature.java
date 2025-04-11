
package net.browndogfurniture.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import net.browndogfurniture.init.BrowndogFurnitureModBlocks;

import java.util.function.Predicate;
import java.util.List;

public class SteelOreFeature extends OreFeature {
	public static SteelOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SteelOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("browndog_furniture:steel_ore", FEATURE, new OreConfiguration(SteelOreFeatureRuleTest.INSTANCE, BrowndogFurnitureModBlocks.STEEL_ORE.defaultBlockState(), 4));
		PLACED_FEATURE = PlacementUtils.register("browndog_furniture:steel_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(7), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(43)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();

	public SteelOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class SteelOreFeatureRuleTest extends RuleTest {
		static final SteelOreFeatureRuleTest INSTANCE = new SteelOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<SteelOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<SteelOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST, new ResourceLocation("browndog_furniture:steel_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, RandomSource random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRANITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DIORITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.ANDESITE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
