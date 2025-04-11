
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.browndogfurniture.block.TitaniumOreBlock;
import net.browndogfurniture.block.TitaniumBlockBlock;
import net.browndogfurniture.block.SteelOreBlock;
import net.browndogfurniture.block.SteelBlockBlock;
import net.browndogfurniture.block.StainlessSteelBlockBlock;
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

	public static void load() {
		TITANIUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_block"), new TitaniumBlockBlock());
		TITANIUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_ore"), new TitaniumOreBlock());
		AETHERIUM_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_ore"), new AetheriumOreBlock());
		AETHERIUM_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_block"), new AetheriumBlockBlock());
		STEEL_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_ore"), new SteelOreBlock());
		STEEL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_block"), new SteelBlockBlock());
		STAINLESS_STEEL_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "stainless_steel_block"), new StainlessSteelBlockBlock());
		BASIC_COFFEE_MACHEN = Registry.register(Registry.BLOCK, new ResourceLocation(BrowndogFurnitureMod.MODID, "basic_coffee_machen"), new BasicCoffeeMachenBlock());
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
	}
}
