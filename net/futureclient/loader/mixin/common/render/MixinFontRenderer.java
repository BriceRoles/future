package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({FontRenderer.class})
public abstract class MixinFontRenderer {
   @Shadow
   public abstract int func_180455_b(String var1, float var2, float var3, int var4, boolean var5);

   @Redirect(
      method = {"drawString(Ljava/lang/String;FFIZ)I"},
      at = @At(
   value = "INVOKE",
   ordinal = 0,
   target = "net/minecraft/client/gui/FontRenderer.renderString(Ljava/lang/String;FFIZ)I"
)
   )
   private int f$E(FontRenderer var1, String var2, float var3, float var4, int var5, boolean var6) {
      gF var7 = (gF)kH.f$E().f$E().f$E(gF.class);
      if (var7 != null) {
         Object var10000 = var7.f$k.f$E();
         if (var10000 instanceof Boolean) {
            if (!(Boolean)var10000) {
               var3 -= 0.4F;
               var4 -= 0.4F;
            }
         }
      }

      return this.func_180455_b(var2, var3, var4, var5, var6);
   }
}
