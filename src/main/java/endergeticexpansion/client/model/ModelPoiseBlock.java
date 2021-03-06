package endergeticexpansion.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import endergeticexpansion.common.entities.EntityPoiseCluster;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

/**
 * ModelPoiseBlock - Endergized
 * Created using Tabula 7.0.0
 */
public class ModelPoiseBlock<T extends EntityPoiseCluster> extends EntityModel<T> {
    public ModelRenderer cube;

    public ModelPoiseBlock() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.cube = new ModelRenderer(this, 0, 0);
        this.cube.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.cube.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F);
    }
    
    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
    	this.cube.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, 0.3F);
    }
    
    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
    
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
}
