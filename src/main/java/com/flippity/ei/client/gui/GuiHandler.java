package com.flippity.ei.client.gui;


import com.flippity.ei.client.gui.container.ContainerCentrifuge;
import com.flippity.ei.common.tiles.atomic.TECentrifuge;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

	public class GuiHandler implements IGuiHandler {

		public GuiHandler (){
			
		}
		
		@Override
		public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
			if(ID == 0){
				TECentrifuge tileEntityFurnace = (TECentrifuge) world.getTileEntity(x, y, z);
				return new ContainerCentrifuge(player.inventory, tileEntityFurnace);
			}
			return null;
		}

		@Override
		public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
			if(ID == 0){
				TECentrifuge tileEntityTestContainer = (TECentrifuge) world.getTileEntity(x, y, z);
				return new GuiCentrifuge(player.inventory, tileEntityTestContainer);
			}
			return null;
		}

	}