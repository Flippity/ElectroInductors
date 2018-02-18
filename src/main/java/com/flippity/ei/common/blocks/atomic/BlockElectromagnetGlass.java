package com.flippity.ei.common.blocks.atomic;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockElectromagnetGlass extends Block{

	public BlockElectromagnetGlass() {
		super(Material.glass);
		this.setBlockTextureName(Reference.MOD_ID + ":" + "ElectroMagnetGlass");
		this.setBlockName("BlockElectromagnetGlass");
		this.setResistance(3);
		this.setHardness(5);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(Tabs.tabAtomic);
	}
	

	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean isNormalCube() {
		return true;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
}
