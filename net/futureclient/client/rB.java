package net.futureclient.client;

import net.minecraft.client.Minecraft;

public class rB extends Ba {
   // $FF: synthetic field
   private s f$d;

   // $FF: synthetic method
   public static s f$E(rB var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public rB() {
      String var10001 = HH.f$E("A\u000eh\u001dl\u0005");
      String[] var10002 = new String[4];
      boolean var10004 = true;
      var10002[0] = wH.f$E("\u0017\u0004>\u0017:\u000f");
      var10002[1] = HH.f$E("N\u0004A\u000eh\u001dl\u0005");
      var10002[2] = wH.f$E("\u001e\u0014+\u000e\u0017\u0004>\u0017:\u000f");
      var10002[3] = HH.f$E("K\u0007l\u0018z\u0002g\f");
      super(var10001, var10002, true, -10887189, JD.f$b);
      Float var10003 = 0.75F;
      Float var4 = -10.0F;
      Float var10005 = 10.0F;
      Double var10006 = 0.1D;
      String[] var10007 = new String[2];
      boolean var10009 = true;
      var10007[0] = wH.f$E("2/\u0004:\u0005");
      var10007[1] = HH.f$E("Z\u001bl\u000f");
      this.f$d = new s(var10003, var4, var10005, var10006, var10007);
      z[] var1 = new z[1];
      boolean var3 = true;
      var1[0] = this.f$d;
      this.f$E(var1);
      Ha[] var2 = new Ha[2];
      var3 = true;
      var2[0] = new JB(this);
      var2[1] = new VA(this);
      this.f$E(var2);
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }
}
