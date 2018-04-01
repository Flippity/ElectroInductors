package com.flippity.ei.common.items.atomic;

import java.util.List;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemAntidote extends ItemFood {

	public ItemAntidote(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName("antidote");
		this.setTextureName(Reference.MOD_ID + ":antidote");
		this.setCreativeTab(Tabs.tabAtomic);
		this.setAlwaysEdible();
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
        list.add(EnumChatFormatting.RED + "Can be eaten to cure radiation posioning." + EnumChatFormatting.RESET);
    }else if (GuiScreen.isShiftKeyDown() == false && GuiScreen.isCtrlKeyDown() == false){
        list.add(EnumChatFormatting.WHITE + "Press" + EnumChatFormatting.RESET + EnumChatFormatting.GREEN + " SHIFT " + EnumChatFormatting.RESET + EnumChatFormatting.WHITE + "for description");
        list.add(EnumChatFormatting.WHITE + "Press" + EnumChatFormatting.RESET + EnumChatFormatting.AQUA + " CONTROL " + EnumChatFormatting.RESET + EnumChatFormatting.WHITE + "for materials");
    }else if (GuiScreen.isCtrlKeyDown()) {
        if(GuiScreen.isCtrlKeyDown()) {
        	list.add(EnumChatFormatting.AQUA + "CRAFTING" + EnumChatFormatting.RESET);
            list.add(EnumChatFormatting.LIGHT_PURPLE + "1" + EnumChatFormatting.RESET + "x" + EnumChatFormatting.YELLOW + "Golden Apple");
            list.add(EnumChatFormatting.LIGHT_PURPLE + "1" + EnumChatFormatting.RESET + "x" + EnumChatFormatting.YELLOW + "Bonemeal");
        }
    }
}



	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		player.removePotionEffectClient(PotionRegistry.Radiation.getId());
	}

}