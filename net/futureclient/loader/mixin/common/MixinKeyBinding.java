package net.futureclient.loader.mixin.common;

import net.futureclient.client.CD;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({KeyBinding.class})
public abstract class MixinKeyBinding {
   @Shadow
   private boolean field_74513_e;

   @Inject(
      method = {"unPressAllKeys"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void f$E(CallbackInfo var0) {
      CD var1 = new CD();
      if (kH.f$E() != null) {
         kH.f$E().f$E().f$E((RF)var1);
      }

      if (var1.f$E()) {
         Minecraft var2 = Minecraft.func_71410_x();
         KeyBinding.func_74510_a(var2.field_71474_y.field_74322_I.func_151463_i(), false);
         KeyBinding.func_74510_a(var2.field_71474_y.field_74313_G.func_151463_i(), false);
         KeyBinding.func_74510_a(var2.field_71474_y.field_74312_F.func_151463_i(), false);
         var0.cancel();
      }

   }

   @Inject(
      method = {"isKeyDown"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Boolean> var1) {
      if (!(Boolean)var1.getReturnValue()) {
         var1.setReturnValue(this.field_74513_e);
      }

   }
}
