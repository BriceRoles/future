package net.futureclient.client;

import java.util.List;
import net.minecraft.world.DimensionType;

public class ZH {
   // $FF: synthetic field
   private String f$i;
   // $FF: synthetic field
   private int f$j;
   // $FF: synthetic field
   private OI f$M;
   // $FF: synthetic field
   private List<OI> f$g;
   // $FF: synthetic field
   private DimensionType f$d;

   // $FF: synthetic method
   public int f$E() {
      return this.f$j;
   }

   // $FF: synthetic method
   public DimensionType f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public List<OI> f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public void f$E(List<OI> var1) {
      this.f$g = var1;
   }

   // $FF: synthetic method
   public void f$E(String var1) {
      this.f$i = var1;
   }

   // $FF: synthetic method
   public void f$E(OI var1) {
      this.f$M = var1;
   }

   // $FF: synthetic method
   public String f$E() {
      return this.f$i;
   }

   // $FF: synthetic method
   public void f$E(int var1) {
      this.f$j = var1;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = 4 << 4 ^ 3 << 1;
      int var10001 = 4 << 3 ^ 2;
      int var10002 = 1 << 3 ^ 2;
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
   public OI f$E() {
      return this.f$M;
   }

   // $FF: synthetic method
   public ZH(int var1, String var2, DimensionType var3, OI var4, List<OI> var5) {
      this.f$j = var1;
      this.f$i = var2;
      this.f$d = var3;
      this.f$M = var4;
      this.f$g = var5;
   }

   // $FF: synthetic method
   public void f$E(DimensionType var1) {
      this.f$d = var1;
   }
}
