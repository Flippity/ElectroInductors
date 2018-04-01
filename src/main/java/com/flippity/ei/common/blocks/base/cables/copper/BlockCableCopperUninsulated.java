package com.flippity.ei.common.blocks.base.cables.copper;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.reference.Reference;

import cofh.api.energy.EnergyStorage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockCableCopperUninsulated extends BlockContainer{

	public BlockCableCopperUninsulated() {
		super(Material.cloth);
		float pix = 1/16F;
		this.setBlockName("blockCableCopperUninsulated");
		this.setBlockTextureName(Reference.MOD_ID + ":" + "textures/blocks/BlockCableCopperUninsulated.png");
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
		return new TECableCopperUninsulated();
	}

}
