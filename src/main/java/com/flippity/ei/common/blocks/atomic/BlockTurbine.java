package com.flippity.ei.common.blocks.atomic;

import org.lwjgl.opengl.GL11;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.tiles.atomic.TETurbine;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockTurbine extends BlockContainer{
	public BlockTurbine() {
		super(Material.iron);
		this.setBlockName("turbine");
		//this.setCreativeTab(Tabs.tabAtomic);
		this.setBlockTextureName(Reference.MOD_ID + ":turbineBlock");
		this.setHardness(2F);
		this.setStepSound(soundTypeMetal);
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
	
	
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
	
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TETurbine();
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack)
    {
		createNewTileEntity(world, world.getBlockMetadata(x, y, z));	
    }
}
