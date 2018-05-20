package com.flippity.ei.client.gui.container;

import com.flippity.ei.ElectroInductors;
import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.common.tiles.atomic.TECentrifuge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerCentrifuge extends Container{
	
	public TECentrifuge tile;
	
	public ContainerCentrifuge(InventoryPlayer player, TECentrifuge tile) {
		this.tile = tile;
		
		this.addSlotToContainer(new Slot(tile, 10, 112, 34));
		this.addSlotToContainer(new Slot(tile, 11, 147, 34));
		
		for(int i = 0; i<9; i++) {
			this.addSlotToContainer(new Slot(player, i, 8 + i*18, 142));
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<9; j++) {
				this.addSlotToContainer(new Slot(player, 9+j+i*9, 8+j*18, (104+i*18)-20));
			}
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}

}