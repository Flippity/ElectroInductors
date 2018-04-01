package com.flippity.ei.common.blocks.base.metals.copper;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCopper extends Block {

	public OreCopper() {
		super(Material.rock);
		this.setBlockTextureName(Reference.MOD_ID + ":copperOre");
		this.setResistance(2);
		this.setHardness(2);
		this.setStepSound(soundTypeStone);
		this.setBlockName("copperOre");
		this.setCreativeTab(Tabs.tabBase);
		this.setHarvestLevel("pickaxe", 1);

	}

}
