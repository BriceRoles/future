package net.futureclient.client;

import java.awt.TrayIcon.MessageType;
import org.lwjgl.opengl.Display;

public class Cb extends Ha<De> {
   // $FF: synthetic field
   public final DC f$d;

   // $FF: synthetic method
   public void f$E(De var1) {
      if (!Display.isActive() && (Boolean)this.f$d.f$F.f$E() && DC.f$e().func_147104_D() != null && DC.f$a().func_147104_D().field_78845_b.equalsIgnoreCase(Rg.f$E("8+8=$&x.")) && DC.f$B(this.f$d).f$E(10000L)) {
         kH.f$E().f$E().f$g.displayMessage(ni.f$E("b\u0016O\u0017D\u001aU\u001cEYU\u0016\u0001\rI\u001c\u0001\nD\u000bW\u001cS"), Rg.f$E("S&\u007fib(|,*/c'c:b,nim&c'mi~!x&\u007f.bi~!oi{<o<og"), MessageType.NONE);
      }

   }

   // $FF: synthetic method
   public Cb(DC var1) {
      this.f$d = var1;
   }
}
