package com.flippity.ei.client.gui;

import com.flippity.ei.client.gui.container.ContainerBoreDrillCrank;
import com.flippity.ei.common.tiles.base.machines.TEBoreDrillCrank;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TEBoreDrillCrank teboredrillcrank = (TEBoreDrillCrank) world.getTileEntity(x, y, z);
			return new ContainerBoreDrillCrank(player.inventory, teboredrillcrank);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TEBoreDrillCrank tileEntityTestContainer = (TEBoreDrillCrank) world.getTileEntity(x, y, z);
			return new GuiBoreDrillCrank(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}
