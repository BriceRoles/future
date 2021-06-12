package net.futureclient.client;

public class di extends GA {
   // $FF: synthetic method
   public di() {
      String[] var10001 = new String[3];
      boolean var10003 = true;
      var10001[0] = hI.f$E("~iZcF");
      var10001[1] = Ri.f$E("Ut");
      var10001[2] = hI.f$E("^");
      super(var10001);
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      if (var1.length == 1) {
         double var2 = Double.parseDouble(var1[0]);
         double var4 = Math.cos(Math.toRadians((double)(this.f$d.field_71439_g.field_70177_z + 90.0F)));
         double var6 = Math.sin(Math.toRadians((double)(this.f$d.field_71439_g.field_70177_z + 90.0F)));
         if (this.f$d.field_71439_g.func_184187_bx() != null) {
            this.f$d.field_71439_g.func_184187_bx().func_70107_b(this.f$d.field_71439_g.func_184187_bx().field_70165_t + 1.0D * var2 * var4 + 0.0D * var2 * var6, this.f$d.field_71439_g.func_184187_bx().field_70163_u, this.f$d.field_71439_g.func_184187_bx().field_70161_v + (1.0D * var2 * var6 - 0.0D * var2 * var4));
         } else {
            this.f$d.field_71439_g.func_70107_b(this.f$d.field_71439_g.field_70165_t + 1.0D * var2 * var4 + 0.0D * var2 * var6, this.f$d.field_71439_g.field_70163_u, this.f$d.field_71439_g.field_70161_v + (1.0D * var2 * var6 - 0.0D * var2 * var4));
         }

         String var10000 = Ri.f$E("irQrMxOcXs\u001d2N7\u001br\u0018d\u001b \u001duQx^|\u0015d\u00149");
         Object[] var10001 = new Object[2];
         boolean var10003 = true;
         var10001[0] = var2 < 0.0D ? hI.f$E("hWi]") : Ri.f$E("qReJvOs");
         var10001[1] = var2;
         return String.format(var10000, var10001);
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   public String f$E() {
      return hI.f$E(",SQTfYi]yk");
   }
}
