
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class BrowndogFurnitureModTabs {
	public static CreativeModeTab TAB_BROWNDOG_FURNITURE_FOOD_CREATIVE_TAB;
	public static CreativeModeTab TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB;

	public static void load() {
		TAB_BROWNDOG_FURNITURE_FOOD_CREATIVE_TAB = FabricItemGroupBuilder.create(new ResourceLocation("browndog_furniture", "browndog_furniture_food_creative_tab")).icon(() -> new ItemStack(Items.COOKED_BEEF)).build();
		TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB = FabricItemGroupBuilder.create(new ResourceLocation("browndog_furniture", "browndog_furniture_resource_creative_tab")).icon(() -> new ItemStack(BrowndogFurnitureModItems.AETHERIUM_INGOT)).build();
	}
}
