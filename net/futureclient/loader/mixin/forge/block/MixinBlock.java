package net.futureclient.loader.mixin.forge.block;

import net.futureclient.client.RF;
import net.futureclient.client.VE;
import net.futureclient.client.kH;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Block.class})
public abstract class MixinBlock {
   @Inject(
      method = {"canRenderInLayer"},
      at = {@At("RETURN")},
      cancellable = true
   )
   @Dynamic
   private void f$E(IBlockState var1, BlockRenderLayer var2, CallbackInfoReturnable<Boolean> var3) {
      Block var4 = (Block)this;
      VE var5 = new VE(var4);
      if (kH.f$E() != null) {
         kH.f$E().f$E().f$E((RF)var5);
      }

      if (var5.f$E() != null) {
         var3.setReturnValue(var5.f$E() == var2);
      }

   }
}
