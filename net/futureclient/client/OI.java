package net.futureclient.client;

public class OI {
   // $FF: synthetic field
   public double f$M;
   // $FF: synthetic field
   public double f$g;
   // $FF: synthetic field
   public double f$d;

   // $FF: synthetic method
   public double f$a() {
      return this.f$g;
   }

   // $FF: synthetic method
   public OI(double var1, double var3, double var5) {
      this.f$M = var1;
      this.f$g = var3;
      this.f$d = var5;
   }

   // $FF: synthetic method
   public double f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
      int var10001 = (2 ^ 5) << 4 ^ 3 << 1;
      int var10002 = (2 ^ 5) << 4 ^ 2 ^ 5;
      int var10003 = (var0 = (String)var0).length();
      char[] var10004 = new char[var10003];
      boolean var10006 = true;
      int var5 = var10003 - 1;
      var10003 = var10002;
      int var3;
      var10002 = var3 = var5;
      char[] var1 = var10004;
      int var4 = var10003;
      var10001 = var10000;
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
   public double f$e() {
      return this.f$M;
   }

   // $FF: synthetic method
   public boolean equals(Object var1) {
      if (var1 instanceof OI) {
         OI var2;
         return Double.compare((var2 = (OI)var1).f$M, this.f$M) == 0 && Double.compare(var2.f$g, this.f$g) == 0 && Double.compare(var2.f$d, this.f$d) == 0;
      } else {
         return super.equals(var1);
      }
   }

   // $FF: synthetic method
   public double f$E(OI var1) {
      double var2 = this.f$M - var1.f$M;
      double var4 = this.f$g - var1.f$g;
      double var6 = this.f$d - var1.f$d;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }
}
