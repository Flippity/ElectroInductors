package com.flippity.ei.common.items.base.cables.copper;

import java.util.List;

import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCableCopperInsulated extends ItemBlock{

	public ItemBlockCableCopperInsulated(Block block) {
		super(block);
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par3) {
        if(GuiScreen.isShiftKeyDown()){
        	list.add("Insulated");
            list.add("Transfers; 64RF/T");
            list.add("Loss; 4RF/T");
            list.add("Buffer; 12800");
        }else{
            list.add("Press shift for info");
        }
    }
	
}
