package com.flippity.ei.common.blocks.atomic;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.common.tiles.atomic.TECentrifuge;
import com.flippity.ei.common.tiles.base.machines.TECoalGenerator;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockCentrifuge extends BlockContainer{

	public BlockCentrifuge() {
		super(Material.iron);
		this.setCreativeTab(Tabs.tabAtomic);
		this.setBlockTextureName(Reference.MOD_ID + ":Centrifuge");
		this.setHardness(2F);
		this.setBlockName("blockCentrifuge");
	}

	public boolean canfill = true;
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float sidex, float sidey, float sidez) {
		if (world.isRemote) {
			System.out.println("world is remote");
			TileEntity tile = world.getTileEntity(x, y, z);
			if(tile instanceof TECentrifuge){
				System.out.println("instance of tile entity centrifuge");
				TECentrifuge TECentrifuge = (TECentrifuge)tile;
				if(player.inventory.hasItem(ItemRegistry.yellowcake)) {
					System.out.println("player has yellowcake");
					if(TECentrifuge.fuel < 8) {
						System.out.println("fuel is less than 8");
						player.inventory.consumeInventoryItem(ItemRegistry.yellowcake);
						TECentrifuge.fuel++;
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
	public TileEntity createNewTileEntity(World world, int x) {
		return new TECentrifuge();
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
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		TileEntity te = world.getTileEntity(x, y, z);
		if (te != null && te instanceof TECentrifuge) {
			TECentrifuge generator = (TECentrifuge) world.getTileEntity(x, y, z);
			generator.canUpdate();
		}

	}
	
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack)
    {
		//This gets the direction the player is facing as an int from 0 to 3
		int dir = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
		
		//You can use the block metadata to save the direction
		world.setBlockMetadataWithNotify(x, y, z, dir, 3);
		
		//Or you can save it in a tile entity if you are using one
		createNewTileEntity(world, world.getBlockMetadata(x, y, z));	
    }
	
}
