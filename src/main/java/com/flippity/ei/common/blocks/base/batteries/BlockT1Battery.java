package com.flippity.ei.common.blocks.base.batteries;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.tiles.base.batteries.TET1Battery;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockT1Battery extends BlockContainer{
	
	public BlockT1Battery() {
		super(Material.iron);
		this.setBlockName("blockT1Battery");
		this.setBlockTextureName(Reference.MOD_ID + ":" + "textures/blocks/battery/Battery.png");
		//this.setCreativeTab(Tabs.tabBase);
		this.setHardness(.5F);
		this.setLightOpacity(0);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TET1Battery();
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean isNormalCube() {
		return false;
	}
}
