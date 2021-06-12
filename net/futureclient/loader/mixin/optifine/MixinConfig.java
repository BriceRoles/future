package net.futureclient.loader.mixin.optifine;

import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
   targets = {"Config"},
   remap = false
)
@Pseudo
public abstract class MixinConfig {
   @Inject(
      method = {"isFastRender"},
      at = {@At("HEAD")},
      cancellable = true
   )
   @Dynamic
   private static void f$E(CallbackInfoReturnable<Boolean> var0) {
      var0.setReturnValue(false);
   }
}
