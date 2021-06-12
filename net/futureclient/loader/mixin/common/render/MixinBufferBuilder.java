package net.futureclient.loader.mixin.common.render;

import java.nio.IntBuffer;
import net.futureclient.client.ba;
import net.futureclient.client.kH;
import net.minecraft.client.renderer.BufferBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({BufferBuilder.class})
public abstract class MixinBufferBuilder {
   @Redirect(
      method = {"putColorMultiplier"},
      at = @At(
   value = "INVOKE",
   remap = false,
   target = "java/nio/IntBuffer.put(II)Ljava/nio/IntBuffer;"
)
   )
   private IntBuffer f$E(IntBuffer var1, int var2, int var3) {
      ba var4 = (ba)kH.f$E().f$E().f$E(ba.class);
      if (var4 != null && var4.f$E()) {
         var3 = var4.f$K.f$E().intValue() << 24 | var3 & 16777215;
      }

      return var1.put(var2, var3);
   }
}
