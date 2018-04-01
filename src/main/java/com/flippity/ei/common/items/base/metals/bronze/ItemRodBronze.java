package com.flippity.ei.common.items.base.metals.bronze;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.constants.MetalConstants;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRodBronze extends Item{
	public ItemRodBronze() {
		super();
		this.setCreativeTab(Tabs.tabBase);
		this.setTextureName(Reference.MOD_ID + ":rod");
		this.setUnlocalizedName("rodBronze");
	}
	
	@SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
    	int colorA = MetalConstants.bronze;
    	return colorA;
    }
}