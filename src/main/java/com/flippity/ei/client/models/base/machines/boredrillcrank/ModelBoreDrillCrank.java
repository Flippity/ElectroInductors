package com.flippity.ei.client.models.base.machines.boredrillcrank;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * BoreDrillCrank - Flippity
 * Created using Tabula 7.0.0
 */
public class ModelBoreDrillCrank extends ModelBase {
    public ModelRenderer base;
    public ModelRenderer base2;
    public ModelRenderer base3;
    public ModelRenderer base4;
    public ModelRenderer base5;
    public ModelRenderer holder11;
    public ModelRenderer holder;
    public ModelRenderer holder1;
    public ModelRenderer holder2;
    public ModelRenderer crankbox;
    public ModelRenderer crankbox2;
    public ModelRenderer bit;

    public ModelBoreDrillCrank() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.crankbox = new ModelRenderer(this, 9, 37);
        this.crankbox.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crankbox.addBox(-6.0F, 14.0F, -4.0F, 5, 7, 6, 0.0F);
        this.base5 = new ModelRenderer(this, 18, 5);
        this.base5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base5.addBox(0.0F, 21.0F, -1.0F, 7, 2, 7, 0.0F);
        this.holder = new ModelRenderer(this, 18, 5);
        this.holder.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.holder.addBox(0.0F, 19.0F, -4.0F, 7, 1, 1, 0.0F);
        this.base = new ModelRenderer(this, 0, 0);
        this.base.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addBox(-8.0F, 23.0F, -8.0F, 16, 1, 16, 0.0F);
        this.base2 = new ModelRenderer(this, 18, 5);
        this.base2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base2.addBox(-7.0F, 21.0F, -1.0F, 7, 2, 7, 0.0F);
        this.holder1 = new ModelRenderer(this, 18, 5);
        this.holder1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.holder1.addBox(0.0F, 19.0F, 0.0F, 7, 1, 1, 0.0F);
        this.base3 = new ModelRenderer(this, 18, 5);
        this.base3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base3.addBox(-7.0F, 21.0F, -7.0F, 7, 2, 6, 0.0F);
        this.holder11 = new ModelRenderer(this, 18, 5);
        this.holder11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.holder11.addBox(0.0F, 20.0F, -3.0F, 7, 1, 3, 0.0F);
        this.holder2 = new ModelRenderer(this, 18, 5);
        this.holder2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.holder2.addBox(7.0F, 19.0F, -3.0F, 1, 2, 3, 0.0F);
        this.base4 = new ModelRenderer(this, 18, 5);
        this.base4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base4.addBox(0.0F, 21.0F, -7.0F, 7, 2, 6, 0.0F);
        this.bit = new ModelRenderer(this, 9, 37);
        this.bit.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bit.addBox(-6.0F, 18.0F, -2.0F, 7, 1, 1, 0.0F);
        this.crankbox2 = new ModelRenderer(this, 9, 37);
        this.crankbox2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crankbox2.addBox(-1.0F, 17.0F, -3.0F, 1, 3, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.crankbox.render(f5);
        this.base5.render(f5);
        this.holder.render(f5);
        this.base.render(f5);
        this.base2.render(f5);
        this.holder1.render(f5);
        this.base3.render(f5);
        this.holder11.render(f5);
        this.holder2.render(f5);
        this.base4.render(f5);
        this.bit.render(f5);
        this.crankbox2.render(f5);
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
