package net.futureclient.client;

import net.minecraft.client.gui.ServerListEntryLanDetected;
import net.minecraft.client.gui.ServerListEntryNormal;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.LanServerInfo;

public class WI {
   // $FF: synthetic field
   public static ServerData f$d;
   // $FF: synthetic field
   public static int f$g;

   // $FF: synthetic method
   public static void f$E(ServerData var0) {
      f$d = var0;
   }

   // $FF: synthetic method
   public static void f$E(IGuiListEntry var0) {
      if (var0 instanceof ServerListEntryNormal) {
         f$d = ((ServerListEntryNormal)var0).func_148296_a();
      } else {
         if (var0 instanceof ServerListEntryLanDetected) {
            LanServerInfo var1 = ((ServerListEntryLanDetected)var0).func_189995_a();
            f$d = new ServerData(Rg.f$E("F\bDdY,x?o;"), var1.func_77488_b(), true);
         }

      }
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = (3 ^ 5) << 3 ^ 2 ^ 5;
      int var10001 = (3 ^ 5) << 3 ^ 3;
      int var10002 = 5 << 4 ^ (2 ^ 5) << 1;
      int var10003 = (var0 = (String)var0).length();
      char[] var10004 = new char[var10003];
      boolean var10006 = true;
      int var5 = var10003 - 1;
      var10003 = var10002;
      int var3;
      var10002 = var3 = var5;
      char[] var1 = var10004;
      int var4 = var10003;
      var10000 = var10002;

      for(int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         char var6 = var0.charAt(var3);
         --var3;
         var1[var10001] = (char)(var6 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10002 = var3--;
         var1[var10002] = (char)(var0.charAt(var10002) ^ var4);
      }

      return new String(var1);
   }
}
