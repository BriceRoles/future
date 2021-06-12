package net.futureclient.loader.mixin.common;

import net.futureclient.client.De;
import net.futureclient.client.RF;
import net.futureclient.client.SD;
import net.futureclient.client.kH;
import net.minecraft.client.multiplayer.WorldClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WorldClient.class})
public abstract class MixinWorldClient {
   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      WorldClient var2 = (WorldClient)this;
      kH.f$E().f$E().f$E((RF)(new De(var2)));
   }

   @ModifyVariable(
      method = {"showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V"},
      at = @At("HEAD")
   )
   private boolean f$E(boolean var1) {
      SD var2 = new SD();
      kH.f$E().f$E().f$E((RF)var2);
      return var2.f$E() || var1;
   }
}
