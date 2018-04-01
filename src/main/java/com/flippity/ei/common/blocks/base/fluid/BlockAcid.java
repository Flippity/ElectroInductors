package com.flippity.ei.common.blocks.base.fluid;

import java.util.Random;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.common.tiles.base.batteries.TET1Battery;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockAcid extends BlockFluidClassic {
        @SideOnly(Side.CLIENT)
        protected IIcon stillIcon;
        @SideOnly(Side.CLIENT)
        protected IIcon flowingIcon;
        public BlockAcid(Fluid fluid) {
                super(fluid, Material.water);
                this.setBlockName("blockAcid");
        }
        @Override
        public IIcon getIcon(int side, int meta) {
                return (side == 0 || side == 1)? stillIcon : flowingIcon;
        }
        @SideOnly(Side.CLIENT)
        @Override
        public void registerBlockIcons(IIconRegister register) {
                stillIcon = register.registerIcon(Reference.MOD_ID + ":acidStill");
                flowingIcon = register.registerIcon(Reference.MOD_ID + ":acidFlow");
        }
        @Override
        public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
                if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
                
                return super.canDisplace(world, x, y, z);
        }
        @Override
        public boolean displaceIfPossible(World world, int x, int y, int z) {
                if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
                
                return super.displaceIfPossible(world, x, y, z);
        }     

        
        @Override
        @SideOnly(Side.CLIENT)
        public void randomDisplayTick(World w, int x, int y, int z, Random rand) {
        	renderParticle(w, x, y, z);
        }
        
        

        private void renderParticle(World w, int x, int y, int z) {
        	Random random = w.rand;
        	double d0 = 0.0625D;
        	for(int l = 0; l < 6; ++l) {
        		double d1 = (double)((float)x + random.nextFloat());
        		double d2 = (double)((float)y + random.nextFloat());
        		double d3 = (double)((float)z + random.nextFloat());
        		if(l == 0 && !w.getBlock(x, y + 1, z).isOpaqueCube()) d2 = (double)(y + 1) + d0;
        		if(l == 1 && !w.getBlock(x, y - 1, z).isOpaqueCube()) d2 = (double)(y + 0) - d0;
        		if(l == 2 && !w.getBlock(x, y, z + 1).isOpaqueCube()) d3 = (double)(z + 1) + d0;    
        		if(l == 3 && !w.getBlock(x, y, z - 1).isOpaqueCube()) d3 = (double)(z + 0) - d0;
        		if(l == 4 && !w.getBlock(x + 1, y, z).isOpaqueCube()) d1 = (double)(x + 1) + d0;
        		if(l == 5 && !w.getBlock(x - 1, y, z).isOpaqueCube()) d1 = (double)(x + 0) - d0;
        		if(d1 < (double)x || d1 > (double)(x + 1) || d2 < 0.0D || d2 > (double)(y + 1) || d3 < (double)z || d3 > (double)(z + 1)) {
        			EntityReddustFX fx= new EntityReddustFX(w, d1, d2, d3, x, y, z);
        			FMLClientHandler.instance().getClient().effectRenderer.addEffect(fx);
        		}
        	}
        }

        int i = 0;
        @Override
        public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
        	i++;
            if (world.isRemote) {
	        	if(entity instanceof EntityItem) {
		        	if(((EntityItem) entity).getEntityItem().getItem() == ItemRegistry.blankPCB || ((EntityItem) entity).getEntityItem().getItem() == ItemRegistry.rawPCB) {
		        		if(((EntityItem) entity).getEntityItem().getItem() == ItemRegistry.rawPCB) {
		        			if(i == 300) {
		        				entity.setDead();
		        				entity.dropItem(ItemRegistry.blankPCB, 1);
		        			}
		        			}
		        		}
		        	}else {
		        		entity.setDead();
		        	}
		        	
		        	if(i == 120) {
		        		i = 0;
		        	}
	        }
	        	if(i == 300) {
	        		i = 0;
        }
    }
}