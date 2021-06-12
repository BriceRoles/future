package net.futureclient.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;

public abstract class BG {
   // $FF: synthetic field
   private static String f$i;
   // $FF: synthetic field
   public static final String f$g = "&lang=";
   // $FF: synthetic field
   public static final String f$d = "&text=";
   // $FF: synthetic field
   public static final String f$M = "key=";
   // $FF: synthetic field
   public static String f$j;
   // $FF: synthetic field
   public static final String f$b = "UTF-8";

   // $FF: synthetic method
   private static String[] f$a(String var0, String var1) throws Exception {
      return f$E((String)((x)((u)V.f$a(var0)).get(var1)).f$E(), (String)null);
   }

   // $FF: synthetic method
   public static String f$a(URL var0, String var1) throws Exception {
      return ((u)V.f$a(f$E(var0))).get(var1).toString();
   }

   // $FF: synthetic method
   public static String f$E(URL var0, String var1) throws Exception {
      String var6 = f$a(f$E(var0), var1);
      String var2 = "";
      int var3 = (var6 = var6).length;

      int var4;
      for(int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
         String var5 = var6[var4];
         StringBuilder var7 = (new StringBuilder()).insert(0, var2);
         ++var4;
         var2 = var7.append(var5).toString();
      }

      return var2.trim();
   }

   // $FF: synthetic method
   public static String f$E() {
      return f$j;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = 4 << 3 ^ 4;
      int var10001 = (2 ^ 5) << 4 ^ 3 << 2 ^ 1;
      int var10002 = (3 ^ 5) << 4 ^ 2 << 2 ^ 1;
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
   private static String[] f$E(String var0, String var1) throws Exception {
      x var2;
      String[] var10000 = new String[(var2 = (x)V.f$a(var0)).size()];
      boolean var10002 = true;
      String[] var3 = var10000;
      int var4 = 0;

      Iterator var7;
      for(Iterator var8 = var7 = var2.iterator(); var8.hasNext(); var8 = var7) {
         Object var5 = var7.next();
         if (var1 != null && var1.length() != 0) {
            u var6;
            if ((var6 = (u)var5).containsKey(var1)) {
               var3[var4] = var6.get(var1).toString();
            }
         } else {
            var3[var4] = var5.toString();
         }

         ++var4;
      }

      return var3;
   }

   // $FF: synthetic method
   private static String f$E(URL var0) throws Exception {
      HttpsURLConnection var1 = (HttpsURLConnection)var0.openConnection();
      if (f$i != null) {
         var1.setRequestProperty(hH.f$E("z\u000bn\u000bz\u000bz"), f$i);
      }

      var1.setRequestProperty(RG.f$E("d3I(B2Sqs%W9"), hH.f$E("|\u000bp\u001a'\u001ed\u000fa\u00003Nk\u0006i\u001c{\u000b|S]:NC0"));
      var1.setRequestProperty(RG.f$E("f?D9W(\n\u001fO=U/B("), "UTF-8");
      var1.setRequestMethod(hH.f$E("O+\\"));

      String var4;
      try {
         int var2 = var1.getResponseCode();
         String var10 = f$E(var1.getInputStream());
         if (var2 != 200) {
            throw new Exception((new StringBuilder()).insert(0, RG.f$E("\u0019U.H.\u0007:U3J|~=I8B$\u0007\u001dw\u0015\u001d|")).append(var10).toString());
         }

         var4 = var10;
      } catch (Exception var8) {
         RA var3;
         if ((var3 = (RA)kH.f$E().f$E().f$E(RA.class)) != null && var3.f$E()) {
            var3.f$E(false);
         }

         La.f$E().f$E(hH.f$E("L\u0007{\u000fj\u0002m\n(:z\u000ff\u001dd\u000f|\u000b(\n}\u000b(\u001agNi\u0000(\u000bz\u001cg\u001c&"));
         throw new Exception((new StringBuilder()).insert(0, RG.f$E("\u0019U.H.\u0007:U3J|~=I8B$\u0007\u001dw\u0015\u001d|")).append(var8.getMessage()).toString());
      } finally {
         if (var1 != null) {
            var1.disconnect();
         }

      }

      return var4;
   }

   // $FF: synthetic method
   public static void f$E() throws Exception {
      if (f$j == null || f$j.length() < 27) {
         throw new RuntimeException(hH.f$E("A ^/D'L1I>A1C+QN%NX\u0002m\u000f{\u000b(\u001dm\u001a(\u001a`\u000b(/X'(%m\u0017(\u0019a\u001a`Nq\u0001}\u001c(7i\u0000l\u000bpNI>ANC\u000bq"));
      }
   }

   // $FF: synthetic method
   private static String f$E(InputStream var0) throws Exception {
      StringBuilder var1 = new StringBuilder();

      try {
         if (var0 != null) {
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var0, "UTF-8"));

            String var2;
            while(null != (var2 = var3.readLine())) {
               var1.append(var2.replaceAll(hH.f$E("ﻷ"), ""));
            }
         }
      } catch (Exception var4) {
         throw new Exception(RG.f$E("\u0007^=I8B$\n(U=I/K=S3UqF,N\u0001\u0007\u0019U.H.\u0007.B=C5I;\u0007(U=I/K=S5H2\u0007/S.B=Jr"), var4);
      }

      return var1.toString();
   }

   // $FF: synthetic method
   public static void f$a(String var0) {
      f$j = var0;
   }

   // $FF: synthetic method
   public static void f$E(String var0) {
      f$i = var0;
   }
}
