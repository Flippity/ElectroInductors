package com.flippity.ei.common.items.base.rubber;

import java.util.List;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemRubberRaw extends Item{
	public ItemRubberRaw() {
		super();
		this.setCreativeTab(Tabs.tabBase);
		this.setTextureName(Reference.MOD_ID + ":rubberRaw");
		this.setUnlocalizedName("rubberRaw");
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
	        list.add(EnumChatFormatting.RED + "Sticky and white resin." + EnumChatFormatting.RESET);
	    }else if (GuiScreen.isShiftKeyDown() == false && GuiScreen.isCtrlKeyDown() == false){
	        list.add(EnumChatFormatting.WHITE + "Press" + EnumChatFormatting.RESET + EnumChatFormatting.GREEN + " SHIFT " + EnumChatFormatting.RESET + EnumChatFormatting.WHITE + "for description");
	        list.add(EnumChatFormatting.WHITE + "Press" + EnumChatFormatting.RESET + EnumChatFormatting.AQUA + " CONTROL " + EnumChatFormatting.RESET + EnumChatFormatting.WHITE + "for materials");
	    }else if (GuiScreen.isCtrlKeyDown()) {
	        if(GuiScreen.isCtrlKeyDown()) {
	        	list.add(EnumChatFormatting.AQUA + "CRAFTING" + EnumChatFormatting.RESET);
	            list.add(EnumChatFormatting.LIGHT_PURPLE + "0" + EnumChatFormatting.RESET + "x" + EnumChatFormatting.YELLOW + "null");
	        }
	    }
	}
	
}
