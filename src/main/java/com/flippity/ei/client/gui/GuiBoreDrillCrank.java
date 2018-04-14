package com.flippity.ei.client.gui;

import org.lwjgl.opengl.GL11;

import com.flippity.ei.client.gui.container.ContainerBoreDrillCrank;
import com.flippity.ei.common.tiles.base.machines.TEBoreDrillCrank;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class GuiBoreDrillCrank extends GuiContainer{
	
	private static final ResourceLocation furnaceGuiTextures = new ResourceLocation("textures/gui/blank.png");
	private TEBoreDrillCrank tileFurnace;

	public GuiBoreDrillCrank(InventoryPlayer invPlayer, TEBoreDrillCrank tile) {
		super(new ContainerBoreDrillCrank(invPlayer, tile));
		this.tileFurnace = tile;
		
	}
	
	protected void drawGuiContainerForegroundLayer(int par1, int par2){
		String string = this.tileFurnace.hasCustomInventoryName() ? this.tileFurnace.getInventoryName() : I18n.format(this.tileFurnace.getInventoryName(), new Object[0]);
		this.fontRendererObj.drawString(string, this.xSize / 2 - this.fontRendererObj.getStringWidth(string), 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 94, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
	        int k = (this.width - this.xSize) / 2;
	        int l = (this.height - this.ySize) / 2;
	        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	        int i1;


	}

}