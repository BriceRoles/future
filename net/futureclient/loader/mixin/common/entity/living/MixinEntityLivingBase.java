package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.B;
import net.futureclient.client.BB;
import net.futureclient.client.Ce;
import net.futureclient.client.RF;
import net.futureclient.client.iF;
import net.futureclient.client.kH;
import net.futureclient.client.mc;
import net.futureclient.client.wC;
import net.futureclient.loader.mixin.common.entity.MixinEntity;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.potion.Potion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityLivingBase.class})
public abstract class MixinEntityLivingBase extends MixinEntity implements B {
   @Shadow
   @Final
   private static DataParameter<Integer> field_184633_f;
   @Shadow
   public int field_184617_aD;
   @Shadow
   public int field_184628_bn;

   @Accessor
   public abstract ItemStack getActiveItemStack();

   public boolean f$E() {
      return this.func_70083_f(7);
   }

   public int f$E() {
      return (Integer)this.field_70180_af.func_187225_a(field_184633_f);
   }

   @Redirect(
      method = {"travel"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/entity/EntityLivingBase.isPotionActive(Lnet/minecraft/potion/Potion;)Z"
)
   )
   private boolean f$E(EntityLivingBase var1, Potion var2) {
      if (var1 instanceof EntityPlayerSP && var2 == MobEffects.field_188424_y) {
         iF var3 = new iF();
         kH.f$E().f$E().f$E((RF)var3);
         if (var3.f$E()) {
            return false;
         }
      }

      return var1.func_70644_a(var2);
   }

   @Inject(
      method = {"isElytraFlying"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Boolean> var1) {
      Entity var2 = (Entity)this;
      if (var2 instanceof EntityPlayerSP) {
         BB var3 = (BB)kH.f$E().f$E().f$E(BB.class);
         if (var3 != null && var3.f$E() && var3.f$D.f$E() == mc.f$M) {
            var1.setReturnValue(false);
         }
      }

   }

   @Inject(
      method = {"collideWithNearbyEntities"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$e(CallbackInfo var1) {
      wC var2 = (wC)kH.f$E().f$E().f$E(wC.class);
      if (var2 != null && var2.f$E() && !(Boolean)var2.f$M.f$E()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"handleJumpWater"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfo var1) {
      Ce var2 = new Ce();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"handleJumpLava"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      Ce var2 = new Ce();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }
}
