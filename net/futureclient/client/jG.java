package net.futureclient.client;

import net.minecraft.util.text.TextFormatting;

public enum jG {
   // $FF: synthetic field
   f$i(v.f$E("SEzEfA`Ep"), TextFormatting.BLUE);

   // $FF: synthetic field
   private TextFormatting f$g;
   // $FF: synthetic field
   f$b(v.f$E("DRqM}Uy"), TextFormatting.GREEN),
   // $FF: synthetic field
   f$j(v.f$E("DRqM}Uy"), TextFormatting.GREEN),
   // $FF: synthetic field
   f$K(v.f$E("ZOz\rDRqM}Uy"), TextFormatting.YELLOW);

   // $FF: synthetic field
   private String f$M;

   // $FF: synthetic method
   public String f$E() {
      return this.f$M;
   }

   // $FF: synthetic method
   public TextFormatting f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   private jG(String var3, TextFormatting var4) {
      this.f$M = var3;
      this.f$g = var4;
   }

   static {
      jG[] var10000 = new jG[4];
      boolean var10002 = true;
      var10000[0] = f$K;
      var10000[1] = f$b;
      var10000[2] = f$j;
      var10000[3] = f$i;
   }
}
