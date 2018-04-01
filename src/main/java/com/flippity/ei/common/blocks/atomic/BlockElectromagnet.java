package com.flippity.ei.common.blocks.atomic;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockElectromagnet extends RecipeBlockElectromagnet{

	public BlockElectromagnet() {
		this.setBlockTextureName(Reference.MOD_ID + ":electromagnet_top");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("blockElectromagnet");
		this.setCreativeTab(Tabs.tabAtomic);
	}
	
	public IIcon[] icons = new IIcon[6];
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i ++) {
	    	if(i == 0) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":electromagnet_top");
	    	}
	    	if(i == 1) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":electromagnet_top");
	    	}
	    	if(i == 2) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":electromagnet_side");
	    	}
	    	if(i == 3) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":electromagnet_side");
	    	}
	    	if(i == 4) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":electromagnet_side");
	    	}
	    	if(i == 5) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":electromagnet_side");
	    	}
	    	
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
	
}
