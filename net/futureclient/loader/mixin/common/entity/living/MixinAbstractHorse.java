package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.LF;
import net.futureclient.client.RF;
import net.futureclient.client.Yd;
import net.futureclient.client.kH;
import net.minecraft.entity.passive.AbstractHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractHorse.class})
public abstract class MixinAbstractHorse extends MixinEntityLivingBase {
   @Inject(
      method = {"getHorseJumpStrength"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$e(CallbackInfoReturnable<Double> var1) {
      LF var2 = new LF();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E() != 0.0D) {
         var1.setReturnValue(var2.f$E());
      }

   }

   @Inject(
      method = {"canBeSteered"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfoReturnable<Boolean> var1) {
      Yd var2 = new Yd();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.setReturnValue(true);
      }

   }

   @Inject(
      method = {"isHorseSaddled"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Boolean> var1) {
      Yd var2 = new Yd();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.setReturnValue(true);
      }

   }
}
