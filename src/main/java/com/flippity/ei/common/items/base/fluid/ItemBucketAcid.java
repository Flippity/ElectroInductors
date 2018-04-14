package com.flippity.ei.common.items.base.fluid;

import java.util.List;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.blocks.FluidsRegistry;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemBucketAcid extends ItemBucket {

public ItemBucketAcid(Block block) {

super(FluidsRegistry.blockAcid);

        this.setContainerItem(Items.bucket);
        this.setUnlocalizedName("itemBucketAcid");
        this.setTextureName(Reference.MOD_ID + ":bucketAcid");
        this.setCreativeTab(Tabs.tabBase);

        this.maxStackSize = 1;

        

        
	}
}