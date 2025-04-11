
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.browndogfurniture.client.gui.CoffeeMacheneGUIScreen;

public class BrowndogFurnitureModScreens {
	public static void load() {
		MenuScreens.register(BrowndogFurnitureModMenus.COFFEE_MACHENE_GUI, CoffeeMacheneGUIScreen::new);
	}
}
