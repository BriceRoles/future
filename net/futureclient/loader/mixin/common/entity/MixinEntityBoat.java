package net.futureclient.loader.mixin.common.entity;

import net.futureclient.client.Tb;
import net.futureclient.client.kH;
import net.minecraft.entity.item.EntityBoat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EntityBoat.class})
public abstract class MixinEntityBoat extends MixinEntity {
   @Redirect(
      method = {"updateMotion"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/entity/item/EntityBoat.hasNoGravity()Z"
)
   )
   private boolean f$E(EntityBoat var1) {
      Tb var2 = (Tb)kH.f$E().f$E().f$E(Tb.class);
      return this.func_189652_ae() || var2 != null && var2.f$E() && var2.f$g.f$E().floatValue() == 0.0F;
   }
}
