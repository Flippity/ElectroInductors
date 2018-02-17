package com.flippity.ei.common.blocks.base.cables.superconductor;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.tiles.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.cables.superconductor.TECableSuperconductorUninsulated;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCableSuperconductorUninsulated extends BlockContainer{

	public BlockCableSuperconductorUninsulated() {
		super(Material.cloth);
		float pix = 1/16F;
		this.setBlockName("BlockCableSuperconductorUninsulated");
		this.setBlockTextureName(Reference.MOD_ID + ":" + "textures/blocks/BlockCableSuperconductorUninsulated.png");
		this.setCreativeTab(Tabs.tabBlocks);
		this.setBlockBounds(pix*3, pix*3, pix*3, 1-pix*3, 1-pix*3, 1-pix*3);
		this.setHardness(.5F);
		this.setLightOpacity(0);
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
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
	


	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TECableSuperconductorUninsulated();
	}

}
