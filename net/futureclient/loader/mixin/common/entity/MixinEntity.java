package net.futureclient.loader.mixin.common.entity;

import java.util.Random;
import net.futureclient.client.Ee;
import net.futureclient.client.RF;
import net.futureclient.client.b;
import net.futureclient.client.df;
import net.futureclient.client.kH;
import net.futureclient.client.ne;
import net.futureclient.client.sf;
import net.futureclient.client.xf;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Entity.class})
public abstract class MixinEntity implements b {
   @Shadow
   public double field_70165_t;
   @Shadow
   public double field_70163_u;
   @Shadow
   public double field_70161_v;
   @Shadow
   public double field_70159_w;
   @Shadow
   public double field_70181_x;
   @Shadow
   public double field_70179_y;
   @Shadow
   public float field_70177_z;
   @Shadow
   public float field_70125_A;
   @Shadow
   public boolean field_70122_E;
   @Shadow
   public Random field_70146_Z;
   @Shadow
   public World field_70170_p;
   @Shadow
   public EntityDataManager field_70180_af;
   private Ee f$g;
   private Float f$d;

   @Shadow
   public abstract AxisAlignedBB func_174813_aQ();

   @Shadow
   public abstract boolean func_70083_f(int var1);

   @Shadow
   public abstract boolean func_189652_ae();

   @Accessor
   public abstract boolean isIsInWeb();

   @Inject(
      method = {"getCollisionBorderSize"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Float> var1) {
      xf var2 = new xf();
      kH.f$E().f$E().f$E((RF)var2);
      var1.setReturnValue(var2.f$E());
   }

   @Inject(
      method = {"move"},
      at = {@At("HEAD")}
   )
   private void f$A(MoverType var1, double var2, double var4, double var6, CallbackInfo var8) {
      Entity var9 = (Entity)this;
      if (var9 instanceof EntityPlayerSP) {
         kH.f$E().f$E().f$E((RF)(this.f$g = new Ee(var1, var2, var4, var6, var9.func_70093_af())));
      }

   }

   @ModifyVariable(
      method = {"move"},
      at = @At("HEAD"),
      ordinal = 0
   )
   private double f$e(double var1) {
      if (this.f$g != null) {
         var1 = this.f$g.f$e();
      }

      return var1;
   }

   @ModifyVariable(
      method = {"move"},
      at = @At("HEAD"),
      ordinal = 1
   )
   private double f$a(double var1) {
      if (this.f$g != null) {
         var1 = this.f$g.f$a();
      }

      return var1;
   }

   @ModifyVariable(
      method = {"move"},
      at = @At("HEAD"),
      ordinal = 2
   )
   private double f$E(double var1) {
      if (this.f$g != null) {
         var1 = this.f$g.f$E();
      }

      return var1;
   }

   @Redirect(
      method = {"move"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/entity/Entity.isSneaking()Z",
   ordinal = 0
)
   )
   private boolean f$E(Entity var1) {
      return this.f$g != null ? this.f$g.f$a() : var1.func_70093_af();
   }

   @Inject(
      method = {"move"},
      at = {@At(
   value = "FIELD",
   target = "net/minecraft/entity/Entity.onGround:Z",
   ordinal = 1
)}
   )
   private void f$K(MoverType var1, double var2, double var4, double var6, CallbackInfo var8) {
      Entity var9 = (Entity)this;
      if (var9 instanceof EntityPlayerSP) {
         df var10 = new df(this.func_174813_aQ(), var9.field_70138_W);
         kH.f$E().f$E().f$E((RF)var10);
         this.f$d = var9.field_70138_W;
         var9.field_70138_W = var10.f$E();
      }

   }

   @Inject(
      method = {"move"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/entity/Entity.setEntityBoundingBox(Lnet/minecraft/util/math/AxisAlignedBB;)V",
   ordinal = 7,
   shift = At.Shift.AFTER
)}
   )
   private void f$B(MoverType var1, double var2, double var4, double var6, CallbackInfo var8) {
      Entity var9 = (Entity)this;
      if (var9 instanceof EntityPlayerSP) {
         sf var10 = new sf(this.func_174813_aQ(), this.f$d != null ? this.f$d : 0.0F);
         kH.f$E().f$E().f$E((RF)var10);
      }

   }

   @Inject(
      method = {"move"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/entity/Entity.resetPositionToBB()V",
   ordinal = 1
)}
   )
   private void f$e(MoverType var1, double var2, double var4, double var6, CallbackInfo var8) {
      Entity var9 = (Entity)this;
      if (var9 instanceof EntityPlayerSP && this.f$d != null) {
         var9.field_70138_W = this.f$d;
         this.f$d = null;
      }

   }

   @Inject(
      method = {"move"},
      at = {@At(
   value = "FIELD",
   target = "net/minecraft/entity/Entity.onGround:Z",
   ordinal = 2,
   shift = At.Shift.AFTER
)}
   )
   private void f$a(MoverType var1, double var2, double var4, double var6, CallbackInfo var8) {
      Entity var9 = (Entity)this;
      if (var9 instanceof EntityPlayerSP) {
         ne var10 = new ne();
         kH.f$E().f$E().f$E((RF)var10);
         var9.field_70122_E = var9.field_70122_E || var10.f$E();
      }

   }

   @Inject(
      method = {"move"},
      at = {@At("RETURN")}
   )
   private void f$E(MoverType var1, double var2, double var4, double var6, CallbackInfo var8) {
      this.f$g = null;
   }
}
