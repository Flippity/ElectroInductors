package com.flippity.ei.client.renderers.cables.copper;

import org.lwjgl.opengl.GL11;

import com.flippity.ei.common.tiles.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class RendererCableCopperInsulated extends TileEntitySpecialRenderer {
    private static final ResourceLocation resourceloc = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/BlockCableCopperInsulated.png");
    float pixel = 1F/16F;

    float texPixel = 1F/32F;
    
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {    	
    	GL11.glTranslated(x, y, z);
    	GL11.glDisable(GL11.GL_LIGHTING);
        this.bindTexture(resourceloc);
        {
        drawCore(te);
        TECableCopperInsulated cable = (TECableCopperInsulated) te;
        for(int i = 0; i < cable.connections.length; i++) {
        	if(cable.connections[i] != null) {
        		drawConnector(cable.connections[i]);
        		}
        	}
       }

    	GL11.glEnable(GL11.GL_LIGHTING);
    	GL11.glTranslated(-x, -y, -z);
		}
    
    public void drawConnector(ForgeDirection dir) {

    	Tessellator tes = Tessellator.instance;
    	tes.startDrawingQuads();{
    		
    		GL11.glPushMatrix();
    		
        	GL11.glTranslatef(0.5F, 0.5F, 0.5F);

        	if(dir.equals(ForgeDirection.UP)) {
        		//rotate
        	}else if(dir.equals(ForgeDirection.DOWN)) {
        		GL11.glRotatef(180, 1, 0, 0);
        	}else if(dir.equals(ForgeDirection.NORTH)) {
        		GL11.glRotatef(270, 1, 0, 0);
        	}else if(dir.equals(ForgeDirection.SOUTH)) {
        		GL11.glRotatef(90, 1, 0, 0);
        	}else if(dir.equals(ForgeDirection.WEST)) {
        		GL11.glRotatef(90, 0, 0, 1);
        	}else if(dir.equals(ForgeDirection.EAST)) {
        		GL11.glRotatef(270, 0, 0, 1);
        	}
        	
        	GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
    		
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 1*texPixel, 1*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1, 1-10*pixel/2, 1*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1, 1-10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 0*texPixel, 1*texPixel);
    		
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 10*pixel/2, 1*texPixel, 1*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1, 10*pixel/2, 1*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 10*pixel/2, 0*texPixel, 1*texPixel);
    		
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 10*pixel/2, 1*texPixel, 1*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1, 10*pixel/2, 1*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1, 1-10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 0*texPixel, 1*texPixel);
    		
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 1*texPixel, 1*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1, 1-10*pixel/2, 1*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 10*pixel/2, 0*texPixel, 1*texPixel);
    		
    		//top
    		tes.addVertexWithUV(1-10*pixel/2, 1, 1-10*pixel/2, 1*texPixel, 1*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1, 10*pixel/2, 1*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1, 1-10*pixel/2, 0*texPixel, 1*texPixel);
    		
    	}
    	tes.draw();
    	
    	GL11.glPopMatrix();
    	
    }
    
    public void drawCore(TileEntity te) {
    	Tessellator tes = Tessellator.instance;
    	tes.startDrawingQuads();{
    		tes.addVertexWithUV(1-10*pixel/2, 10*pixel/2, 1-10*pixel/2, 7*texPixel, 7*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 7*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 10*pixel/2, 1-10*pixel/2, 0*texPixel, 7*texPixel);
    		
    		tes.addVertexWithUV(1-10*pixel/2, 10*pixel/2, 10*pixel/2, 7*texPixel, 7*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 10*pixel/2, 7*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 10*pixel/2, 1-10*pixel/2, 0*texPixel, 7*texPixel);
    		
    		tes.addVertexWithUV(10*pixel/2, 10*pixel/2, 10*pixel/2, 0*texPixel, 7*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 10*pixel/2, 7*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 10*pixel/2, 10*pixel/2, 7*texPixel, 7*texPixel);
    		
    		tes.addVertexWithUV(10*pixel/2, 10*pixel/2, 1-10*pixel/2, 7*texPixel, 7*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 7*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 10*pixel/2, 10*pixel/2, 0*texPixel, 7*texPixel);
    		
    		//top
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 7*texPixel, 7*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 1-10*pixel/2, 10*pixel/2, 7*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 1-10*pixel/2, 1-10*pixel/2, 0*texPixel, 7*texPixel);
    		
    		//bottom
    		tes.addVertexWithUV(10*pixel/2, 10*pixel/2, 1-10*pixel/2, 7*texPixel, 7*texPixel);
    		tes.addVertexWithUV(10*pixel/2, 10*pixel/2, 10*pixel/2, 7*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 10*pixel/2, 10*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(1-10*pixel/2, 10*pixel/2, 1-10*pixel/2, 0*texPixel, 7*texPixel);
    		
    		
    		
    	}
    	tes.draw();
    }

}
