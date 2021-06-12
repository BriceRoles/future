package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.WI;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreenServerList;
import net.minecraft.client.multiplayer.ServerData;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiScreenServerList.class})
public abstract class MixinGuiScreenServerList {
   @Shadow
   @Final
   private ServerData field_146301_f;

   @Inject(
      method = {"actionPerformed"},
      at = {@At(
   value = "INVOKE",
   ordinal = 1,
   target = "net/minecraft/client/gui/GuiScreen.confirmClicked(ZI)V"
)}
   )
   private void f$E(GuiButton var1, CallbackInfo var2) {
      if (var1.field_146127_k == 0) {
         WI.f$E(this.field_146301_f);
      }

   }
}
