package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Ca extends Ba {
   // $FF: synthetic field
   private float f$g;
   // $FF: synthetic field
   private z<Boolean> f$C;
   // $FF: synthetic field
   private boolean f$d;
   // $FF: synthetic field
   private Bh f$j;
   // $FF: synthetic field
   private List<Block> f$A;
   // $FF: synthetic field
   public int f$B;
   // $FF: synthetic field
   private ka<Ka> f$e;
   // $FF: synthetic field
   private final n f$b;
   // $FF: synthetic field
   private s f$I;
   // $FF: synthetic field
   private final ka<da> f$K;
   // $FF: synthetic field
   private List<Block> f$c;
   // $FF: synthetic field
   public Rg f$L;
   // $FF: synthetic field
   private float f$M;
   // $FF: synthetic field
   private z<Boolean> f$a;
   // $FF: synthetic field
   private Bh f$i;

   // $FF: synthetic method
   public static Minecraft f$F() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$J() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$D() {
      return f$d;
   }

   // $FF: synthetic method
   public static boolean f$E(Ca var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$l() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$p() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$A() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$H() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$w() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$b() {
      return f$d;
   }

   // $FF: synthetic method
   public static float f$E(Ca var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static Minecraft f$v() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$U() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$X() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$q() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$c() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$V() {
      return f$d;
   }

   // $FF: synthetic method
   public static float f$a(Ca var0, float var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public void f$K() {
      this.f$L = null;
      super.f$K();
   }

   // $FF: synthetic method
   public static float f$E(Ca var0, float var1) {
      return var0.f$M = var1;
   }

   // $FF: synthetic method
   public static z f$a(Ca var0) {
      return var0.f$C;
   }

   // $FF: synthetic method
   public static Minecraft f$L() {
      return f$d;
   }

   // $FF: synthetic method
   public static ka f$E(Ca var0) {
      return var0.f$e;
   }

   // $FF: synthetic method
   private Rg f$E(BlockPos var1) {
      if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(0, -1, 0)).func_177230_c())) {
         return new Rg(var1.func_177982_a(0, -1, 0), EnumFacing.UP);
      } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(-1, 0, 0)).func_177230_c())) {
         return new Rg(var1.func_177982_a(-1, 0, 0), EnumFacing.EAST);
      } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(1, 0, 0)).func_177230_c())) {
         return new Rg(var1.func_177982_a(1, 0, 0), EnumFacing.WEST);
      } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(0, 0, -1)).func_177230_c())) {
         return new Rg(var1.func_177982_a(0, 0, -1), EnumFacing.SOUTH);
      } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(0, 0, 1)).func_177230_c())) {
         return new Rg(var1.func_177982_a(0, 0, 1), EnumFacing.NORTH);
      } else {
         BlockPos var2 = var1.func_177982_a(-1, 0, 0);
         if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(-1, 0, 0)).func_177230_c())) {
            return new Rg(var2.func_177982_a(-1, 0, 0), EnumFacing.EAST);
         } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(1, 0, 0)).func_177230_c())) {
            return new Rg(var2.func_177982_a(1, 0, 0), EnumFacing.WEST);
         } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(0, 0, -1)).func_177230_c())) {
            return new Rg(var2.func_177982_a(0, 0, -1), EnumFacing.SOUTH);
         } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(0, 0, 1)).func_177230_c())) {
            return new Rg(var2.func_177982_a(0, 0, 1), EnumFacing.NORTH);
         } else {
            var2 = var1.func_177982_a(1, 0, 0);
            if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(-1, 0, 0)).func_177230_c())) {
               return new Rg(var2.func_177982_a(-1, 0, 0), EnumFacing.EAST);
            } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(1, 0, 0)).func_177230_c())) {
               return new Rg(var2.func_177982_a(1, 0, 0), EnumFacing.WEST);
            } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(0, 0, -1)).func_177230_c())) {
               return new Rg(var2.func_177982_a(0, 0, -1), EnumFacing.SOUTH);
            } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(0, 0, 1)).func_177230_c())) {
               return new Rg(var2.func_177982_a(0, 0, 1), EnumFacing.NORTH);
            } else {
               var2 = var1.func_177982_a(0, 0, -1);
               if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(-1, 0, 0)).func_177230_c())) {
                  return new Rg(var2.func_177982_a(-1, 0, 0), EnumFacing.EAST);
               } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(1, 0, 0)).func_177230_c())) {
                  return new Rg(var2.func_177982_a(1, 0, 0), EnumFacing.WEST);
               } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(0, 0, -1)).func_177230_c())) {
                  return new Rg(var2.func_177982_a(0, 0, -1), EnumFacing.SOUTH);
               } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var2.func_177982_a(0, 0, 1)).func_177230_c())) {
                  return new Rg(var2.func_177982_a(0, 0, 1), EnumFacing.NORTH);
               } else {
                  var1 = var1.func_177982_a(0, 0, 1);
                  if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(-1, 0, 0)).func_177230_c())) {
                     return new Rg(var1.func_177982_a(-1, 0, 0), EnumFacing.EAST);
                  } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(1, 0, 0)).func_177230_c())) {
                     return new Rg(var1.func_177982_a(1, 0, 0), EnumFacing.WEST);
                  } else if (!this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(0, 0, -1)).func_177230_c())) {
                     return new Rg(var1.func_177982_a(0, 0, -1), EnumFacing.SOUTH);
                  } else {
                     return !this.f$c.contains(f$d.field_71441_e.func_180495_p(var1.func_177982_a(0, 0, 1)).func_177230_c()) ? new Rg(var1.func_177982_a(0, 0, 1), EnumFacing.NORTH) : null;
                  }
               }
            }
         }
      }
   }

   // $FF: synthetic method
   public static z f$E(Ca var0) {
      return var0.f$a;
   }

   // $FF: synthetic method
   public static Minecraft f$P() {
      boolean var10000 = true;
      boolean var10001 = true;
      boolean var10002 = true;
      boolean var10003 = true;
      return f$d;
   }

   // $FF: synthetic method
   public static Rg f$E(Ca var0, BlockPos var1) {
      return var0.f$E(var1);
   }

   // $FF: synthetic method
   public static Minecraft f$C() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$t() {
      return f$d;
   }

   // $FF: synthetic method
   public static boolean f$E(Ca var0, boolean var1) {
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$i() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$W() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$Q() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$E(Ca var0) {
      return var0.f$a();
   }

   // $FF: synthetic method
   public static Minecraft f$k() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static List f$E(Ca var0) {
      return var0.f$A;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static s f$E(Ca var0) {
      return var0.f$I;
   }

   // $FF: synthetic method
   public static Minecraft f$Y() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$x() {
      return f$d;
   }

   // $FF: synthetic method
   public static Bh f$a(Ca var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public static Minecraft f$j() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$d() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$o() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$u() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$n() {
      return f$d;
   }

   // $FF: synthetic method
   private int f$a() {
      ItemStack var1;
      if ((var1 = f$d.field_71439_g.field_71071_by.func_70448_g()).func_190916_E() != 0 && var1.func_77973_b() instanceof ItemBlock && (((da)this.f$K.f$E()).equals(da.f$i) || ((da)this.f$K.f$E()).equals(da.f$M) && ((List)this.f$b.f$E()).contains(var1.func_77973_b()) || ((da)this.f$K.f$E()).equals(da.f$g) && !((List)this.f$b.f$E()).contains(var1.func_77973_b()))) {
         return f$d.field_71439_g.field_71071_by.field_70461_c;
      } else {
         int var3;
         for(int var10000 = var3 = 36; var10000 < 45; var10000 = var3) {
            ItemStack var2;
            if ((var2 = f$d.field_71439_g.field_71069_bz.func_75139_a(var3).func_75211_c()).func_77973_b() instanceof ItemBlock && (((da)this.f$K.f$E()).equals(da.f$i) || ((da)this.f$K.f$E()).equals(da.f$M) && ((List)this.f$b.f$E()).contains(var2.func_77973_b()) || ((da)this.f$K.f$E()).equals(da.f$g) && !((List)this.f$b.f$E()).contains(var2.func_77973_b()))) {
               return var3 - 36;
            }

            ++var3;
         }

         return -1;
      }
   }

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$M() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$m() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$I() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$f() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$g() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$G() {
      return f$d;
   }

   // $FF: synthetic method
   public Ca() {
      String var10001 = RG.f$E("t?F:A3K8");
      String[] var10002 = new String[4];
      boolean var10004 = true;
      var10002[0] = Wh.f$E("N^|[{RqY");
      var10002[1] = RG.f$E("t?F:A3K8p=K7");
      var10002[2] = Wh.f$E("N^|[{R");
      var10002[3] = RG.f$E("\bH+B.");
      super(var10001, var10002, true, -6772395, JD.f$M);
      Boolean var10003 = true;
      String[] var6 = new String[3];
      boolean var10006 = true;
      var6[0] = Wh.f$E("irJxO");
      var6[1] = RG.f$E("\bH+");
      var6[2] = Wh.f$E("I");
      this.f$a = new z(var10003, var6);
      var10003 = false;
      var6 = new String[4];
      var10006 = true;
      var6[0] = RG.f$E("t(H,j3S5H2");
      var6[1] = Wh.f$E("PRiTrS");
      var6[2] = RG.f$E("\u001df\u001f");
      var6[3] = Wh.f$E("|^");
      this.f$C = new z(var10003, var6);
      Ka var4 = Ka.f$M;
      var6 = new String[4];
      var10006 = true;
      var6[0] = RG.f$E("j3C9");
      var6[1] = Wh.f$E("prY");
      var6[2] = RG.f$E("s%W9");
      var6[3] = Wh.f$E("P");
      this.f$e = new ka(var4, var6);
      Float var5 = 75.0F;
      Float var10 = 1.0F;
      Float var10005 = 600.0F;
      Integer var12 = 1;
      String[] var10007 = new String[3];
      boolean var10009 = true;
      var10007[0] = RG.f$E("\u0018B0F%");
      var10007[1] = Wh.f$E("yxQ");
      var10007[2] = RG.f$E("8");
      this.f$I = new s(var5, var10, var10005, var12, var10007);
      da var7 = da.f$i;
      var6 = new String[3];
      var10006 = true;
      var6[0] = Wh.f$E("nxQx^iTrS");
      var6[1] = RG.f$E("\u000fB0B?S5H2j3C9");
      var6[2] = Wh.f$E("N");
      this.f$K = new ka(var7, var6);
      String[] var8 = new String[7];
      boolean var11 = true;
      var8[0] = RG.f$E("\u0015S9J/");
      var8[1] = Wh.f$E("\u007fQr^vN");
      var8[2] = RG.f$E("+O5S9K5T(");
      var8[3] = Wh.f$E("_q\\~VqTnI");
      var8[4] = RG.f$E("T9K9D(F>K9");
      var8[5] = Wh.f$E("NxQx^i\\\u007fQxTiXpN");
      var8[6] = RG.f$E("5");
      this.f$b = new n(var8);
      this.f$j = new Bh();
      this.f$i = new Bh();
      Block[] var1 = new Block[6];
      boolean var9 = true;
      var1[0] = Blocks.field_150350_a;
      var1[1] = Blocks.field_150355_j;
      var1[2] = Blocks.field_150480_ab;
      var1[3] = Blocks.field_150358_i;
      var1[4] = Blocks.field_150353_l;
      var1[5] = Blocks.field_150356_k;
      this.f$c = Arrays.asList(var1);
      var1 = new Block[4];
      var9 = true;
      var1[0] = Blocks.field_150353_l;
      var1[1] = Blocks.field_150356_k;
      var1[2] = Blocks.field_150355_j;
      var1[3] = Blocks.field_150358_i;
      this.f$A = Arrays.asList(var1);
      this.f$L = null;
      z[] var2 = new z[6];
      var9 = true;
      var2[0] = this.f$e;
      var2[1] = this.f$K;
      var2[2] = this.f$b;
      var2[3] = this.f$a;
      var2[4] = this.f$C;
      var2[5] = this.f$I;
      this.f$E((z[])var2);
      Ha[] var3 = new Ha[3];
      var9 = true;
      var3[0] = new Ea(this);
      var3[1] = new Ga(this);
      var3[2] = new aa(this);
      this.f$E((Ha[])var3);
   }

   // $FF: synthetic method
   public static Minecraft f$h() {
      return f$d;
   }

   // $FF: synthetic method
   public static Bh f$E(Ca var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public static float f$a(Ca var0) {
      return var0.f$g;
   }
}
