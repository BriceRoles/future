package net.futureclient.client;

import java.util.Map;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;

public class hc extends Ha<Bf> {
   // $FF: synthetic field
   public final SB f$d;

   // $FF: synthetic method
   public hc(SB var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(Bf var1) {
      if (var1.f$E() instanceof EntityPlayer) {
         EntityPlayer var2 = (EntityPlayer)var1.f$E();
         if (var1.f$E() instanceof ModelBiped) {
            ModelBiped var3 = (ModelBiped)var1.f$E();
            Map var10000 = SB.f$E(this.f$d);
            float[][] var10002 = new float[5][];
            boolean var10004 = true;
            float[] var4 = new float[3];
            boolean var10006 = true;
            var4[0] = var3.field_78116_c.field_78795_f;
            var4[1] = var3.field_78116_c.field_78796_g;
            var4[2] = var3.field_78116_c.field_78808_h;
            var10002[0] = var4;
            var4 = new float[3];
            var10006 = true;
            var4[0] = var3.field_178723_h.field_78795_f;
            var4[1] = var3.field_178723_h.field_78796_g;
            var4[2] = var3.field_178723_h.field_78808_h;
            var10002[1] = var4;
            var4 = new float[3];
            var10006 = true;
            var4[0] = var3.field_178724_i.field_78795_f;
            var4[1] = var3.field_178724_i.field_78796_g;
            var4[2] = var3.field_178724_i.field_78808_h;
            var10002[2] = var4;
            float[] var10005 = new float[3];
            boolean var10007 = true;
            var10005[0] = var3.field_178721_j.field_78795_f;
            var10005[1] = var3.field_178721_j.field_78796_g;
            var10005[2] = var3.field_178721_j.field_78808_h;
            var10002[3] = var10005;
            var10005 = new float[3];
            var10007 = true;
            var10005[0] = var3.field_178722_k.field_78795_f;
            var10005[1] = var3.field_178722_k.field_78796_g;
            var10005[2] = var3.field_178722_k.field_78808_h;
            var10002[4] = var10005;
            var10000.put(var2, var10002);
         }
      }

   }
}
