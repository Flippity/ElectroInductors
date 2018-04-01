package com.flippity.ei.client.renderers.cables.copper;

import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperInsulated;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRendererCableCopperInsulated implements IItemRenderer {


    public ItemRendererCableCopperInsulated() {
    	
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
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TECableCopperInsulated(), 0.0D, 0.0D, 0.0D, 0.0f);
    }

}
