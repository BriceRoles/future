package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.RF;
import net.futureclient.client.Yd;
import net.futureclient.client.kH;
import net.minecraft.entity.passive.EntityLlama;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityLlama.class})
public abstract class MixinEntityLlama extends MixinAbstractHorse {
   @Inject(
      method = {"canBeSteered"},
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
