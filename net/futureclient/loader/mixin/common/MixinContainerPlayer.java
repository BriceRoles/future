package net.futureclient.loader.mixin.common;

import net.futureclient.client.RF;
import net.futureclient.client.YF;
import net.futureclient.client.kH;
import net.minecraft.inventory.ContainerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ContainerPlayer.class})
public abstract class MixinContainerPlayer {
   @Inject(
      method = {"onContainerClosed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      YF var2 = new YF();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }
}
