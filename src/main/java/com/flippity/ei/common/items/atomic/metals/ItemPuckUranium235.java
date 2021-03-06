package com.flippity.ei.common.items.atomic.metals;

import java.util.List;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.client.handler.HazmatHandler;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.reference.Reference;

import ibxm.Player;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPuckUranium235 extends Item {

	public ItemPuckUranium235() {
		super();
		this.setCreativeTab(Tabs.tabAtomic);
		this.setTextureName(Reference.MOD_ID + ":uraniumPuck");
		this.setUnlocalizedName("uraniumPuck235");

	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par3) {
            list.add("Uranium 235");
            list.add("Fissile");
    }

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		{
			HazmatHandler.handlePotionEffect(entity, stack);
		}
	}
}
