package com.flippity.ei.client.renderers.atomic;

import org.lwjgl.opengl.GL11;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import com.flippity.ei.client.models.atomic.centrifuge.ModelCentrifuge;
import com.flippity.ei.client.models.atomic.centrifuge.ModelCentrifugeShell;
import com.flippity.ei.client.models.base.machines.boredrillcrank.ModelBoreDrillCrank;
import com.flippity.ei.client.models.base.machines.boredrillcrank.ModelCrank;
import com.flippity.ei.client.models.base.machines.boredrillcrank.ModelRod;
import com.flippity.ei.common.blocks.base.machines.BlockBoreDrillCrank;
import com.flippity.ei.common.tiles.atomic.TECentrifuge;
import com.flippity.ei.common.tiles.base.machines.TEBoreDrillCrank;
import com.flippity.ei.reference.Reference;

public class RendererCentrifuge extends TileEntitySpecialRenderer {

    //The model of your block
    public final ModelCentrifuge model;
    public static ModelCentrifugeShell model2;
    //public final ModelCrank model2;
    private static final ResourceLocation resourceloc = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/Centrifuge.png");

    public RendererCentrifuge() {
        this.model = new ModelCentrifuge();
        this.model2 = new ModelCentrifugeShell();
    }


    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();

        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //This is the texture of your block. It's pathed to be the same place as your other blocks here.
        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!    
        ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
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
            this.model2.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            /*
             * Place your rendering code here.
             */

            GL11.glPopMatrix();
            
          //Stuff to get the dir int, from the block metadata or the tile or whatever
          //Check the dir and apply rotations

                  if (dir == 0)
                  {
                      GL11.glRotatef(-180F, 0.0F, 1.0F, 0.0F);
                  }

                  if (dir % 2 != 0)
                  {
                      GL11.glRotatef(dir * (-90F), 0.0F, 1.0F, 0.0F);
                  }

                  if (dir % 2 == 0)
                  {
                      GL11.glRotatef(dir * (-180F), 0.0F, 1.0F, 0.0F);
                  }
        }
        else {
            GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            this.model2.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            }

    }
    
}
   
