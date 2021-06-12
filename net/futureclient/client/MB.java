package net.futureclient.client;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class MB extends Ba {
   // $FF: synthetic field
   private Map<BlockPos, AtomicInteger> f$b;
   // $FF: synthetic field
   private Map<HG, BlockPos[]> f$I;
   // $FF: synthetic field
   private BlockPos f$K;
   // $FF: synthetic field
   private int f$i;
   // $FF: synthetic field
   private BlockPos f$j;
   // $FF: synthetic field
   private int f$M;
   // $FF: synthetic field
   private BlockPos f$g;
   // $FF: synthetic field
   private boolean f$d;

   // $FF: synthetic method
   public MB() {
      String var10001 = ke.f$E("3\u000e\t\u0004)\u0014\u0013\u0004\u000f");
      String[] var10002 = new String[7];
      boolean var10004 = true;
      var10002[0] = Ri.f$E("YRcXCHyXe");
      var10002[1] = ke.f$E("/\u0012\u0015\u0018\u0012)\u0014\u0013\u0004\u000f");
      var10002[2] = Ri.f$E("VHcRCHyXe");
      var10002[3] = ke.f$E(" \b\u0015\u00125\b\u000f\u0018");
      var10002[4] = Ri.f$E("DRyZCHyXe");
      var10002[5] = ke.f$E(")\u0014\u0013\u0004\u000f");
      var10002[6] = Ri.f$E("|CHyXe");
      super(var10001, var10002, true, -6692885, JD.f$b);
      Ha[] var1 = new Ha[2];
      boolean var10003 = true;
      boolean var10006 = false;
      var1[0] = new WA(this);
      var1[1] = new QB(this);
      this.f$E((Ha[])var1);
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static boolean f$E(MB var0, boolean var1) {
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   public static int f$E(MB var0) {
      return var0.f$M++;
   }

   // $FF: synthetic method
   public static BlockPos f$e(MB var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   private BlockPos f$E(BlockPos var1) {
      Iterator var2 = this.f$b.entrySet().iterator();

      BlockPos var3;
      AtomicInteger var4;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         Entry var5;
         var3 = (BlockPos)(var5 = (Entry)var2.next()).getKey();
         var4 = (AtomicInteger)var5.getValue();
      } while(var3 == null || var3.equals(var1) || var4.intValue() <= 0);

      return var3;
   }

   // $FF: synthetic method
   public static boolean f$E(MB var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static int f$a(MB var0, int var1) {
      return var0.f$i = var1;
   }

   // $FF: synthetic method
   public static int f$a(MB var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static Map f$E(MB var0) {
      return var0.f$b;
   }

   // $FF: synthetic method
   public static Map f$a(MB var0) {
      return var0.f$I;
   }

   // $FF: synthetic method
   public static BlockPos f$a(MB var0, BlockPos var1) {
      return var0.f$E(var1);
   }

   // $FF: synthetic method
   public static BlockPos f$E(MB var0, BlockPos var1) {
      return var0.f$j = var1;
   }

   // $FF: synthetic method
   public static BlockPos f$E(MB var0) {
      return var0.f$K;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static BlockPos f$e(MB var0, BlockPos var1) {
      return var0.f$K = var1;
   }

   // $FF: synthetic method
   public static int f$e(MB var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public static BlockPos f$a(MB var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public void f$K() {
      super.f$K();
      if (f$d.field_71441_e != null && f$d.field_71439_g != null) {
         this.f$d = true;
         this.f$I = xh.f$E();
         this.f$b = new LinkedHashMap();
         this.f$I.values().forEach((var1) -> {
            Arrays.asList(var1).forEach((var1x) -> {
               if (var1x != null) {
                  this.f$g = var1x;
                  this.f$b.put(var1x, new AtomicInteger(-1));
               }

            });
         });
         this.f$i = 0;
         this.f$M = 0;
      } else {
         this.f$E(false);
      }
   }

   // $FF: synthetic method
   public static int f$E(MB var0, int var1) {
      return var0.f$M = var1;
   }
}
