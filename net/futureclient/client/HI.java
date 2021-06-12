package net.futureclient.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class HI {
   // $FF: synthetic field
   private static String f$d = System.getProperty(tg.f$E("ge|\u001eU\u001cP")).toUpperCase();

   // $FF: synthetic method
   private static String f$B() {
      try {
         Process var0;
         Scanner var1;
         String var4;
         if (f$d.contains(tg.f$E("c8{"))) {
            (var0 = Runtime.getRuntime().exec(BI.f$E("\r_<~7=\u0010J8w9\u007f5k=20if~5`\"{\"}zS1v*q;q\"k/p5#k0\"k6x4>%{/|&cs \u0016Q\u001f@"))).getOutputStream().close();
            (var1 = new Scanner(var0.getInputStream())).nextLine();
            var1.nextLine();
            var4 = var1.nextLine();
            var1.close();
            return var4;
         }

         if (f$d.contains(tg.f$E("y0v"))) {
            (var0 = Runtime.getRuntime().exec(BI.f$E("%g#l:z\u0005b$q;|+jou\u0003H\u0017v(v!\u007f/p\u0003ni4/J\nW"))).getOutputStream().close();
            var1 = new Scanner(var0.getInputStream());
            int var2;
            int var10000 = var2 = 1;

            while(true) {
               boolean var10003 = true;
               if (var10000 > 16) {
                  var4 = var1.nextLine();
                  var1.close();
                  return var4;
               }

               var1.nextLine();
               boolean var10004 = true;
               ++var2;
               var10000 = var2;
            }
         }
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return tg.f$E("\u0017\u0002F\u001eG");
   }

   // $FF: synthetic method
   private static String f$K() {
      try {
         Process var0;
         Scanner var1;
         String var4;
         if (f$d.contains(BI.f$E("d3|"))) {
            (var0 = Runtime.getRuntime().exec(tg.f$E("B3s\u007fx\u0003V\"z}N%f%`\u0001L$m)g\u000ef$z/v7s1bqr8mvV){u 2o y>{qI\u0018B\bm`;\u0013Q8q"))).getOutputStream().close();
            (var1 = new Scanner(var0.getInputStream())).nextLine();
            var1.nextLine();
            var4 = var1.nextLine();
            var1.close();
            return var4;
         }

         if (f$d.contains(BI.f$E("~;q"))) {
            (var0 = Runtime.getRuntime().exec(tg.f$E(".`(k1}\u000ee/v0{ mdr\bO\u0010y\"e1x/a\bib3$M\u0001P"))).getOutputStream().close();
            var1 = new Scanner(var0.getInputStream());
            int var2;
            int var10000 = var2 = 1;

            while(true) {
               boolean var10003 = true;
               if (var10000 > 4) {
                  var4 = var1.nextLine();
                  var1.close();
                  return var4;
               }

               var1.nextLine();
               boolean var10004 = true;
               ++var2;
               var10000 = var2;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return BI.f$E("\u0010\tA\u0015@");
   }

   // $FF: synthetic method
   public static String f$A() {
      boolean var10002 = true;
      String[] var10000 = new String[7];
      var10002 = true;
      boolean var10004 = true;
      var10000[0] = System.getenv(BI.f$E("M\u0007\u001f[\u001aD\t]\u0004A\u0014Q\u0002AI\u001c=z?`"));
      var10004 = true;
      var10000[1] = System.getenv(tg.f$E("X\u0007\u0016]\u0011B\u000eZ\u001bF\u0006@\u0003KS\u0001#{#f"));
      var10004 = true;
      var10000[2] = f$B();
      var10004 = true;
      var10000[3] = f$K();
      var10004 = true;
      var10000[4] = f$e();
      var10004 = true;
      var10000[5] = f$E();
      var10004 = true;
      var10000[6] = f$a();
      String[] var0 = var10000;
      StringBuilder var1 = new StringBuilder();
      int var3 = var0.length;
      var10002 = true;
      boolean var4 = false;
      return var1.toString();
   }

   // $FF: synthetic method
   private static String f$a() {
      try {
         Process var0;
         String var6;
         boolean var10003;
         boolean var10004;
         if (f$d.contains(BI.f$E("d3|"))) {
            Runtime var7 = Runtime.getRuntime();
            var10003 = true;
            String[] var10001 = new String[4];
            var10003 = true;
            boolean var10005 = true;
            var10001[0] = tg.f$E("\u0007Y\u0018V");
            var10005 = true;
            var10001[1] = BI.f$E("0p*`o,\u0018[\u0013B");
            var10005 = true;
            var10001[2] = tg.f$E("S\u0014A");
            var10005 = true;
            var10001[3] = BI.f$E("%{/|&cs \u0016Q\u001f@");
            (var0 = var7.exec(var10001)).waitFor();
            BufferedReader var5 = new BufferedReader(new InputStreamReader(var0.getInputStream()));
            StringBuilder var3 = new StringBuilder();
            BufferedReader var8 = var5;

            while((var6 = var8.readLine()) != null) {
               var8 = var5;
               var3.append(var6);
            }

            int var9 = var3.toString().lastIndexOf(tg.f$E("G"));
            var10004 = true;
            return var3.substring(var9 + 1).trim();
         }

         if (f$d.contains(BI.f$E("~;q"))) {
            (var0 = Runtime.getRuntime().exec(tg.f$E("(f'd4x\u0002i$}*az7)?\u0007@\u001cp0v$k\bib3$M\u0001P"))).getOutputStream().close();
            Scanner var1 = new Scanner(var0.getInputStream());
            int var2;
            int var10000 = var2 = 1;

            while(true) {
               var10003 = true;
               if (var10000 > 9) {
                  var6 = var1.nextLine();
                  var1.close();
                  return var6;
               }

               var1.nextLine();
               var10004 = true;
               ++var2;
               var10000 = var2;
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return BI.f$E("\u0010\tA\u0015@");
   }

   // $FF: synthetic method
   private static String f$E() {
      try {
         Process var5;
         Scanner var7;
         int var16;
         boolean var10003;
         boolean var10004;
         if (f$d.contains(tg.f$E("c8{"))) {
            (var5 = Runtime.getRuntime().exec(BI.f$E("0b/ma\u007f9r%u:7=w\">9g.yx95l+r(>%{/|&cs \u0016Q\u001f@"))).getOutputStream().close();
            (var7 = new Scanner(var5.getInputStream())).nextLine();
            HashMap var12 = new HashMap();

            while(var7.hasNext()) {
               String[] var10;
               var16 = (var10 = var7.nextLine().replaceAll(tg.f$E("\u0015"), "").split(BI.f$E("\b"))).length;
               var10003 = true;
               if (var16 == 2) {
                  var10004 = true;
                  String var17 = var10[0].toLowerCase();
                  boolean var10005 = true;
                  var12.put(var17, var10[1]);
               }
            }

            var7.close();
            String var13;
            if ((var13 = (String)var12.get(tg.f$E("V"))) != null) {
               return var13;
            }

            return "";
         }

         if (f$d.contains(BI.f$E("~;q"))) {
            (var5 = Runtime.getRuntime().exec(tg.f$E("}$j/z9O!g2\u007f?~)z6\u0001\u000bL1b8t1X\u0002S\bib3$M\u0001P"))).getOutputStream().close();
            var7 = new Scanner(var5.getInputStream());
            int var9;
            var16 = var9 = 1;

            while(true) {
               var10003 = true;
               if (var16 > 16) {
                  String var11 = var7.nextLine();
                  var7.close();
                  return var11;
               }

               var7.nextLine();
               var10004 = true;
               ++var9;
               var16 = var9;
            }
         }

         if (f$d.contains(BI.f$E("\u00192}/j"))) {
            String var0 = tg.f$E("9!<s#&9l(\u007f+j092q2\u007fq8ph#w>q+\")p$u#a$9{?\"i{7MG\u0015T");
            boolean var10002 = true;
            String[] var10000 = new String[3];
            var10002 = true;
            var10004 = true;
            var10000[0] = BI.f$E(" \u007f<\u0015\u001c\tZ");
            var10004 = true;
            var10000[1] = tg.f$E("\\V");
            var10004 = true;
            var10000[2] = var0;
            String[] var1 = var10000;
            Process var2;
            (var2 = Runtime.getRuntime().exec(var1)).waitFor();
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.getInputStream()));
            StringBuilder var8 = new StringBuilder();

            label54:
            while(true) {
               BufferedReader var14 = var3;

               String var6;
               while((var6 = var14.readLine()) != null) {
                  if (!var6.contains(BI.f$E("^\u001eM\u0005[\u000f\\\u0006CB\u00063|(f"))) {
                     continue label54;
                  }

                  var14 = var3;
                  var8.append(var6);
               }

               String var15 = var8.toString();
               int var10001 = var8.toString().indexOf(tg.f$E("\b"));
               var10004 = true;
               return var15.substring(var10001 + 1);
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return BI.f$E("\u0010\tA\u0015@");
   }

   // $FF: synthetic method
   private static String f$e() {
      try {
         if (f$d.contains(BI.f$E("d3|"))) {
            Runtime var10000 = Runtime.getRuntime();
            boolean var10003 = true;
            String[] var10001 = new String[4];
            var10003 = true;
            boolean var10005 = true;
            var10001[0] = tg.f$E("\u0007Y\u0018V");
            var10005 = true;
            var10001[1] = BI.f$E("v4\u007fo:\u001fF\u0019F");
            var10005 = true;
            var10001[2] = tg.f$E("S\u0014A");
            var10005 = true;
            var10001[3] = BI.f$E("\u000eF\u0013V");
            Process var0;
            (var0 = var10000.exec(var10001)).getOutputStream().close();
            Scanner var1;
            (var1 = new Scanner(var0.getInputStream())).nextLine();
            var1.nextLine();
            Scanner var10002 = var1;
            String var3 = var1.nextLine();
            var10002.close();
            return var3;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      return tg.f$E("\u0017\u0002F\u001eG");
   }
}
