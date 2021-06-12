package net.futureclient.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public enum Dh {
   // $FF: synthetic field
   f$g;

   // $FF: synthetic method
   public byte[] f$E(String var1) {
      byte[] var10000 = new byte[var1.length() / 2];
      boolean var10002 = true;
      byte[] var2 = var10000;

      int var3;
      for(int var4 = var3 = 0; var4 < var1.length(); var4 = var3) {
         int var10001 = var3 / 2;
         byte var5 = (byte)((Character.digit(var1.charAt(var3), 16) << 4) + Character.digit(var1.charAt(var3 + 1), 16));
         var3 += 2;
         var2[var10001] = var5;
      }

      return var2;
   }

   // $FF: synthetic method
   public byte[] f$E(InputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      Object var3 = null;

      byte[] var34;
      ByteArrayOutputStream var37;
      label291: {
         Throwable var10000;
         try {
            try {
               var1 = var1;
               Object var4 = null;

               try {
                  try {
                     byte[] var35 = new byte['\uffff'];
                     boolean var10002 = true;
                     byte[] var5 = var35;
                     InputStream var36 = var1;

                     int var6;
                     while((var6 = var36.read(var5)) != -1) {
                        var36 = var1;
                        var2.write(var5, 0, var6);
                     }

                     var34 = var2.toByteArray();
                  } catch (Throwable var30) {
                     throw var30;
                  }
               } catch (Throwable var31) {
                  if (var1 != null) {
                     if (var4 != null) {
                        try {
                           var1.close();
                        } catch (Throwable var28) {
                           var10000 = var31;
                           ((Throwable)var4).addSuppressed(var28);
                           throw var10000;
                        }

                        var10000 = var31;
                        throw var10000;
                     }

                     var1.close();
                  }

                  var10000 = var31;
                  throw var10000;
               }

               if (var1 != null) {
                  if (var4 != null) {
                     try {
                        var1.close();
                     } catch (Throwable var29) {
                        var37 = var2;
                        ((Throwable)var4).addSuppressed(var29);
                        break label291;
                     }

                     var37 = var2;
                     break label291;
                  }

                  var1.close();
               }
            } catch (Throwable var32) {
               throw var32;
            }
         } catch (Throwable var33) {
            if (var2 != null) {
               if (var3 != null) {
                  try {
                     var2.close();
                  } catch (Throwable var27) {
                     var10000 = var33;
                     ((Throwable)var3).addSuppressed(var27);
                     throw var10000;
                  }

                  var10000 = var33;
                  throw var10000;
               }

               var2.close();
            }

            var10000 = var33;
            throw var10000;
         }

         var37 = var2;
      }

      if (var37 != null) {
         if (var3 != null) {
            try {
               var2.close();
               return var34;
            } catch (Throwable var26) {
               ((Throwable)var3).addSuppressed(var26);
               return var34;
            }
         }

         var2.close();
      }

      return var34;
   }

   static {
      Dh[] var10000 = new Dh[1];
      boolean var10002 = true;
      var10000[0] = f$g;
   }

   // $FF: synthetic method
   public <T> T f$E(byte[] var1) throws IOException, ClassNotFoundException {
      byte[] var33 = new ByteArrayInputStream(var1);
      Object var2 = null;

      ByteArrayInputStream var34;
      Object var5;
      label257: {
         Throwable var10000;
         try {
            try {
               ObjectInputStream var3 = new ObjectInputStream(var33);
               Object var4 = null;

               try {
                  try {
                     var5 = var3.readObject();
                  } catch (Throwable var26) {
                     throw var26;
                  }
               } catch (Throwable var29) {
                  if (var3 != null) {
                     if (var4 != null) {
                        try {
                           var3.close();
                        } catch (Throwable var28) {
                           var10000 = var29;
                           ((Throwable)var4).addSuppressed(var28);
                           throw var10000;
                        }

                        var10000 = var29;
                        throw var10000;
                     }

                     var3.close();
                  }

                  var10000 = var29;
                  throw var10000;
               }

               if (var3 != null) {
                  if (var4 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var30) {
                        var34 = var33;
                        ((Throwable)var4).addSuppressed(var30);
                        break label257;
                     }

                     var34 = var33;
                     break label257;
                  }

                  var3.close();
               }
            } catch (Throwable var31) {
               throw var31;
            }
         } catch (Throwable var32) {
            if (var33 != null) {
               if (var2 != null) {
                  try {
                     var33.close();
                  } catch (Throwable var27) {
                     var10000 = var32;
                     ((Throwable)var2).addSuppressed(var27);
                     throw var10000;
                  }

                  var10000 = var32;
                  throw var10000;
               }

               var33.close();
            }

            var10000 = var32;
            throw var10000;
         }

         var34 = var33;
      }

      if (var34 != null) {
         if (var2 != null) {
            try {
               var33.close();
               return var5;
            } catch (Throwable var25) {
               ((Throwable)var2).addSuppressed(var25);
               return var5;
            }
         }

         var33.close();
      }

      return var5;
   }
}
