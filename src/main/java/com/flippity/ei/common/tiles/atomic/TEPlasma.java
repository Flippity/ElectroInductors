package com.flippity.ei.common.tiles.atomic;

import java.util.Random;

import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.blocks.atomic.RecipeBlockElectromagnet;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TEPlasma extends TileEntity{
	
	public TEPlasma() {
		this.updateEntity();
	}
	int f = 0;
	public static int heat = 500;
	
	boolean over1 = false;
	boolean over2 = false;
	boolean over3 = false;
	boolean over4 = false;
	boolean over5 = false;
	boolean over6 = false;

	@Override
	public void updateEntity(){
		
		if(heat < 1000000) {
			heat += 5000;
		}
		
		f++;
		if(f == 40) {
			if(worldObj.getBlock(xCoord + 1, yCoord, zCoord) == BlockRegistry.blockPlasma) {
				over1 = true;
			}else if(worldObj.getBlock(xCoord + 1, yCoord, zCoord) instanceof RecipeBlockElectromagnet) {
					over1 = true;
			}else{
				over1 = false;
		}
		
		if(worldObj.getBlock(xCoord - 1, yCoord, zCoord) == BlockRegistry.blockPlasma) {
			over2 = true;
		}else if(worldObj.getBlock(xCoord - 1, yCoord, zCoord) instanceof RecipeBlockElectromagnet) {
				over2 = true;
		}else{
			over2 = false;
	}
		if(worldObj.getBlock(xCoord, yCoord + 1, zCoord) == BlockRegistry.blockPlasma) {
			over3 = true;
		}else if(worldObj.getBlock(xCoord, yCoord + 1, zCoord) instanceof RecipeBlockElectromagnet) {
				over3 = true;
		}else{
			over3 = false;
	}
		if(worldObj.getBlock(xCoord, yCoord - 1, zCoord) == BlockRegistry.blockPlasma) {
			over4 = true;
		}else if(worldObj.getBlock(xCoord, yCoord - 1, zCoord) instanceof RecipeBlockElectromagnet) {
				over4 = true;
		}else{
			over4 = false;
	}
		
		if(worldObj.getBlock(xCoord, yCoord, zCoord + 1) == BlockRegistry.blockPlasma) {
			over5 = true;
		}else if(worldObj.getBlock(xCoord, yCoord, zCoord + 1) instanceof RecipeBlockElectromagnet) {
				over5 = true;
		}else{
			over5 = false;
	}
		if(worldObj.getBlock(xCoord, yCoord, zCoord - 1) == BlockRegistry.blockPlasma) {
			over6 = true;
		}else if(worldObj.getBlock(xCoord, yCoord, zCoord - 1) instanceof RecipeBlockElectromagnet) {
				over6 = true;
		}else{
			over6 = false;
	}
		
		if(over1 == true && over2 == true && over3 == true && over4 == true && over5 == true && over6 == true) {
			
		}else {
			worldObj.setBlock(xCoord, yCoord, zCoord, Blocks.fire);
		}
		
		f = 0;
		}
	}
}

