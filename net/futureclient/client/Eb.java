package net.futureclient.client;

import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class Eb extends Ba {
   // $FF: synthetic field
   private final z<Boolean> f$d;
   // $FF: synthetic field
   private static final MovementInput f$g;

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public void f$B() {
      super.f$B();
      if (f$d.field_71439_g != null && f$d.field_71439_g.field_71158_b.getClass() == f$g.getClass()) {
         MovementInputFromOptions var1;
         (var1 = new MovementInputFromOptions(f$d.field_71474_y)).func_78898_a();
         f$d.field_71439_g.field_71158_b = var1;
      }

   }

   // $FF: synthetic method
   public static MovementInput f$E() {
      return f$g;
   }

   static {
      f$g = new lC(f$d.field_71474_y);
   }

   // $FF: synthetic method
   public Eb() {
      String var10001 = Rg.f$E("K<~&](f\"");
      String[] var10002 = new String[2];
      boolean var10004 = true;
      var10002[0] = yH.f$E("\u0002a7{\u0014u/\u007f");
      var10002[1] = Rg.f$E("\b\u007f=e\u001b\u007f'");
      super(var10001, var10002, true, -6710870, JD.f$j);
      Boolean var10003 = true;
      String[] var4 = new String[3];
      boolean var10006 = true;
      var4[0] = yH.f$E("\u000f{ \u007f");
      var4[1] = Rg.f$E("f&i\"");
      var4[2] = yH.f$E("x");
      this.f$d = new z(var10003, var4);
      z[] var1 = new z[1];
      boolean var3 = true;
      var1[0] = this.f$d;
      this.f$E(var1);
      Ha[] var2 = new Ha[2];
      var3 = true;
      var2[0] = new Zb(this);
      var2[1] = new ob(this);
      this.f$E(var2);
   }

   // $FF: synthetic method
   public static z f$E(Eb var0) {
      return var0.f$d;
   }
}
