package com.flippity.ei.common.blocks.atomic;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.client.handler.HazmatHandler;
import com.flippity.ei.client.handler.HazmatHandlerBlock;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class OreUranium extends Block {
	public OreUranium() {
		super(Material.rock);
		this.setBlockTextureName(Reference.MOD_ID + ":uraniumOre");
		this.setResistance(5);
		this.setHardness(7);
		this.setStepSound(soundTypeStone);
		this.setBlockName("uraniumOre");
		this.setCreativeTab(Tabs.tabAtomic);
	}
	
	  public void onEntityWalking(World world, int x, int y, int z, Entity entity){
			HazmatHandlerBlock.handlePotionEffect(entity);
	  
	  super.onEntityWalking(world, x, y, z, entity); }
	 
}