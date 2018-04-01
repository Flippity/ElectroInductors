package com.flippity.ei.common.items.base.blocks.battery;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockT1Battery extends ItemBlock{

	public ItemBlockT1Battery(Block block) {
		super(block);
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par3) {
        if(GuiScreen.isShiftKeyDown()){
        	list.add("Tier 1");
            list.add("Can Store 16384RF");
        }else{
            list.add("Press shift for info");
        }
    }
	
}
