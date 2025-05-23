
package net.browndogfurniture.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.browndogfurniture.init.BrowndogFurnitureModBlocks;

import java.util.List;
import java.util.Collections;

public class BlueStairsBlock extends StairBlock {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.WOOD).sound(SoundType.WOOD).strength(3.3f, 2.2f).dynamicShape();

	public BlueStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), PROPERTIES);
		FlammableBlockRegistry.getDefaultInstance().add(this, 6, 0);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(BrowndogFurnitureModBlocks.BLUE_STAIRS, RenderType.solid());
	}
}
