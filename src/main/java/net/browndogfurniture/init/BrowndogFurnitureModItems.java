
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.browndogfurniture.item.TitaniumSwordItem;
import net.browndogfurniture.item.TitaniumShovelItem;
import net.browndogfurniture.item.TitaniumPickaxeItem;
import net.browndogfurniture.item.TitaniumIngotItem;
import net.browndogfurniture.item.TitaniumHoeItem;
import net.browndogfurniture.item.TitaniumAxeItem;
import net.browndogfurniture.item.TitaniumArmorItem;
import net.browndogfurniture.item.SteelIngotItem;
import net.browndogfurniture.item.StainlessSteelIngotItem;
import net.browndogfurniture.item.HotChocolateItem;
import net.browndogfurniture.item.CoffieItem;
import net.browndogfurniture.item.ChocolateItem;
import net.browndogfurniture.item.AetheriumSwordItem;
import net.browndogfurniture.item.AetheriumShovelItem;
import net.browndogfurniture.item.AetheriumPickaxeItem;
import net.browndogfurniture.item.AetheriumIngotItem;
import net.browndogfurniture.item.AetheriumHoeItem;
import net.browndogfurniture.item.AetheriumAxeItem;
import net.browndogfurniture.item.AetheriumArmorItem;
import net.browndogfurniture.BrowndogFurnitureMod;

public class BrowndogFurnitureModItems {
	public static Item AETHERIUM_ARMOR_HELMET;
	public static Item AETHERIUM_ARMOR_CHESTPLATE;
	public static Item AETHERIUM_ARMOR_LEGGINGS;
	public static Item AETHERIUM_ARMOR_BOOTS;
	public static Item TITANIUM_ARMOR_HELMET;
	public static Item TITANIUM_ARMOR_CHESTPLATE;
	public static Item TITANIUM_ARMOR_LEGGINGS;
	public static Item TITANIUM_ARMOR_BOOTS;
	public static Item TITANIUM_BLOCK;
	public static Item TITANIUM_ORE;
	public static Item AETHERIUM_ORE;
	public static Item AETHERIUM_BLOCK;
	public static Item AETHERIUM_INGOT;
	public static Item TITANIUM_INGOT;
	public static Item TITANIUM_AXE;
	public static Item TITANIUM_PICKAXE;
	public static Item TITANIUM_SWORD;
	public static Item TITANIUM_SHOVEL;
	public static Item TITANIUM_HOE;
	public static Item AETHERIUM_PICKAXE;
	public static Item AETHERIUM_AXE;
	public static Item AETHERIUM_SWORD;
	public static Item AETHERIUM_SHOVEL;
	public static Item AETHERIUM_HOE;
	public static Item STEEL_ORE;
	public static Item STEEL_BLOCK;
	public static Item STAINLESS_STEEL_BLOCK;
	public static Item STEEL_INGOT;
	public static Item STAINLESS_STEEL_INGOT;
	public static Item COFFIE;
	public static Item CHOCOLATE;
	public static Item BASIC_COFFEE_MACHEN;
	public static Item HOT_CHOCOLATE;

	public static void load() {
		AETHERIUM_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_armor_helmet"), new AetheriumArmorItem.Helmet());
		AETHERIUM_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_armor_chestplate"), new AetheriumArmorItem.Chestplate());
		AETHERIUM_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_armor_leggings"), new AetheriumArmorItem.Leggings());
		AETHERIUM_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_armor_boots"), new AetheriumArmorItem.Boots());
		TITANIUM_ARMOR_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_armor_helmet"), new TitaniumArmorItem.Helmet());
		TITANIUM_ARMOR_CHESTPLATE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_armor_chestplate"), new TitaniumArmorItem.Chestplate());
		TITANIUM_ARMOR_LEGGINGS = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_armor_leggings"), new TitaniumArmorItem.Leggings());
		TITANIUM_ARMOR_BOOTS = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_armor_boots"), new TitaniumArmorItem.Boots());
		TITANIUM_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_block"),
				new BlockItem(BrowndogFurnitureModBlocks.TITANIUM_BLOCK, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		TITANIUM_ORE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_ore"),
				new BlockItem(BrowndogFurnitureModBlocks.TITANIUM_ORE, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		AETHERIUM_ORE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_ore"),
				new BlockItem(BrowndogFurnitureModBlocks.AETHERIUM_ORE, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		AETHERIUM_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_block"),
				new BlockItem(BrowndogFurnitureModBlocks.AETHERIUM_BLOCK, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		AETHERIUM_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_ingot"), new AetheriumIngotItem());
		TITANIUM_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_ingot"), new TitaniumIngotItem());
		TITANIUM_AXE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_axe"), new TitaniumAxeItem());
		TITANIUM_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_pickaxe"), new TitaniumPickaxeItem());
		TITANIUM_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_sword"), new TitaniumSwordItem());
		TITANIUM_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_shovel"), new TitaniumShovelItem());
		TITANIUM_HOE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "titanium_hoe"), new TitaniumHoeItem());
		AETHERIUM_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_pickaxe"), new AetheriumPickaxeItem());
		AETHERIUM_AXE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_axe"), new AetheriumAxeItem());
		AETHERIUM_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_sword"), new AetheriumSwordItem());
		AETHERIUM_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_shovel"), new AetheriumShovelItem());
		AETHERIUM_HOE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "aetherium_hoe"), new AetheriumHoeItem());
		STEEL_ORE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_ore"),
				new BlockItem(BrowndogFurnitureModBlocks.STEEL_ORE, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		STEEL_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_block"),
				new BlockItem(BrowndogFurnitureModBlocks.STEEL_BLOCK, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		STAINLESS_STEEL_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "stainless_steel_block"),
				new BlockItem(BrowndogFurnitureModBlocks.STAINLESS_STEEL_BLOCK, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		STEEL_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "steel_ingot"), new SteelIngotItem());
		STAINLESS_STEEL_INGOT = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "stainless_steel_ingot"), new StainlessSteelIngotItem());
		COFFIE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "coffie"), new CoffieItem());
		CHOCOLATE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "chocolate"), new ChocolateItem());
		BASIC_COFFEE_MACHEN = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "basic_coffee_machen"),
				new BlockItem(BrowndogFurnitureModBlocks.BASIC_COFFEE_MACHEN, new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB)));
		HOT_CHOCOLATE = Registry.register(Registry.ITEM, new ResourceLocation(BrowndogFurnitureMod.MODID, "hot_chocolate"), new HotChocolateItem());
	}
}
