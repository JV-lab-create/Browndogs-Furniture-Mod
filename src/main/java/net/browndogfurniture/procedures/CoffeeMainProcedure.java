package net.browndogfurniture.procedures;

import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.browndogfurniture.init.BrowndogFurnitureModItems;
import net.browndogfurniture.BrowndogFurnitureMod;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class CoffeeMainProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency world for procedure CoffeeMain!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency x for procedure CoffeeMain!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency y for procedure CoffeeMain!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency z for procedure CoffeeMain!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency entity for procedure CoffeeMain!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double previousRecipe = 0;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 0)).getItem() == Items.POTION && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 1)).getItem() == Items.COCOA_BEANS) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BrowndogFurnitureModItems.COFFIE);
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
