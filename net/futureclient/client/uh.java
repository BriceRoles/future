package net.futureclient.client;

import baritone.api.pathing.goals.Goal;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;

public enum uh implements IBaritoneProcess {
   // $FF: synthetic field
   private static final PathingCommand f$g;
   // $FF: synthetic field
   f$M;

   // $FF: synthetic method
   public double priority() {
      return 1.0D;
   }

   // $FF: synthetic method
   public String displayName0() {
      return (new StringBuilder()).insert(0, kH.f$m).append(Ci.f$E("s12\u0014 \u0004")).toString();
   }

   // $FF: synthetic method
   public boolean isTemporary() {
      return true;
   }

   // $FF: synthetic method
   public void onLostControl() {
   }

   // $FF: synthetic method
   public PathingCommand onTick(boolean var1, boolean var2) {
      int var3 = new SE(var1, var2);
      kH.f$E().f$E().f$E((RF)var3);
      return f$g;
   }

   static {
      uh[] var10000 = new uh[1];
      boolean var10002 = true;
      var10000[0] = f$M;
      f$g = new PathingCommand((Goal)null, PathingCommandType.REQUEST_PAUSE);
   }

   // $FF: synthetic method
   public boolean isActive() {
      bF var1 = new bF();
      kH.f$E().f$E().f$E((RF)var1);
      return var1.f$E();
   }
}
