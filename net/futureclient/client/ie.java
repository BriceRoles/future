package net.futureclient.client;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class ie extends RF {
   // $FF: synthetic field
   private ItemStack f$d;
   // $FF: synthetic field
   private BlockPos f$g;
   // $FF: synthetic field
   private EntityLivingBase f$M;

   // $FF: synthetic method
   public EntityLivingBase f$E() {
      return this.f$M;
   }

   // $FF: synthetic method
   public BlockPos f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public ItemStack f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public ie(EntityLivingBase var1, BlockPos var2, ItemStack var3) {
      this.f$M = var1;
      this.f$g = var2;
      this.f$d = var3;
   }
}
