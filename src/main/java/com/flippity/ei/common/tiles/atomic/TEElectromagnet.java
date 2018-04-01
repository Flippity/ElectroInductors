package com.flippity.ei.common.tiles.atomic;

import com.flippity.ei.common.blocks.BlockRegistry;

import net.minecraft.tileentity.TileEntity;

public class TEElectromagnet extends TileEntity{
	
	public TEElectromagnet() {
		this.updateEntity();
	}

	public static int heat = 0;
	int ticks = 0;
	
	@Override
	public void updateEntity(){
		ticks ++;
		if(ticks == 10) {
			if(worldObj.getBlock(xCoord + 1, yCoord, zCoord) == BlockRegistry.blockPlasma) {
				heat = TEPlasma.heat;
			}else if(worldObj.getBlock(xCoord - 1, yCoord, zCoord) == BlockRegistry.blockPlasma) {
				heat = TEPlasma.heat;
			}else if(worldObj.getBlock(xCoord, yCoord + 1, zCoord) == BlockRegistry.blockPlasma) {
				heat = TEPlasma.heat;
			}else if(worldObj.getBlock(xCoord, yCoord - 1, zCoord) == BlockRegistry.blockPlasma) {
				heat = TEPlasma.heat;
			}else if(worldObj.getBlock(xCoord, yCoord, zCoord + 1) == BlockRegistry.blockPlasma) {
				heat = TEPlasma.heat;
			}else if(worldObj.getBlock(xCoord, yCoord, zCoord - 1) == BlockRegistry.blockPlasma) {
				heat = TEPlasma.heat;
			}else {
				heat = 30;
			}
			ticks = 0;
		}
	}
}
