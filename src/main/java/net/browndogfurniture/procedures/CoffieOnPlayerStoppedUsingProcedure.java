package net.browndogfurniture.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.browndogfurniture.BrowndogFurnitureMod;

import java.util.Map;

public class CoffieOnPlayerStoppedUsingProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BrowndogFurnitureMod.LOGGER.warn("Failed to load dependency entity for procedure CoffieOnPlayerStoppedUsing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2));
	}
}
