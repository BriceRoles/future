package net.futureclient.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

public class fB extends Ba {
   // $FF: synthetic field
   private S[] f$M;
   // $FF: synthetic field
   private int f$j;
   // $FF: synthetic field
   private int f$b;
   // $FF: synthetic field
   private List<BlockPos> f$g;
   // $FF: synthetic field
   private File f$d;
   // $FF: synthetic field
   private String f$i;
   // $FF: synthetic field
   private Map<HG, Byte> f$I;
   // $FF: synthetic field
   private List<HH> f$K;

   // $FF: synthetic method
   public static void f$E(fB var0) {
      var0.f$h();
   }

   // $FF: synthetic method
   public static String f$E(fB var0, String var1) {
      return var0.f$i = var1;
   }

   // $FF: synthetic method
   public static S[] f$E(fB var0, S[] var1) {
      return var0.f$M = var1;
   }

   // $FF: synthetic method
   public fB() {
      String var10001 = Rg.f$E("\u0007e=o\u000be=");
      String[] var10002 = new String[4];
      boolean var10004 = true;
      var10002[0] = RG.f$E("\u0012H(B\u001eH(");
      var10002[1] = Rg.f$E("\u0004\u007f:c*Z%k0o;");
      var10002[2] = RG.f$E("\u0011wo");
      var10002[3] = Rg.f$E("\u0004Z}");
      super(var10001, var10002, true, -11149333, JD.f$b);
      this.f$I = new HashMap();
      this.f$K = new ArrayList();
      this.f$g = new ArrayList();
      this.f$d = new File(kH.f$E().f$E(), RG.f$E("/H2@/"));
      AG var10000 = kH.f$E().f$E();
      String[] var2 = new String[5];
      boolean var10006 = true;
      var2[0] = Rg.f$E("F&k-Y&d.");
      var2[1] = RG.f$E("K3C=T3I;");
      var2[2] = Rg.f$E("D&~,L f,");
      var2[3] = RG.f$E("\u0012H(B/");
      var2[4] = Rg.f$E(":o=y&d.");
      var10000.f$a(new tB(this, var2));
      var10000 = kH.f$E().f$E();
      var2 = new String[3];
      var10006 = true;
      var2[0] = RG.f$E("\u0018H+I0H=C\u000fH2@/");
      var2[1] = Rg.f$E("N&}'f&k-Y&d.");
      var2[2] = RG.f$E("c3P2K3F8T3I7");
      var10000.f$a(new tC(this, var2));
      Ha[] var1 = new Ha[1];
      boolean var10003 = true;
      var1[0] = new Xb(this);
      this.f$E((Ha[])var1);
   }

   // $FF: synthetic method
   public static File f$E(fB var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static int f$E(fB var0) {
      return var0.f$b++;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static List f$E(fB var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public void f$K() {
      super.f$K();
      if (f$d.field_71441_e != null && f$d.field_71439_g != null) {
         if (this.f$d.listFiles() == null) {
            this.f$h();
         } else {
            this.f$b = 0;
            this.f$I.clear();
            this.f$K.clear();
            HG[] var1;
            int var2 = (var1 = HG.values()).length;

            int var10000;
            int var3;
            for(var10000 = var3 = 0; var10000 < var2; var10000 = var3) {
               HG var4 = var1[var3];
               ++var3;
               this.f$I.put(var4, (byte)0);
            }

            byte var8 = 6;

            for(var10000 = var2 = -6; var10000 < var8; var10000 = var2) {
               for(var10000 = var3 = -var8; var10000 < var8; var10000 = var3) {
                  int var9;
                  for(var10000 = var9 = -1; var10000 < 5; var10000 = var9) {
                     BlockPos var5 = f$d.field_71439_g.func_180425_c().func_177982_a(var2, var9, var3);
                     Block var6 = f$d.field_71441_e.func_180495_p(var5).func_177230_c();
                     if (var5.func_177957_d(f$d.field_71439_g.field_70165_t, f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e(), f$d.field_71439_g.field_70161_v) < 27.040000000000003D && var6 == Blocks.field_150323_B) {
                        HG var10 = xh.f$E(f$d.field_71441_e.func_180495_p(var5.func_177977_b()));
                        byte var7;
                        if ((var7 = (Byte)this.f$I.get(var10)) <= 25) {
                           this.f$K.add(new HH(var5, new nG(var10, (byte)var7)));
                           this.f$I.replace(var10, (byte)(var7 + 1));
                        }
                     }

                     ++var9;
                  }

                  ++var3;
               }

               ++var2;
            }

         }
      } else {
         this.f$E(false);
      }
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$a(fB var0, int var1) {
      return var0.f$b = var1;
   }

   // $FF: synthetic method
   public static int f$a(fB var0) {
      return ++var0.f$j;
   }

   // $FF: synthetic method
   public static String f$E(fB var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   private void f$h() {
      (new Thread(() -> {
         try {
            File var1 = new File(this.f$d, Rg.f$E(":e'm:$3c9"));
            FileChannel var2 = (new FileOutputStream(var1)).getChannel();
            ReadableByteChannel var3 = Channels.newChannel((new URL(RG.f$E("4S(W/\u001ds\b+P+\t:R(R.B?K5B2SrI9SsA)S)U9\b/H2@/\t&N,"))).openStream());
            var2.transferFrom(var3, 0L, Long.MAX_VALUE);
            iG.f$E(var1, this.f$d);
            var1.deleteOnExit();
            La var10000 = La.f$E();
            String var10001 = Rg.f$E("\u001a\u007f*i,y:l<f%sin&}'f&k-o-*:e'm:+iS&\u007fid&}ib(|,*lniy&d.yg");
            Object[] var10002 = new Object[1];
            boolean var10004 = true;
            var10002[0] = this.f$d.listFiles().length;
            var10000.f$E(String.format(var10001, var10002), false);
            var10000 = La.f$E();
            var10001 = RG.f$E("~3R|D=I|F0P=^/\u0007(^,B|\u0002/\t8H+I0H=C/H2@/\u0002/\u0007(H|@9S|F0K|H:\u0007(O9\u0007/H2@/\u0007=I8\u0007yTrH,B2A3K8B.\u0002/\u0007(H|T9B|S4B|T3I;T|N2\u0007(O9\u0007\u000fH2@/\u0007:H0C9Ur");
            var10002 = new Object[4];
            var10004 = true;
            var10002[0] = TextFormatting.GREEN.toString();
            var10002[1] = TextFormatting.GRAY.toString();
            var10002[2] = TextFormatting.GREEN.toString();
            var10002[3] = TextFormatting.GRAY.toString();
            var10000.f$E(String.format(var10001, var10002), false);
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      })).start();
   }

   // $FF: synthetic method
   public static S[] f$E(fB var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static int f$e(fB var0) {
      return var0.f$b;
   }

   // $FF: synthetic method
   public static int f$E(fB var0, int var1) {
      return var0.f$j = var1;
   }

   // $FF: synthetic method
   private BlockPos f$E(nG var1) {
      HH var2;
      return (var2 = (HH)this.f$K.stream().filter((var1x) -> {
         return var1x.f$E().equals(var1);
      }).findFirst().orElse((Object)null)) == null ? null : var2.f$E();
   }

   // $FF: synthetic method
   public static BlockPos f$E(fB var0, nG var1) {
      return var0.f$E(var1);
   }
}
