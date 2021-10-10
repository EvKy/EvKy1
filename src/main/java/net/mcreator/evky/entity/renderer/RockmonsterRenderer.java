package net.mcreator.evky.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.evky.entity.RockmonsterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RockmonsterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RockmonsterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 2f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("evky:textures/rockmonster.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer LLeg;
		private final ModelRenderer RLeg;
		private final ModelRenderer Body;
		private final ModelRenderer Head;
		private final ModelRenderer RArm;
		private final ModelRenderer LArm;
		public Modelcustom_model() {
			textureWidth = 256;
			textureHeight = 256;
			LLeg = new ModelRenderer(this);
			LLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			LLeg.setTextureOffset(96, 0).addBox(-14.0F, -10.0F, -5.0F, 11.0F, 10.0F, 10.0F, 0.0F, false);
			RLeg = new ModelRenderer(this);
			RLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			RLeg.setTextureOffset(94, 49).addBox(3.0F, -10.0F, -5.0F, 11.0F, 10.0F, 10.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 24.0F, 0.0F);
			Body.setTextureOffset(0, 0).addBox(-15.0F, -41.0F, -8.0F, 30.0F, 17.0F, 18.0F, 0.0F, false);
			Body.setTextureOffset(86, 25).addBox(-11.0F, -24.0F, -5.0F, 22.0F, 14.0F, 10.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head.setTextureOffset(0, 89).addBox(-8.0F, -48.0F, -5.0F, 16.0F, 7.0F, 13.0F, 0.0F, false);
			RArm = new ModelRenderer(this);
			RArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			RArm.setTextureOffset(0, 35).addBox(-28.0F, -37.0F, -10.0F, 13.0F, 23.0F, 21.0F, 0.0F, false);
			LArm = new ModelRenderer(this);
			LArm.setRotationPoint(0.0F, 24.0F, 0.0F);
			LArm.setTextureOffset(47, 58).addBox(15.0F, -37.0F, -10.0F, 13.0F, 23.0F, 21.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			LLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			RArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
