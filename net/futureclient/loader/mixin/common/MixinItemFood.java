package net.futureclient.loader.mixin.common;

import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.nF;
import net.futureclient.client.p;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ItemFood.class})
public abstract class MixinItemFood implements p {
   @Accessor
   public abstract PotionEffect getPotionId();

   @Inject(
      method = {"onItemUseFinish"},
      at = {@At("HEAD")}
   )
   private void f$E(ItemStack var1, World var2, EntityLivingBase var3, CallbackInfoReturnable<ItemStack> var4) {
      if (var3 instanceof EntityPlayer) {
         kH.f$E().f$E().f$E((RF)(new nF(var1, var2, var3)));
      }

   }
}
