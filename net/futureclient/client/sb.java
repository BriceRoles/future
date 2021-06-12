package net.futureclient.client;

import java.awt.TrayIcon.MessageType;
import net.minecraft.network.play.server.SPacketChat;
import org.lwjgl.opengl.Display;

public class sb extends Ha<jf> {
   // $FF: synthetic field
   public final DC f$d;

   // $FF: synthetic method
   public void f$E(jf var1) {
      if (var1.f$E() instanceof SPacketChat && !Display.isActive()) {
         sb var10000;
         String var2;
         label43: {
            label42: {
               var2 = ((SPacketChat)var1.f$E()).func_148915_c().func_150254_d();
               if ((Boolean)this.f$d.f$H.f$E() && !var2.contains(OI.f$E("Ð\n"))) {
                  String var10001 = LI.f$E("9\u001fj\u001a");
                  Object[] var10002 = new Object[1];
                  boolean var10004 = true;
                  var10002[0] = DC.f$E().field_71439_g.func_70005_c_();
                  if (var2.contains(String.format(var10001, var10002))) {
                     if (!DC.f$B() && DC.f$e(this.f$d).f$E(10000L)) {
                        kH.f$E().f$E().f$g.displayMessage(OI.f$E(" \u0016\u0003\u0012N\u0014\u000f\u001b\u0002\u0012\nW\u0007\u0019N\u0014\u0006\u0016\u001a"), LI.f$E("cvOk\u001aw[t_9RxI9X|_w\u001anHpNm_w\u001apT9Yq[m\u0014"), MessageType.NONE);
                        if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                           DC.f$B(true);
                           var10000 = this;
                           break label43;
                        }
                     }
                     break label42;
                  }
               }

               DC.f$B(false);
            }

            var10000 = this;
         }

         if ((Boolean)var10000.f$d.f$E.f$E() && var2.contains(OI.f$E("Ð\n")) && var2.contains(LI.f$E("\u001anRpIi_kI#\u001a"))) {
            if (!DC.f$e() && DC.f$a(this.f$d).f$E(10000L)) {
               kH.f$E().f$E().f$g.displayMessage(OI.f$E("'\u001c\u001e\u0018\u0016\u001a\u0012N\u001a\u000b\u0004\u001d\u0016\t\u0012N\u0005\u000b\u0014\u000b\u001e\u0018\u0012\n"), LI.f$E("@Ul\u001aq[o_9H|Y|So_}\u001ax\u001aiHpLxN|\u001at_jIx]|\u0014"), MessageType.NONE);
               if (((gC)DC.f$E(this.f$d).f$E()).equals(gC.f$M)) {
                  DC.f$K(true);
                  return;
               }
            }
         } else {
            DC.f$K(false);
         }
      }

   }

   // $FF: synthetic method
   public sb(DC var1) {
      this.f$d = var1;
   }
}
