package net.futureclient.client;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class VH {
   // $FF: synthetic field
   private static final String f$i = "https://sessionserver.mojang.com/session/minecraft/profile/";
   // $FF: synthetic field
   private static final Map<UUID, String> f$M = new ConcurrentHashMap();
   // $FF: synthetic field
   private static final Gson f$g = new Gson();
   // $FF: synthetic field
   private static final Map<UUID, String> f$d = new ConcurrentHashMap();

   // $FF: synthetic method
   public static String f$B(UUID var0) {
      return (String)f$M.computeIfAbsent(var0, (var0x) -> {
         try {
            InputStream var1 = (new URL((new StringBuilder()).insert(0, "https://sessionserver.mojang.com/session/minecraft/profile/").append(var0x.toString().replaceAll(vH.f$E("\r"), "")).toString())).openStream();
            Object var2 = null;

            label129: {
               String var4;
               try {
                  try {
                     JsonElement var3;
                     if ((var3 = ((JsonObject)f$g.fromJson(new String(Dh.f$g.f$E(var1)), JsonObject.class)).get(yH.f$E("-u.q"))) == null) {
                        break label129;
                     }

                     var4 = var3.getAsString();
                  } catch (Throwable var16) {
                     throw var16;
                  }
               } catch (Throwable var17) {
                  Throwable var10000;
                  if (var1 != null) {
                     if (var2 != null) {
                        try {
                           var1.close();
                        } catch (Throwable var15) {
                           var10000 = var17;
                           ((Throwable)var2).addSuppressed(var15);
                           throw var10000;
                        }

                        var10000 = var17;
                        throw var10000;
                     }

                     var1.close();
                  }

                  var10000 = var17;
                  throw var10000;
               }

               if (var1 != null) {
                  if (var2 != null) {
                     try {
                        var1.close();
                        return var4;
                     } catch (Throwable var13) {
                        ((Throwable)var2).addSuppressed(var13);
                        return var4;
                     }
                  }

                  var1.close();
               }

               return var4;
            }

            if (var1 != null) {
               if (var2 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var14) {
                     ((Throwable)var2).addSuppressed(var14);
                  }
               } else {
                  var1.close();
               }
            }
         } catch (Exception var18) {
         }

         return var0x.toString();
      });
   }

   // $FF: synthetic method
   public static String f$e(UUID var0) {
      return (String)f$M.getOrDefault(var0, f$d.computeIfAbsent(var0, (var0x) -> {
         sh.f$E(() -> {
            f$B(var0x);
            f$d.remove(var0x);
         });
         return var0x.toString();
      }));
   }
}
