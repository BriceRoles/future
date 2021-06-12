package net.futureclient.loader.mixin.common.network;

import net.futureclient.client.GE;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.minecraft.network.NettyCompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({NettyCompressionDecoder.class})
public abstract class MixinNettyCompressionDecoder {
   @ModifyConstant(
      method = {"decode"},
      constant = {@Constant(
   intValue = 2097152
)}
   )
   private int f$E(int var1) {
      GE var2 = new GE();
      kH.f$E().f$E().f$E((RF)var2);
      return var2.f$E() ? Integer.MAX_VALUE : var1;
   }
}
