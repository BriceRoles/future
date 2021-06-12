package net.futureclient.client;

import java.util.Set;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EnumPlayerModelParts;

public class MA extends Ba {
   // $FF: synthetic field
   private z<Boolean> f$M;
   // $FF: synthetic field
   private Bh f$d;
   // $FF: synthetic field
   private s f$i;
   // $FF: synthetic field
   private Set f$g;

   // $FF: synthetic method
   public static Bh f$E(MA var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public MA() {
      String var10001 = hI.f$E("ea_dtf_d]");
      String[] var10002 = new String[1];
      boolean var10004 = true;
      var10002[0] = ph.f$E("M\u0010w\u0015\\\u0017w\u0015u");
      super(var10001, var10002, true, -15605781, JD.f$b);
      Float var10003 = 0.1F;
      Float var6 = 0.0F;
      Float var10005 = 20.0F;
      Double var10006 = 0.1D;
      String[] var10007 = new String[5];
      boolean var10009 = true;
      var10007[0] = hI.f$E("roZkO");
      var10007[1] = ph.f$E("(n\u001ez");
      var10007[2] = hI.f$E("ezSoR");
      var10007[3] = ph.f$E("Z\u001er");
      var10007[4] = hI.f$E("r");
      this.f$i = new s(var10003, var6, var10005, var10006, var10007);
      Boolean var4 = false;
      String[] var7 = new String[3];
      boolean var1 = true;
      var7[0] = ph.f$E(")\u007f\u0015z\u0014s");
      var7[1] = hI.f$E("dkXnYg_pW~_eX");
      var7[2] = ph.f$E(")\u007f\u0015z");
      this.f$M = new z(var4, var7);
      this.f$d = new Bh();
      z[] var2 = new z[2];
      boolean var5 = true;
      var2[0] = this.f$M;
      var2[1] = this.f$i;
      this.f$E((z[])var2);
      Ha[] var3 = new Ha[1];
      var5 = true;
      var3[0] = new bA(this);
      this.f$E((Ha[])var3);
   }

   // $FF: synthetic method
   public static z f$E(MA var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public void f$B() {
      super.f$B();
      EnumPlayerModelParts[] var1;
      int var2 = (var1 = EnumPlayerModelParts.values()).length;

      int var3;
      for(int var10000 = var3 = 0; var10000 < var2; var10000 = var3) {
         EnumPlayerModelParts var4 = var1[var3];
         ++var3;
         f$d.field_71474_y.func_178878_a(var4, this.f$g.contains(var4));
      }

   }

   // $FF: synthetic method
   public void f$K() {
      super.f$K();
      this.f$g = f$d.field_71474_y.func_178876_d();
   }

   // $FF: synthetic method
   public static s f$E(MA var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }
}
