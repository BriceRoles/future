package net.futureclient.client;

import java.awt.TrayIcon.MessageType;
import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import org.lwjgl.opengl.Display;

public class Oc extends Ha<ME> {
   // $FF: synthetic field
   public final DC f$d;

   // $FF: synthetic method
   public void f$E(ME var1) {
      if (Display.isActive()) {
         DC.f$K(false);
         DC.f$B(false);
         DC.f$e(false);
         DC.f$a(false);
         DC.f$E(false);
      } else {
         Oc var10000;
         label213: {
            Eb var2;
            if ((var2 = (Eb)kH.f$E().f$E().f$E(Eb.class)) != null && var2.f$E() && (Boolean)this.f$d.f$m.f$E()) {
               EnumFacing var3 = DC.f$g().field_71439_g.func_174811_aO();
               if (DC.f$m().field_71439_g.func_184187_bx() == null) {
                  if (var3.equals(EnumFacing.NORTH) && DC.f$f().field_71439_g.field_70179_y == 0.0D) {
                     if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                        DC.f$e();
                        if (DC.f$a() > 1) {
                           DC.f$E(0);
                           kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                           if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                              DC.f$e(true);
                              var10000 = this;
                              break label213;
                           }
                        }
                     }
                  } else if (var3.equals(EnumFacing.SOUTH) && DC.f$L().field_71439_g.field_70159_w == 0.0D && DC.f$i().field_71439_g.field_70179_y == 0.0D) {
                     if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                        DC.f$e();
                        if (DC.f$a() > 1) {
                           DC.f$E(0);
                           kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                           if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                              DC.f$e(true);
                              var10000 = this;
                              break label213;
                           }
                        }
                     }
                  } else if (var3.equals(EnumFacing.EAST) && DC.f$c().field_71439_g.field_70159_w == 0.0D) {
                     if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                        DC.f$e();
                        if (DC.f$a() > 1) {
                           DC.f$E(0);
                           kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                           if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                              DC.f$e(true);
                              var10000 = this;
                              break label213;
                           }
                        }
                     }
                  } else {
                     if (!var3.equals(EnumFacing.WEST) || DC.f$I().field_71439_g.field_70159_w != 0.0D) {
                        DC.f$e(false);
                        DC.f$E(0);
                        var10000 = this;
                        break label213;
                     }

                     if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                        DC.f$e();
                        if (DC.f$a() > 1) {
                           DC.f$E(0);
                           kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                           if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                              DC.f$e(true);
                              var10000 = this;
                              break label213;
                           }
                        }
                     }
                  }
               } else if (var3.equals(EnumFacing.NORTH) && DC.f$j().field_71439_g.func_184187_bx().field_70179_y == 0.0D) {
                  if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                     DC.f$e();
                     if (DC.f$a() > 1) {
                        DC.f$E(0);
                        kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                        if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                           DC.f$e(true);
                           var10000 = this;
                           break label213;
                        }
                     }
                  }
               } else if (var3.equals(EnumFacing.SOUTH) && DC.f$M().field_71439_g.func_184187_bx().field_70159_w == 0.0D && DC.f$C().field_71439_g.func_184187_bx().field_70179_y == 0.0D) {
                  if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                     DC.f$e();
                     if (DC.f$a() > 1) {
                        DC.f$E(0);
                        kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                        if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                           DC.f$e(true);
                           var10000 = this;
                           break label213;
                        }
                     }
                  }
               } else if (var3.equals(EnumFacing.EAST) && DC.f$H().field_71439_g.func_184187_bx().field_70159_w == 0.0D) {
                  if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                     DC.f$e();
                     if (DC.f$a() > 1) {
                        DC.f$E(0);
                        kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                        if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                           DC.f$e(true);
                           var10000 = this;
                           break label213;
                        }
                     }
                  }
               } else if (var3.equals(EnumFacing.WEST) && DC.f$h().field_71439_g.func_184187_bx().field_70159_w == 0.0D) {
                  if (!DC.f$h() && DC.f$h(this.f$d).f$E(2500L)) {
                     DC.f$e();
                     if (DC.f$a() > 1) {
                        DC.f$E(0);
                        kH.f$E().f$E().f$g.displayMessage(Wh.f$E("SR=QrSzXo\u001dpRkTsZ"), Bh.f$E(",#\u00199:7\u0001=M>\f%M2\b\"\b5\u00193\tv\u0019>\f\"M/\u0002#M7\u001f3M%\u0019#\u000e=C"), MessageType.NONE);
                        if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                           DC.f$e(true);
                           var10000 = this;
                           break label213;
                        }
                     }
                  }
               } else {
                  DC.f$e(false);
                  DC.f$E(0);
               }
            }

            var10000 = this;
         }

         label220: {
            if ((Boolean)var10000.f$d.f$D.f$E() && DC.f$A().field_71439_g.field_70737_aN != 0) {
               if (!DC.f$A() && DC.f$A(this.f$d).f$E(10000L)) {
                  kH.f$E().f$E().f$g.displayMessage(Wh.f$E("y|P|Zx\u001doX~XtKxY"), Bh.f$E("49\u0018v\u00057\u001b3M<\u0018%\u0019v\u00197\u00063\u0003v\t7\u00007\n3C"), MessageType.NONE);
                  if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                     DC.f$a(true);
                     var10000 = this;
                     break label220;
                  }
               }
            } else {
               DC.f$a(false);
            }

            var10000 = this;
         }

         if ((Boolean)var10000.f$d.f$l.f$E()) {
            Iterator var5 = DC.f$K().field_71441_e.field_73010_i.iterator();

            while(true) {
               while(var5.hasNext()) {
                  EntityPlayer var4;
                  if (Pg.f$E((Entity)(var4 = (EntityPlayer)((Entity)var5.next()))) && !DC.f$E(this.f$d).contains(var4) && ((Boolean)this.f$d.f$L.f$E() || !kH.f$E().f$E().f$E(var4.func_70005_c_())) && !var4.func_70005_c_().equals(DC.f$B().field_71439_g.func_70005_c_()) && !(var4 instanceof EntityPlayerSP)) {
                     if (!DC.f$K() && DC.f$K(this.f$d).f$E(10000L)) {
                        DC.f$E(this.f$d).add(var4);
                        kH.f$E().f$E().f$g.displayMessage(Wh.f$E("mq\\dXo\u001dtS=O|SzX"), (new StringBuilder()).insert(0, var4.func_70005_c_()).append(Bh.f$E("M5\f;\bv\u00048\u00199M$\b8\t3\u001fv\t?\u001e\"\f8\u000e3C")).toString(), MessageType.NONE);
                        if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                           DC.f$E(true);
                        }
                     }
                  } else {
                     DC.f$E(false);
                  }
               }

               return;
            }
         }
      }
   }

   // $FF: synthetic method
   public Oc(DC var1) {
      this.f$d = var1;
   }
}
