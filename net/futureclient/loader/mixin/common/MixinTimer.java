package net.futureclient.loader.mixin.common;

import net.futureclient.client.q;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Timer.class})
public abstract class MixinTimer implements q {
   @Shadow
   public float field_194148_c;
   private float f$d = 1.0F;

   @Inject(
      method = {"updateTimer"},
      at = {@At(
   value = "FIELD",
   target = "net/minecraft/util/Timer.elapsedPartialTicks:F",
   ordinal = 1
)}
   )
   private void f$E(CallbackInfo var1) {
      this.field_194148_c *= this.f$d;
   }

   public void f$E(float var1) {
      this.f$d = var1;
   }

   public float f$E() {
      return this.f$d;
   }
}
