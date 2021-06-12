package net.futureclient.client;

import net.minecraft.entity.player.EnumPlayerModelParts;

public class bA extends Ha<Af> {
   // $FF: synthetic field
   public final MA f$d;

   // $FF: synthetic method
   public void f$E(Af var1) {
      if (MA.f$E(this.f$d).f$a(MA.f$E(this.f$d).f$E().floatValue() * 1000.0F)) {
         EnumPlayerModelParts[] var2;
         int var3 = (var2 = EnumPlayerModelParts.values()).length;

         int var4;
         for(int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
            EnumPlayerModelParts var5 = var2[var4];
            MA.f$E().field_71474_y.func_178878_a(var5, (Boolean)MA.f$E(this.f$d).f$E() ? Math.random() < 0.5D : !MA.f$a().field_71474_y.func_178876_d().contains(var5));
            ++var4;
         }

         MA.f$E(this.f$d).f$a();
      }

   }

   // $FF: synthetic method
   public bA(MA var1) {
      this.f$d = var1;
   }
}
