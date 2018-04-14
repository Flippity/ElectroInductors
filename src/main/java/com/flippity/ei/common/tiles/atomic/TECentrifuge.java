package com.flippity.ei.common.tiles.atomic;

import com.flippity.ei.common.blocks.atomic.BlockCentrifuge;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
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

	public static boolean isItemFuel(ItemStack itemstack){
		return getItemBurnTime(itemstack) > 0;
	}
	
	public static int getItemBurnTime(ItemStack itemstack){
			Item item = itemstack.getItem();
		
			if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air){
				Block block = Block.getBlockFromItem(item);
				
				/*if(block == TMBlock.tutBlock){
					return 200;
				}*/
				
				/*if(block.getMaterial() == Material.rock){
					return 300;
				}*/
				return 100;
			}else {
				return 0;
			}
			
			/*if(item == TMItem.tutItem) return 1600;
			if(item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("EMERALD")) return 300;
			return GameRegistry.getFuelValue(itemstack);
		}*/
	}
	
	@Override
	public int getMaxEnergyStored(ForgeDirection from) {
		return storage.getMaxEnergyStored();
	}
	
}
