package com.flippity.ei.common.tiles.base.cables.superconductor;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyConnection;
import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyHandler;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TECableSuperconductorUninsulated extends TileEntity implements IEnergyHandler {

public ForgeDirection[] connections = new ForgeDirection[6];

public EnergyStorage storage;
public int output = 768;

public TECableSuperconductorUninsulated() {
	this.output = output;
	this.storage = new EnergyStorage(output * 2);

	storage.setMaxReceive(output);
	storage.setMaxExtract(output);
	storage.setMaxTransfer(output);
}

public void updateEntity() {
	this.updateConnections();

	if (storage.getEnergyStored() > 0) {
		for (int i = 0; i < 6; i++){

			//ForgeDirection is a useful helper class for handling directions.
			int targetX = xCoord + ForgeDirection.getOrientation(i).offsetX;
			int targetY = yCoord + ForgeDirection.getOrientation(i).offsetY;
			int targetZ = zCoord + ForgeDirection.getOrientation(i).offsetZ;

			TileEntity tile = worldObj.getTileEntity(targetX, targetY, targetZ);
			if (tile instanceof IEnergyHandler) {
				int maxExtract = storage.getMaxExtract(); //Gets the maximum amount of energy that can be extracted from this tile in one tick.
				int maxAvailable = storage.extractEnergy(maxExtract, true); //Simulates removing "maxExtract" to find out how much energy is actually available.
				int energyTransferred = ((IEnergyHandler) tile).receiveEnergy(ForgeDirection.getOrientation(i).getOpposite(), maxAvailable, false); //Sends "maxAvailable" to the target tile and records how much energy was accepted. 

				storage.extractEnergy(energyTransferred, false);//Extract the energy transferred from the internal storage.
			}
		}
	}

}

public void updateConnections() {
	if(this.worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof IEnergyHandler) connections[0] = ForgeDirection.UP;
	else connections[0] = null;

	if(this.worldObj.getTileEntity(xCoord, yCoord - 1, zCoord) instanceof IEnergyHandler) connections[1] = ForgeDirection.DOWN;
	else connections[1] = null;

	if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord - 1) instanceof IEnergyHandler) connections[2] = ForgeDirection.NORTH;
	else connections[2] = null;

	if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord + 1) instanceof IEnergyHandler) connections[3] = ForgeDirection.SOUTH;
	else connections[3] = null;

	if(this.worldObj.getTileEntity(xCoord + 1, yCoord, zCoord) instanceof IEnergyHandler) connections[4] = ForgeDirection.EAST;
	else connections[4] = null;

	if(this.worldObj.getTileEntity(xCoord - 1, yCoord, zCoord) instanceof IEnergyHandler) connections[5] = ForgeDirection.WEST;
	else connections[5] = null;
}

public boolean onlyOneOpposite(ForgeDirection[] directions) {
	ForgeDirection mainDirection = null;
	boolean isOpposite = false;

	for(int i = 0; i < directions.length + 1; i++) {

		if(mainDirection == null && directions[i] != null) mainDirection = directions[i];

		if(directions[i] != null && mainDirection != directions[i]) {
			if(!isOpposite(mainDirection, directions[i])) return false;
			else isOpposite = true;
		}
	}

	return isOpposite;
}

public boolean isOpposite(ForgeDirection firstDirection, ForgeDirection secondDirection) {

	if((firstDirection.equals(ForgeDirection.NORTH) && secondDirection.equals(ForgeDirection.SOUTH)) || 
			firstDirection.equals(ForgeDirection.SOUTH) && secondDirection.equals(ForgeDirection.NORTH)) return true;

	if((firstDirection.equals(ForgeDirection.EAST) && secondDirection.equals(ForgeDirection.WEST)) || 
			firstDirection.equals(ForgeDirection.WEST) && secondDirection.equals(ForgeDirection.EAST)) return true;

	if((firstDirection.equals(ForgeDirection.UP) && secondDirection.equals(ForgeDirection.DOWN)) || 
			firstDirection.equals(ForgeDirection.DOWN) && secondDirection.equals(ForgeDirection.UP)) return true;

	return false;
}

@Override
public boolean canConnectEnergy(ForgeDirection from) {
	return true;
}

@Override
public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) {
	return this.storage.receiveEnergy(Math.min(output * 2, maxReceive), simulate);
}

@Override
public int extractEnergy(ForgeDirection from, int maxExtract,
		boolean simulate) {

	return storage.extractEnergy(storage.getMaxExtract(), simulate);
}

@Override
public int getEnergyStored(ForgeDirection from) {
	return storage.getEnergyStored();
}

@Override
public int getMaxEnergyStored(ForgeDirection from) {
	return storage.getMaxEnergyStored();
}}