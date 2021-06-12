package net.futureclient.client;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Level;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class Xc {
   // $FF: synthetic field
   private float f$l;
   // $FF: synthetic field
   private final int f$a;
   // $FF: synthetic field
   private static int f$j = -1;
   // $FF: synthetic field
   private static int f$d = -1;
   // $FF: synthetic field
   private final int f$c;
   // $FF: synthetic field
   private int f$K = -1;
   // $FF: synthetic field
   private final int f$B;
   // $FF: synthetic field
   private int f$e = -1;
   // $FF: synthetic field
   private static int f$g = -1;
   // $FF: synthetic field
   private int f$L;
   // $FF: synthetic field
   private int f$I = -1;
   // $FF: synthetic field
   private static int f$b = -1;
   // $FF: synthetic field
   private final int f$A;
   // $FF: synthetic field
   private final int f$C;
   // $FF: synthetic field
   private static int f$i = -1;
   // $FF: synthetic field
   private static int f$M = -1;

   // $FF: synthetic method
   public Xc(int var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      this.f$c = var1;
      this.f$A = var2;
      this.f$B = var3;
      this.f$a = var4;
      this.f$C = var5;
      this.f$l = var6;
      this.f$L = var7;
      this.f$a();
      this.f$E();
   }

   // $FF: synthetic method
   public void f$e() {
      if (this.f$K > -1) {
         EXTFramebufferObject.glDeleteRenderbuffersEXT(this.f$K);
      }

      if (this.f$I > -1) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(this.f$I);
      }

      if (this.f$e > -1) {
         GL11.glDeleteTextures(this.f$e);
      }

   }

   // $FF: synthetic method
   private void f$a() {
      this.f$I = EXTFramebufferObject.glGenFramebuffersEXT();
      this.f$e = GL11.glGenTextures();
      this.f$K = EXTFramebufferObject.glGenRenderbuffersEXT();
      GL11.glBindTexture(3553, this.f$e);
      GL11.glTexParameterf(3553, 10241, 9729.0F);
      GL11.glTexParameterf(3553, 10240, 9729.0F);
      GL11.glTexParameterf(3553, 10242, 10496.0F);
      GL11.glTexParameterf(3553, 10243, 10496.0F);
      GL11.glBindTexture(3553, 0);
      GL11.glBindTexture(3553, this.f$e);
      GL11.glTexImage2D(3553, 0, 32856, this.f$A, this.f$B, 0, 6408, 5121, (ByteBuffer)null);
      EXTFramebufferObject.glBindFramebufferEXT(36160, this.f$I);
      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, this.f$e, 0);
      EXTFramebufferObject.glBindRenderbufferEXT(36161, this.f$K);
      EXTFramebufferObject.glRenderbufferStorageEXT(36161, 34041, this.f$A, this.f$B);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, this.f$K);
   }

   // $FF: synthetic method
   public Xc f$E(int var1) {
      this.f$L = var1;
      return this;
   }

   // $FF: synthetic method
   private void f$E() {
      if (f$i == -1) {
         f$i = ARBShaderObjects.glCreateProgramObjectARB();

         try {
            if (f$b == -1) {
               String var1 = hH.f$E("M~\u000bz\u001da\u0001fN9\\8N\u0002\u0018g\u0007lNe\u000fa\u0000 G(\u0015(do\u0002W:m\u0016K\u0001g\u001cl583(S(\td1E\u001bd\u001aa:m\u0016K\u0001g\u001cl^3N\u0002\td1X\u0001{\u0007|\u0007g\u0000(S(\td1E\u0001l\u000bd8a\u000b\u007f>z\u0001b\u000bk\u001aa\u0001f#i\u001az\u0007pN\"No\u0002W8m\u001c|\u000bpU(du");
            }

            if (f$j == -1) {
               f$j = Wh.f$E(mI.f$E("%ockupiw&(4)&\u0013swo\u007fikk9uxkij|t+B9Bp`\u007fsjcJgtv|t\"&\u0013swo\u007fikk9p|e+&McacuUp||=9\flhp`vtt&phm&JgtvucKg}olu\"&\u0013pvo}&tgph1/9}9\focz29e|hmckEvj9;9r|~mskc+B1Bp`\u007fsjcJgtv|t5&~jFR|~Zivt}])[7um/\"&\u0013o\u007f&1e|hmckEvj7g9'$&)()@0&b&\u0013auY_txaZiuik&$&ocz2165&)*965&)/\"&\u0013t|rltw=9\fd&\u0013`uixr9euijcjr9;9Uxkij|Txbpsj&3&+()@9-9476_=9\f\u007fik&1owr9~v&$&4Uxkij|Txbpsj=9~v&%;9Uxkij|Txbpsj=9~v-2/9}9\f\u007fik&1owr9\u007fv&$&4Uxkij|Txbpsj=9\u007fv&%;9Uxkij|Txbpsj=9\u007fv-2/9}9\focz29eltkEvj9;9r|~mskc+B1Bp`\u007fsjcJgtv|t5&~jFR|~Zivt}])[7um&2&ocz41~v&3&McacuUp||(a*9\u007fv&3&McacuUp||(`/0=9\fp`9.zsktZiu(k&8;9676_&ez9eltkEvj7a9'$&)()@9ze&zsktZiu({&8;9676_&ez9eltkEvj7g9'$&)()@0&b&\u0013`uixr9eltkcwr]ojr9;9uhtm.ai3~v,(()`9-9\u007fv,`i3776\u007f/\"&\u0013o\u007f&1eltkcwr]ojr9:9euijcjr0&b&\u0013euijcjr9;9eltkcwr]ojr\"&\u0013{9\fd&\u0013{9\fd&\u0013auY_txaZiuik&$&ocz2175&(*975&tga.)*9.1Uxkij|Txbpsj,(()@0&4&1euijcjr9+970/9)9.JgtvucKg}olu3776_/0/\"&\u0013{"), 35632);
            }
         } catch (Exception var2) {
            f$i = -1;
            f$b = -1;
            f$j = -1;
            var2.printStackTrace();
         }

         if (f$i != -1) {
            ARBShaderObjects.glAttachObjectARB(f$i, f$j);
            ARBShaderObjects.glLinkProgramARB(f$i);
            if (ARBShaderObjects.glGetObjectParameteriARB(f$i, 35714) == 0) {
               La.f$E().f$E(Level.ERROR, Wh.f$E(f$i));
               return;
            }

            ARBShaderObjects.glValidateProgramARB(f$i);
            if (ARBShaderObjects.glGetObjectParameteriARB(f$i, 35715) == 0) {
               La.f$E().f$E(Level.ERROR, Wh.f$E(f$i));
               return;
            }

            ARBShaderObjects.glUseProgramObjectARB(0);
            f$M = ARBShaderObjects.glGetUniformLocationARB(f$i, hH.f$E("L\u0007n\b}\u001dm=i\u0003x\u000bz"));
            f$g = ARBShaderObjects.glGetUniformLocationARB(f$i, mI.f$E("R|~|jJocc"));
            f$d = ARBShaderObjects.glGetUniformLocationARB(f$i, hH.f$E("=i\u0003x\u0002m<i\na\u001b{"));
         }
      }

   }

   // $FF: synthetic method
   public int f$E() {
      return this.f$e;
   }

   // $FF: synthetic method
   public Xc f$E() {
      if (this.f$I != -1 && this.f$K != -1 && f$i != -1) {
         EXTFramebufferObject.glBindFramebufferEXT(36160, this.f$I);
         GL11.glClear(16640);
         ARBShaderObjects.glUseProgramObjectARB(f$i);
         ARBShaderObjects.glUniform1iARB(f$M, 0);
         GL13.glActiveTexture(33984);
         GL11.glEnable(3553);
         GL11.glBindTexture(3553, this.f$c);
         FloatBuffer var1;
         (var1 = BufferUtils.createFloatBuffer(2)).position(0);
         var1.put(1.0F / (float)this.f$A * this.f$l);
         var1.put(1.0F / (float)this.f$B * this.f$l);
         var1.flip();
         ARBShaderObjects.glUniform2ARB(f$g, var1);
         IntBuffer var2;
         (var2 = BufferUtils.createIntBuffer(1)).position(0);
         var2.put(this.f$L);
         var2.flip();
         ARBShaderObjects.glUniform1ARB(f$d, var2);
         boolean var3 = true;
         GL11.glPushMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 768);
         GL11.glBegin(9);
         GL11.glTexCoord2d(0.0D, 1.0D);
         GL11.glVertex2d(0.0D, 0.0D);
         GL11.glTexCoord2d(0.0D, 0.0D);
         GL11.glVertex2d(0.0D, (double)(this.f$C * 2));
         GL11.glTexCoord2d(1.0D, 0.0D);
         GL11.glVertex2d((double)(this.f$a * 2), (double)(this.f$C * 2));
         GL11.glTexCoord2d(1.0D, 0.0D);
         GL11.glVertex2d((double)(this.f$a * 2), (double)(this.f$C * 2));
         GL11.glTexCoord2d(1.0D, 1.0D);
         GL11.glVertex2d((double)(this.f$a * 2), 0.0D);
         GL11.glTexCoord2d(0.0D, 1.0D);
         GL11.glVertex2d(0.0D, 0.0D);
         GL11.glEnd();
         GL11.glDisable(3042);
         GL11.glPopMatrix();
         ARBShaderObjects.glUseProgramObjectARB(0);
         return this;
      } else {
         throw new RuntimeException(mI.f$E("Phoguo}&PBj'"));
      }
   }

   // $FF: synthetic method
   public Xc f$E(float var1) {
      this.f$l = var1;
      return this;
   }
}
