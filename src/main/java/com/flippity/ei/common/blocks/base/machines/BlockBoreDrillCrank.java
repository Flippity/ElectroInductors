package com.flippity.ei.common.blocks.base.machines;

import com.flippity.ei.client.renderers.machines.RendererBoreDrillCrank;
import com.flippity.ei.common.tiles.base.machines.TEBoreDrillCrank;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBoreDrillCrank extends BlockContainer{

	public BlockBoreDrillCrank() {
		super(Material.iron);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TEBoreDrillCrank();
	}
	
	public static boolean rotate = false;
	
	@Override
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		rotate = true;
		System.out.println(rotate);
        return true;
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
