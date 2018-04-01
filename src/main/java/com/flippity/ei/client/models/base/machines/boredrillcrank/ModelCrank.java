package com.flippity.ei.client.models.base.machines.boredrillcrank;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * BoreDrillCrank - Flippity
 * Created using Tabula 7.0.0
 */
public class ModelCrank extends ModelBase {
    public ModelRenderer crank;
    public ModelRenderer crank2;

    public ModelCrank() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.crank = new ModelRenderer(this, 9, 37);
        this.crank.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crank.addBox(-7.0F, 15.0F, -2.0F, 1, 3, 3, 0.0F);
        this.crank2 = new ModelRenderer(this, 9, 37);
        this.crank2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crank2.addBox(-8.0F, 15.0F, 0.0F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.crank.render(f5);
        this.crank2.render(f5);
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
