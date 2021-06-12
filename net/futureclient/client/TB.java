package net.futureclient.client;

import net.minecraft.client.Minecraft;

public class TB extends Ba {
   // $FF: synthetic field
   private int f$g;
   // $FF: synthetic field
   private ka<Qd> f$M;
   // $FF: synthetic field
   private boolean f$d;

   // $FF: synthetic method
   public static boolean f$E(TB var0, boolean var1) {
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static ka f$E(TB var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public TB() {
      String var10001 = HH.f$E("O\nz\u001fZ\u001c`\u0006");
      String[] var10002 = new String[3];
      boolean var10004 = true;
      var10002[0] = HH.f$E("O\nz\u001fZ\u001c`\u0006");
      var10002[1] = HH.f$E("o\nz\u001fz\u001c`\u0006");
      var10002[2] = HH.f$E("z\u001c`\u0006");
      super(var10001, var10002, true, 52479, JD.f$j);
      Qd var10003 = Qd.f$M;
      String[] var4 = new String[2];
      boolean var10006 = true;
      var4[0] = HH.f$E("D\u0004m\u000e");
      var4[1] = HH.f$E("\u0006");
      this.f$M = new ka(var10003, var4);
      z[] var1 = new z[1];
      boolean var3 = true;
      var1[0] = this.f$M;
      this.f$E((z[])var1);
      Ha[] var2 = new Ha[2];
      var3 = true;
      var2[0] = new Kb(this);
      var2[1] = new Db(this);
      this.f$E((Ha[])var2);
   }

   // $FF: synthetic method
   public static int f$E(TB var0, int var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public static boolean f$E(TB var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static int f$E(TB var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }
}
