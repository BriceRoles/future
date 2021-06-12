package net.futureclient.client;

import java.util.ArrayDeque;

public class RG {
   // $FF: synthetic field
   private static final int f$j = 20;
   // $FF: synthetic field
   private final gG f$d = new gG();
   // $FF: synthetic field
   private long f$g;
   // $FF: synthetic field
   private float f$M;
   // $FF: synthetic field
   private ArrayDeque<Float> f$i = new ArrayDeque(20);

   // $FF: synthetic method
   public static float f$E(RG var0, float var1) {
      return var0.f$M = var1;
   }

   // $FF: synthetic method
   public static gG f$E(RG var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public RG() {
      kH.f$E().f$E().f$a(new VG(this));
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = (2 ^ 5) << 3 ^ 3;
      int var10001 = 5 << 4 ^ (3 ^ 5) << 1;
      int var10002 = 4 << 3 ^ 2 ^ 5;
      int var10003 = (var0 = (String)var0).length();
      char[] var10004 = new char[var10003];
      boolean var10006 = true;
      int var5 = var10003 - 1;
      var10003 = var10002;
      int var3;
      var10002 = var3 = var5;
      char[] var1 = var10004;
      int var4 = var10003;
      var10000 = var10002;

      for(int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         char var6 = var0.charAt(var3);
         --var3;
         var1[var10001] = (char)(var6 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10002 = var3--;
         var1[var10002] = (char)(var0.charAt(var10002) ^ var4);
      }

      return new String(var1);
   }

   // $FF: synthetic method
   public static long f$E(RG var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static long f$E(RG var0, long var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public gG f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public float f$E() {
      return this.f$M;
   }

   // $FF: synthetic method
   public static ArrayDeque f$E(RG var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public boolean f$E() {
      return this.f$d.f$E() > 2500L;
   }
}
