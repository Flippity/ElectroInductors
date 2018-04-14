package com.flippity.ei.common.items.atomic.metals;

import java.util.List;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.client.handler.HazmatHandler;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.reference.Reference;

import ibxm.Player;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemPuckUranium235 extends Item {

	public ItemPuckUranium235() {
		super();
		this.setCreativeTab(Tabs.tabAtomic);
		this.setTextureName(Reference.MOD_ID + ":uraniumPuck");
		this.setUnlocalizedName("uraniumPuck235");
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
	        list.add(EnumChatFormatting.RED + "Dense puck of uranium 235." + EnumChatFormatting.RESET);
	        list.add(EnumChatFormatting.RED + "can be used in fission." + EnumChatFormatting.RESET);

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
