package net.futureclient.loader.mixin.common.block;

import net.futureclient.client.DF;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.minecraft.block.BlockSoulSand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BlockSoulSand.class})
public abstract class MixinBlockSoulSand {
   @Inject(
      method = {"onEntityCollision"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      DF var2 = new DF();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }
}
