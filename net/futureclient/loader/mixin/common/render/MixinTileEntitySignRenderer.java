package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.oD;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({TileEntitySignRenderer.class})
public abstract class MixinTileEntitySignRenderer {
   @Redirect(
      method = {"render"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/gui/FontRenderer.drawString(Ljava/lang/String;III)I"
)
   )
   private int f$E(FontRenderer var1, String var2, int var3, int var4, int var5) {
      oD var6 = new oD();
      kH.f$E().f$E().f$E((RF)var6);
      return var6.f$E() ? 0 : var1.func_78276_b(var2, var3, var4, var5);
   }
}
