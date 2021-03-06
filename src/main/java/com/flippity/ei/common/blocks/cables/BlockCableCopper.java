package com.flippity.ei.common.blocks.cables;

import java.util.List;

import com.flippity.ei.client.ClientProxy;
import com.flippity.ei.common.tiles.cables.TECableCopper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockCableCopper extends BlockContainer{

	
	public BlockCableCopper() {
		super(Material.iron);
		this.setHardness(1F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("BlockCableCopper");
		this.setStepSound(soundTypeMetal);
		this.setBlockBounds(0, 0, 0, 1, 1, 1);
		this.useNeighborBrightness = true;
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
		
	    @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 0;
	    }
	    
	    
		@Override
		public TileEntity createNewTileEntity(World world, int id) {
			return new TECableCopper();
		}
/*		
	    @Override
	    public void registerBlockIcons(IIconRegister reg) {}
		
		@Override
		public int damageDropped(int meta) {
		    return meta;
		}
		
		@Override
		public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		    for (int i = 0; i < 16; i ++) {
		        list.add(new ItemStack(item, 1, i));
		    }

		}*/
}
