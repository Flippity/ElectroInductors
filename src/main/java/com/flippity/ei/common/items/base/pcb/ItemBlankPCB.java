package com.flippity.ei.common.items.base.pcb;

import java.util.List;

import com.flippity.ei.client.gui.GUITest;
import com.flippity.ei.client.gui.GuiBoreDrillCrank;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.constants.MetalConstants;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemBlankPCB extends Item{
	public ItemBlankPCB() {
		super();
		this.setCreativeTab(Tabs.tabBase);
		this.setTextureName(Reference.MOD_ID + ":pcb");
		this.setUnlocalizedName("blankPCB");
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
	        list.add(EnumChatFormatting.RED + "Etched in acid, now can be used in" + EnumChatFormatting.RESET);
	        list.add(EnumChatFormatting.RED + "to make powerful machines with a bit of soldering." + EnumChatFormatting.RESET);
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
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		if(!world.isRemote) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiBoreDrillCrank(player.inventory, null));
		}
		return super.onItemRightClick(item, world, player);
		
	}

}
