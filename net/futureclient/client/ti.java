package net.futureclient.client;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.WorldClient;

public class ti extends GA {
   // $FF: synthetic method
   public String f$E() {
      return PI.f$E("\u0004Qy]Ri");
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      if (var1.length == 1) {
         String[] var2 = new ServerData("", var1[0], false);
         this.f$d.field_71441_e.func_72882_A();
         this.f$d.func_71403_a((WorldClient)null);
         this.f$d.func_147108_a(new GuiConnecting(new GuiMultiplayer(new GuiMainMenu()), this.f$d, var2));
         return vH.f$E("cYNXEUT_NQ\u000e\u0018\u000e");
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   public ti() {
      String[] var10001 = new String[2];
      boolean var10003 = true;
      var10001[0] = vH.f$E("cYNXEUT");
      var10001[1] = PI.f$E("W");
      super(var10001);
   }
}
