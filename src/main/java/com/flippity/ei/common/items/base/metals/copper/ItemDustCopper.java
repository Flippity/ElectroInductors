package com.flippity.ei.common.items.base.metals.copper;

import java.util.List;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.constants.MetalConstants;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemDustCopper extends Item{
	public ItemDustCopper() {
		super();
		this.setCreativeTab(Tabs.tabBase);
		this.setTextureName(Reference.MOD_ID + ":dust");
		this.setUnlocalizedName("dustCopper");
	}
	
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = MetalConstants.copper;
    	return colorA;
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
	        list.add(EnumChatFormatting.RED + "A filthy, orange, powder." + EnumChatFormatting.RESET);
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

