package net.futureclient.client;

public class z<T> {
   // $FF: synthetic field
   public T f$d;
   // $FF: synthetic field
   private final String[] f$g;

   // $FF: synthetic method
   public T f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public z(T var1, String... var2) {
      this.f$d = var1;
      this.f$g = var2;
   }

   // $FF: synthetic method
   public void f$E(T var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = (2 ^ 5) << 4 ^ 3 << 1;
      int var10001 = (3 ^ 5) << 4 ^ 3 << 1;
      int var10002 = 2 << 3 ^ 1;
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
   public String[] f$E() {
      return this.f$g;
   }
}
