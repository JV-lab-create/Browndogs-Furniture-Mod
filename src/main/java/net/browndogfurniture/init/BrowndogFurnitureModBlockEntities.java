
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.browndogfurniture.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.browndogfurniture.block.entity.BasicCoffeeMachenBlockEntity;
import net.browndogfurniture.BrowndogFurnitureMod;

public class BrowndogFurnitureModBlockEntities {
	public static BlockEntityType<?> BASIC_COFFEE_MACHEN;

	public static void load() {
		BASIC_COFFEE_MACHEN = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(BrowndogFurnitureMod.MODID, "basic_coffee_machen"),
				FabricBlockEntityTypeBuilder.create(BasicCoffeeMachenBlockEntity::new, BrowndogFurnitureModBlocks.BASIC_COFFEE_MACHEN).build(null));
	}
}
