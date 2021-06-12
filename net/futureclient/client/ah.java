package net.futureclient.client;

public class ah {
   // $FF: synthetic field
   public int f$g;
   // $FF: synthetic field
   public int f$d;

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getClassName() + var10003.getMethodName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = (3 ^ 5) << 3 ^ 4;
      int var10004 = 3 << 3 ^ 2 ^ 5;
      int var10005 = 5 << 4 ^ (3 ^ 5) << 1;
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
   public ah(int var1, int var2) {
      this.f$g = var1;
      this.f$d = var2;
   }

   // $FF: synthetic method
   public boolean equals(Object var1) {
      if (var1 instanceof ah) {
         ah var2;
         return Double.compare((double)(var2 = (ah)var1).f$g, (double)this.f$g) == 0 && Double.compare((double)var2.f$d, (double)this.f$d) == 0;
      } else {
         return super.equals(var1);
      }
   }
}
