package net.futureclient.loader.mixin.common.block;

import net.futureclient.client.ba;
import net.futureclient.client.kH;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BlockLiquid.class})
public abstract class MixinBlockLiquid extends MixinBlock {
   @Inject(
      method = {"shouldSideBeRendered"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(IBlockState var1, IBlockAccess var2, BlockPos var3, EnumFacing var4, CallbackInfoReturnable<Boolean> var5) {
      ba var6 = (ba)kH.f$E().f$E().f$E(ba.class);
      if (var6 != null && var6.f$E()) {
         var5.setReturnValue(var2.func_180495_p(var3.func_177972_a(var4)).func_185904_a() != this.field_149764_J);
      }

   }
}
