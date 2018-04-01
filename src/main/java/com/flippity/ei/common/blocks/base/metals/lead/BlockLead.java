package com.flippity.ei.common.blocks.base.metals.lead;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.constants.MetalConstants;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockLead extends Block {

	public BlockLead() {
		super(Material.iron);
		this.setBlockTextureName(Reference.MOD_ID + ":" + "leadBlock");
		this.setResistance(3);
		this.setHardness(6);
		this.setStepSound(soundTypeMetal);
		this.setBlockName("leadBlock");
		this.setCreativeTab(Tabs.tabBase);
	}
}