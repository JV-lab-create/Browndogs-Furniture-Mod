
package net.browndogfurniture.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.browndogfurniture.init.BrowndogFurnitureModItems;

public class PlasticPickaxeItem extends PickaxeItem {
	public PlasticPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 10;
			}

			public float getSpeed() {
				return 0.5f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BrowndogFurnitureModItems.PLASTIC_INGOT));
			}
		}, 1, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
