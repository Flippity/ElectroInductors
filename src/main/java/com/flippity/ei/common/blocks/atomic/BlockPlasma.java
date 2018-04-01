package com.flippity.ei.common.blocks.atomic;

import java.util.Random;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.common.tiles.atomic.TEPlasma;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperInsulated;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockPlasma extends BlockContainer{

	public BlockPlasma() {
		super(Material.portal);
		this.setBlockTextureName(Reference.MOD_ID + ":plasma");
		this.setBlockName("blockPlasma");
		this.setCreativeTab(Tabs.tabAtomic);
		this.setResistance(-1);
		this.setHardness(-1);
		this.setLightLevel(5F);
		this.setTickRandomly(true);
	}

	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean isNormalCube() {
		return true;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
 
	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TEPlasma();
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return null;
    }
	
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
    	//when player collides
    	if(entity instanceof EntityLivingBase){
    		if(ArmorHazmat.suited != true) {
   		 //gives radiation
   		 ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionRegistry.Radiation.id, 300, 0, false));
    		}
   	   	 //sets on fire
   		 ((EntityLivingBase) entity).setFire(60);
    		}
    	
    	if(entity instanceof EntityItem) {
    		entity.setDead();
    	}
    }
}
