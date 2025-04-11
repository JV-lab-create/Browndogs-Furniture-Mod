
package net.browndogfurniture.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.browndogfurniture.init.BrowndogFurnitureModTabs;

public class StainlessSteelIngotItem extends Item {
	public StainlessSteelIngotItem() {
		super(new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
