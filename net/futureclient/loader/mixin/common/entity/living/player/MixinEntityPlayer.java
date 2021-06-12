package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.Me;
import net.futureclient.client.RF;
import net.futureclient.client.he;
import net.futureclient.client.kH;
import net.futureclient.client.ye;
import net.futureclient.loader.mixin.common.entity.living.MixinEntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPlayer.class})
public abstract class MixinEntityPlayer extends MixinEntityLivingBase {
   private boolean f$d;

   @Shadow
   public abstract String func_70005_c_();

   @Shadow
   public abstract float func_110139_bj();

   @Shadow
   public void func_70071_h_() {
   }

   @Inject(
      method = {"getAbsorptionAmount"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$e(CallbackInfoReturnable<Float> var1) {
      if (this.f$d ^= true) {
         try {
            var1.setReturnValue(this.func_110139_bj());
         } catch (ClassCastException var3) {
            var1.setReturnValue(0.0F);
         }

      }
   }

   @Inject(
      method = {"isEntityInsideOpaqueBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfoReturnable<Boolean> var1) {
      ye var2 = new ye();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"isPushedByWater"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Boolean> var1) {
      he var2 = new he();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }

   @Redirect(
      method = {"attackTargetEntityWithCurrentItem"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/entity/player/EntityPlayer.setSprinting(Z)V"
)
   )
   private void f$E(EntityPlayer var1, boolean var2) {
      Me var3 = new Me();
      kH.f$E().f$E().f$E((RF)var3);
      if (var3.f$E()) {
         this.field_70159_w /= 0.6D;
         this.field_70179_y /= 0.6D;
      } else {
         var1.func_70031_b(var2);
      }
   }
}
