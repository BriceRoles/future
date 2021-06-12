package net.futureclient.client;

// $FF: synthetic class
public class Ef {
   // $FF: synthetic field
   public static final int[] f$d;
   // $FF: synthetic field
   public static final int[] f$g;

   static {
      int[] var10000 = new int[kF.values().length];
      boolean var10002 = true;
      f$d = var10000;

      try {
         f$d[kF.f$M.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      var10000 = new int[Vf.values().length];
      var10002 = true;
      f$g = var10000;

      try {
         f$g[Vf.f$M.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         f$g[Vf.f$g.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}
