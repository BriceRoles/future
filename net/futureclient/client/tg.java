package net.futureclient.client;

public class tg {
   // $FF: synthetic field
   private double f$d;
   // $FF: synthetic field
   private String f$g;

   // $FF: synthetic method
   public tg(String var1, double var2) {
      this.f$g = var1;
      this.f$d = var2;
   }

   // $FF: synthetic method
   public String f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public boolean equals(Object var1) {
      if (var1 != null && var1.getClass() == this.getClass()) {
         Object var2 = (tg)var1;
         return this.f$g.equals(var2.f$g) && this.f$d == var2.f$d;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getMethodName() + var10003.getClassName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
      int var10004 = 2 << 3 ^ 2 ^ 5;
      int var10005 = (2 ^ 5) << 3;
      int var10006 = (var0 = (String)var0).length();
      char[] var10007 = new char[var10006];
      boolean var10009 = true;
      int var14 = var10006 - 1;
      var10006 = var10005;
      int var1;
      var10005 = var1 = var14;
      char[] var3 = var10007;
      int var7 = var10006;
      int var4 = var11;
      var10 = 2.0F;
      int var2;
      int var5 = var2 = var10001;
      int var8 = var10005;

      for(String var6 = var10000; var8 >= 0; var8 = var1) {
         var11 = var1--;
         var3[var11] = (char)(var4 ^ var0.charAt(var11) ^ var6.charAt(var2));
         if (var1 < 0) {
            break;
         }

         var10001 = var1;
         char var10002 = (char)(var7 ^ var0.charAt(var1) ^ var6.charAt(var2));
         --var1;
         --var2;
         var3[var10001] = var10002;
         if (var2 < 0) {
            var2 = var5;
         }
      }

      return new String(var3);
   }

   // $FF: synthetic method
   public int hashCode() {
      byte var1 = 11;
      int var2 = 23 * var1 + this.f$g.hashCode();
      return 23 * var2 + (int)(this.f$d * 1000000.0D);
   }

   // $FF: synthetic method
   public double f$E() {
      return this.f$d;
   }
}
