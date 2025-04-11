
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.browndogfurniture.block.TitaniumOreBlock;
import net.browndogfurniture.block.TitaniumBlockBlock;
import net.browndogfurniture.block.TarDustOreBlock;
import net.browndogfurniture.block.TarDustBlockBlock;
import net.browndogfurniture.block.SteelOreBlock;
import net.browndogfurniture.block.SteelBlockBlock;
import net.browndogfurniture.block.StainlessSteelBlockBlock;
import net.browndogfurniture.block.SapphireOreBlock;
import net.browndogfurniture.block.SapphireBlockBlock;
import net.browndogfurniture.block.PlasticOreBlock;
import net.browndogfurniture.block.PlasticBlockBlock;
import net.browndogfurniture.block.NickelOreBlock;
import net.browndogfurniture.block.NickelBlockBlock;
import net.browndogfurniture.block.BlueWoodBlock;
import net.browndogfurniture.block.BlueStairsBlock;
import net.browndogfurniture.block.BlueSlabBlock;
import net.browndogfurniture.block.BluePressurePlateBlock;
import net.browndogfurniture.block.BluePlanksBlock;
import net.browndogfurniture.block.BlueLogBlock;
import net.browndogfurniture.block.BlueLeavesBlock;
import net.browndogfurniture.block.BlueFenceGateBlock;
import net.browndogfurniture.block.BlueFenceBlock;
import net.browndogfurniture.block.BlueButtonBlock;
import net.browndogfurniture.block.BasicCoffeeMachenBlock;
import net.browndogfurniture.block.AetheriumOreBlock;
import net.browndogfurniture.block.AetheriumBlockBlock;
import net.browndogfurniture.BrowndogFurnitureMod;

public class BrowndogFurnitureModBlocks {
	public static Block TITANIUM_BLOCK;
	public static Block TITANIUM_ORE;
	public static Block AETHERIUM_ORE;
	public static Block AETHERIUM_BLOCK;
	public static Block STEEL_ORE;
	public static Block STEEL_BLOCK;
	public static Block STAINLESS_STEEL_BLOCK;
	public static Block BASIC_COFFEE_MACHEN;
	public static Block NICKEL_ORE;
	public static Block NICKEL_BLOCK;
	public static Block SAPPHIRE_ORE;
	public static Block SAPPHIRE_BLOCK;
	public static Block PLASTIC_ORE;
	public static Block PLASTIC_BLOCK;
	public static Block TAR_DUST_ORE;
	public static Block TAR_DUST_BLOCK;
	public static Block BLUE_WOOD;
	public static Block BLUE_LOG;
	public static Block BLUE_PLANKS;
	public static Block BLUE_LEAVES;
	public static Block BLUE_STAIRS;
	public static Block BLUE_SLAB;
	public static Block BLUE_FENCE;
	public static Block BLUE_FENCE_GATE;
	public static Block BLUE_PRESSURE_PLATE;
	public static Block BLUE_BUTTON;

	public static void load() {
		TITANIUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_block"), new TitaniumBlockBlock());
		TITANIUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_ore"), new TitaniumOreBlock());
		AETHERIUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_ore"), new AetheriumOreBlock());
		AETHERIUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_block"), new AetheriumBlockBlock());
		STEEL_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_ore"), new SteelOreBlock());
		STEEL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_block"), new SteelBlockBlock());
		STAINLESS_STEEL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "stainless_steel_block"), new StainlessSteelBlockBlock());
		BASIC_COFFEE_MACHEN = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "basic_coffee_machen"), new BasicCoffeeMachenBlock());
		NICKEL_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "nickel_ore"), new NickelOreBlock());
		NICKEL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "nickel_block"), new NickelBlockBlock());
		SAPPHIRE_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "sapphire_ore"), new SapphireOreBlock());
		SAPPHIRE_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "sapphire_block"), new SapphireBlockBlock());
		PLASTIC_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "plastic_ore"), new PlasticOreBlock());
		PLASTIC_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "plastic_block"), new PlasticBlockBlock());
		TAR_DUST_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "tar_dust_ore"), new TarDustOreBlock());
		TAR_DUST_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "tar_dust_block"), new TarDustBlockBlock());
		BLUE_WOOD = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_wood"), new BlueWoodBlock());
		BLUE_LOG = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_log"), new BlueLogBlock());
		BLUE_PLANKS = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_planks"), new BluePlanksBlock());
		BLUE_LEAVES = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_leaves"), new BlueLeavesBlock());
		BLUE_STAIRS = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_stairs"), new BlueStairsBlock());
		BLUE_SLAB = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_slab"), new BlueSlabBlock());
		BLUE_FENCE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_fence"), new BlueFenceBlock());
		BLUE_FENCE_GATE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_fence_gate"), new BlueFenceGateBlock());
		BLUE_PRESSURE_PLATE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_pressure_plate"), new BluePressurePlateBlock());
		BLUE_BUTTON = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "blue_button"), new BlueButtonBlock());
	}

	public static void clientLoad() {
		TitaniumBlockBlock.clientInit();
		TitaniumOreBlock.clientInit();
		AetheriumOreBlock.clientInit();
		AetheriumBlockBlock.clientInit();
		SteelOreBlock.clientInit();
		SteelBlockBlock.clientInit();
		StainlessSteelBlockBlock.clientInit();
		BasicCoffeeMachenBlock.clientInit();
		NickelOreBlock.clientInit();
		NickelBlockBlock.clientInit();
		SapphireOreBlock.clientInit();
		SapphireBlockBlock.clientInit();
		PlasticOreBlock.clientInit();
		PlasticBlockBlock.clientInit();
		TarDustOreBlock.clientInit();
		TarDustBlockBlock.clientInit();
		BlueWoodBlock.clientInit();
		BlueLogBlock.clientInit();
		BluePlanksBlock.clientInit();
		BlueLeavesBlock.clientInit();
		BlueStairsBlock.clientInit();
		BlueSlabBlock.clientInit();
		BlueFenceBlock.clientInit();
		BlueFenceGateBlock.clientInit();
		BluePressurePlateBlock.clientInit();
		BlueButtonBlock.clientInit();
	}
}
