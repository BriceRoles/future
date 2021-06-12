package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.RF;
import net.futureclient.client.hg;
import net.futureclient.client.kH;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BlockRendererDispatcher.class})
public abstract class MixinBlockRendererDispatcher {
   @Inject(
      method = {"renderBlock"},
      at = {@At("HEAD")}
   )
   private void f$E(IBlockState var1, BlockPos var2, IBlockAccess var3, BufferBuilder var4, CallbackInfoReturnable<Boolean> var5) {
      kH.f$E().f$E().f$E((RF)(new hg(var1, var2)));
   }
}
