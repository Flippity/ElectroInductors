package com.flippity.ei.common.tiles.base.cables.copper;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TECableCopperUninsulated extends TileEntity{

	public ForgeDirection[] connections = new ForgeDirection[6];
	
	public TECableCopperUninsulated() {
		
	}
	
	public void updateEntity() {
		updateConnections();
	}
	
	public void updateConnections() {
		if(this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TECableCopperUninsulated || this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TECableCopperInsulated) connections[0] = ForgeDirection.UP;
		else connections[0] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof TECableCopperUninsulated || this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof TECableCopperInsulated) connections[1] = ForgeDirection.DOWN;
		else connections[1] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof TECableCopperUninsulated || this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof TECableCopperInsulated) connections[2] = ForgeDirection.NORTH;
		else connections[2] = null;
		if(this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof TECableCopperUninsulated || this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof TECableCopperInsulated) connections[3] = ForgeDirection.EAST;
		else connections[3] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TECableCopperUninsulated || this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TECableCopperInsulated) connections[4] = ForgeDirection.SOUTH;
		else connections[4] = null;
		if(this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof TECableCopperUninsulated || this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof TECableCopperInsulated) connections[5] = ForgeDirection.WEST;
		else connections[5] = null;
	}
}
