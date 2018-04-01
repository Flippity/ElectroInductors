package com.flippity.ei.client.models.base.machines.boredrillcrank;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * BoreDrillCrank - Flippity
 * Created using Tabula 7.0.0
 */
public class ModelRod extends ModelBase {
    public ModelRenderer pipe;

    public ModelRod() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.pipe = new ModelRenderer(this, 1, 28);
        this.pipe.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pipe.addBox(1.0F, 17.0F, -3.0F, 6, 3, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.pipe.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
