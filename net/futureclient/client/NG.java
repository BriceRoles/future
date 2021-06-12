package net.futureclient.client;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.StringJoiner;

public class NG extends GA {
   // $FF: synthetic method
   public String f$E() {
      return LI.f$E("?_B\\vTmFjN`V|FjSc_eVpImg");
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      gF var2;
      if ((var2 = (gF)kH.f$E().f$E().f$E(gF.class)) == null) {
         return null;
      } else {
         String[] var3 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
         if (var1.length < 1) {
            return null;
         } else {
            byte var10000;
            label172: {
               String var4 = var1[0].toLowerCase();
               byte var5 = -1;
               byte var14;
               switch(var4.hashCode()) {
               case 3322014:
                  while(false) {
                  }

                  if (var4.equals(LI.f$E("uSjN"))) {
                     var10000 = var14 = 0;
                     break label172;
                  }
                  break;
               case 3530753:
                  if (var4.equals(LI.f$E("jSc_"))) {
                     var5 = 2;
                  }
                  break;
               case 109780401:
                  if (var4.equals(ni.f$E("R\rX\u0015D"))) {
                     var10000 = var14 = 1;
                     break label172;
                  }
               }

               var10000 = var5;
            }

            String var9;
            Object[] var10001;
            boolean var10003;
            String[] var20;
            int var22;
            int var23;
            String var27;
            String var28;
            int var30;
            switch(var10000) {
            case 0:
               StringJoiner var6 = new StringJoiner(ni.f$E("U\u0001"));
               var20 = var3;
               var22 = var3.length;

               for(var30 = var23 = 0; var30 < var22; var30 = var23) {
                  var27 = var20[var23];
                  ++var23;
                  var6.add(var27);
               }

               var28 = LI.f$E("|vTmI9\u0012<I0\u00009\u001fj\u0014");
               var10001 = new Object[2];
               var10003 = true;
               var10001[0] = var3.length;
               var10001[1] = var6.toString();
               return String.format(var28, var10001);
            case 1:
               while(false) {
               }

               if (var1.length != 2) {
                  return ni.f$E("o\u0016\u0001\u001fN\u0017UYR\rX\u0015DYD\u0017U\u001cS\u001cEW\u0001)N\nR\u0010C\u0015DYN\tU\u0010N\u0017RC\u0001)m8h7\rYc6m=\rYh-`5h:\rYN\u000b\u0001;n5eRh-`5h:\u000f");
               } else {
                  String var7;
                  label140: {
                     var9 = var7 = var1[1].toUpperCase();
                     byte var25 = -1;
                     byte var26;
                     switch(var9.hashCode()) {
                     case -2125451728:
                        while(false) {
                        }

                        if (var9.equals(LI.f$E("PnXvPy"))) {
                           var10000 = var26 = 2;
                           break label140;
                        }
                        break;
                     case -977469450:
                        if (var9.equals(ni.f$E("c6m=\n0u8m0b"))) {
                           var25 = 3;
                        }
                        break;
                     case 2044549:
                        if (var9.equals(ni.f$E(";n5e"))) {
                           var10000 = var26 = 1;
                           break label140;
                        }
                        break;
                     case 76210602:
                        if (var9.equals(LI.f$E("jU{Pt"))) {
                           var10000 = var26 = 0;
                           break label140;
                        }
                     }

                     var10000 = var25;
                  }

                  byte var8;
                  gF var29;
                  switch(var10000) {
                  case 0:
                     while(false) {
                     }

                     var8 = 0;
                     var29 = var2;
                     break;
                  case 1:
                     var8 = 1;
                     var29 = var2;
                     break;
                  case 2:
                     var8 = 2;
                     var29 = var2;
                     break;
                  case 3:
                     var8 = 3;
                     var29 = var2;
                     break;
                  default:
                     return LI.f$E("PTo[uS}\u001a\u007fUwN9ImCu_9_wN|H|^7\u001aIUjIpXu_9UiNpUwI#\u001aIvXsW\u00169xVv]\u00169sM{UsZ\u00169Uk\u001a[uU~2sM{UsZ\u0014");
                  }

                  var29.f$L = new fG(new Font(var2.f$L.f$E().getName(), var8, var2.f$L.f$E().getSize()), true, true);
                  var28 = ni.f$E("?N\u0017UYR\rX\u0015DYC\u001cD\u0017\u0001\nD\r\u0001\rNY\u0004\n\u000f");
                  var10001 = new Object[1];
                  var10003 = true;
                  var10001[0] = var7;
                  return String.format(var28, var10001);
               }
            case 2:
               if (var1.length != 2) {
                  return LI.f$E("tv\u001a\u007fUwN9Ip@|\u001a|Tm_k_}\u0014");
               } else {
                  var9 = var1[1];

                  int var10;
                  try {
                     var10 = Integer.parseInt(var9);
                  } catch (NumberFormatException var12) {
                     var28 = ni.f$E("0O\u000f@\u0015H\u001d\u0001\u001fN\u0017UYR\u0010[\u001c\u0001\u001cO\rD\u000bD\u001d\rYH\u0017Q\fUYL\fR\r\u0001\u001bDY@YO\fL\u001bD\u000b\u001bY\u0004\n\u000f");
                     var10001 = new Object[1];
                     var10003 = true;
                     var10001[0] = var12.getMessage();
                     return String.format(var28, var10001);
                  }

                  if (var10 >= 5 && var10 <= 30) {
                     var2.f$L = new fG(new Font(var2.f$L.f$E().getName(), var2.f$L.f$E().getStyle(), var10), true, true);
                     var28 = ni.f$E("g\u0016O\r\u0001\nH\u0003DYI\u0018RYC\u001cD\u0017\u0001\nD\r\u0001\rNY\u0004\n\u000f");
                     var10001 = new Object[1];
                     var10003 = true;
                     var10001[0] = var10;
                     return String.format(var28, var10001);
                  }

                  var28 = LI.f$E("|vTm\u001ajSc_9YxTwUm\u001a{_9\u001fj\u001amRxT9\u001fj\u0014");
                  var10001 = new Object[2];
                  var10003 = true;
                  var10001[0] = var10 < 5 ? ni.f$E("R\u0014@\u0015M\u001cS") : LI.f$E("u[k]|H");
                  var10001[1] = var10 < 5 ? 5 : 30;
                  return String.format(var28, var10001);
               }
            default:
               StringBuilder var13 = new StringBuilder();
               String[] var16 = var1;
               int var15 = var1.length;

               int var21;
               for(var30 = var21 = 0; var30 < var15; var30 = var21) {
                  String var24 = var16[var21];
                  var13.append(var24);
                  ++var21;
                  var13.append(LI.f$E("\u001a"));
               }

               String var18 = var1.length == 1 ? var1[0].toLowerCase() : var13.toString().trim().toLowerCase();
               String[] var17 = var3;
               var21 = var3.length;

               for(var30 = var22 = 0; var30 < var21; var30 = var22) {
                  if ((var9 = var17[var22]).toLowerCase().equals(var18)) {
                     var2.f$L = new fG(new Font(var9, var2.f$L.f$E().getStyle(), var2.f$L.f$E().getSize()), true, true);
                     var28 = ni.f$E("?N\u0017UYI\u0018RYC\u001cD\u0017\u0001\nD\r\u0001\rNY\u0004\n\u000f");
                     var10001 = new Object[1];
                     var10003 = true;
                     var10001[0] = var9;
                     return String.format(var28, var10001);
                  }

                  ++var22;
               }

               String var19 = var18.replaceAll(LI.f$E("\u001aeee\u0017e\u001d"), "").toLowerCase();
               var20 = var3;
               var22 = var3.length;

               for(var30 = var23 = 0; var30 < var22; var30 = var23) {
                  if ((var27 = var20[var23]).replaceAll(ni.f$E("\u0001\u0005~\u0005\f\u0005\u0006"), "").toLowerCase().contains(var19)) {
                     var2.f$L = new fG(new Font(var27, var2.f$L.f$E().getStyle(), var2.f$L.f$E().getSize()), true, true);
                     var28 = LI.f$E("_UwN9RxI9X|_w\u001aj_m\u001amU9\u001fj\u0014");
                     var10001 = new Object[1];
                     var10003 = true;
                     var10001[0] = var27;
                     return String.format(var28, var10001);
                  }

                  ++var23;
               }

               return ni.f$E("-I\u0018UYG\u0016O\r\u0001\u001dN\u001cR\u0017\u0006\r\u0001\u001cY\u0010R\r\u000f");
            }
         }
      }
   }

   // $FF: synthetic method
   public NG() {
      String[] var10001 = new String[6];
      boolean var10003 = true;
      var10001[0] = LI.f$E("_UwN");
      var10001[1] = ni.f$E("r\u001cU?N\u0017U");
      var10001[2] = LI.f$E("ZOjNvW_UwN");
      var10001[3] = ni.f$E("r\u001cU:T\nU\u0016L?N\u0017U");
      var10001[4] = LI.f$E("_Uw^");
      var10001[5] = ni.f$E("r\u001cU?N\u0017E");
      super(var10001);
   }
}
