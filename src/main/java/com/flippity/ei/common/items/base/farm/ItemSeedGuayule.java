package com.flippity.ei.common.items.base.farm;

import java.util.List;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.reference.Reference;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent;

public class ItemSeedGuayule extends RecipeItemSeed{

	public ItemSeedGuayule(Block parBlockPlant, Block parSoilBlock) {
		super(BlockRegistry.blockGuayule, Blocks.farmland);
        setUnlocalizedName("guayuleSeeds");
        setTextureName(Reference.MOD_ID + ":" + "seeds_guayule");
        setCreativeTab(Tabs.tabBase);
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
	        list.add(EnumChatFormatting.RED + "These seeds produce a sticky resin." + EnumChatFormatting.RESET);
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
	
	@SubscribeEvent
	 public void onDrops(BlockEvent.HarvestDropsEvent event) {
	 
	 if (event.block == Blocks.grass)
		 System.out.println("Dropped Guayule Seeds");
	 	event.drops.add(new ItemStack(ItemRegistry.guayuleSeeds));
	 }
}