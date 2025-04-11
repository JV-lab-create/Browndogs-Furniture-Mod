
package net.browndogfurniture.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.browndogfurniture.init.BrowndogFurnitureModTabs;

import java.util.List;

public class AdvancedComputerChipItem extends Item {
	public AdvancedComputerChipItem() {
		super(new Item.Properties().tab(BrowndogFurnitureModTabs.TAB_BROWNDOG_FURNITURE_RESOURCE_CREATIVE_TAB).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Used to make Advanced Electronics"));
	}
}
