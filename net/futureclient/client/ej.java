package net.futureclient.client;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.ICustomGoalProcess;
import net.minecraft.world.DimensionType;

public final class ej extends GA {
   // $FF: synthetic method
   public String f$E(String[] var1) {
      Double var4 = null;
      double var2;
      double var5;
      double var10000;
      switch(var1.length) {
      case 1:
         while(false) {
         }

         va var8;
         if ((var8 = ((yB)kH.f$E().f$E().f$E(yB.class)).f$a(var1[0])) == null) {
            return LI.f$E("swLxVp^9mxCiUpTm\u001a|Tm_k_}\u0014");
         }

         var2 = var8.f$a();
         var5 = var8.f$e();
         if (this.f$d.field_71441_e.field_73011_w.func_186058_p().equals(DimensionType.NETHER) && var8.f$a().equals(DimensionType.OVERWORLD.func_186065_b())) {
            var2 /= 8.0D;
            var5 /= 8.0D;
            var10000 = var2;
         } else if (this.f$d.field_71441_e.field_73011_w.func_186058_p().equals(DimensionType.OVERWORLD) && var8.f$a().equals(DimensionType.NETHER.func_186065_b())) {
            var2 *= 8.0D;
            var5 *= 8.0D;
            var10000 = var2;
         } else {
            var10000 = var2;
         }
         break;
      case 2:
         var2 = Double.parseDouble(var1[0]);
         var5 = Double.parseDouble(var1[1]);
         var10000 = var2;
         break;
      case 3:
         var2 = Double.parseDouble(var1[0]);
         var4 = Double.parseDouble(var1[1]);
         var5 = Double.parseDouble(var1[2]);
         var10000 = var2;
         break;
      default:
         return null;
      }

      int var7 = (int)Math.floor(var10000);
      int var14 = (int)Math.floor(var5);
      Object var9;
      if (var4 != null) {
         int var10 = (int)Math.floor(var4);
         var9 = new GoalBlock(var7, var10, var14);
      } else {
         var9 = new GoalXZ(var7, var14);
      }

      IBaritone var11;
      IBaritoneProcess var12 = (IBaritoneProcess)(var11 = BaritoneAPI.getProvider().getPrimaryBaritone()).getPathingControlManager().mostRecentInControl().orElse((Object)null);
      ICustomGoalProcess var13 = var11.getCustomGoalProcess();
      String var15;
      Object[] var10001;
      boolean var10003;
      if (var12 != null && var12.priority() > var13.priority()) {
         var15 = o.f$E("m/<(oc<*,\u007f=x*d;f6*,e!~=e#f&d(*\rk=c;e!oo}&~'*.*'c(b*xoz=c x&~6+");
         var10001 = new Object[1];
         var10003 = true;
         var10001[0] = var12.displayName0();
         return String.format(var15, var10001);
      } else {
         var13.setGoalAndPath((Goal)var9);
         var15 = LI.f$E("JNxHmSw]9Nv\u001ai[mR9NvMxH}I9\u001fj\u0014");
         var10001 = new Object[1];
         var10003 = true;
         var10001[0] = var9;
         return String.format(var15, var10001);
      }
   }

   // $FF: synthetic method
   public String f$E() {
      return o.f$E("io\u0014}.s?e&d;Wo,xvo,*Q7WoQ5Wo,xvo,*Q7WoQ6WoQ5W");
   }

   // $FF: synthetic method
   public ej() {
      String[] var10001 = new String[2];
      boolean var10003 = true;
      var10001[0] = LI.f$E("^UmU");
      var10001[1] = o.f$E("\u001fk;b");
      super(var10001);
   }
}
