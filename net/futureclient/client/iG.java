package net.futureclient.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class iG {
   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = (new StringBuffer(var10003.getClassName())).insert(0, var10003.getMethodName()).toString();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = 3 << 3 ^ 1;
      int var10004 = (2 ^ 5) << 4 ^ 3 << 2 ^ 1;
      int var10005 = 2 << 3 ^ 2;
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
   public static void f$E(File var0, File var1) {
      byte[] var10000 = new byte[1024];
      boolean var10002 = true;
      byte[] var2 = var10000;

      try {
         if (!var1.exists()) {
            var1.mkdir();
         }

         ZipInputStream var3;
         ZipEntry var4;
         for(ZipEntry var9 = var4 = (var3 = new ZipInputStream(new FileInputStream(var0))).getNextEntry(); var9 != null; var9 = var4 = var3.getNextEntry()) {
            String var5 = var4.getName();
            File var8 = new File(var1, var5);
            (new File(var8.getParent())).mkdirs();
            FileOutputStream var10 = new FileOutputStream(var8);
            ZipInputStream var11 = var3;

            int var6;
            while((var6 = var11.read(var2)) > 0) {
               var11 = var3;
               var10.write(var2, 0, var6);
            }

            var10.close();
         }

         var3.closeEntry();
         var3.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }
}
