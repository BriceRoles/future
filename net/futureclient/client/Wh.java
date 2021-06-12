package net.futureclient.client;

import java.nio.ByteBuffer;
import org.apache.logging.log4j.Level;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public abstract class Wh {
   // $FF: synthetic field
   private int f$b = -1;
   // $FF: synthetic field
   public final int f$K;
   // $FF: synthetic field
   private String f$A;
   // $FF: synthetic field
   public final int f$C;
   // $FF: synthetic field
   public final int f$a;
   // $FF: synthetic field
   private int f$M = -1;
   // $FF: synthetic field
   private int f$g = -1;
   // $FF: synthetic field
   private String f$B;
   // $FF: synthetic field
   public int f$i = -1;
   // $FF: synthetic field
   public int f$d = -1;
   // $FF: synthetic field
   public int f$j = -1;
   // $FF: synthetic field
   public static final double f$c = 2.0D;
   // $FF: synthetic field
   public final int f$e;
   // $FF: synthetic field
   public final int f$I;

   // $FF: synthetic method
   public int f$E(String var1) {
      return ARBShaderObjects.glGetUniformLocationARB(this.f$d, var1);
   }

   // $FF: synthetic method
   public void f$B() {
      GL11.glScaled(0.5D, 0.5D, 0.5D);
      GL11.glDisable(3553);
      GL11.glBegin(4);
      GL11.glTexCoord2d(0.0D, 1.0D);
      GL11.glVertex2d(0.0D, 0.0D);
      GL11.glTexCoord2d(0.0D, 0.0D);
      GL11.glVertex2d(0.0D, (double)this.f$K);
      GL11.glTexCoord2d(1.0D, 0.0D);
      GL11.glVertex2d((double)this.f$I, (double)this.f$K);
      GL11.glTexCoord2d(1.0D, 0.0D);
      GL11.glVertex2d((double)this.f$I, (double)this.f$K);
      GL11.glTexCoord2d(1.0D, 1.0D);
      GL11.glVertex2d((double)this.f$I, 0.0D);
      GL11.glTexCoord2d(0.0D, 1.0D);
      GL11.glVertex2d(0.0D, 0.0D);
      GL11.glEnd();
      GL11.glScaled(2.0D, 2.0D, 2.0D);
   }

   // $FF: synthetic method
   public static String f$E(int var0) {
      return ARBShaderObjects.glGetInfoLogARB(var0, ARBShaderObjects.glGetObjectParameteriARB(var0, 35716));
   }

   // $FF: synthetic method
   public abstract Wh f$E();

   // $FF: synthetic method
   public void f$e() {
      if (this.f$i > -1) {
         EXTFramebufferObject.glDeleteRenderbuffersEXT(this.f$i);
      }

      if (this.f$j > -1) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(this.f$j);
      }

      if (this.f$b > -1) {
         GL11.glDeleteTextures(this.f$b);
      }

   }

   // $FF: synthetic method
   private void f$K() {
      this.f$j = EXTFramebufferObject.glGenFramebuffersEXT();
      this.f$b = GL11.glGenTextures();
      this.f$i = EXTFramebufferObject.glGenRenderbuffersEXT();
      GL11.glBindTexture(3553, this.f$b);
      GL11.glTexParameterf(3553, 10241, 9729.0F);
      GL11.glTexParameterf(3553, 10240, 9729.0F);
      GL11.glTexParameterf(3553, 10242, 10496.0F);
      GL11.glTexParameterf(3553, 10243, 10496.0F);
      GL11.glBindTexture(3553, 0);
      GL11.glBindTexture(3553, this.f$b);
      GL11.glTexImage2D(3553, 0, 32856, this.f$C, this.f$e, 0, 6408, 5121, (ByteBuffer)null);
      EXTFramebufferObject.glBindFramebufferEXT(36160, this.f$j);
      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, this.f$b, 0);
      EXTFramebufferObject.glBindRenderbufferEXT(36161, this.f$i);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, this.f$C, this.f$e);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, this.f$i);
      this.f$a();
   }

   // $FF: synthetic method
   public static int f$E(String var0, int var1) throws Exception {
      byte var2 = 0;

      try {
         int var5;
         if ((var5 = ARBShaderObjects.glCreateShaderObjectARB(var1)) == 0) {
            return 0;
         } else {
            ARBShaderObjects.glShaderSourceARB(var5, var0);
            ARBShaderObjects.glCompileShaderARB(var5);
            if (ARBShaderObjects.glGetObjectParameteriARB(var5, 35713) == 0) {
               throw new RuntimeException((new StringBuilder()).insert(0, RG.f$E("\u0019U.H.\u0007?U9F(N2@|T4F8B.\u001d|")).append(f$E(var5)).toString());
            } else {
               return var5;
            }
         }
      } catch (Exception var4) {
         ARBShaderObjects.glDeleteObjectARB(var2);
         throw var4;
      }
   }

   // $FF: synthetic method
   private void f$a() {
      int var1;
      switch(var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160)) {
      case 36053:
         return;
      case 36054:
         throw new RuntimeException(RG.f$E("`\u0010x\u001au\u001dj\u0019e\ta\u001ab\u000ex\u0015i\u001fh\u0011w\u0010b\bb\u0003f\bs\u001dd\u0014j\u0019i\bx\u0019\u007f\b"));
      case 36055:
         throw new RuntimeException(yH.f$E("\u0004X\u001cR\u0011U\u000eQ\u0001A\u0005R\u0006F\u001c]\rW\fY\u0013X\u0006@\u0006K\u000e]\u0010G\nZ\u0004K\u0002@\u0017U\u0000\\\u000eQ\r@\u001cQ\u001b@"));
      case 36056:
      default:
         throw new RuntimeException((new StringBuilder()).insert(0, RG.f$E("@0d4B?L\u001aU=J9E)A:B.t(F(R/b\u0004s|U9S)U2B8\u0007)I7I3P2\u0007/S=S)Tf")).append(var1).toString());
      case 36057:
         throw new RuntimeException(yH.f$E("\u0004X\u001cR\u0011U\u000eQ\u0001A\u0005R\u0006F\u001c]\rW\fY\u0013X\u0006@\u0006K\u0007]\u000eQ\rG\n[\rG\u001cQ\u001b@"));
      case 36058:
         throw new RuntimeException(RG.f$E("\u001bk\u0003a\u000ef\u0011b\u001er\u001aa\u0019u\u0003n\u0012d\u0013j\fk\u0019s\u0019x\u001ah\u000ej\u001ds\u000fx\u0019\u007f\b"));
      case 36059:
         throw new RuntimeException(yH.f$E("S\u000fK\u0005F\u0002Y\u0006V\u0016R\u0005Q\u0011K\nZ\u0000[\u000eD\u000fQ\u0017Q\u001cP\u0011U\u0014K\u0001A\u0005R\u0006F\u001cQ\u001b@"));
      }
   }

   // $FF: synthetic method
   private void f$E() {
      if (this.f$d == -1) {
         this.f$d = ARBShaderObjects.glCreateProgramObjectARB();

         try {
            String var1;
            if (this.f$M == -1) {
               var1 = RG.f$E("\u0004*B.T5H2\u0007m\u0015l\u0007VQ3N8\u00071F5It\u000e|\\|-;K\u0003s9_\u001fH3U8|lz|\u001a|@0x\u0011R0S5s9_\u001fH3U8\u0017g\u0007V@0x\fH/N(N3I|\u001a|@0x\u0011H8B0q5B+w.H6B?S5H2j=S.N$\u0007v\u0007;K\u0003q9U(B$\u001c|-!");
               this.f$M = f$E(var1, 35633);
            }

            if (this.f$g == -1) {
               var1 = yH.f$E("`b&f0},zc%q$I\u001e6z*r,f.40u.d/q1&\u00074\u0007}%r6g&G\"y3q1/Ia-}%{1ycb&wq4\u0017q;q/G*n&/Ia-}%{1yc}-`cG\"y3x&F\"p*a0/I\u001e5{*pcy\"}-<j\u001e8\u001ec4c45q  cw&z7q1W,xc)c`&l7a1qqPkP*r%a0q\u0010u.d&fo4$x\u001c@&l\u0000{,f'OsImg7=x\u001ec4c4I4c4c}%< q-`&f\u0000{/:\"4b)c$m$\u0005=I4c4coI4c4c4c4cs/K\u0005f\"s\u0000{/{14~45q  k$o4s8c$o4s=x\u001ec4c4c4c41q7a1zx\u001ec4c4>\u001ec4c4%x,u74 x,g&g74~4\u0010u.d/q\u0011u'}6gc>c%m$\u0005/I4c4cr,fk}-`cl,4~4nG\"y3x&F\"p*a0/cl,4\u007f)cG\"y3x&F\"p*a0/cl,?h=c\u001ec4c48\u001ec4c4c4c4%{1<*z74:{c)c9\u0010u.d/q\u0011u'}6gx4:{c(~4\u0010u.d/q\u0011u'}6gx4:{h?j4I4c4c4c4coI4c4c4c4c4c4cb&ww4 a1f\u0000{/4~47q;`6f&&\u0007<\u0007}%r6g&G\"y3q18cs/K\u0017q;W,{1p\u0018$\u001e:0`c?cb&wq<;{c>c@&l&x\u0010}9qmlo4:{c>c@&l&x\u0010}9qmmj=x\u001ec4c4c4c4c4c4*rkw6f1W,xmfc5~4s:sRch?4 a1f\u0000{/:$4b)c$m$\u00054?hcw6f1W,xmvc5~4s:sRch?4 a1f\u0000{/:\"4b)c$m$\u0005=I4c4c4c4c4c4coI4c4c4c4c4c4c4c4cr/{\"`cw6f1q-`\u0007}0`c)cg2f7<;{c>cl,4h4:{c>cm,=x\u001ec4c4c4c4c4c4c4c4*rkw6f1q-`\u0007}0`c(cw/{0q0`j\u001ec4c4c4c4c4c4c4c48\u001ec4c4c4c4c4c4c4c4c4c4 x,g&g74~4 a1f&z7P*g7/I4c4c4c4c4c4c4c4ciI4c4c4c4c4c4ciI4c4c4c4ciI4c4ciI4c4cr/{\"`cyc)c&m$x\u001ec4c4%x,u74%u'qc)cy\"lk$o4k<\u0010u.d/q\u0011u'}6gc>c%m$\u0005=c9c< x,g&g74n4r=j4l4kG\"y3x&F\"p*a04i4r:sRj=x\u001ec4c4$x\u001cR1u$W,x,fc)cb&ww<.4n4%u'qo4.4n4%u'qo4.4n4%u'qo4%u'qj/Ii");
               this.f$g = f$E(var1, 35632);
            }
         } catch (Exception var2) {
            this.f$M = this.f$d = -1;
            this.f$g = -1;
            var2.printStackTrace();
         }

         if (this.f$d != -1) {
            ARBShaderObjects.glAttachObjectARB(this.f$d, this.f$M);
            ARBShaderObjects.glAttachObjectARB(this.f$d, this.f$g);
            ARBShaderObjects.glLinkProgramARB(this.f$d);
            if (ARBShaderObjects.glGetObjectParameteriARB(this.f$d, 35714) == 0) {
               La.f$E().f$E(Level.ERROR, f$E(this.f$d));
               return;
            }

            ARBShaderObjects.glValidateProgramARB(this.f$d);
            if (ARBShaderObjects.glGetObjectParameteriARB(this.f$d, 35715) == 0) {
               La.f$E().f$E(Level.ERROR, f$E(this.f$d));
               return;
            }

            ARBShaderObjects.glUseProgramObjectARB(0);
         }
      }

   }

   // $FF: synthetic method
   public Wh(String var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      this.f$A = var1;
      this.f$B = var2;
      this.f$a = var3;
      this.f$C = var4;
      this.f$e = var5;
      this.f$I = (int)((double)var6 * 2.0D);
      this.f$K = (int)((double)var7 * 2.0D);
      this.f$K();
      this.f$E();
   }

   // $FF: synthetic method
   public int f$E() {
      return this.f$b;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = 2 << 3;
      int var10001 = (2 ^ 5) << 3 ^ 5;
      int var10002 = 3 << 3 ^ 5;
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
}
