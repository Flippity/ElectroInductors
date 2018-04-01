package com.flippity.ei.common.blocks.base.metals.aluminum;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreAluminum extends Block {

	public OreAluminum() {
		super(Material.rock);
		this.setBlockTextureName(Reference.MOD_ID + ":aluminumOre");
		this.setResistance(3);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setBlockName("aluminumOre");
		this.setCreativeTab(Tabs.tabBase);
		this.setHarvestLevel("pickaxe", 1);

	}

}
