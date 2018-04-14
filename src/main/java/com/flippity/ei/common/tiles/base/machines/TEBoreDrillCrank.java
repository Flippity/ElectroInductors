package com.flippity.ei.common.tiles.base.machines;

import com.flippity.ei.client.renderers.machines.RendererBoreDrillCrank;
import com.flippity.ei.common.blocks.base.machines.BlockBoreDrillCrank;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TEBoreDrillCrank extends TileEntity implements ISidedInventory{
	
	private static final int[] slotsTop = new int[] { 0 };
	//private static final int[] slotsBottom = new int[] { 2, 1 };
	private static final int[] slotsSides = new int[] { 1 };
	
	public TEBoreDrillCrank() {}
	public static boolean rotate;
	int i = 0;
	
	public int furnaceBurnTime;
	public int currentBurnTime;
	public int furnaceCookTime;
	
	@Override
	public void updateEntity() {
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
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ItemStack getStackInSlot(int p_70301_1_) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
		// TODO Auto-generated method stub
		return false;
	}
}
