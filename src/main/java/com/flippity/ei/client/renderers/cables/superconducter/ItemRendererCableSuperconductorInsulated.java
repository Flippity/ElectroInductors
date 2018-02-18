package com.flippity.ei.client.renderers.cables.superconducter;

import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.base.cables.superconductor.TECableSuperconductorInsulated;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRendererCableSuperconductorInsulated implements IItemRenderer {


    public ItemRendererCableSuperconductorInsulated() {
    	
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TECableSuperconductorInsulated(), 0.0D, 0.0D, 0.0D, 0.0f);
    }

}
