package net.futureclient.loader.mixin.forge.item;

import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.zD;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ItemStack.class})
public abstract class MixinItemStack {
   @Shadow
   private int field_77991_e;

   @Inject(
      method = {"<init>(Lnet/minecraft/item/Item;IILnet/minecraft/nbt/NBTTagCompound;)V"},
      at = {@At("RETURN")}
   )
   @Dynamic
   private void f$E(Item var1, int var2, int var3, NBTTagCompound var4, CallbackInfo var5) {
      this.field_77991_e = this.f$E((ItemStack)this, this.field_77991_e, var3);
   }

   @Inject(
      method = {"<init>(Lnet/minecraft/nbt/NBTTagCompound;)V"},
      at = {@At("RETURN")}
   )
   private void f$E(NBTTagCompound var1, CallbackInfo var2) {
      this.field_77991_e = this.f$E((ItemStack)this, this.field_77991_e, var1.func_74765_d("Damage"));
   }

   private int f$E(ItemStack var1, int var2, int var3) {
      zD var4 = new zD(var1, var2, var3);
      if (kH.f$E() != null) {
         kH.f$E().f$E().f$E((RF)var4);
      }

      return var4.f$a();
   }
}
