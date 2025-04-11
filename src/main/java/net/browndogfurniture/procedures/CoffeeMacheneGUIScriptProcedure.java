package net.browndogfurniture.procedures;

import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;

import net.browndogfurniture.init.BrowndogFurnitureModItems;
import net.browndogfurniture.BrowndogFurnitureMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class CoffeeMacheneGUIScriptProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency world for procedure CoffeeMacheneGUIScript!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency x for procedure CoffeeMacheneGUIScript!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency y for procedure CoffeeMacheneGUIScript!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency z for procedure CoffeeMacheneGUIScript!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 1)).getItem() == Items.COCOA_BEANS && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 0)).getItem() == Items.POTION) {
			BlockEntity _ent4 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent4 != null) {
				((RandomizableContainerBlockEntity) _ent4).removeItem(0, 1);
			}
			BlockEntity _ent5 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent5 != null) {
				((RandomizableContainerBlockEntity) _ent5).removeItem(1, 1);
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				ItemStack stack = new ItemStack(BrowndogFurnitureModItems.COFFIE);
				stack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (new BlockPos(x, y, z)), 2) + 1));
				if (_ent != null) {
					((RandomizableContainerBlockEntity) _ent).setItem(2, stack);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), SoundEvents.BREWING_STAND_BREW, SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, SoundEvents.BREWING_STAND_BREW, SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 1)).getItem() == BrowndogFurnitureModItems.CHOCOLATE && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> stack = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					stack.set(((RandomizableContainerBlockEntity) _ent).getItem(slotid).copy());
				return stack.get();
			}
		}.getItemStack(world, (new BlockPos(x, y, z)), 0)).getItem() == Items.POTION) {
			BlockEntity _ent13 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent13 != null) {
				((RandomizableContainerBlockEntity) _ent13).removeItem(0, 1);
			}
			BlockEntity _ent14 = world.getBlockEntity(new BlockPos(x, y, z));
			if (_ent14 != null) {
				((RandomizableContainerBlockEntity) _ent14).removeItem(1, 1);
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				ItemStack stack = new ItemStack(BrowndogFurnitureModItems.HOT_CHOCOLATE);
				stack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger count = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						RandomizableContainerBlockEntity ent = (RandomizableContainerBlockEntity) _ent;
						if (_ent != null)
							count.set((int) ent.countItem(ent.getItem(slotid).getItem()));
						return count.get();
					}
				}.getAmount(world, (new BlockPos(x, y, z)), 2) + 1));
				if (_ent != null) {
					((RandomizableContainerBlockEntity) _ent).setItem(2, stack);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), SoundEvents.BREWING_STAND_BREW, SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, SoundEvents.BREWING_STAND_BREW, SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}
