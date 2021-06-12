package net.futureclient.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import net.futureclient.loader.injector.Injector;
import net.minecraft.entity.player.EntityPlayer;

public final class ii implements P {
   // $FF: synthetic field
   private static final Set<String> f$g = new HashSet();
   /** @deprecated */
   // $FF: synthetic field
   @Deprecated
   private static final Function<String, String> f$d = (var0x) -> {
      try {
         MessageDigest var10000 = MessageDigest.getInstance(PI.f$E("gju\u000f\u0005"));
         var10000.update(var0x.getBytes(StandardCharsets.UTF_8));
         byte[] var2 = var10000.digest();
         StringBuilder var3 = new StringBuilder();
         int var4 = (var2 = var2).length;

         int var5;
         for(int var7 = var5 = 0; var7 < var4; var7 = var5) {
            String var10001 = Integer.toString((var2[var5] & 255) + 256, 16);
            ++var5;
            var3.append(var10001.substring(1));
         }

         return var3.toString();
      } catch (Exception var6) {
         return null;
      }
   };
   // $FF: synthetic field
   private static final boolean f$M = false;

   // $FF: synthetic method
   public boolean f$E(EntityPlayer var1) {
      return f$g.contains(f$d.apply(var1.func_110124_au().toString()));
   }

   static {
      try {
         InputStream var0 = ii.class.getResourceAsStream(Injector.f$E("v\u00038\u001d6\u0000*"));
         Object var1 = null;

         try {
            try {
               if (var0 != null) {
                  BufferedReader var2 = new BufferedReader(new InputStreamReader(var0));

                  String var3;
                  while((var3 = var2.readLine()) != null) {
                     f$g.add(var3);
                  }
               }
            } catch (Throwable var12) {
               throw var12;
            }
         } catch (Throwable var13) {
            Throwable var10000;
            label104: {
               if (var0 != null) {
                  if (var1 != null) {
                     try {
                        var0.close();
                     } catch (Throwable var11) {
                        var10000 = var13;
                        ((Throwable)var1).addSuppressed(var11);
                        break label104;
                     }

                     var10000 = var13;
                     break label104;
                  }

                  var0.close();
               }

               var10000 = var13;
            }

            throw var10000;
         }

         if (var0 != null) {
            if (var1 != null) {
               try {
                  var0.close();
                  return;
               } catch (Throwable var10) {
                  ((Throwable)var1).addSuppressed(var10);
                  return;
               }
            }

            var0.close();
            return;
         }
      } catch (Exception var14) {
         var14.printStackTrace();
      }

   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      PrintStream var10001 = System.out;
      f$g.forEach(var10001::println);
   }

   // $FF: synthetic method
   public String f$E() {
      return Injector.f$E("-\u000b!\u001a,\u001c<\u001dv\b,\u001a,\u001c<A*\u00030\fv\r8\u001e<@)\u0000>");
   }
}
