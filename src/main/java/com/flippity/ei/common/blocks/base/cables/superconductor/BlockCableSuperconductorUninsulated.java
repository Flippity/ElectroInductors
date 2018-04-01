package com.flippity.ei.common.blocks.base.cables.superconductor;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.base.cables.superconductor.TECableSuperconductorUninsulated;
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
		this.setBlockName("blockCableSuperconductorUninsulated");
		this.setBlockTextureName(Reference.MOD_ID + ":" + "BlockCableSuperconductorUninsulated.png");
		this.setCreativeTab(Tabs.tabBase);
		this.setBlockBounds(pix*4.5F, pix*4.5F, pix*4.5F, 1-pix*4.5F, 1-pix*4.5F, 1-pix*4.5F);
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
