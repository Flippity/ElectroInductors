package com.flippity.ei.common.blocks.base.machines;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.tiles.base.batteries.TET1Battery;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.base.machines.TECoalGenerator;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCoalGenerator extends BlockContainer{
	
	public BlockCoalGenerator() {
		super(Material.iron);
		this.setBlockName("blockCoalGenerator");
		//this.setBlockTextureName(Reference.MOD_ID + ":" + "textures/blocks/battery/Battery.png");
		this.setCreativeTab(Tabs.tabBase);
		this.setHardness(1);
		this.setLightOpacity(0);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player,  int meta, float sidex, float sidey, float sidez) {
		if (!world.isRemote) {
			TileEntity tile = world.getTileEntity(x, y, z);
			if(tile instanceof TECoalGenerator){
				TECoalGenerator coalgenerator = (TECoalGenerator)tile;
				if(player.inventory.hasItem(Items.coal)) {
					if(coalgenerator.fuel < 8) {
						player.inventory.consumeInventoryItem(Items.coal);
						coalgenerator.fuel++;
						return true;
					}
				}else {
					return false;
				}
			}
		}
	
			return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TECoalGenerator();
	}

}