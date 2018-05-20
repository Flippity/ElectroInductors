package com.flippity.ei.client.gui;
import com.flippity.ei.client.gui.container.ContainerCentrifuge;
import com.flippity.ei.common.tiles.atomic.TECentrifuge;
import com.flippity.ei.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiCentrifuge extends GuiContainer{

	public GuiCentrifuge(InventoryPlayer player, TECentrifuge tile) {
		super(new ContainerCentrifuge(player, tile));
		this.xSize = 176;
		this.ySize = 176;
	}

	public static ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/centrifuge.png");


	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int x, int y) {
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	
}