package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.RF;
import net.futureclient.client.YD;
import net.futureclient.client.Yd;
import net.futureclient.client.kH;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPig.class})
public abstract class MixinEntityPig extends EntityAnimal {
   public MixinEntityPig(World var1) {
      super(var1);
   }

   @Inject(
      method = {"canBeSteered"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Boolean> var1) {
      Yd var2 = new Yd();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.setReturnValue(true);
      }

   }

   @Redirect(
      method = {"travel"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/entity/passive/EntityAnimal.travel(FFF)V"
)
   )
   private void f$E(EntityAnimal var1, float var2, float var3, float var4) {
      YD var5 = new YD();
      kH.f$E().f$E().f$E((RF)var5);
      super.func_191986_a(var2, var3, var5.f$E() ? 0.0F : var4);
   }
}
