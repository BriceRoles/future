package net.futureclient.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class og extends DataInputStream {
   // $FF: synthetic field
   private LI f$d;

   // $FF: synthetic method
   public byte[] f$E(byte[] var1) throws IOException, DataFormatException {
      Inflater var2;
      (var2 = new Inflater()).setInput(var1);
      byte[] var5 = new ByteArrayOutputStream(var1.length);
      byte[] var10000 = new byte[1024];
      boolean var10002 = true;
      byte[] var3 = var10000;
      Inflater var6 = var2;

      while(!var6.finished()) {
         var6 = var2;
         int var4 = var2.inflate(var3);
         var5.write(var3, 0, var4);
      }

      var5.close();
      return var5.toByteArray();
   }

   // $FF: synthetic method
   public <P extends WH> P f$E(Class<P> var1) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, DataFormatException {
      int var2;
      if ((var2 = this.readInt()) > 2500) {
         System.err.println(aH.f$E("h8L.K>Vg\u001e") + var2);
         throw new IOException(vH.f$E("pWC]EB\u0000BOY\u0000ZOXG\f\u0000") + var2);
      } else {
         byte[] var10000 = new byte[var2];
         boolean var10002 = true;
         byte[] var3 = var10000;
         this.readFully(var3);
         DataInputStream var10001 = new DataInputStream(new ByteArrayInputStream(var3));
         boolean var4 = var10001.readBoolean();
         byte[] var12 = new byte[var2 - 1];
         boolean var10004 = true;
         byte[] var6 = var12;
         var10001.readFully(var12);
         var6 = this.f$E(var6);
         if (var4) {
            if (this.f$d == null) {
               throw new IOException(aH.f$E("\tV4M}N<]6[)\u001e4M}[3]/G-J8Z"));
            }

            try {
               var6 = this.f$d.f$E(var6);
            } catch (Exception var5) {
               throw new IOException(vH.f$E("aRYNQ\u0000FAESAODD"));
            }

            var6 = this.f$E(var6);
         }

         DataInputStream var7 = new DataInputStream(new ByteArrayInputStream(var6));
         var7.readInt();
         Class[] var10 = new Class[0];
         boolean var10003 = true;
         Constructor var8 = var1.getConstructor(var10);
         var8.setAccessible(true);
         Object[] var11 = new Object[0];
         var10003 = true;
         WH var9 = (WH)var8.newInstance(var11);
         var9.f$E(var7);
         return var9;
      }
   }

   // $FF: synthetic method
   public og(InputStream var1) {
      super(var1);
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = (new StringBuffer(var10003.getClassName())).insert(0, var10003.getMethodName()).toString();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = 1 << 3 ^ 2;
      int var10004 = 2 << 3 ^ 5;
      int var10006 = (var0 = (String)var0).length();
      char[] var10007 = new char[var10006];
      boolean var10009 = true;
      int var1;
      int var10005 = var1 = var10006 - 1;
      char[] var3 = var10007;
      byte var7 = 3;
      int var4 = var11;
      var10 = 2.0F;
      int var2;
      int var5 = var2 = var10001;
      int var8 = var10005;

      for(String var6 = var10000; var8 >= 0; var8 = var1) {
         var11 = var1--;
         var3[var11] = (char)(var4 ^ var0.charAt(var11) ^ var6.charAt(var2));
         if (var1 < 0) {
            break;
         }

         var10001 = var1;
         char var10002 = (char)(var7 ^ var0.charAt(var1) ^ var6.charAt(var2));
         --var1;
         --var2;
         var3[var10001] = var10002;
         if (var2 < 0) {
            var2 = var5;
         }
      }

      return new String(var3);
   }

   // $FF: synthetic method
   public TI f$E() throws IOException, DataFormatException {
      int var1;
      if ((var1 = this.readInt()) > 2500) {
         System.err.println(aH.f$E("h8L.K>Vg\u001e") + var1);
         throw new IOException(vH.f$E("pWC]EB\u0000BOY\u0000ZOXG\f\u0000") + var1);
      } else {
         byte[] var10000 = new byte[var1];
         boolean var10002 = true;
         byte[] var2 = var10000;
         this.readFully(var2);
         DataInputStream var10001 = new DataInputStream(new ByteArrayInputStream(var2));
         boolean var3 = var10001.readBoolean();
         byte[] var8 = new byte[var1 - 1];
         boolean var10004 = true;
         byte[] var5 = var8;
         var10001.readFully(var8);
         var5 = this.f$E(var5);
         if (var3) {
            if (this.f$d == null) {
               throw new IOException(aH.f$E("\tV4M}N<]6[)\u001e4M}[3]/G-J8Z"));
            }

            try {
               var5 = this.f$d.f$E(var5);
            } catch (Exception var4) {
               throw new IOException(vH.f$E("aRYNQ\u0000FAESAODD"));
            }

            var5 = this.f$E(var5);
         }

         DataInputStream var6;
         int var7 = (var6 = new DataInputStream(new ByteArrayInputStream(var5))).readInt();
         return new TI(var7, var6);
      }
   }

   // $FF: synthetic method
   public og(InputStream var1, String var2) {
      super(var1);
      this.f$d = new LI(var2);
   }
}
