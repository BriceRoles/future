package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiChat.class})
public abstract class MixinGuiChat extends GuiScreen {
   @Shadow
   public GuiTextField field_146415_a;

   @Redirect(
      method = {"drawScreen"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/gui/GuiChat.drawRect(IIIII)V"
)
   )
   private void f$E(int var1, int var2, int var3, int var4, int var5) {
      if (!lG.f$E().f$E()) {
         this.field_146415_a.func_146195_b(Display.isActive());
         gF var6 = (gF)kH.f$E().f$E().f$E(gF.class);
         if (var6 != null && !var6.f$i) {
            var6.f$i = true;
         }

         func_73734_a(var1, this.field_146295_m - (var6 != null ? var6.f$j : 14), var3, var4, var5);
      } else {
         func_73734_a(var1, var2, var3, var4, var5);
      }

   }
}
