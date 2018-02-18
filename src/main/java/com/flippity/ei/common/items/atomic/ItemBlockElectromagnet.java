package com.flippity.ei.common.items.atomic;

import java.util.List;

import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockElectromagnet extends ItemBlock{

	public ItemBlockElectromagnet(Block block) {
		super(block);
	}

	boolean keyShiftDown;
	boolean keyCTRlDown;
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par3) {
		
		if(GuiScreen.isShiftKeyDown()) {
			keyShiftDown = true;
		}else if(GuiScreen.isShiftKeyDown() == false){
			keyShiftDown = false;
		}
		
		if(GuiScreen.isCtrlKeyDown()) {
			keyCTRlDown = true;
		}else {
			keyCTRlDown = false;
		}
		
        if(GuiScreen.isShiftKeyDown()){
        	list.add("Electromagnets can be used to move particles");
        	list.add("and trap plasma.");
        	if(this.equals(this.getItemFromBlock(BlockRegistry.blockElectromagnet))) {
        		list.add("This electromagnet can boil water");
        	}else {
        		list.add("This electromagnet can not boil water");
        	}
        }else if (GuiScreen.isShiftKeyDown() == false && GuiScreen.isCtrlKeyDown() == false){
            list.add("Press shift for info");
            list.add("Press control for materials");
        }else if (GuiScreen.isCtrlKeyDown()) {
            if(GuiScreen.isCtrlKeyDown()) {
            	if(this.equals(this.getItemFromBlock(BlockRegistry.blockElectromagnet))) {
                	list.add("3 x Bronze Ingot, 6 x Steel Plate");
            	}else {
                	list.add("1 x Electromagnet, 1 x Glass");
            	}
            }
        }
    }
	
}
