package net.futureclient.loader.injector;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.futureclient.client.Je;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

public final class Injector {
   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = 4 << 4 ^ 3 << 2 ^ 1;
      int var10001 = 5 << 4 ^ 2 << 2 ^ 1;
      int var10002 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
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

   // $FF: synthetic method
   public void load(ClassLoader var1) {
      MixinBootstrap.init();
      boolean var10002 = true;
      boolean var2 = false;

      boolean var10003;
      try {
         var10003 = true;
         Class.forName("net.minecraftforge.common.ForgeVersion", false, var1);
         var2 = true;
      } catch (Throwable var11) {
         try {
            var10003 = true;
            Class.forName("net.minecraftforge.versions.forge.ForgeVersion", false, var1);
            var2 = true;
         } catch (Throwable var10) {
         }
      }

      MixinEnvironment.getDefaultEnvironment().setObfuscationContext(var2 ? "searge" : "notch");
      MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
      Mixins.addConfiguration(Je.f$a.f$a());
      Mixins.addConfiguration(var2 ? Je.f$C.f$a() : Je.f$e.f$a());
      Mixins.addConfiguration(Je.f$I.f$a());
      var10002 = true;
      boolean var3 = false;

      boolean var16;
      label78: {
         try {
            var10003 = true;
            Class.forName("baritone.launch.BaritoneTweaker", false, var1);
            var3 = true;
         } catch (Throwable var12) {
            Throwable var13;
            for(Throwable var10000 = var13 = var12; var10000 != null; var10000 = var13 = var13.getCause()) {
               String var5 = "io.github.impactdevelopment.simpletweaker.SimpleTweaker";
               String var6 = "io.github.impactdevelopment.simpletweaker.SimpleTweaker".replace(".", "/");
               String var7;
               if ((var7 = var13.getMessage()) != null && (var7.contains("io.github.impactdevelopment.simpletweaker.SimpleTweaker") || var7.contains(var6))) {
                  var16 = var3 = true;
                  break label78;
               }
            }

            var16 = var3;
            break label78;
         }

         var16 = var3;
      }

      if (var16) {
         if (Mixins.getConfigs().stream().noneMatch((var0) -> {
            return var0.getName().equals(Je.f$b.f$a());
         })) {
            Mixins.addConfiguration(Je.f$b.f$a());
         }

         Mixins.addConfiguration(Je.f$K.f$a());
      }

      if (Boolean.getBoolean("alreadyLoadedExceptionHack")) {
         try {
            var10003 = true;
            Field var14 = Class.forName("net.minecraft.launchwrapper.LaunchClassLoader", false, this.getClass().getClassLoader()).getDeclaredField("cachedClasses");
            boolean var10005 = true;
            var14.setAccessible(true);
            Map var15 = (Map)var14.get(var1);
            var14.set(var1, new ConcurrentHashMap(var15));
         } catch (Throwable var9) {
            var9.printStackTrace();
         }
      }

      try {
         Mixins.getConfigs().stream().filter((var0) -> {
            return var0.getName().equals(Je.f$j.f$a());
         }).forEach((var0) -> {
            MixinEnvironment var10000 = var0.getEnvironment();
            boolean var10004 = true;
            var10000.setOption(MixinEnvironment.Option.DISABLE_REFMAP, true);
         });
      } catch (Throwable var8) {
         var8.printStackTrace();
      }
   }
}
