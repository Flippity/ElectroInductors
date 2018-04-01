package com.flippity.ei.common.tiles.atomic;

import com.flippity.ei.client.renderers.atomic.RendererTurbine;
import com.flippity.ei.common.blocks.atomic.RecipeBlockElectromagnet;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class TETurbine extends TileEntity {

	
	public void updateEntity() {
		if(worldObj.getBlock(xCoord, yCoord --, zCoord) == Blocks.water) {
			if(worldObj.getBlock(xCoord, yCoord -= 2, zCoord) instanceof RecipeBlockElectromagnet) {
				//updateConnections();
			}
		}
	}
	
	public void updateConnections() {
		//RendererTurbine.canSpin();
	}

}
