package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class jb extends Ba {
   // $FF: synthetic field
   private final List<SoundEvent> f$d;

   // $FF: synthetic method
   public jb() {
      String var10001 = GA.f$E("0~*y\u000b\u007f\u0007@H!");
      boolean var10004 = true;
      String[] var10002 = new String[5];
      var10004 = true;
      boolean var10006 = true;
      var10002[0] = EH.f$E("\u000f3\u00154428\rwl");
      var10006 = true;
      var10002[1] = GA.f$E("_\u0016E\tp\u0013@H!");
      var10006 = true;
      var10002[2] = EH.f$E("\u0011%\u0012e|(,\u00154428\rwl");
      var10006 = true;
      var10002[3] = GA.f$E("j*\nx*y\u000b\u007f\u0007@H!");
      var10006 = true;
      var10002[4] = EH.f$E("\u001e$#}Z6=6\u001e9,0.\u007f\u007f");
      boolean var10005 = true;
      super(var10001, var10002, true, -51200, JD.f$b);
      boolean var10003 = true;
      SoundEvent[] var1 = new SoundEvent[7];
      var10003 = true;
      var10005 = true;
      var1[0] = SoundEvents.field_187719_p;
      var10005 = true;
      var1[1] = SoundEvents.field_191258_p;
      var10005 = true;
      var1[2] = SoundEvents.field_187716_o;
      var10005 = true;
      var1[3] = SoundEvents.field_187725_r;
      var10005 = true;
      var1[4] = SoundEvents.field_187722_q;
      var10005 = true;
      var1[5] = SoundEvents.field_187713_n;
      var10005 = true;
      var1[6] = SoundEvents.field_187728_s;
      this.f$d = Arrays.asList(var1);
      var10003 = true;
      Ha[] var2 = new Ha[1];
      var10003 = true;
      var10005 = true;
      var2[0] = new lA(this);
      this.f$E(var2);
   }

   // $FF: synthetic method
   public static List f$E(jb var0) {
      return var0.f$d;
   }
}
