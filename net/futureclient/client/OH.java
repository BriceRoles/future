package net.futureclient.client;

import net.minecraft.util.EnumFacing;

// $FF: synthetic class
public class OH {
   // $FF: synthetic field
   public static final int[] f$d;

   static {
      int[] var10000 = new int[EnumFacing.values().length];
      boolean var10002 = true;
      f$d = var10000;

      try {
         f$d[EnumFacing.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         f$d[EnumFacing.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         f$d[EnumFacing.EAST.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         f$d[EnumFacing.WEST.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}
