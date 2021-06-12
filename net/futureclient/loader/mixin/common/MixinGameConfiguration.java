package net.futureclient.loader.mixin.common;

import net.futureclient.client.AI;
import net.minecraft.client.main.GameConfiguration.DisplayInformation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DisplayInformation.class})
public abstract class MixinGameConfiguration {
   @Inject(
      method = {"<init>(IIZZ)V"},
      at = {@At("RETURN")}
   )
   private void f$E(int var1, int var2, boolean var3, boolean var4, CallbackInfo var5) {
      AI.f$E().f$E();
   }
}
