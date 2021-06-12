package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.EE;
import net.futureclient.client.HD;
import net.futureclient.client.M;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerControllerMP.class})
public abstract class MixinPlayerControllerMP implements M {
   @Shadow
   private float field_78770_f;
   @Shadow
   private int field_78781_i;

   @Invoker
   public abstract void invokeSyncCurrentPlayItem();

   @Accessor
   public abstract float getCurBlockDamageMP();

   @Inject(
      method = {"clickBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(BlockPos var1, EnumFacing var2, CallbackInfoReturnable<Boolean> var3) {
      HD var4 = new HD(var1, var2);
      kH.f$E().f$E().f$E((RF)var4);
      if (var4.f$E()) {
         var3.cancel();
      }

   }

   @Redirect(
      method = {"onPlayerDamageBlock"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/multiplayer/PlayerControllerMP.syncCurrentPlayItem()V"
)
   )
   private void f$E(PlayerControllerMP var1, BlockPos var2, EnumFacing var3) {
      EE var4 = new EE(var2.func_177958_n(), var2.func_177956_o(), var2.func_177952_p(), this.field_78781_i, this.field_78770_f, var3, var2);
      kH.f$E().f$E().f$E((RF)var4);
      this.invokeSyncCurrentPlayItem();
      if (this.field_78781_i != var4.f$E()) {
         this.field_78781_i = var4.f$E();
      }

      if (this.field_78770_f != var4.f$E()) {
         this.field_78770_f = var4.f$E();
      }

   }
}
