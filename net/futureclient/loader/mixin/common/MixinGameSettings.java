package net.futureclient.loader.mixin.common;

import net.futureclient.client.AI;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameSettings.class})
public abstract class MixinGameSettings {
   @Inject(
      method = {"<init>(Lnet/minecraft/client/Minecraft;Ljava/io/File;)V"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      AI.f$E().f$E();
   }
}
