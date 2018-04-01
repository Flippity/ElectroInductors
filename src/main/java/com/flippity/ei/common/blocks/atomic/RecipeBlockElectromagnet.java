package com.flippity.ei.common.blocks.atomic;

import com.flippity.ei.common.tiles.atomic.TEElectromagnet;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class RecipeBlockElectromagnet extends BlockContainer{

	public RecipeBlockElectromagnet() {
		super(Material.iron);
		
	}

	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TEElectromagnet();
	}

}
