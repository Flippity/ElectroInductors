package com.flippity.ei.client.renderers.atomic;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.flippity.ei.client.models.atomic.turbine.ModelTurbine;
import com.flippity.ei.common.tiles.atomic.TEElectromagnet;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RendererTurbine extends TileEntitySpecialRenderer {

    //The model of your block
    public final ModelTurbine model;
    private static final ResourceLocation resourceloc = new ResourceLocation(Reference.MOD_ID + ":" + "textures/blocks/turbineBlock.png");

    public RendererTurbine() {
        this.model = new ModelTurbine();
    }

	static float time = 0;
	static float mult;

    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {    	
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();
        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //This is the texture of your block. It's pathed to be the same place as your other blocks here.
        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!

        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);

        adjustLightFixture(te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord, te.blockType);

        //A reference to your Model file. Again, very important.
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
		}

    //Set the lighting stuff, so it changes it's brightness properly.       
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        //  the if statement checking for if the world is null or not if not renders the block if null renders the item model
        // != means not equal
        if (world != null) {
            int dir = world.getBlockMetadata(i, j, k);

            GL11.glPushMatrix();
            //This line actually rotates the renderer.
            GL11.glRotatef(dir * (90F), 0F, 1F, 0F);

            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            /*
             * Place your rendering code here.
             */

            GL11.glPopMatrix();
    }
    
}

    
/*public static void canSpin() {
    	
    	GL11.glPushMatrix();

		if(Minecraft.getMinecraft().theWorld != null)
		{
			time = (float)Minecraft.getMinecraft().theWorld.getWorldTime();
		
		if(TEElectromagnet.heat < 499) {
			mult = 0F;
			GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);

		}
		
		if(TEElectromagnet.heat > 500 && TEElectromagnet.heat < 249999) {
			mult = 1F;
			GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);

		}
		
		if(TEElectromagnet.heat > 250000 && TEElectromagnet.heat < 400000) {
			mult = 5F;
				GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);
			}
		
		if(TEElectromagnet.heat > 400001 && TEElectromagnet.heat < 600000) {
			mult = 8F;
				GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);
			}
		if(TEElectromagnet.heat > 600001 && TEElectromagnet.heat < 800000) {
			mult = 10F;
			GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);
		}
		if(TEElectromagnet.heat > 800001 && TEElectromagnet.heat < 1000000) {
			mult = 14F;
			GL11.glRotatef(time * mult, 0.0F, time * mult,0.0F);
		}
		GL11.glPopMatrix();
		}
    }*/
}
