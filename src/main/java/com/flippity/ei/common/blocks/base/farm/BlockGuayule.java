package com.flippity.ei.common.blocks.base.farm;

import java.util.ArrayList;
import java.util.Random;

import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockGuayule extends RecipeBlockCrops{
    public BlockGuayule()
    {
        // Basic block setup
        setBlockName("guayuleBlock");
        setBlockTextureName(Reference.MOD_ID + ":" + "guayule_stage1");
    }

    //Will drop seeds and rubber
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(ItemRegistry.guayuleSeeds, world.rand.nextInt(3) + 1));
        if(growStage == 7) {
        	drops.add(new ItemStack(ItemRegistry.rubberRaw, 1));
        }
        return drops;
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World parWorld, int parX, int parY, int parZ, Random parRand)
    {
        super.updateTick(parWorld, parX, parY, parZ, parRand);
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 1;

        if (growStage > 7)
        {
            growStage = 7;
        }

        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage1");
          iIcon[1] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage2");
          iIcon[2] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage3");
          iIcon[3] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage4");
          iIcon[4] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage4");
          iIcon[5] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage5");
          iIcon[6] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage5");
          iIcon[7] = parIIconRegister.registerIcon(Reference.MOD_ID + ":" + "guayule_stage6");
    }
}
