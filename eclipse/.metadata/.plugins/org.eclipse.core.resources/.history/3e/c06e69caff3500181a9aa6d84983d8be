package com.flippity.ei.common.tiles.atomic;

import com.flippity.ei.common.blocks.atomic.BlockCentrifuge;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TECentrifuge extends TileEntity implements IEnergyHandler{
	
	public static boolean rotate = false;
	public static int fuel = 0;
	public static boolean canfill = true;
	
	protected EnergyStorage storage;
	public int output;
	public static int energy;
	
	public int i = 0;
	
	public TECentrifuge() {
		this.output = 256;
		this.storage = new EnergyStorage(output * 64);
		
		storage.setMaxReceive(512);
		storage.setMaxExtract(output);
		//storage.setMaxTransfer(output);
	}
	
	@Override
	public void updateEntity() {
		i++;
		if(i == 40) {
			i = 0;
			if(fuel > 0) {
				fuel -= 1;
				System.out.println("fuel - 1");
			}
		}
		
		System.out.println(i);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setInteger("fuel", fuel);
		nbt.setInteger("time", i);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		i = nbt.getInteger("time");
		fuel = nbt.getInteger("fuel");
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
	public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) {
		return 0;
	}

	@Override
	public int getEnergyStored(ForgeDirection from) {
		return storage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}
	
}
