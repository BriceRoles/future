package net.futureclient.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Bj {
   // $FF: synthetic method
   public static S[] f$E(File var0) throws IOException {
      FileInputStream var10000 = new FileInputStream(var0);
      byte[] var10001 = new byte[var10000.available()];
      boolean var10003 = true;
      byte[] var1 = var10001;
      var10000.read(var10001);
      ArrayList var2 = new ArrayList();
      boolean var3 = true;
      byte[] var4 = var1;
      int var5 = var1.length;

      int var6;
      int var11;
      for(var11 = var6 = 0; var11 < var5; var11 = var6) {
         if (var4[var6] == 64) {
            var3 = false;
            break;
         }

         ++var6;
      }

      int var8;
      for(var11 = var8 = 0; var11 < var1.length; var11 = var8) {
         byte var9;
         if ((var9 = var1[var8]) == (var3 ? 5 : 64)) {
            byte[] var13 = new byte[2];
            boolean var10002 = true;
            ++var8;
            var13[0] = var1[var8];
            ++var8;
            var13[1] = var1[var8];
            byte[] var10 = var13;
            int var7 = var13[0] & 255 | (var10[1] & 255) << 8;
            var2.add(new mi(var7));
         } else {
            HG[] var14 = HG.values();
            ++var8;
            var2.add(new nG(var14[var9], var1[var8]));
         }

         ++var8;
      }

      S[] var12 = new S[var2.size()];
      var10003 = true;
      return (S[])var2.toArray(var12);
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getMethodName() + var10003.getClassName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = (2 ^ 5) << 4 ^ 3 << 1;
      int var10004 = (2 ^ 5) << 3 ^ 3;
      int var10005 = 5 << 4 ^ 2 << 2 ^ 1;
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

   // $FF: synthetic method
   public static void f$E(File var0, S[] var1) throws IOException {
      FileOutputStream var2 = new FileOutputStream(var0);
      int var3 = (var1 = var1).length;

      int var4;
      for(int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
         boolean var10002;
         S var5;
         byte[] var7;
         byte[] var9;
         if ((var5 = var1[var4]) instanceof mi) {
            mi var6 = (mi)var5;
            var9 = new byte[3];
            var10002 = true;
            var9[0] = 64;
            var9[1] = (byte)(var6.f$E() & 255);
            var9[2] = (byte)(var6.f$E() >> 8 & 255);
            var7 = var9;
            var2.write(var7);
         } else if (var5 instanceof nG) {
            nG var8 = (nG)var5;
            var9 = new byte[2];
            var10002 = true;
            var9[0] = (byte)var8.f$E().f$E();
            var9[1] = var8.f$E();
            var7 = var9;
            var2.write(var7);
         }

         ++var4;
      }

      var2.close();
   }
}
