package com.flippity.ei.common.tiles.base.cables.copper;

import cofh.api.energy.IEnergyConnection;
import cofh.api.energy.IEnergyHandler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TECableCopperInsulated extends TileEntity{

	public ForgeDirection[] connections = new ForgeDirection[6];
	
	
	public TECableCopperInsulated() {
	}
	
	public void updateEntity() {
		updateConnections();
	}
	
	public void updateConnections() {
		if(this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TECableCopperInsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TECableCopperUninsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof IEnergyHandler &&
				this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof IEnergyConnection == true) connections[0] = ForgeDirection.UP;
		else connections[0] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof TECableCopperInsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof TECableCopperUninsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof IEnergyHandler &&
				this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof IEnergyConnection == true) connections[1] = ForgeDirection.DOWN;
		else connections[1] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof TECableCopperInsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof TECableCopperUninsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof IEnergyHandler &&
				this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof IEnergyConnection == true) connections[2] = ForgeDirection.NORTH;
		else connections[2] = null;
		if(this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof TECableCopperInsulated ||
				this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof TECableCopperUninsulated ||
				this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof IEnergyHandler &&
				this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof IEnergyConnection == true) connections[3] = ForgeDirection.EAST;
		else connections[3] = null;
		if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TECableCopperInsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof TECableCopperUninsulated ||
				this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof IEnergyHandler &&
				this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof IEnergyConnection == true) connections[4] = ForgeDirection.SOUTH;
		else connections[4] = null;
		if(this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof TECableCopperInsulated ||
				this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof TECableCopperUninsulated ||
				this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof IEnergyHandler &&
				this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof IEnergyConnection == true) connections[5] = ForgeDirection.WEST;
		else connections[5] = null;
	}
}
