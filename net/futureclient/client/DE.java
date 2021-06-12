package net.futureclient.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public final class DE implements IMixinConfigPlugin {
   // $FF: synthetic field
   private final AtomicBoolean f$M;
   // $FF: synthetic field
   private boolean f$g;
   // $FF: synthetic field
   private Je f$d;

   // $FF: synthetic method
   public void postApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   // $FF: synthetic method
   public void acceptTargets(Set<String> var1, Set<String> var2) {
   }

   // $FF: synthetic method
   public void preApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   // $FF: synthetic method
   public DE() {
      boolean var10005 = true;
      this.f$M = new AtomicBoolean(true);
   }

   // $FF: synthetic method
   public boolean shouldApplyMixin(String var1, String var2) {
      if (!this.f$d.equals(Je.f$I)) {
         boolean var10002 = true;
         return true;
      } else {
         boolean var10003 = true;
         if (this.f$M.getAndSet(false)) {
            try {
               String var38 = this.getClass().getResourceAsStream(jI.f$E("Nc\u0002E\u0000X\u001bEEm-s>"));
               var2 = null;

               InputStream var39;
               label290: {
                  Throwable var10000;
                  try {
                     try {
                        if (var38 == null) {
                           try {
                              InputStream var3 = this.getClass().getResourceAsStream(wG.f$E("\u0014\u0015U\u0004\u0005\u0005\u0000DT\u001b[\u001cRXx\u0014^\u0016C\r^Sv;h("));
                              Object var4 = null;

                              try {
                                 try {
                                    if (var3 != null) {
                                       this.f$g = true;
                                    }
                                 } catch (Throwable var32) {
                                    throw var32;
                                 }
                              } catch (Throwable var33) {
                                 if (var3 != null) {
                                    if (var4 != null) {
                                       try {
                                          var3.close();
                                       } catch (Throwable var31) {
                                          var10000 = var33;
                                          ((Throwable)var4).addSuppressed(var31);
                                          throw var10000;
                                       }

                                       var10000 = var33;
                                       throw var10000;
                                    }

                                    var3.close();
                                 }

                                 var10000 = var33;
                                 throw var10000;
                              }

                              if (var3 != null) {
                                 if (var4 != null) {
                                    try {
                                       var3.close();
                                    } catch (Throwable var29) {
                                       ((Throwable)var4).addSuppressed(var29);
                                    }
                                 } else {
                                    var3.close();
                                 }
                              }
                           } catch (IOException var34) {
                              var39 = var38;
                              var34.printStackTrace();
                              break label290;
                           }
                        } else {
                           this.f$g = true;
                        }
                     } catch (Throwable var35) {
                        throw var35;
                     }
                  } catch (Throwable var36) {
                     if (var38 != null) {
                        if (var2 != null) {
                           try {
                              var38.close();
                           } catch (Throwable var30) {
                              var10000 = var36;
                              var2.addSuppressed(var30);
                              throw var10000;
                           }

                           var10000 = var36;
                           throw var10000;
                        }

                        var38.close();
                     }

                     var10000 = var36;
                     throw var10000;
                  }

                  var39 = var38;
               }

               if (var39 != null) {
                  if (var2 != null) {
                     try {
                        var38.close();
                     } catch (Throwable var28) {
                        var2.addSuppressed(var28);
                     }
                  } else {
                     var38.close();
                  }
               }
            } catch (IOException var37) {
               var37.printStackTrace();
            }
         }

         return this.f$g;
      }
   }

   // $FF: synthetic method
   public List<String> getMixins() {
      return null;
   }

   // $FF: synthetic method
   public String getRefMapperConfig() {
      return null;
   }

   // $FF: synthetic method
   public void onLoad(String var1) {
      this.f$d = Je.f$E(var1);
   }
}
