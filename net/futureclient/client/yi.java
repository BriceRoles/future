package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.text.TextFormatting;

public class yi extends GA {
   // $FF: synthetic field
   private List<OI> f$d;

   // $FF: synthetic method
   public String f$E() {
      return ZH.f$E(",GQCnFvFoNW\u0002QVoZ~\u007f");
   }

   // $FF: synthetic method
   public yi() {
      String[] var10001 = new String[1];
      boolean var10003 = true;
      var10001[0] = ZH.f$E("LKdFYKmL");
      super(var10001);
      this.f$d = new ArrayList();
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      if (var1.length < 2) {
         return null;
      } else {
         String var2 = var1[0];
         StringBuilder var3 = new StringBuilder();

         int var4;
         for(int var10000 = var4 = 1; var10000 < var1.length; var10000 = var4) {
            var3.append(var1[var4]);
            ++var4;
            var3.append(v.f$E("4"));
         }

         String var8 = var1.length == 2 ? var1[1] : var3.toString().trim();
         Gb var5;
         if ((var5 = (Gb)kH.f$E().f$E().f$E(Gb.class)) == null) {
            return ZH.f$E("OPxMx\f");
         } else {
            List var6;
            if (!(var6 = (List)var5.f$E().f$E()).contains(Blocks.field_150472_an)) {
               var6.add(Blocks.field_150472_an);
            }

            if (!var6.contains(Blocks.field_150444_as)) {
               var6.add(Blocks.field_150444_as);
            }

            this.f$d.field_71441_e.field_147482_g.forEach((var2x) -> {
               if (var2x instanceof TileEntitySign) {
                  TileEntity var4 = (TileEntitySign)var2x;

                  int var3;
                  for(int var10000 = var3 = 0; var10000 < 4; var10000 = var3) {
                     if (var4.field_145915_a[var3].func_150254_d().toLowerCase().contains(var8)) {
                        this.f$d.add(new OI((double)var4.func_174877_v().func_177958_n(), (double)var4.func_174877_v().func_177956_o(), (double)var4.func_174877_v().func_177952_p()));
                        return;
                     }

                     ++var3;
                  }
               }

            });
            if (this.f$d.isEmpty()) {
               return v.f$E("n{\u0000gIsNg\u0000rOaNp\u0000cI`H4T|A`\u0000`ElT:");
            } else {
               int var7;
               String var9;
               Object[] var10;
               boolean var10003;
               if (var2.equalsIgnoreCase(ZH.f$E("CnF"))) {
                  this.f$d.forEach((var1x) -> {
                     if (!var5.f$g.contains(var1x)) {
                        var5.f$g.add(var1x);
                     }

                  });
                  var7 = this.f$d.size();
                  this.f$d.clear();
                  if (var5.f$E()) {
                     tI.f$E();
                  }

                  var9 = v.f$E("UDpEp\u00001S4S}Gz\u0005g\u0000cI`H4T|E4TqX`\u00001S6\u0005g\u00021S4T{\u0000GEuRwH:");
                  var10 = new Object[5];
                  var10003 = true;
                  var10[0] = var7;
                  var10[1] = var7 > 1 ? ZH.f$E("Q") : "";
                  var10[2] = TextFormatting.WHITE;
                  var10[3] = var8;
                  var10[4] = TextFormatting.GRAY;
                  return String.format(var9, var10);
               } else if (!var2.equalsIgnoreCase(v.f$E("pEx")) && !var2.equalsIgnoreCase(ZH.f$E("xGgM|G"))) {
                  return v.f$E("]NbAxIp\u0000uC`I{N:");
               } else {
                  CopyOnWriteArrayList var10001 = var5.f$g;
                  this.f$d.forEach(var10001::remove);
                  var7 = this.f$d.size();
                  this.f$d.clear();
                  if (var5.f$E()) {
                     tI.f$E();
                  }

                  var9 = v.f$E("FEyObEp\u00001S4S}Gz\u0005g\u0000cI`H4T|E4TqX`\u00001S6\u0005g\u00021S4T{\u0000GEuRwH:");
                  var10 = new Object[5];
                  var10003 = true;
                  var10[0] = var7;
                  var10[1] = var7 > 1 ? ZH.f$E("Q") : "";
                  var10[2] = TextFormatting.WHITE;
                  var10[3] = var8;
                  var10[4] = TextFormatting.GRAY;
                  return String.format(var9, var10);
               }
            }
         }
      }
   }
}
