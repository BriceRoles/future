package net.futureclient.client;

import net.minecraft.client.Minecraft;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;

public class tF extends Ba {
   // $FF: synthetic field
   private Bh f$b;
   // $FF: synthetic field
   private z<Boolean> f$M;
   // $FF: synthetic field
   public boolean f$d;
   // $FF: synthetic field
   private z<Boolean> f$i;
   // $FF: synthetic field
   private Bh f$j;
   // $FF: synthetic field
   private s f$g;

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static z f$E(tF var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   private void f$A() {
      if (this.f$b.f$E(125L) && f$d.field_71439_g.func_70089_S()) {
         int var1 = f$d.field_71439_g.field_71071_by.field_70461_c;

         int var2;
         for(int var10000 = var2 = 44; var10000 >= 9; var10000 = var2) {
            ItemStack var3;
            if (!((var3 = f$d.field_71439_g.field_71069_bz.func_75139_a(var2).func_75211_c()).func_77973_b() instanceof ItemAir) && var3.func_77973_b() instanceof ItemSoup) {
               if (var2 >= 36 && var2 <= 44) {
                  f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketHeldItemChange(var2 - 36));
                  if ((Boolean)this.f$M.f$E()) {
                     f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                  } else {
                     f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                  }

                  f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketHeldItemChange(var1));
                  this.f$b.f$a();
                  return;
               }

               f$d.field_71442_b.func_187098_a(0, var2, 0, ClickType.PICKUP, f$d.field_71439_g);
               f$d.field_71442_b.func_187098_a(0, 41, 0, ClickType.PICKUP, f$d.field_71439_g);
               this.f$b.f$a();
               return;
            }

            --var2;
         }
      }

   }

   // $FF: synthetic method
   public static s f$E(tF var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static void f$E(tF var0) {
      var0.f$A();
   }

   // $FF: synthetic method
   public tF() {
      String var10001 = r.f$E("Uz``G`a\u007f");
      String[] var10002 = new String[2];
      boolean var10004 = true;
      var10002[0] = v.f$E("aaT{s{Ud");
      var10002[1] = r.f$E("uz``g\u007f");
      super(var10001, var10002, true, -4598640, JD.f$I);
      this.f$b = new Bh();
      this.f$j = new Bh();
      Boolean var10003 = false;
      String[] var5 = new String[3];
      boolean var10006 = true;
      var5[0] = v.f$E("dfOdS{Ud");
      var5[1] = r.f$E("p}{\u007f");
      var5[2] = v.f$E("`HfOc");
      this.f$i = new z(var10003, var5);
      var10003 = true;
      var5 = new String[4];
      var10006 = true;
      var5[0] = r.f$E("%!-I}w");
      var5[1] = v.f$E("|AzDrIl");
      var5[2] = r.f$E(">:>$guapi}w");
      var5[3] = v.f$E("rIl");
      this.f$M = new z(var10003, var5);
      Float var3 = 14.0F;
      Float var6 = 1.0F;
      Float var10005 = 20.0F;
      Double var7 = 0.5D;
      String[] var10007 = new String[3];
      boolean var10009 = true;
      var10007[0] = r.f$E("\\juc`g");
      var10007[1] = v.f$E("|");
      var10007[2] = r.f$E("|\u007f");
      this.f$g = new s(var3, var6, var10005, var7, var10007);
      this.f$d = false;
      z[] var1 = new z[3];
      boolean var4 = true;
      var1[0] = this.f$i;
      var1[1] = this.f$g;
      var1[2] = this.f$M;
      this.f$E((z[])var1);
      Ha[] var2 = new Ha[1];
      var4 = true;
      var2[0] = new ND(this);
      this.f$E((Ha[])var2);
   }

   // $FF: synthetic method
   public void f$B() {
      this.f$d = false;
      super.f$B();
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static Bh f$E(tF var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public int f$a() {
      int var1 = 0;
      NonNullList var10000 = f$d.field_71439_g.field_71071_by.field_70462_a;
      ItemStack[] var10001 = new ItemStack[var1];
      boolean var10003 = true;
      ItemStack[] var2;
      int var3 = (var2 = (ItemStack[])var10000.toArray(var10001)).length;

      int var4;
      for(int var6 = var4 = 0; var6 < var3; var6 = var4) {
         ItemStack var5;
         if ((var5 = var2[var4]) != null && var5.func_77973_b() instanceof ItemSoup) {
            ++var1;
         }

         ++var4;
      }

      return var1;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }
}
