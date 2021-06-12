package net.futureclient.client;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.text.DecimalFormat;
import java.util.StringJoiner;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.RayTraceResult.Type;

public class fi extends GA {
   // $FF: synthetic field
   private final DecimalFormat f$d;
   // $FF: synthetic field
   private double f$M;
   // $FF: synthetic field
   private double f$i;
   // $FF: synthetic field
   private double f$g;

   // $FF: synthetic method
   public fi() {
      String[] var10001 = new String[3];
      boolean var10003 = true;
      var10001[0] = hH.f$E(")z\u000fj");
      var10001[1] = yH.f$E("$f\"v*d");
      var10001[2] = hH.f$E("\tz\u000fj\rg\u0001z\n{");
      super(var10001);
      this.f$d = new DecimalFormat(yH.f$E("$m7"));
      kH.f$E().f$E().f$a(new cj(this));
   }

   // $FF: synthetic method
   public static Minecraft f$B(fi var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static double f$a(fi var0, double var1) {
      return var0.f$M = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$E(fi var0) {
      boolean var10000 = true;
      boolean var10001 = true;
      boolean var10002 = true;
      boolean var10003 = true;
      return var0.f$d;
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      if (var1.length != 1) {
         return null;
      } else {
         String var12;
         byte var10000;
         label129: {
            var12 = var1[0].toLowerCase();
            byte var2 = -1;
            byte var13;
            switch(var12.hashCode()) {
            case -1386164858:
               while(false) {
               }

               if (var12.equals(hH.f$E("\fd\u0001k\u0005{"))) {
                  var10000 = var13 = 18;
                  break label129;
               }
               break;
            case -1354750946:
               if (var12.equals(hH.f$E("\rg\u0001z\n{"))) {
                  var10000 = var13 = 8;
                  break label129;
               }
               break;
            case -1112526474:
               if (var12.equals(yH.f$E("p&u7|0d,`"))) {
                  var10000 = var13 = 17;
                  break label129;
               }
               break;
            case -1003854816:
               if (var12.equals(hH.f$E("\u0001\u007f\u0000m\u001c{"))) {
                  var10000 = var13 = 22;
                  break label129;
               }
               break;
            case -927836409:
               if (var12.equals(hH.f$E("\nm\u000f|\u0006k\u0001g\u001cl\u0007f\u000f|\u000b{"))) {
                  var10000 = var13 = 14;
                  break label129;
               }
               break;
            case -905826493:
               if (var12.equals(hH.f$E("\u001dm\u001c~\u000bz"))) {
                  var10000 = var13 = 6;
                  break label129;
               }
               break;
            case -666719309:
               if (var12.equals(yH.f$E(".{!{4z&f"))) {
                  var10000 = var13 = 21;
                  break label129;
               }
               break;
            case -265713450:
               if (var12.equals(hH.f$E("\u001b{\u000bz\u0000i\u0003m"))) {
                  var10000 = var13 = 2;
                  break label129;
               }
               break;
            case -150073454:
               if (var12.equals(yH.f$E("p&u7| {,f'g"))) {
                  var10000 = var13 = 13;
                  break label129;
               }
               break;
            case 99:
               if (var12.equals(hH.f$E("k"))) {
                  var10000 = var13 = 12;
                  break label129;
               }
               break;
            case 105:
               if (var12.equals(yH.f$E("}"))) {
                  var10000 = var13 = 5;
                  break label129;
               }
               break;
            case 3199:
               if (var12.equals(yH.f$E("'w"))) {
                  var10000 = var13 = 15;
                  break label129;
               }
               break;
            case 3367:
               if (var12.equals(hH.f$E("\u0007x"))) {
                  var10000 = var13 = 4;
                  break label129;
               }
               break;
            case 3373707:
               if (var12.equals(hH.f$E("\u0000i\u0003m"))) {
                  var10000 = var13 = 0;
                  break label129;
               }
               break;
            case 3381091:
               if (var12.equals(yH.f$E("-} \u007f"))) {
                  var10000 = var13 = 1;
                  break label129;
               }
               break;
            case 70690926:
               if (var12.equals(yH.f$E("-} \u007f-u.q"))) {
                  var10000 = var13 = 3;
                  break label129;
               }
               break;
            case 93832333:
               if (var12.equals(yH.f$E("v/{ \u007f"))) {
                  var10000 = var13 = 19;
                  break label129;
               }
               break;
            case 94845685:
               if (var12.equals(yH.f$E("w,{1p"))) {
                  var10000 = var13 = 9;
                  break label129;
               }
               break;
            case 95457908:
               if (var12.equals(hH.f$E("l\u000bi\u001a`"))) {
                  var10000 = var13 = 16;
                  break label129;
               }
               break;
            case 106164915:
               if (var12.equals(hH.f$E("g\u0019f\u000bz"))) {
                  var10000 = var13 = 20;
                  break label129;
               }
               break;
            case 198931832:
               if (var12.equals(yH.f$E(" {,f'}-u7q"))) {
                  var10000 = var13 = 11;
                  break label129;
               }
               break;
            case 806538016:
               if (var12.equals(yH.f$E("y,v,c-q1g"))) {
                  var2 = 23;
               }
               break;
            case 1379104682:
               if (var12.equals(yH.f$E("0q1b&f*d"))) {
                  var10000 = var13 = 7;
                  break label129;
               }
               break;
            case 1871919611:
               if (var12.equals(hH.f$E("k\u0001g\u001cl\u0007f\u000f|\u000b{"))) {
                  var10000 = var13 = 10;
                  break label129;
               }
            }

            var10000 = var2;
         }

         String var3;
         String var16;
         Object[] var10001;
         boolean var10003;
         switch(var10000) {
         case 0:
         case 1:
         case 2:
         case 3:
            while(false) {
            }

            var12 = this.f$d.field_71439_g.func_70005_c_();
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var12), (ClipboardOwner)null);
            break;
         case 4:
         case 5:
         case 6:
         case 7:
            if (this.f$d.func_71356_B()) {
               return hH.f$E("Q\u0001}Ni\u001cmNa\u0000(\u001da\u0000o\u0002mNx\u0002i\u0017m\u001c)");
            }

            if (this.f$d.func_147104_D() != null) {
               var3 = this.f$d.func_147104_D().field_78845_b;
               Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var3), (ClipboardOwner)null);
            }
            break;
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
            var16 = yH.f$E("Ly4fgo4\u001a.c108cNy4fg");
            var10001 = new Object[3];
            var10003 = true;
            var10001[0] = (int)this.f$d.field_71439_g.field_70165_t;
            var10001[1] = (int)this.f$d.field_71439_g.field_70163_u;
            var10001[2] = (int)this.f$d.field_71439_g.field_70161_v;
            var3 = String.format(var16, var10001);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var3), (ClipboardOwner)null);
            break;
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
            double var4 = Double.parseDouble(this.f$d.format(this.f$i).replaceAll(",", "."));
            double var6 = Double.parseDouble(this.f$d.format(this.f$M).replaceAll(",", "."));
            double var8 = Double.parseDouble(this.f$d.format(this.f$g).replaceAll(",", "."));
            Clipboard var17 = Toolkit.getDefaultToolkit().getSystemClipboard();
            String var15 = hH.f$E("PT(K{B(72N-\u001d$NRT(K{");
            Object[] var10004 = new Object[3];
            boolean var10006 = true;
            var10004[0] = var4;
            var10004[1] = var6;
            var10004[2] = var8;
            var17.setContents(new StringSelection(String.format(var15, var10004)), (ClipboardOwner)null);
            break;
         case 18:
         case 19:
            StringJoiner var10 = new StringJoiner(yH.f$E("\u001e"));
            Block.field_149771_c.func_148742_b().forEach((var1x) -> {
               var10.add(var1x.toString());
            });
            var16 = hH.f$E(",d\u0001k\u0005{N K{G\u0002K{");
            var10001 = new Object[2];
            var10003 = true;
            var10001[0] = Block.field_149771_c.func_148742_b().size();
            var10001[1] = var10.toString();
            String var14 = String.format(var16, var10001);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var14), (ClipboardOwner)null);
            break;
         case 20:
         case 21:
            if (this.f$d.field_71476_x.field_72313_a != Type.ENTITY) {
               return yH.f$E("Z,4&z7}7mcr,a-pc}-4 f,g0|\"}1:");
            }

            UUID var11;
            if ((var11 = Pg.f$E(this.f$d.field_71476_x.field_72308_g)) == null) {
               return hH.f$E("\\\u0006a\u001d(\u000bf\u001aa\u001aqN`\u000f{Nf\u0001(\u0001\u007f\u0000m\u001c&");
            }

            sh.f$E(() -> {
               String var2 = VH.f$B(var11);
               this.f$d.func_152344_a(() -> {
                  Clipboard var10000 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  String var10003 = hH.f$E("-\u001d(F-\u001d!");
                  Object[] var10004 = new Object[2];
                  boolean var10006 = true;
                  var10004[0] = var2;
                  var10004[1] = var11;
                  var10000.setContents(new StringSelection(String.format(var10003, var10004)), (ClipboardOwner)null);
                  La.f$E().f$E(yH.f$E("W,d*q'47|&40q/q `&pc`:d&:"));
               });
            });
            return yH.f$E("W+q \u007f*z$:m:");
         case 22:
         case 23:
            sh.f$E(() -> {
               StringJoiner var1 = new StringJoiner(hH.f$E("\u0002"));
               this.f$d.field_71441_e.field_72996_f.stream().sorted(Pg.f$a()).forEach((var2) -> {
                  UUID var3;
                  if ((var3 = Pg.f$E(var2)) != null) {
                     String var4 = VH.f$B(var3);
                     String var10001 = yH.f$E("Ofg.Ic10.c104k10=");
                     Object[] var10002 = new Object[4];
                     boolean var10004 = true;
                     var10002[0] = (double)Math.round(var2.func_70032_d(this.f$d.field_71439_g)) * 100.0D / 100.0D;
                     var10002[1] = var2.func_145748_c_().func_150260_c();
                     var10002[2] = var4;
                     var10002[3] = var3;
                     var1.add(String.format(var10001, var10002));
                  }
               });
               if (var1.length() <= 0) {
                  this.f$d.func_152344_a(() -> {
                     La.f$E().f$E(hH.f$E("F\u0001(\u000bf\u001aa\u001aa\u000b{N\u007f\u0007|\u0006(\u0001\u007f\u0000m\u001c{Na\u0000(\u001cm\u0000l\u000bzNl\u0007{\u001ai\u0000k\u000b&"));
                  });
               } else {
                  this.f$d.func_152344_a(() -> {
                     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var1.toString()), (ClipboardOwner)null);
                     La.f$E().f$E(yH.f$E("W,d*q'47|&40q/q `&pc`:d&:"));
                  });
               }
            });
            return hH.f$E("K\u0006m\rc\u0007f\t&@&");
         default:
            return yH.f$E("]-w,f1q `c`:d&:");
         }

         return hH.f$E("K\u0001x\u0007m\n(\u001a`\u000b(\u001dm\u0002m\r|\u000blN|\u0017x\u000b&");
      }
   }

   // $FF: synthetic method
   public static double f$e(fi var0, double var1) {
      return var0.f$i = var1;
   }

   // $FF: synthetic method
   public static double f$E(fi var0, double var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$a(fi var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public String f$E() {
      return yH.f$E("2&O*d?w,{1p0h'q\"`+w,{1p0h-u.q?v/{ \u007f0h.{!{4z&fkgjI");
   }

   // $FF: synthetic method
   public static Minecraft f$e(fi var0) {
      return var0.f$d;
   }
}
