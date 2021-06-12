package net.futureclient.loader.mixin.forge.entity.living.player;

import net.futureclient.client.RF;
import net.futureclient.client.jE;
import net.futureclient.client.kH;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerControllerMP.class})
public class MixinPlayerControllerMP {
   @Inject(
      method = {"onPlayerDestroyBlock"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/block/Block.removedByPlayer(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;Z)Z"
)},
      cancellable = true
   )
   @Dynamic
   private void f$E(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      jE var3 = new jE();
      kH.f$E().f$E().f$E((RF)var3);
      if (var3.f$E()) {
         var2.setReturnValue(false);
      }

   }
}
