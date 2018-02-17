package com.flippity.ei.common.tiles.cables.superconductor;

import com.flippity.ei.common.tiles.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.cables.copper.TECableCopperUninsulated;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TECableSuperconductorUninsulated extends TileEntity {
	
	public ForgeDirection[] connections = new ForgeDirection[6];
	
	public TECableSuperconductorUninsulated() {
		
	}
	
	public void updateEntity() {
		updateConnections();
	}
	
	public void updateConnections() {
		if(this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TECableSuperconductorInsulated || this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TECableSuperconductorUninsulated) connections[0] = ForgeDirection.UP;
		else connections[0] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof TECableSuperconductorInsulated || this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof TECableSuperconductorUninsulated) connections[1] = ForgeDirection.DOWN;
		else connections[1] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof TECableSuperconductorInsulated || this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof TECableSuperconductorUninsulated) connections[2] = ForgeDirection.NORTH;
		else connections[2] = null;
		if(this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof TECableSuperconductorInsulated || this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof TECableSuperconductorUninsulated) connections[3] = ForgeDirection.EAST;
		else connections[3] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TECableSuperconductorInsulated || this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TECableSuperconductorUninsulated) connections[4] = ForgeDirection.SOUTH;
		else connections[4] = null;
		if(this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof TECableSuperconductorInsulated || this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof TECableSuperconductorUninsulated) connections[5] = ForgeDirection.WEST;
		else connections[5] = null;
	}
}
