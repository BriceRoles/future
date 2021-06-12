package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.Bf;
import net.futureclient.client.Ff;
import net.futureclient.client.Kg;
import net.futureclient.client.RF;
import net.futureclient.client.SF;
import net.futureclient.client.kH;
import net.futureclient.client.zA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderLivingBase.class})
public abstract class MixinRenderLivingBase {
   private final Minecraft f$g = Minecraft.func_71410_x();
   private Kg f$d;

   @Inject(
      method = {"doRender"},
      at = {@At("HEAD")}
   )
   private void f$a(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (var1.equals(this.f$g.field_71439_g)) {
         this.f$d = new Kg(var1.field_70760_ar, var1.field_70761_aq, var1.field_70758_at, var1.field_70759_as, var1.field_70127_C, var1.field_70125_A);
         kH.f$E().f$E().f$E((RF)this.f$d);
         var1.field_70760_ar = this.f$d.f$I();
         var1.field_70761_aq = this.f$d.f$j();
         var1.field_70758_at = this.f$d.f$M();
         var1.field_70759_as = this.f$d.f$C();
         var1.field_70127_C = this.f$d.f$H();
         var1.field_70125_A = this.f$d.f$h();
      }

   }

   @Inject(
      method = {"doRender"},
      at = {@At("RETURN")}
   )
   private void f$E(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (this.f$d != null) {
         var1.field_70760_ar = this.f$d.f$A();
         var1.field_70761_aq = this.f$d.f$K();
         var1.field_70758_at = this.f$d.f$B();
         var1.field_70759_as = this.f$d.f$e();
         var1.field_70127_C = this.f$d.f$a();
         var1.field_70125_A = this.f$d.f$E();
         this.f$d = null;
      }

   }

   @Inject(
      method = {"renderLayers"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      if (!zA.f$b) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"renderName"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(EntityLivingBase var1, double var2, double var4, double var6, CallbackInfo var8) {
      if (var1 instanceof EntityPlayer) {
         SF var9 = new SF();
         kH.f$E().f$E().f$E((RF)var9);
         if (var9.f$E()) {
            var8.cancel();
         }
      }

      if (!zA.f$b) {
         var8.cancel();
      }

   }

   @Redirect(
      method = {"renderModel"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V"
)
   )
   private void f$E(ModelBase var1, Entity var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      RenderLivingBase var9 = (RenderLivingBase)this;
      EntityLivingBase var10 = (EntityLivingBase)var2;
      Ff var11 = new Ff(var9, var10, var1, var3, var4, var5, var6, var7, var8);
      kH.f$E().f$E().f$E((RF)var11);
      if (!var11.f$E()) {
         var1.func_78088_a(var2, var3, var4, var5, var6, var7, var8);
      }

      kH.f$E().f$E().f$E((RF)(new Bf(var9, var10, var1)));
   }
}
