package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.RF;
import net.futureclient.client.Td;
import net.futureclient.client.kH;
import net.futureclient.client.pB;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ItemRenderer.class})
public abstract class MixinItemRenderer {
   @Redirect(
      method = {"renderItemInFirstPerson(F)V"},
      at = @At(
   value = "INVOKE",
   ordinal = 1,
   target = "net/minecraft/client/renderer/ItemRenderer.renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"
)
   )
   private void f$E(ItemRenderer var1, AbstractClientPlayer var2, float var3, float var4, EnumHand var5, float var6, ItemStack var7, float var8) {
      pB var9 = (pB)kH.f$E().f$E().f$E(pB.class);
      if (var9 != null && var9.f$E()) {
         var8 += var9.f$d.f$E().floatValue();
      }

      var1.func_187457_a(var2, var3, var4, var5, var6, var7, var8);
   }

   @Inject(
      method = {"renderFireInFirstPerson"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      Td var2 = new Td();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }
}
