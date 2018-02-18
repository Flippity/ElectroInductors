package com.flippity.ei.common.blocks.atomic;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockElectromagnet extends Block{

	public BlockElectromagnet() {
		super(Material.iron);
		this.setBlockTextureName(Reference.MOD_ID + ":Electromagnet_2");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("BlockElectromagnet");
		this.setCreativeTab(Tabs.tabAtomic);
	}
	
	public IIcon[] icons = new IIcon[6];
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i ++) {
	    	if(i == 0) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":Electromagnet_2");
	    	}
	    	if(i == 1) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":Electromagnet_2");
	    	}
	    	if(i == 2) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":Electromagnet_1");
	    	}
	    	if(i == 3) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":Electromagnet_1");
	    	}
	    	if(i == 4) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":Electromagnet_1");
	    	}
	    	if(i == 5) {
	    		this.icons[i] = reg.registerIcon(Reference.MOD_ID + ":Electromagnet_1");
	    	}
	    	
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
	
}
