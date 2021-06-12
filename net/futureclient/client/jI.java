package net.futureclient.client;

import java.util.Comparator;

public class jI implements Comparator<tg> {
   // $FF: synthetic method
   public int f$E(tg var1, tg var2) {
      double var3 = var1.f$E();
      double var5 = var2.f$E();
      if (var3 == var5) {
         return 0;
      } else {
         return var3 < var5 ? 1 : -1;
      }
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getMethodName() + var10003.getClassName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = (2 ^ 5) << 4 ^ 5;
      int var10004 = 1 << 3;
      int var10005 = 4 << 4 ^ 5;
      int var10006 = (var0 = (String)var0).length();
      char[] var10007 = new char[var10006];
      boolean var10009 = true;
      int var14 = var10006 - 1;
      var10006 = var10005;
      int var1;
      var10005 = var1 = var14;
      char[] var3 = var10007;
      int var7 = var10006;
      int var4 = var10004;
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
}
