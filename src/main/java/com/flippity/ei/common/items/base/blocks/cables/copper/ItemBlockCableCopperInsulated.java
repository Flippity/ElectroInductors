package com.flippity.ei.common.items.base.blocks.cables.copper;

import java.util.List;

import com.flippity.ei.client.armor.ArmorRegistry;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemBlockCableCopperInsulated extends ItemBlock{

	public ItemBlockCableCopperInsulated(Block block) {
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
        list.add(EnumChatFormatting.RED + "Copper pulled into a wire," + EnumChatFormatting.RESET);
        list.add(EnumChatFormatting.RED + "and finished with rubber insulation." + EnumChatFormatting.RESET);
    }else if (GuiScreen.isShiftKeyDown() == false && GuiScreen.isCtrlKeyDown() == false){
        list.add(EnumChatFormatting.WHITE + "Press" + EnumChatFormatting.RESET + EnumChatFormatting.GREEN + " SHIFT " + EnumChatFormatting.RESET + EnumChatFormatting.WHITE + "for description");
        list.add(EnumChatFormatting.WHITE + "Press" + EnumChatFormatting.RESET + EnumChatFormatting.AQUA + " CONTROL " + EnumChatFormatting.RESET + EnumChatFormatting.WHITE + "for materials");
    }else if (GuiScreen.isCtrlKeyDown()) {
        if(GuiScreen.isCtrlKeyDown()) {
        	list.add(EnumChatFormatting.AQUA + "CRAFTING ");
            list.add(EnumChatFormatting.LIGHT_PURPLE + "1" + EnumChatFormatting.RESET + "x" + EnumChatFormatting.YELLOW + "Copper Cable");
            list.add(EnumChatFormatting.LIGHT_PURPLE + "1" + EnumChatFormatting.RESET + "x" + EnumChatFormatting.YELLOW + "Rubber");
        }
    }
}}
