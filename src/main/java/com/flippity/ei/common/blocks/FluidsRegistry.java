package com.flippity.ei.common.blocks;

import com.flippity.ei.client.handler.BucketHandler;
import com.flippity.ei.common.blocks.base.fluid.BlockAcid;
import com.flippity.ei.common.items.base.fluid.ItemBucketAcid;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidsRegistry {
	
    public static Fluid fluidAcid;
    public static Block blockAcid;
    public static Item itemBucketAcid;
    
    public static void bucketInit() {
    	itemBucketAcid = new ItemBucketAcid(blockAcid);
        itemBucketAcid.setContainerItem(Items.bucket);

        GameRegistry.registerItem(itemBucketAcid, "itemBucketAcid");

        FluidContainerRegistry.registerFluidContainer(fluidAcid, new ItemStack(itemBucketAcid), new ItemStack(Items.bucket));

       

        BucketHandler.INSTANCE.buckets.put(blockAcid, itemBucketAcid);

        MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
	
    }
	
	public static void fluidInit() {
		 fluidAcid = new Fluid("fluidAcid");
		 FluidRegistry.registerFluid(fluidAcid);
		 
		 blockAcid = new BlockAcid(fluidAcid);
	     GameRegistry.registerBlock(blockAcid, "blockAcid");

	        fluidAcid.setUnlocalizedName(blockAcid.getUnlocalizedName());
	}
}