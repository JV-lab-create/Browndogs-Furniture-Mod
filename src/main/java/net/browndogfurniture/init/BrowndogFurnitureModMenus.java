
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import net.browndogfurniture.world.inventory.CoffeeMacheneGUIMenu;
import net.browndogfurniture.client.gui.CoffeeMacheneGUIScreen;
import net.browndogfurniture.BrowndogFurnitureMod;

public class BrowndogFurnitureModMenus {
	public static MenuType<CoffeeMacheneGUIMenu> COFFEE_MACHENE_GUI;

	public static void load() {
		COFFEE_MACHENE_GUI = Registry.register(Registry.MENU, new ResourceLocation(BrowndogFurnitureMod.MODID, "coffee_machene_gui"), new ExtendedScreenHandlerType<>(CoffeeMacheneGUIMenu::new));
		CoffeeMacheneGUIScreen.screenInit();
	}
}
