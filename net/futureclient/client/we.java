package net.futureclient.client;

import java.util.Iterator;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class we extends Ha<sE> {
   // $FF: synthetic field
   public final vf f$d;

   // $FF: synthetic method
   public we(vf var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(sE var1) {
      if (var1.f$E().equals(YE.f$M)) {
         boolean var2 = GL11.glIsEnabled(2896);
         boolean var3 = GL11.glIsEnabled(3042);
         boolean var4 = GL11.glIsEnabled(3553);
         boolean var5 = GL11.glIsEnabled(2929);
         boolean var6 = GL11.glIsEnabled(2848);
         GL11.glPushMatrix();
         GL11.glDepthMask(false);
         if (var2) {
            GL11.glDisable(2896);
         }

         GL11.glBlendFunc(770, 771);
         if (!var3) {
            GL11.glEnable(3042);
         }

         GL11.glLineWidth(0.5F);
         if (var4) {
            GL11.glDisable(3553);
         }

         if (var5) {
            GL11.glDisable(2929);
         }

         if (!var6) {
            GL11.glEnable(2848);
         }

         wD var7;
         GL11.glColor4d((double)((float)(var7 = (wD)kH.f$E().f$E().f$E(wD.class)).f$a.getRed() / 255.0F), (double)((float)var7.f$a.getGreen() / 255.0F), (double)((float)var7.f$a.getBlue() / 255.0F), 1.0D);
         Frustum var14 = new Frustum();
         Object var8 = vf.f$C().func_175606_aa() == null ? vf.f$H().field_71439_g : vf.f$h().func_175606_aa();
         var14.func_78547_a(((Entity)var8).field_70142_S + (((Entity)var8).field_70165_t - ((Entity)var8).field_70142_S) * (double)((Y)vf.f$A()).getTimer().field_194147_b, ((Entity)var8).field_70137_T + (((Entity)var8).field_70163_u - ((Entity)var8).field_70137_T) * (double)((Y)vf.f$K()).getTimer().field_194147_b, ((Entity)var8).field_70136_U + (((Entity)var8).field_70161_v - ((Entity)var8).field_70136_U) * (double)((Y)vf.f$B()).getTimer().field_194147_b);
         Iterator var15;
         Iterator var10000 = var15 = vf.f$E(this.f$d).iterator();

         while(var10000.hasNext()) {
            ah var16 = (ah)var15.next();
            double var10 = (double)(var16.f$g * 16);
            double var12 = (double)(var16.f$d * 16);
            AxisAlignedBB var9 = new AxisAlignedBB(var10, 0.0D, var12, var10 + 16.0D, 0.0D, var12 + 16.0D);
            if (!var14.func_78546_a(var9)) {
               var10000 = var15;
            } else {
               Uh.f$E(var9.func_72317_d(-((K)vf.f$e().func_175598_ae()).getRenderPosX(), -((K)vf.f$a().func_175598_ae()).getRenderPosY(), -((K)vf.f$E().func_175598_ae()).getRenderPosZ()));
               var10000 = var15;
            }
         }

         GL11.glColor4d(1.0D, 1.0D, 1.0D, 1.0D);
         if (!var6) {
            GL11.glDisable(2848);
         }

         if (var5) {
            GL11.glEnable(2929);
         }

         if (var4) {
            GL11.glEnable(3553);
         }

         if (!var3) {
            GL11.glDisable(3042);
         }

         if (var2) {
            GL11.glEnable(2896);
         }

         GL11.glDepthMask(true);
         GL11.glPopMatrix();
      }
   }
}
