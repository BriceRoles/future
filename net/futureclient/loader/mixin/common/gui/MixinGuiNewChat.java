package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.La;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiNewChat.class})
public abstract class MixinGuiNewChat {
   @ModifyVariable(
      method = {"setChatLine"},
      at = @At("HEAD"),
      ordinal = 0
   )
   private int f$E(int var1) {
      if (var1 == La.f$i) {
         var1 = 0;
      }

      return var1;
   }

   @Inject(
      method = {"printChatMessageWithOptionalDeletion"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/client/gui/GuiNewChat.setChatLine(Lnet/minecraft/util/text/ITextComponent;IIZ)V",
   shift = At.Shift.AFTER
)},
      cancellable = true
   )
   private void f$E(ITextComponent var1, int var2, CallbackInfo var3) {
      if (var2 == La.f$i || var2 == La.f$M) {
         var3.cancel();
      }

   }
}
