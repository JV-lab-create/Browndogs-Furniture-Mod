
package net.browndogfurniture.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.browndogfurniture.init.BrowndogFurnitureModTabs;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_FOOD_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
