
package net.browndogfurniture.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import net.browndogfurniture.world.inventory.CoffeeMacheneGUIMenu;
import net.browndogfurniture.network.CoffeeMacheneGUIButtonMessage;
import net.browndogfurniture.BrowndogFurnitureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CoffeeMacheneGUIScreen extends AbstractContainerScreen<CoffeeMacheneGUIMenu> {
	private final static HashMap<String, Object> guistate = CoffeeMacheneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_brew;
	ImageButton imagebutton_gui_conection;
	ImageButton imagebutton_arrow;

	public CoffeeMacheneGUIScreen(CoffeeMacheneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("browndog_furniture:textures/screens/coffee_machene_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.browndog_furniture.coffee_machene_gui.label_coffee_machene"), 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_brew = new Button(this.leftPos + 123, this.topPos + 7, 46, 20, Component.translatable("gui.browndog_furniture.coffee_machene_gui.button_brew"), e -> {
			if (true) {
				ClientPlayNetworking.send(new ResourceLocation("browndog_furniture:coffeemachenegui_button_" + 0), new CoffeeMacheneGUIButtonMessage(0, x, y, z));
			}
		});
		guistate.put("button:button_brew", button_brew);
		this.addRenderableWidget(button_brew);
		imagebutton_gui_conection = new ImageButton(this.leftPos + 42, this.topPos + 43, 16, 16, 0, 0, 16, new ResourceLocation("browndog_furniture:textures/screens/atlas/imagebutton_gui_conection.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_gui_conection", imagebutton_gui_conection);
		this.addRenderableWidget(imagebutton_gui_conection);
		imagebutton_arrow = new ImageButton(this.leftPos + 78, this.topPos + 43, 16, 16, 0, 0, 16, new ResourceLocation("browndog_furniture:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
	}

	public static void screenInit() {
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(BrowndogFurnitureMod.MODID, "coffeemachenegui_button_0"), CoffeeMacheneGUIButtonMessage::apply);
	}
}
