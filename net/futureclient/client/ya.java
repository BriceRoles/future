package net.futureclient.client;

import net.minecraft.client.Minecraft;

public final class ya extends Ba {
   // $FF: synthetic field
   private final z<Boolean> f$g;
   // $FF: synthetic field
   private final z<Boolean> f$d;

   // $FF: synthetic method
   public ya() {
      String var10001 = LI.f$E("WU^VpNzR[VvYrI");
      String[] var10002 = new String[7];
      boolean var10004 = true;
      var10002[0] = PI.f$E("l[eXK@A\\`XMWIG");
      var10002[1] = LI.f$E("tv}uSmYqC[VvYrI");
      var10002[2] = PI.f$E("SN]VWJM@XMWIG");
      var10002[3] = LI.f$E("Tv]uSmYqC{VvYrI");
      var10002[4] = PI.f$E("ZEV");
      var10002[5] = LI.f$E("xTmS}_jCwY");
      var10002[6] = PI.f$E("L[FQQMLW");
      super(var10001, var10002, true, -2525659, JD.f$M);
      Boolean var10003 = true;
      String[] var4 = new String[1];
      boolean var10006 = true;
      var4[0] = LI.f$E("ju[z_");
      this.f$g = new z(var10003, var4);
      var10003 = true;
      var4 = new String[1];
      var10006 = true;
      var4[0] = PI.f$E("pGGVFMM");
      this.f$d = new z(var10003, var4);
      z[] var1 = new z[2];
      boolean var3 = true;
      var1[0] = this.f$g;
      var1[1] = this.f$d;
      this.f$E(var1);
      Ha[] var2 = new Ha[2];
      var3 = true;
      var2[0] = new za(this);
      var2[1] = new Ya(this);
      this.f$E(var2);
   }

   // $FF: synthetic method
   public static z f$a(ya var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static z f$E(ya var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }
}
