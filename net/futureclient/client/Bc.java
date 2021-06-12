package net.futureclient.client;

// $FF: synthetic class
public class Bc {
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
      } catch (NoSuchFieldError var4) {
      }

      var10000 = new int[hA.values().length];
      var10002 = true;
      f$g = var10000;

      try {
         f$g[hA.f$i.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         f$g[hA.f$g.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         f$g[hA.f$M.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
