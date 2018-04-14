package com.flippity.ei.client.gui.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

import com.flippity.ei.common.tiles.base.machines.TEBoreDrillCrank;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerBoreDrillCrank extends Container {
	
	private TEBoreDrillCrank teboredrillcrank;
	private int lastCookTime;
	private int lastBurnTime;
	private int lastItemBurnTime;
	
	public ContainerBoreDrillCrank(InventoryPlayer player, TEBoreDrillCrank teboredrillcrank){
		this.teboredrillcrank = teboredrillcrank;
		this.addSlotToContainer(new Slot(teboredrillcrank, 0, 56, 17));
		this.addSlotToContainer(new Slot(teboredrillcrank, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnace(player.player, teboredrillcrank, 2, 116, 35));
		int i;
		
		for(i = 0; i < 3; ++i){
			for(int j = 0; j < 9; ++j){
				this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		for(i = 0; i < 9; ++i){
			this.addSlotToContainer(new Slot(player, i , 8 + i * 18 , 142));
		}
	}

	public void addCraftingToCrafters(ICrafting craft){
		super.addCraftingToCrafters(craft);
		craft.sendProgressBarUpdate(this, 0, this.teboredrillcrank.furnaceCookTime);
		craft.sendProgressBarUpdate(this, 1, this.teboredrillcrank.furnaceBurnTime);
		craft.sendProgressBarUpdate(this, 2, this.teboredrillcrank.currentBurnTime);
	}
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();
		for(int i = 0; i < this.crafters.size(); ++i){
			ICrafting craft = (ICrafting) this.crafters.get(i);
			
			if(this.lastCookTime != this.teboredrillcrank.furnaceCookTime){
				craft.sendProgressBarUpdate(this, 0, this.teboredrillcrank.furnaceCookTime);
			}
			
			if(this.lastBurnTime != this.teboredrillcrank.furnaceBurnTime){
				craft.sendProgressBarUpdate(this, 1, this.teboredrillcrank.furnaceBurnTime);
			}
			
			if(this.lastItemBurnTime != this.teboredrillcrank.currentBurnTime){
				craft.sendProgressBarUpdate(this, 2, this.teboredrillcrank.currentBurnTime);
			}
		}
		
		this.lastBurnTime = this.teboredrillcrank.furnaceBurnTime;
		this.lastCookTime = this.teboredrillcrank.furnaceCookTime;
		this.lastItemBurnTime = this.teboredrillcrank.currentBurnTime;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2){
		if(par1 == 0){
			this.teboredrillcrank.furnaceCookTime = par2;
		}
		
		if(par1 == 1){
			this.teboredrillcrank.furnaceBurnTime = par2;
		}
		
		if(par1 == 2){
			this.teboredrillcrank.currentBurnTime = par2;
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.teboredrillcrank.isUseableByPlayer(player);
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int par2){
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(par2);
		
		if(slot != null && slot.getHasStack()){
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			
			if(par2 == 2){
				if(!this.mergeItemStack(itemstack1, 3, 39, true)){
					return null;
				}
				slot.onSlotChange(itemstack1, itemstack);
			}else if(par2 != 1 && par2 != 0){if(teboredrillcrank.isItemFuel(itemstack1)){
					if(!this.mergeItemStack(itemstack1, 1, 2, false)){
						return null;
					}
				}else if(par2 >=3 && par2 < 30){
					if(!this.mergeItemStack(itemstack1, 30, 39, false)){
						return null;
					}
				}else if(par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)){
					return null;
				}
			}else if(!this.mergeItemStack(itemstack1, 3, 39, false)){
				return null;
			}
			if(itemstack1.stackSize == 0){
				slot.putStack((ItemStack)null);
			}else{
				slot.onSlotChanged();
			}
			if(itemstack1.stackSize == itemstack.stackSize){
				return null;
			}
			slot.onPickupFromSlot(player, itemstack1);
		}
		return itemstack;
	}
}