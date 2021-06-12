package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.Cf;
import net.futureclient.client.Dg;
import net.futureclient.client.Lg;
import net.futureclient.client.RD;
import net.futureclient.client.RF;
import net.futureclient.client.Wd;
import net.futureclient.client.YE;
import net.futureclient.client.fg;
import net.futureclient.client.gF;
import net.futureclient.client.i;
import net.futureclient.client.kH;
import net.futureclient.client.lF;
import net.futureclient.client.rA;
import net.futureclient.client.sE;
import net.futureclient.client.xf;
import net.futureclient.client.zA;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class MixinEntityRenderer implements i {
   @Shadow
   @Final
   private Minecraft field_78531_r;
   private boolean f$M;
   private float f$g;
   private float f$d;

   @Shadow
   public abstract void func_78467_g(float var1);

   public void f$E(float var1) {
      this.func_78467_g(var1);
   }

   @Invoker
   public abstract void invokeSetupCameraTransform(float var1, int var2);

   @Inject(
      method = {"hurtCameraEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$K(CallbackInfo var1) {
      lF var2 = new lF();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E() || !zA.f$b) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"renderWorldPass"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/client/renderer/GlStateManager.clear(I)V",
   ordinal = 1,
   shift = At.Shift.AFTER
)}
   )
   private void f$E(int var1, float var2, long var3, CallbackInfo var5) {
      if (Display.isActive() || Display.isVisible()) {
         kH.f$E().f$E().f$E((RF)(new sE(YE.f$M, var2)));
         kH.f$E().f$E().f$E((RF)(new sE(YE.f$g, var2)));
      }

   }

   @Inject(
      method = {"renderHand"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$B(CallbackInfo var1) {
      Dg var2 = new Dg();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("RETURN")}
   )
   private void f$e(CallbackInfo var1) {
      int var2 = this.field_78531_r.field_71474_y.field_74335_Z;
      this.field_78531_r.field_71474_y.field_74335_Z = 1;
      kH.f$E().f$E().f$E((RF)(new fg()));
      this.field_78531_r.field_71474_y.field_74335_Z = var2;
   }

   @Inject(
      method = {"orientCamera"},
      at = {@At("HEAD")}
   )
   private void f$E(float var1, CallbackInfo var2) {
      Wd var3 = new Wd(3.5F);
      kH.f$E().f$E().f$E((RF)var3);
      this.f$M = var3.f$E();
      this.f$g = var3.f$E();
   }

   @Redirect(
      method = {"orientCamera"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/multiplayer/WorldClient.rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"
)
   )
   private RayTraceResult f$E(WorldClient var1, Vec3d var2, Vec3d var3) {
      return this.f$M ? null : this.field_78531_r.field_71441_e.func_72933_a(var2, var3);
   }

   @Redirect(
      method = {"orientCamera"},
      at = @At(
   value = "INVOKE",
   ordinal = 2,
   target = "net/minecraft/client/renderer/GlStateManager.translate(FFF)V"
)
   )
   private void f$E(float var1, float var2, float var3) {
      GlStateManager.func_179109_b(var1, var2, var3 - (this.f$M ? this.f$g - 3.5F : 0.0F));
   }

   @Redirect(
      method = {"setupFog"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/renderer/ActiveRenderInfo.getBlockStateAtEntityViewpoint(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;F)Lnet/minecraft/block/state/IBlockState;"
)
   )
   private IBlockState f$E(World var1, Entity var2, float var3) {
      IBlockState var4 = ActiveRenderInfo.func_186703_a(this.field_78531_r.field_71441_e, var2, var3);
      gF var5 = (gF)kH.f$E().f$E().f$E(gF.class);
      return var5 == null || !(Boolean)var5.f$J.f$E() || var4.func_185904_a() != Material.field_151587_i && var4.func_185904_a() != Material.field_151586_h ? var4 : Blocks.field_150350_a.func_176223_P();
   }

   @Inject(
      method = {"displayItemActivation"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfo var1) {
      RD var2 = new RD();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }

   @Redirect(
      method = {"getMouseOver"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/multiplayer/PlayerControllerMP.getBlockReachDistance()F"
)
   )
   private float f$E(PlayerControllerMP var1) {
      xf var2 = new xf();
      kH.f$E().f$E().f$E((RF)var2);
      return this.field_78531_r.field_71442_b.func_78757_d() + (this.f$d = var2.f$a());
   }

   @Redirect(
      method = {"getMouseOver"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/util/math/Vec3d.distanceTo(Lnet/minecraft/util/math/Vec3d;)D"
)
   )
   private double f$E(Vec3d var1, Vec3d var2) {
      return var1.func_72438_d(var2) - (double)this.f$d;
   }

   @Redirect(
      method = {"renderWorldPass"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;",
   ordinal = 0
)
   )
   private EntityPlayerSP f$E(Minecraft var1) {
      rA var2 = (rA)kH.f$E().f$E().f$E(rA.class);
      return (EntityPlayerSP)(var2 != null && var2.f$E() ? var2.f$E() : var1.field_71439_g);
   }

   @Redirect(
      method = {"getMouseOver"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/Minecraft.getRenderViewEntity()Lnet/minecraft/entity/Entity;",
   ordinal = 0
)
   )
   private Entity f$E(Minecraft var1) {
      Cf var2 = new Cf(var1.func_175606_aa());
      kH.f$E().f$E().f$E((RF)var2);
      return var2.f$E();
   }

   @Inject(
      method = {"getMouseOver"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      Lg var2 = new Lg(this.field_78531_r.field_71476_x);
      kH.f$E().f$E().f$E((RF)var2);
      this.field_78531_r.field_71476_x = var2.f$E();
   }

   @Redirect(
      method = {"updateCameraAndRender"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/entity/EntityPlayerSP.turn(FF)V"
)
   )
   private void f$E(EntityPlayerSP var1, float var2, float var3) {
      rA var4 = (rA)kH.f$E().f$E().f$E(rA.class);
      if (var4 != null && var4.f$E()) {
         var4.f$E().func_70082_c(var2, var3);
      } else {
         var1.func_70082_c(var2, var3);
      }
   }
}
