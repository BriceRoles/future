package net.futureclient.client;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class La implements E {
   // $FF: synthetic field
   private static final Logger f$d;
   // $FF: synthetic field
   private static final La f$g;
   // $FF: synthetic field
   public static final int f$M;
   // $FF: synthetic field
   public static final int f$i = 1337 + (new Random()).nextInt(2147482311);

   // $FF: synthetic method
   public void f$E(ITextComponent var1, boolean var2) {
      Minecraft var3;
      if ((var3 = Minecraft.func_71410_x()).field_71456_v != null) {
         var1 = (new TextComponentString(Ri.f$E("L{bIbOr`7"))).func_150255_a((new Style()).func_150238_a(TextFormatting.RED)).func_150257_a(var1);
         var3.field_71456_v.func_146158_b().func_146234_a(var1, var2 ? f$M : f$i);
      }

   }

   // $FF: synthetic method
   public void f$E(Level var1, String var2) {
      f$d.log(var1, var2);
   }

   // $FF: synthetic method
   public void f$E(String var1) {
      this.f$E(var1, true);
   }

   static {
      f$M = -f$i;
      f$g = new La();
      f$d = LogManager.getLogger(kH.f$m);
   }

   // $FF: synthetic method
   public void f$E(String var1, boolean var2) {
      String var3 = (new TextComponentString(var1.replace(Ri.f$E("1"), hH.f$E("¯")))).func_150255_a((new Style()).func_150238_a(TextFormatting.GRAY));
      this.f$E(var3, var2);
   }

   // $FF: synthetic method
   public static La f$E() {
      return f$g;
   }
}
