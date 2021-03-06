package com.flippity.ei.client.renderers;

import org.lwjgl.opengl.GL11;

import com.flippity.ei.client.renderers.cables.ItemRendererCableCopper;
import com.flippity.ei.common.tiles.cables.TECableCopper;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class GenericItemBlockRenderer implements IItemRenderer{
	

	private TileEntity tile;
	private TileEntitySpecialRenderer renderer;

	public GenericItemBlockRenderer(TileEntity tile, TileEntitySpecialRenderer renderer) {
		this.tile = tile;
		this.renderer = renderer;
	}


	public GenericItemBlockRenderer(TECableCopper tile2,
			ItemRendererCableCopper itemRendererCable) {
	}


	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
			TileEntityRendererDispatcher.instance.renderTileEntityAt(tile, 0, 0, 0, 0);
		GL11.glPopMatrix();
		
	}

}
