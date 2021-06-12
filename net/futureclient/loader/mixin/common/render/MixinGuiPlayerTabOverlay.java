package net.futureclient.loader.mixin.common.render;

import java.util.List;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.wd;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({GuiPlayerTabOverlay.class})
public abstract class MixinGuiPlayerTabOverlay {
   @Redirect(
      method = {"renderPlayerlist"},
      at = @At(
   value = "INVOKE",
   remap = false,
   target = "java/util/List.subList(II)Ljava/util/List;"
)
   )
   private List<?> f$E(List<?> var1, int var2, int var3) {
      wd var4 = new wd();
      kH.f$E().f$E().f$E((RF)var4);
      return var4.f$a() ? var1 : var1.subList(var2, var3);
   }
}
