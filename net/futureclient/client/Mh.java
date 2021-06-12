package net.futureclient.client;

import baritone.api.Settings;
import baritone.api.Settings.Setting;
import baritone.api.utils.SettingsUtil;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public class Mh extends ma {
   // $FF: synthetic field
   private final z<Boolean> f$f;
   // $FF: synthetic field
   private final List<z> f$j;
   // $FF: synthetic field
   private final z<Boolean> f$G;
   // $FF: synthetic field
   private final z<Boolean> f$m;
   // $FF: synthetic field
   private final z<Boolean> f$D;
   // $FF: synthetic field
   public final CI f$d;
   // $FF: synthetic field
   private final z<Boolean> f$a;
   // $FF: synthetic field
   private final z<Boolean> f$I;
   // $FF: synthetic field
   private final z<Boolean> f$k;
   // $FF: synthetic field
   private final z<Boolean> f$e;
   // $FF: synthetic field
   private final List<z> f$M;
   // $FF: synthetic field
   private final z<Boolean> f$K;
   // $FF: synthetic field
   private final s f$h;
   // $FF: synthetic field
   private final z<Boolean> f$l;
   // $FF: synthetic field
   private final z<Boolean> f$F;
   // $FF: synthetic field
   private final z<Boolean> f$b;
   // $FF: synthetic field
   private final z<Boolean> f$E;
   // $FF: synthetic field
   private final z<Boolean> f$C;
   // $FF: synthetic field
   private final z<Boolean> f$H;
   // $FF: synthetic field
   private final z<Boolean> f$c;
   // $FF: synthetic field
   public final Settings f$g;
   // $FF: synthetic field
   private final List<z> f$i;
   // $FF: synthetic field
   private final z<Boolean> f$A;
   // $FF: synthetic field
   private final z<Boolean> f$B;
   // $FF: synthetic field
   private final z<Boolean> f$J;
   // $FF: synthetic field
   private final z<Boolean> f$L;

   // $FF: synthetic method
   public static z f$a(Mh var0) {
      return var0.f$G;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static s f$E(Mh var0) {
      return var0.f$h;
   }

   // $FF: synthetic method
   public Mh(CI var1, String var2, String[] var3, Settings var4) {
      super(var2, var3);
      this.f$d = var1;
      this.f$g = var4;
      Boolean var10003 = true;
      String[] var10004 = new String[5];
      boolean var10006 = true;
      var10004[0] = ph.f$E("R\u001ay[N\u001ak\b{");
      var10004[1] = Bh.f$E(":\f1\u001d7\u0018%\b");
      var10004[2] = ph.f$E("\u0017n\u001ak\b{");
      var10004[3] = Bh.f$E(":\f1\u001d");
      var10004[4] = ph.f$E("\u0017n");
      this.f$G = new z(var10003, var10004);
      Double var5 = 5.0D;
      Double var7 = 1.0D;
      Double var10005 = 10.0D;
      Double var8 = 1.0D;
      String[] var10007 = new String[5];
      boolean var10009 = true;
      var10007[0] = Bh.f$E("\u001a\f1M\u0002\u0004;\b");
      var10007[1] = ph.f$E("r\u001ay\u000fw\u0016{");
      var10007[2] = Bh.f$E("\u0001\"\u0004;\b");
      var10007[3] = ph.f$E("\u0017\u007f\u001cj");
      var10007[4] = Bh.f$E(":\u0019");
      this.f$h = new s(var5, var7, var10005, var8, var10007);
      var10003 = true;
      var10004 = new String[5];
      var10006 = true;
      var10004[0] = ph.f$E("8q\u0016|\u001aj[N\u001ak\b{");
      var10004[1] = Bh.f$E("\u000e9\u00004\f\"\u001d7\u0018%\b");
      var10004[2] = ph.f$E("\u0018n\u001ak\b{");
      var10004[3] = Bh.f$E("\u000e9\u00004\f\"\u001d");
      var10004[4] = ph.f$E("\u0018n");
      this.f$f = new z(var10003, var10004);
      Setting var6 = this.f$g.allowPlace;
      var10004 = new String[2];
      var10006 = true;
      var10004[0] = Bh.f$E("=:\f5\b");
      var10004[1] = ph.f$E("n");
      this.f$k = new fj(var6, var10004);
      var6 = this.f$g.allowBreak;
      var10004 = new String[2];
      var10006 = true;
      var10004[0] = Bh.f$E("/$\b7\u0006");
      var10004[1] = ph.f$E("|");
      this.f$F = new fj(var6, var10004);
      var6 = this.f$g.allowSprint;
      var10004 = new String[2];
      var10006 = true;
      var10004[0] = Bh.f$E("\u0005\u001d$\u00048\u0019");
      var10004[1] = ph.f$E("m");
      this.f$J = new fj(var6, var10004);
      var6 = this.f$g.allowInventory;
      var10004 = new String[4];
      var10006 = true;
      var10004[0] = Bh.f$E("8%\bv$8\u001b3\u0003\"\u0002$\u0014");
      var10004[1] = ph.f$E(".m\u001eW\u0015h\u001ep\u000fq\tg");
      var10004[2] = Bh.f$E("\u00048\u001b3\u0003\"\u0002$\u0014");
      var10004[3] = ph.f$E("w");
      this.f$E = new fj(var6, var10004);
      var6 = this.f$g.allowVines;
      var10004 = new String[2];
      var10006 = true;
      var10004[0] = Bh.f$E(";?\u00033\u001e");
      var10004[1] = ph.f$E("h");
      this.f$H = new fj(var6, var10004);
      var6 = this.f$g.allowJumpAt256;
      var10004 = new String[4];
      var10006 = true;
      var10004[0] = Bh.f$E("'#\u0000&M\u0017\u0019v_c[");
      var10004[1] = ph.f$E("T\u000es\u000b_\u000f,N(");
      var10004[2] = Bh.f$E("<\f");
      var10004[3] = ph.f$E("t\u001a,N(");
      this.f$m = new fj(var6, var10004);
      var6 = this.f$g.allowParkour;
      var10004 = new String[2];
      var10006 = true;
      var10004[0] = Bh.f$E("=7\u001f=\u0002#\u001f");
      var10004[1] = ph.f$E("n");
      this.f$D = new fj(var6, var10004);
      var6 = this.f$g.allowParkourPlace;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = Bh.f$E("=7\u001f=\u0002#\u001fv=:\f5\b");
      var10004[1] = ph.f$E("+\u007f\tu\u0014k\tN\u0017\u007f\u0018{");
      var10004[2] = Bh.f$E("&\u001d");
      this.f$l = new fj(var6, var10004);
      var6 = this.f$g.allowParkourAscend;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = ph.f$E("+\u007f\tu\u0014k\t>:m\u0018{\u0015z");
      var10004[1] = Bh.f$E("=7\u001f=\u0002#\u001f\u0017\u001e5\b8\t");
      var10004[2] = ph.f$E("\u000b\u007f");
      this.f$L = new fj(var6, var10004);
      var6 = this.f$g.allowDiagonalAscend;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = Bh.f$E(")?\f1\u00028\f:M\u0017\u001e5\b8\t");
      var10004[1] = ph.f$E("?w\u001ay\u0014p\u001ar:m\u0018{\u0015z");
      var10004[2] = Bh.f$E("2\f");
      this.f$c = new fj(var6, var10004);
      var6 = this.f$g.allowDiagonalDescend;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = ph.f$E("?w\u001ay\u0014p\u001ar[Z\u001em\u0018{\u0015z");
      var10004[1] = Bh.f$E(")?\f1\u00028\f:)3\u001e5\b8\t");
      var10004[2] = ph.f$E("\u001fz");
      this.f$A = new fj(var6, var10004);
      var6 = this.f$g.allowDownward;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = Bh.f$E(" ?\u00033M\u0012\u0002!\u0003!\f$\t");
      var10004[1] = ph.f$E("6w\u0015{?q\fp\f\u007f\tz");
      var10004[2] = Bh.f$E(";\t");
      this.f$B = new fj(var6, var10004);
      var6 = this.f$g.legitMine;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = ph.f$E("7{\u001cw\u000f>6w\u0015{");
      var10004[1] = Bh.f$E("!3\n?\u0019\u001b\u00048\b");
      var10004[2] = ph.f$E("\u0017s");
      this.f$a = new fj(var6, var10004);
      var6 = this.f$g.disconnectOnArrival;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = Bh.f$E("\u001a\u00021M\u0019\u0003v,$\u001f?\u001b7\u0001");
      var10004[1] = ph.f$E("7q\u001cQ\u0015_\tl\u0012h\u001ar");
      var10004[2] = Bh.f$E("\u00019\f");
      this.f$C = new fj(var6, var10004);
      var6 = this.f$g.freeLook;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = ph.f$E("X\t{\u001e>7q\u0014u");
      var10004[1] = Bh.f$E("\u0010\u001f3\b\u001a\u00029\u0006");
      var10004[2] = ph.f$E("\u001dr");
      this.f$e = new fj(var6, var10004);
      var6 = this.f$g.antiCheatCompatibility;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = Bh.f$E(",8\u0019?.>\b7\u0019");
      var10004[1] = ph.f$E("\u001a}");
      var10004[2] = Bh.f$E("\f");
      this.f$I = new fj(var6, var10004);
      var6 = this.f$g.censorCoordinates;
      var10004 = new String[4];
      var10006 = true;
      var10004[0] = ph.f$E("]\u001ep\bq\t>8q\u0014l\u001fm");
      var10004[1] = Bh.f$E("\u0015\b8\u001e9\u001f\u0015\u00029\u001f2\u001e");
      var10004[2] = ph.f$E("8q\u0014l\u001fm8{\u0015m\u0014l");
      var10004[3] = Bh.f$E("5\u000e");
      this.f$K = new fj(var6, var10004);
      var6 = this.f$g.chatDebug;
      var10004 = new String[3];
      var10006 = true;
      var10004[0] = ph.f$E("8v\u001aj[Z\u001e|\u000ey");
      var10004[1] = Bh.f$E(".>\f\")3\u000f#\n");
      var10004[2] = ph.f$E("\u0018z");
      this.f$b = new fj(var6, var10004);
      this.f$j = new ArrayList();
      this.f$i = new ArrayList();
      this.f$M = new ArrayList();
      this.f$j.add(this.f$G);
      this.f$j.add(this.f$h);
      this.f$j.add(this.f$f);
      this.f$M.addAll(this.f$j);
      this.f$i.add(this.f$k);
      this.f$i.add(this.f$F);
      this.f$i.add(this.f$J);
      this.f$i.add(this.f$E);
      this.f$i.add(this.f$H);
      this.f$i.add(this.f$m);
      this.f$i.add(this.f$D);
      this.f$i.add(this.f$l);
      this.f$i.add(this.f$L);
      this.f$i.add(this.f$c);
      this.f$i.add(this.f$A);
      this.f$i.add(this.f$B);
      this.f$i.add(this.f$a);
      this.f$i.add(this.f$C);
      this.f$i.add(this.f$e);
      this.f$i.add(this.f$I);
      this.f$i.add(this.f$K);
      this.f$i.add(this.f$b);
      this.f$M.addAll(this.f$i);
      this.f$a(this.f$M);
      kH.f$E().f$E().f$a(new pI(this));
      kH.f$E().f$E().f$a(new dh(this));
   }

   // $FF: synthetic method
   public static z f$E(Mh var0) {
      return var0.f$f;
   }

   // $FF: synthetic method
   public void f$a() {
      this.f$a(this.f$j);
      super.f$a();
      this.f$a(this.f$M);
      SettingsUtil.save(this.f$g);
   }

   // $FF: synthetic method
   public void f$e() {
      this.f$a(this.f$j);
      super.f$e();
      this.f$a(this.f$M);
      SettingsUtil.readAndApply(this.f$g);
   }
}
