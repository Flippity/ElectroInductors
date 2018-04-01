package com.flippity.ei.common.blocks.base.metals.lead;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreLead extends Block {

	public OreLead() {
		super(Material.rock);
		this.setBlockTextureName(Reference.MOD_ID + ":leadOre");
		this.setResistance(3);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("leadOre");
		this.setCreativeTab(Tabs.tabBase);
		this.setHarvestLevel("pickaxe", 2);

	}

}