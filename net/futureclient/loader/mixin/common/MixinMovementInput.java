package net.futureclient.loader.mixin.common;

import net.futureclient.client.Fe;
import net.futureclient.client.PD;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MovementInputFromOptions.class})
public abstract class MixinMovementInput {
   @Inject(
      method = {"updatePlayerMoveState"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      MovementInputFromOptions var2 = (MovementInputFromOptions)this;
      kH.f$E().f$E().f$E((RF)(new PD(var2)));
   }

   @Redirect(
      method = {"updatePlayerMoveState"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/settings/KeyBinding.isKeyDown()Z"
)
   )
   private boolean f$E(KeyBinding var1) {
      MovementInputFromOptions var2 = (MovementInputFromOptions)this;
      Fe var3 = new Fe(var2, var1, var1.func_151470_d());
      kH.f$E().f$E().f$E((RF)var3);
      return var3.f$a();
   }
}
