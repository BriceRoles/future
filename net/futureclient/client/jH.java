package net.futureclient.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class jH extends Socket {
   // $FF: synthetic field
   private static int[] f$d;
   // $FF: synthetic field
   private int f$g;
   // $FF: synthetic field
   private String f$i;
   // $FF: synthetic field
   private qh f$M;

   // $FF: synthetic method
   private void f$e() throws IOException {
      PrintStream var1;
      PrintStream var10000 = var1 = new PrintStream(this.getOutputStream());
      var10000.println(ph.f$E("8Q5P>]/>") + this.f$i + z.f$E("L") + this.f$g + ph.f$E(">3J/NT/U/"));
      var1.println(z.f$E("Y9B\"+V") + this.f$i + ph.f$E("$") + this.f$g);
      var10000.println();
      var10000.flush();
      BufferedReader var5 = new BufferedReader(new InputStreamReader(this.getInputStream()));
      StringBuffer var3 = new StringBuffer();
      BufferedReader var9 = var5;

      String var2;
      StringBuffer var10;
      while(true) {
         if ((var2 = var9.readLine()) == null) {
            var10 = var3;
            break;
         }

         if (var2.length() == 0) {
            var10 = var3;
            break;
         }

         var3.append(var2);
         var9 = var5;
      }

      String[] var6;
      String[] var11 = var6 = var10.toString().split(z.f$E("|"))[0].trim().split(ph.f$E(">"));
      var2 = var11[0];
      int var7 = Integer.parseInt(var11[1]);
      String var8 = "";

      int var4;
      for(int var12 = var4 = 2; var12 < var6.length; var12 = var4) {
         var8 = var8 + var6[var4];
         if (var4 != var6.length - 1) {
            var8 = var8 + z.f$E("V");
         }

         ++var4;
      }

      if (var7 != 200) {
         new IOException;
         System.out.println(var8);
      }
   }

   // $FF: synthetic method
   private void f$E() throws IOException {
      DataOutputStream var1 = new DataOutputStream(this.getOutputStream());
      DataInputStream var2 = new DataInputStream(this.getInputStream());
      var1.writeByte(5);
      DataOutputStream var10000;
      if (this.f$M.f$E()) {
         var10000 = var1;
         var1.writeByte(2);
         var1.writeByte(0);
         var1.writeByte(2);
      } else {
         var10000 = var1;
         var1.writeByte(1);
         var1.writeByte(0);
      }

      var10000.flush();
      var2.readByte();
      if (var2.readByte() == 2) {
         this.f$E(var1, var2);
      }

      var1.writeByte(5);
      var1.writeByte(1);
      var1.writeByte(0);
      var1.writeByte(3);
      var1.writeByte(this.f$i.length());

      int var3;
      for(int var4 = var3 = 0; var4 < this.f$i.length(); var4 = var3) {
         var1.writeByte(this.f$i.charAt(var3++));
      }

      var1.writeShort(this.f$g);
      var1.flush();
      var2.readByte();
      var2.readByte();
      var2.readByte();
      this.f$E(var2.readByte(), var2);
      var2.readShort();
   }

   // $FF: synthetic method
   public void f$E(qh var1, int var2) throws IOException {
      this.connect(new InetSocketAddress(var1.f$E(), var1.f$E()), var2);
      switch(f$E()[var1.f$E().ordinal()]) {
      case 1:
         while(false) {
         }

         this.f$a();
         return;
      case 2:
         this.f$E();
      default:
         return;
      case 3:
         this.f$e();
      }
   }

   // $FF: synthetic method
   public void f$E(int var1) throws IOException {
      if (this.f$M == null) {
         throw new IOException(z.f$E("&c\u0019i\u000f1\u001fbV\u007f\u0003}\u001a"));
      } else {
         this.connect(new InetSocketAddress(this.f$M.f$E(), this.f$M.f$E()), var1);
         switch(f$E()[this.f$M.f$E().ordinal()]) {
         case 1:
            while(false) {
            }

            this.f$a();
            return;
         case 2:
            this.f$E();
         default:
            return;
         case 3:
            this.f$e();
         }
      }
   }

   // $FF: synthetic method
   public jH(String var1, int var2, qh var3) throws UnknownHostException, IOException {
      this.f$i = var1;
      this.f$g = var2;
      this.f$M = var3;
      this.f$E(30000);
   }

   // $FF: synthetic method
   private void f$a() throws IOException {
      DataOutputStream var1 = new DataOutputStream(this.getOutputStream());
      DataInputStream var2 = new DataInputStream(this.getInputStream());
      var1.writeByte(4);
      var1.writeByte(1);
      var1.writeShort(this.f$g);
      var1.write(InetAddress.getByName(this.f$i).getAddress());
      DataOutputStream var10000;
      if (this.f$M.f$E()) {
         var10000 = var1;
         var1.write(this.f$M.f$e().getBytes());
      } else {
         var10000 = var1;
         var1.writeByte(0);
      }

      var10000.flush();
      byte var4 = var2.readByte();
      byte var3 = var2.readByte();
      if (var4 == 0 && var3 == 90) {
         var2.readShort();
         byte[] var10001 = new byte[4];
         boolean var10003 = true;
         byte[] var5 = var10001;
         var2.read(var5);
      } else {
         throw new SocketException();
      }
   }

   // $FF: synthetic method
   public jH(String var1, int var2) throws UnknownHostException, IOException {
      this.f$i = var1;
      this.f$g = var2;
   }

   // $FF: synthetic method
   public static int[] f$E() {
      int[] var10000 = f$d;
      if (var10000 != null) {
         return var10000;
      } else {
         var10000 = new int[zh.values().length];
         boolean var10002 = true;
         int[] var0 = var10000;

         label51: {
            label50: {
               label49: {
                  boolean var10001;
                  label48: {
                     label57: {
                        label46: {
                           label45: {
                              try {
                                 var0[zh.f$g.ordinal()] = 3;
                              } catch (NoSuchFieldError var5) {
                                 try {
                                    var10000 = var0;
                                    break label45;
                                 } catch (NoSuchFieldError var4) {
                                    var10001 = false;
                                    break label46;
                                 }
                              }

                              var10000 = var0;
                           }

                           try {
                              var10000[zh.f$i.ordinal()] = 1;
                              break label57;
                           } catch (NoSuchFieldError var3) {
                              var10001 = false;
                           }
                        }

                        try {
                           var10000 = var0;
                           break label48;
                        } catch (NoSuchFieldError var2) {
                           var10001 = false;
                           break label49;
                        }
                     }

                     var10000 = var0;
                  }

                  try {
                     var10000[zh.f$M.ordinal()] = 2;
                     break label50;
                  } catch (NoSuchFieldError var1) {
                     var10001 = false;
                  }
               }

               var10000 = var0;
               break label51;
            }

            var10000 = var0;
         }

         f$d = var10000;
         return var10000;
      }
   }

   // $FF: synthetic method
   private void f$E(int var1, DataInputStream var2) throws IOException {
      byte[] var10000;
      boolean var10002;
      byte[] var3;
      if (var1 == 1) {
         var10000 = new byte[4];
         var10002 = true;
         var3 = var10000;
         var2.read(var3);
      } else if (var1 == 3) {
         byte[] var10001 = new byte[var2.readByte()];
         boolean var10003 = true;
         var2.read(var10001);
      } else {
         var10000 = new byte[16];
         var10002 = true;
         var3 = var10000;
         var2.read(var3);
      }
   }

   // $FF: synthetic method
   private void f$E(DataOutputStream var1, DataInputStream var2) throws IOException {
      int var10000 = 0;
      var1.writeByte(1);
      var1.writeByte(this.f$M.f$e().length());

      int var3;
      for(var3 = 0; var10000 < this.f$M.f$e().length(); var10000 = var3) {
         var1.writeByte(this.f$M.f$e().charAt(var3++));
      }

      var10000 = 0;
      var1.writeByte(this.f$M.f$a().length());

      for(var3 = 0; var10000 < this.f$M.f$a().length(); var10000 = var3) {
         var1.writeByte(this.f$M.f$a().charAt(var3++));
      }

      var1.flush();
      var2.readByte();
      byte var4 = var2.readByte();
      if (var4 != 0) {
         throw new SocketException(ph.f$E("8q\u000er\u001fp\\j[r\u0014y\u0012pA>") + var4);
      }
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getClassName() + var10003.getMethodName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = 2 << 3 ^ 2;
      int var10004 = 4 << 4 ^ 1 << 1;
      int var10005 = 1 << 3;
      int var10006 = (var0 = (String)var0).length();
      char[] var10007 = new char[var10006];
      boolean var10009 = true;
      int var14 = var10006 - 1;
      var10006 = var10005;
      int var1;
      var10005 = var1 = var14;
      char[] var3 = var10007;
      int var7 = var10006;
      int var4 = var10004;
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
}
