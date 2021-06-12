package net.futureclient.loader.mixin.baritone;

import net.futureclient.client.Bi;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public abstract class MixinMinecraft {
   @Inject(
      method = {"init"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      Bi.f$M.f$E();
   }
}
