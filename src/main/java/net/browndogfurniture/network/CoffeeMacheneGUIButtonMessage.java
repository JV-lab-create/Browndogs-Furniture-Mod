
package net.browndogfurniture.network;

import net.minecraft.world.level.Level;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.FriendlyByteBuf;

import net.fabricmc.fabric.api.networking.v1.PacketSender;

import net.browndogfurniture.world.inventory.CoffeeMacheneGUIMenu;
import net.browndogfurniture.procedures.CoffeeMacheneGUIScriptProcedure;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class CoffeeMacheneGUIButtonMessage extends FriendlyByteBuf {
	public CoffeeMacheneGUIButtonMessage(int buttonID, int x, int y, int z) {
		super(Unpooled.buffer());
		writeInt(buttonID);
		writeInt(x);
		writeInt(y);
		writeInt(z);
	}

	public static void apply(MinecraftServer server, ServerPlayer entity, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf, PacketSender responseSender) {
		int buttonID = buf.readInt();
		double x = buf.readInt();
		double y = buf.readInt();
		double z = buf.readInt();
		server.execute(() -> {
			Level world = entity.getLevel();
			HashMap guistate = CoffeeMacheneGUIMenu.guistate;
			if (buttonID == 0) {

				CoffeeMacheneGUIScriptProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
		});
	}
}
