/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.browndogfurniture;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import net.browndogfurniture.init.BrowndogFurnitureModTabs;
import net.browndogfurniture.init.BrowndogFurnitureModProcedures;
import net.browndogfurniture.init.BrowndogFurnitureModMenus;
import net.browndogfurniture.init.BrowndogFurnitureModItems;
import net.browndogfurniture.init.BrowndogFurnitureModFeatures;
import net.browndogfurniture.init.BrowndogFurnitureModBlocks;
import net.browndogfurniture.init.BrowndogFurnitureModBlockEntities;

public class BrowndogFurnitureMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "browndog_furniture";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing BrowndogFurnitureMod");

		BrowndogFurnitureModTabs.load();

		BrowndogFurnitureModBlocks.load();
		BrowndogFurnitureModItems.load();
		BrowndogFurnitureModBlockEntities.load();

		BrowndogFurnitureModFeatures.load();

		BrowndogFurnitureModProcedures.load();

		BrowndogFurnitureModMenus.load();

	}
}
