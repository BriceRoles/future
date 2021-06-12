package net.futureclient.client;

import net.minecraft.util.Session;

public class ph {
   // $FF: synthetic field
   private String f$b;
   // $FF: synthetic field
   private String f$I;
   // $FF: synthetic field
   private jG f$d;
   // $FF: synthetic field
   private String f$j;
   // $FF: synthetic field
   private String f$K;
   // $FF: synthetic field
   private String f$g;
   // $FF: synthetic field
   private String f$i;
   // $FF: synthetic field
   private String f$M;

   // $FF: synthetic method
   public void f$E(Session var1) {
      this.f$j = var1.func_148255_b();
      this.f$M = var1.func_148254_d();
   }

   // $FF: synthetic method
   public void f$E(String var1) {
      this.f$g = var1;
   }

   // $FF: synthetic method
   public String f$K() {
      return this.f$b;
   }

   // $FF: synthetic method
   public jG f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public void f$E(jG var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$e(String var1) {
      this.f$i = var1;
   }

   // $FF: synthetic method
   public String f$B() {
      return this.f$j;
   }

   // $FF: synthetic method
   public String f$A() {
      return this.f$K;
   }

   // $FF: synthetic method
   public void f$K(String var1) {
      this.f$I = var1;
   }

   // $FF: synthetic method
   public ph(String var1, String var2, String var3, String var4, String var5) {
      this.f$d = jG.f$j;
      this.f$I = var1;
      this.f$j = var2;
      this.f$i = "";
      this.f$M = var3;
      this.f$K = var4;
      this.f$b = var5;
      this.f$g = "";
   }

   // $FF: synthetic method
   public void f$a(String var1) {
      this.f$M = var1;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = 1 << 3 ^ 3 ^ 5;
      int var10001 = 3 << 3 ^ 3 ^ 5;
      int var10002 = (2 ^ 5) << 4 ^ 2 << 2 ^ 3;
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
   public ph(String var1) {
      this.f$d = jG.f$K;
      this.f$I = var1;
      this.f$j = "";
      this.f$i = "";
      this.f$M = "";
      this.f$K = var1;
      this.f$b = "";
      this.f$g = "";
   }

   // $FF: synthetic method
   public String f$e() {
      return this.f$i;
   }

   // $FF: synthetic method
   public ph(String var1, String var2) {
      this.f$d = jG.f$b;
      this.f$I = "";
      this.f$j = "";
      this.f$i = "";
      this.f$M = "";
      this.f$K = var1;
      this.f$b = var2;
      this.f$g = "";
   }

   // $FF: synthetic method
   public void f$B(String var1) {
      this.f$j = var1;
   }

   // $FF: synthetic method
   public String f$a() {
      return this.f$M;
   }

   // $FF: synthetic method
   public String f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public String f$h() {
      return this.f$I;
   }

   // $FF: synthetic method
   public Session f$E() {
      return this.f$I.isEmpty() ? new Session(this.f$K, this.f$j, this.f$M, yH.f$E(".{)u-s")) : new Session(this.f$I, this.f$j, this.f$M, f$E("\u0016q\u0011\u007f\u0015y"));
   }

   // $FF: synthetic method
   public ph(String var1, String var2, String var3) {
      this.f$d = jG.f$i;
      this.f$I = var1;
      this.f$j = "";
      this.f$i = var2;
      this.f$M = var3;
      this.f$K = var1;
      this.f$b = "";
      this.f$g = "";
   }
}
