package net.futureclient.client;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class v {
   // $FF: synthetic field
   public static final int f$C = 2;
   // $FF: synthetic field
   public static final int f$j = -1;
   // $FF: synthetic field
   public static final int f$B = 0;
   // $FF: synthetic field
   private o f$g = null;
   // $FF: synthetic field
   public static final int f$K = 5;
   // $FF: synthetic field
   private LinkedList f$i;
   // $FF: synthetic field
   private w f$M = new w((Reader)null);
   // $FF: synthetic field
   public static final int f$a = 1;
   // $FF: synthetic field
   private int f$d = 0;
   // $FF: synthetic field
   public static final int f$b = 6;
   // $FF: synthetic field
   public static final int f$e = 3;
   // $FF: synthetic field
   public static final int f$I = 4;

   // $FF: synthetic method
   public void f$E(String var1, m var2, boolean var3) throws r {
      StringReader var5 = new StringReader(var1);

      try {
         this.f$E((Reader)var5, var2, var3);
      } catch (IOException var4) {
         throw new r(-1, 2, var4);
      }
   }

   // $FF: synthetic method
   public Object f$E(String var1, a var2) throws r {
      StringReader var4 = new StringReader(var1);

      try {
         return this.f$E((Reader)var4, (a)var2);
      } catch (IOException var3) {
         throw new r(-1, 2, var3);
      }
   }

   // $FF: synthetic method
   public Object f$E(String var1) throws r {
      return this.f$E(var1, (a)null);
   }

   // $FF: synthetic method
   private void f$E() throws r, IOException {
      this.f$g = this.f$M.f$E();
      if (this.f$g == null) {
         this.f$g = new o(-1, (Object)null);
      }

   }

   // $FF: synthetic method
   private List f$E(a var1) {
      if (var1 == null) {
         return new x();
      } else {
         List var2;
         return (List)((var2 = var1.f$E()) == null ? new x() : var2);
      }
   }

   // $FF: synthetic method
   public Object f$E(Reader var1, a var2) throws IOException, r {
      this.f$E(var1);
      Reader var9 = new LinkedList();
      LinkedList var3 = new LinkedList();

      try {
         do {
            v var10000;
            label124: {
               this.f$E();
               String var4;
               Map var5;
               List var6;
               label117:
               switch(this.f$d) {
               case -1:
                  throw new r(this.f$E(), 1, this.f$g);
               case 0:
                  while(false) {
                  }

                  switch(this.f$g.f$g) {
                  case 0:
                     var10000 = this;

                     while(false) {
                     }

                     this.f$d = 1;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(this.f$g.f$d);
                     break label124;
                  case 1:
                     var10000 = this;
                     this.f$d = 2;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(this.f$E(var2));
                     break label124;
                  case 2:
                  default:
                     var10000 = this;
                     this.f$d = -1;
                     break label124;
                  case 3:
                     var10000 = this;
                     this.f$d = 3;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(this.f$E(var2));
                     break label124;
                  }
               case 1:
                  if (this.f$g.f$g == -1) {
                     return var3.removeFirst();
                  }

                  throw new r(this.f$E(), 1, this.f$g);
               case 2:
                  switch(this.f$g.f$g) {
                  case 0:
                     while(false) {
                     }

                     if (this.f$g.f$d instanceof String) {
                        var4 = (String)this.f$g.f$d;
                        var3.addFirst(var4);
                        var10000 = this;
                        this.f$d = 4;
                        var9.addFirst(new Integer(this.f$d));
                     } else {
                        this.f$d = -1;
                        var10000 = this;
                     }
                     break label124;
                  case 2:
                     if (var3.size() > 1) {
                        var9.removeFirst();
                        var3.removeFirst();
                        var10000 = this;
                        this.f$d = this.f$E(var9);
                     } else {
                        var10000 = this;
                        this.f$d = 1;
                     }
                     break label124;
                  case 5:
                     break label117;
                  default:
                     var10000 = this;
                     this.f$d = -1;
                     break label124;
                  }
               case 3:
                  List var10;
                  switch(this.f$g.f$g) {
                  case 0:
                     while(false) {
                     }

                     List var11 = (List)var3.getFirst();
                     var10000 = this;
                     var11.add(this.f$g.f$d);
                     break label124;
                  case 1:
                     var10 = (List)var3.getFirst();
                     var10000 = this;
                     var5 = this.f$E(var2);
                     var10.add(var5);
                     this.f$d = 2;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(var5);
                     break label124;
                  case 2:
                  default:
                     var10000 = this;
                     this.f$d = -1;
                     break label124;
                  case 3:
                     var10 = (List)var3.getFirst();
                     var10000 = this;
                     var6 = this.f$E(var2);
                     var10.add(var6);
                     this.f$d = 3;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(var6);
                     break label124;
                  case 4:
                     if (var3.size() > 1) {
                        var9.removeFirst();
                        var3.removeFirst();
                        var10000 = this;
                        this.f$d = this.f$E(var9);
                     } else {
                        var10000 = this;
                        this.f$d = 1;
                     }
                     break label124;
                  case 5:
                     break label117;
                  }
               case 4:
                  switch(this.f$g.f$g) {
                  case 0:
                     while(false) {
                     }

                     var9.removeFirst();
                     var4 = (String)var3.removeFirst();
                     Map var10001 = (Map)var3.getFirst();
                     var10000 = this;
                     var10001.put(var4, this.f$g.f$d);
                     this.f$d = this.f$E(var9);
                     break label124;
                  case 1:
                     var9.removeFirst();
                     var4 = (String)var3.removeFirst();
                     var5 = (Map)var3.getFirst();
                     var10000 = this;
                     Map var7 = this.f$E(var2);
                     var5.put(var4, var7);
                     this.f$d = 2;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(var7);
                     break label124;
                  case 2:
                  case 4:
                  case 5:
                  default:
                     var10000 = this;
                     this.f$d = -1;
                     break label124;
                  case 3:
                     var9.removeFirst();
                     var4 = (String)var3.removeFirst();
                     var5 = (Map)var3.getFirst();
                     var10000 = this;
                     var6 = this.f$E(var2);
                     var5.put(var4, var6);
                     this.f$d = 3;
                     var9.addFirst(new Integer(this.f$d));
                     var3.addFirst(var6);
                     break label124;
                  case 6:
                  }
               }

               var10000 = this;
            }

            if (var10000.f$d == -1) {
               throw new r(this.f$E(), 1, this.f$g);
            }
         } while(this.f$g.f$g != -1);
      } catch (IOException var8) {
         throw var8;
      }

      throw new r(this.f$E(), 1, this.f$g);
   }

   // $FF: synthetic method
   private Map f$E(a var1) {
      if (var1 == null) {
         return new u();
      } else {
         Map var2;
         return (Map)((var2 = var1.f$E()) == null ? new u() : var2);
      }
   }

   // $FF: synthetic method
   public void f$E(Reader var1, m var2) throws IOException, r {
      this.f$E(var1, var2, false);
   }

   // $FF: synthetic method
   public Object f$E(Reader var1) throws IOException, r {
      return this.f$E(var1, (a)null);
   }

   // $FF: synthetic method
   public void f$E(String var1, m var2) throws r {
      this.f$E(var1, var2, false);
   }

   // $FF: synthetic method
   private int f$E(LinkedList var1) {
      return var1.size() == 0 ? -1 : (Integer)var1.getFirst();
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = 2 << 3 ^ 4;
      int var10001 = 5 << 3 ^ 5;
      int var10002 = 4 << 3;
      int var10003 = (var0 = (String)var0).length();
      char[] var10004 = new char[var10003];
      boolean var10006 = true;
      int var5 = var10003 - 1;
      var10003 = var10002;
      int var3;
      var10002 = var3 = var5;
      char[] var1 = var10004;
      int var4 = var10003;
      var10001 = var10000;
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

   // $FF: synthetic method
   public void f$E(Reader var1) {
      this.f$M.f$E(var1);
      this.f$a();
   }

   // $FF: synthetic method
   public int f$E() {
      return this.f$M.f$e();
   }

   // $FF: synthetic method
   public void f$E(Reader var1, m var2, boolean var3) throws IOException, r {
      v var10000;
      if (!var3) {
         this.f$E(var1);
         var10000 = this;
         this.f$i = new LinkedList();
      } else {
         if (this.f$i == null) {
            var3 = false;
            this.f$E(var1);
            this.f$i = new LinkedList();
         }

         var10000 = this;
      }

      LinkedList var116 = var10000.f$i;

      label482: {
         IOException var125;
         label481: {
            r var124;
            label480: {
               RuntimeException var123;
               label479: {
                  Error var122;
                  label486: {
                     boolean var10001;
                     label477: {
                        label476:
                        while(true) {
                           label474: {
                              label473: {
                                 label472: {
                                    label471: {
                                       label470: {
                                          label487: {
                                             label488: {
                                                m var127;
                                                label467: {
                                                   label489: {
                                                      label490: {
                                                         try {
                                                            switch(this.f$d) {
                                                            case -1:
                                                               break label476;
                                                            case 0:
                                                               var127 = var2;
                                                               break label490;
                                                            case 1:
                                                               break label477;
                                                            case 2:
                                                               break label467;
                                                            case 3:
                                                               break;
                                                            case 4:
                                                               break label488;
                                                            case 5:
                                                               break label489;
                                                            case 6:
                                                               return;
                                                            default:
                                                               break label487;
                                                            }
                                                         } catch (IOException var112) {
                                                            var125 = var112;
                                                            var10001 = false;
                                                            break label481;
                                                         } catch (r var113) {
                                                            var124 = var113;
                                                            var10001 = false;
                                                            break label480;
                                                         } catch (RuntimeException var114) {
                                                            var123 = var114;
                                                            var10001 = false;
                                                            break label479;
                                                         } catch (Error var115) {
                                                            var122 = var115;
                                                            var10001 = false;
                                                            break label486;
                                                         }

                                                         label366: {
                                                            label365: {
                                                               label364: {
                                                                  label363: {
                                                                     try {
                                                                        this.f$E();
                                                                        switch(this.f$g.f$g) {
                                                                        case 0:
                                                                           var127 = var2;
                                                                           break label363;
                                                                        case 1:
                                                                           break label365;
                                                                        case 2:
                                                                        default:
                                                                           break;
                                                                        case 3:
                                                                           break label364;
                                                                        case 4:
                                                                           break label366;
                                                                        case 5:
                                                                           break label487;
                                                                        }
                                                                     } catch (IOException var88) {
                                                                        var125 = var88;
                                                                        var10001 = false;
                                                                        break label481;
                                                                     } catch (r var89) {
                                                                        var124 = var89;
                                                                        var10001 = false;
                                                                        break label480;
                                                                     } catch (RuntimeException var90) {
                                                                        var123 = var90;
                                                                        var10001 = false;
                                                                        break label479;
                                                                     } catch (Error var91) {
                                                                        var122 = var91;
                                                                        var10001 = false;
                                                                        break label486;
                                                                     }

                                                                     try {
                                                                        this.f$d = -1;
                                                                        break label487;
                                                                     } catch (IOException var64) {
                                                                        var125 = var64;
                                                                        var10001 = false;
                                                                        break label481;
                                                                     } catch (r var65) {
                                                                        var124 = var65;
                                                                        var10001 = false;
                                                                        break label480;
                                                                     } catch (RuntimeException var66) {
                                                                        var123 = var66;
                                                                        var10001 = false;
                                                                        break label479;
                                                                     } catch (Error var67) {
                                                                        var122 = var67;
                                                                        var10001 = false;
                                                                        break label486;
                                                                     }
                                                                  }

                                                                  while(true) {
                                                                     try {
                                                                        if (true) {
                                                                           if (!var127.f$E(this.f$g.f$d)) {
                                                                              return;
                                                                           }
                                                                           break label487;
                                                                        }
                                                                     } catch (IOException var84) {
                                                                        var125 = var84;
                                                                        var10001 = false;
                                                                        break label481;
                                                                     } catch (r var85) {
                                                                        var124 = var85;
                                                                        var10001 = false;
                                                                        break label480;
                                                                     } catch (RuntimeException var86) {
                                                                        var123 = var86;
                                                                        var10001 = false;
                                                                        break label479;
                                                                     } catch (Error var87) {
                                                                        var122 = var87;
                                                                        var10001 = false;
                                                                        break label486;
                                                                     }
                                                                  }
                                                               }

                                                               try {
                                                                  this.f$d = 3;
                                                                  var116.addFirst(new Integer(this.f$d));
                                                                  if (!var2.f$a()) {
                                                                     return;
                                                                  }
                                                                  break label487;
                                                               } catch (IOException var60) {
                                                                  var125 = var60;
                                                                  var10001 = false;
                                                                  break label481;
                                                               } catch (r var61) {
                                                                  var124 = var61;
                                                                  var10001 = false;
                                                                  break label480;
                                                               } catch (RuntimeException var62) {
                                                                  var123 = var62;
                                                                  var10001 = false;
                                                                  break label479;
                                                               } catch (Error var63) {
                                                                  var122 = var63;
                                                                  var10001 = false;
                                                                  break label486;
                                                               }
                                                            }

                                                            try {
                                                               this.f$d = 2;
                                                               var116.addFirst(new Integer(this.f$d));
                                                               if (!var2.f$K()) {
                                                                  return;
                                                               }
                                                               break label487;
                                                            } catch (IOException var56) {
                                                               var125 = var56;
                                                               var10001 = false;
                                                               break label481;
                                                            } catch (r var57) {
                                                               var124 = var57;
                                                               var10001 = false;
                                                               break label480;
                                                            } catch (RuntimeException var58) {
                                                               var123 = var58;
                                                               var10001 = false;
                                                               break label479;
                                                            } catch (Error var59) {
                                                               var122 = var59;
                                                               var10001 = false;
                                                               break label486;
                                                            }
                                                         }

                                                         try {
                                                            if (var116.size() > 1) {
                                                               var127 = var2;
                                                               var116.removeFirst();
                                                               this.f$d = this.f$E(var116);
                                                            } else {
                                                               this.f$d = 1;
                                                               var127 = var2;
                                                            }

                                                            if (!var127.f$E()) {
                                                               return;
                                                            }
                                                            break label487;
                                                         } catch (IOException var52) {
                                                            var125 = var52;
                                                            var10001 = false;
                                                            break label481;
                                                         } catch (r var53) {
                                                            var124 = var53;
                                                            var10001 = false;
                                                            break label480;
                                                         } catch (RuntimeException var54) {
                                                            var123 = var54;
                                                            var10001 = false;
                                                            break label479;
                                                         } catch (Error var55) {
                                                            var122 = var55;
                                                            var10001 = false;
                                                            break label486;
                                                         }
                                                      }

                                                      label442: {
                                                         label441: {
                                                            label440:
                                                            while(true) {
                                                               try {
                                                                  if (true) {
                                                                     var127.f$a();
                                                                     this.f$E();
                                                                     switch(this.f$g.f$g) {
                                                                     case 0:
                                                                        var10000 = this;
                                                                        break label440;
                                                                     case 1:
                                                                        break label442;
                                                                     case 2:
                                                                     default:
                                                                        break label470;
                                                                     case 3:
                                                                        break label441;
                                                                     }
                                                                  }
                                                               } catch (IOException var108) {
                                                                  var125 = var108;
                                                                  var10001 = false;
                                                                  break label481;
                                                               } catch (r var109) {
                                                                  var124 = var109;
                                                                  var10001 = false;
                                                                  break label480;
                                                               } catch (RuntimeException var110) {
                                                                  var123 = var110;
                                                                  var10001 = false;
                                                                  break label479;
                                                               } catch (Error var111) {
                                                                  var122 = var111;
                                                                  var10001 = false;
                                                                  break label486;
                                                               }
                                                            }

                                                            while(true) {
                                                               try {
                                                                  if (true) {
                                                                     var10000.f$d = 1;
                                                                     var116.addFirst(new Integer(this.f$d));
                                                                     if (!var2.f$E(this.f$g.f$d)) {
                                                                        return;
                                                                     }
                                                                     break label487;
                                                                  }
                                                               } catch (IOException var104) {
                                                                  var125 = var104;
                                                                  var10001 = false;
                                                                  break label481;
                                                               } catch (r var105) {
                                                                  var124 = var105;
                                                                  var10001 = false;
                                                                  break label480;
                                                               } catch (RuntimeException var106) {
                                                                  var123 = var106;
                                                                  var10001 = false;
                                                                  break label479;
                                                               } catch (Error var107) {
                                                                  var122 = var107;
                                                                  var10001 = false;
                                                                  break label486;
                                                               }
                                                            }
                                                         }

                                                         try {
                                                            this.f$d = 3;
                                                            var116.addFirst(new Integer(this.f$d));
                                                            if (!var2.f$a()) {
                                                               return;
                                                            }
                                                            break label487;
                                                         } catch (IOException var28) {
                                                            var125 = var28;
                                                            var10001 = false;
                                                            break label481;
                                                         } catch (r var29) {
                                                            var124 = var29;
                                                            var10001 = false;
                                                            break label480;
                                                         } catch (RuntimeException var30) {
                                                            var123 = var30;
                                                            var10001 = false;
                                                            break label479;
                                                         } catch (Error var31) {
                                                            var122 = var31;
                                                            var10001 = false;
                                                            break label486;
                                                         }
                                                      }

                                                      try {
                                                         this.f$d = 2;
                                                         var116.addFirst(new Integer(this.f$d));
                                                         if (!var2.f$K()) {
                                                            return;
                                                         }
                                                         break label487;
                                                      } catch (IOException var24) {
                                                         var125 = var24;
                                                         var10001 = false;
                                                         break label481;
                                                      } catch (r var25) {
                                                         var124 = var25;
                                                         var10001 = false;
                                                         break label480;
                                                      } catch (RuntimeException var26) {
                                                         var123 = var26;
                                                         var10001 = false;
                                                         break label479;
                                                      } catch (Error var27) {
                                                         var122 = var27;
                                                         var10001 = false;
                                                         break label486;
                                                      }
                                                   }

                                                   try {
                                                      var116.removeFirst();
                                                      this.f$d = this.f$E(var116);
                                                      if (!var2.f$e()) {
                                                         return;
                                                      }
                                                      break label487;
                                                   } catch (IOException var48) {
                                                      var125 = var48;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (r var49) {
                                                      var124 = var49;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (RuntimeException var50) {
                                                      var123 = var50;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (Error var51) {
                                                      var122 = var51;
                                                      var10001 = false;
                                                      break label486;
                                                   }
                                                }

                                                try {
                                                   this.f$E();
                                                   switch(this.f$g.f$g) {
                                                   case 0:
                                                      while(false) {
                                                      }

                                                      if (!(this.f$g.f$d instanceof String)) {
                                                         break label471;
                                                      }

                                                      int var117 = (String)this.f$g.f$d;
                                                      this.f$d = 4;
                                                      var116.addFirst(new Integer(this.f$d));
                                                      if (!var2.f$E(var117)) {
                                                         return;
                                                      }
                                                      break label487;
                                                   case 2:
                                                      break;
                                                   case 5:
                                                      break label487;
                                                   default:
                                                      break label472;
                                                   }
                                                } catch (IOException var100) {
                                                   var125 = var100;
                                                   var10001 = false;
                                                   break label481;
                                                } catch (r var101) {
                                                   var124 = var101;
                                                   var10001 = false;
                                                   break label480;
                                                } catch (RuntimeException var102) {
                                                   var123 = var102;
                                                   var10001 = false;
                                                   break label479;
                                                } catch (Error var103) {
                                                   var122 = var103;
                                                   var10001 = false;
                                                   break label486;
                                                }

                                                try {
                                                   if (var116.size() > 1) {
                                                      var127 = var2;
                                                      var116.removeFirst();
                                                      this.f$d = this.f$E(var116);
                                                   } else {
                                                      this.f$d = 1;
                                                      var127 = var2;
                                                   }

                                                   if (!var127.f$B()) {
                                                      return;
                                                   }
                                                   break label487;
                                                } catch (IOException var32) {
                                                   var125 = var32;
                                                   var10001 = false;
                                                   break label481;
                                                } catch (r var33) {
                                                   var124 = var33;
                                                   var10001 = false;
                                                   break label480;
                                                } catch (RuntimeException var34) {
                                                   var123 = var34;
                                                   var10001 = false;
                                                   break label479;
                                                } catch (Error var35) {
                                                   var122 = var35;
                                                   var10001 = false;
                                                   break label486;
                                                }
                                             }

                                             label399: {
                                                label492: {
                                                   LinkedList var126;
                                                   try {
                                                      this.f$E();
                                                      switch(this.f$g.f$g) {
                                                      case 0:
                                                         var126 = var116;
                                                         break;
                                                      case 1:
                                                         break label492;
                                                      case 2:
                                                      case 4:
                                                      case 5:
                                                      default:
                                                         break label473;
                                                      case 3:
                                                         break label399;
                                                      case 6:
                                                         break label487;
                                                      }
                                                   } catch (IOException var96) {
                                                      var125 = var96;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (r var97) {
                                                      var124 = var97;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (RuntimeException var98) {
                                                      var123 = var98;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (Error var99) {
                                                      var122 = var99;
                                                      var10001 = false;
                                                      break label486;
                                                   }

                                                   while(true) {
                                                      try {
                                                         if (true) {
                                                            var126.removeFirst();
                                                            this.f$d = this.f$E(var116);
                                                            if (var2.f$E(this.f$g.f$d)) {
                                                               break;
                                                            }

                                                            return;
                                                         }
                                                      } catch (IOException var92) {
                                                         var125 = var92;
                                                         var10001 = false;
                                                         break label481;
                                                      } catch (r var93) {
                                                         var124 = var93;
                                                         var10001 = false;
                                                         break label480;
                                                      } catch (RuntimeException var94) {
                                                         var123 = var94;
                                                         var10001 = false;
                                                         break label479;
                                                      } catch (Error var95) {
                                                         var122 = var95;
                                                         var10001 = false;
                                                         break label486;
                                                      }
                                                   }

                                                   try {
                                                      if (!var2.f$e()) {
                                                         return;
                                                      }
                                                      break label487;
                                                   } catch (IOException var36) {
                                                      var125 = var36;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (r var37) {
                                                      var124 = var37;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (RuntimeException var38) {
                                                      var123 = var38;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (Error var39) {
                                                      var122 = var39;
                                                      var10001 = false;
                                                      break label486;
                                                   }
                                                }

                                                try {
                                                   var116.removeFirst();
                                                   var116.addFirst(new Integer(5));
                                                   this.f$d = 2;
                                                   var116.addFirst(new Integer(this.f$d));
                                                   if (!var2.f$K()) {
                                                      return;
                                                   }
                                                   break label487;
                                                } catch (IOException var44) {
                                                   var125 = var44;
                                                   var10001 = false;
                                                   break label481;
                                                } catch (r var45) {
                                                   var124 = var45;
                                                   var10001 = false;
                                                   break label480;
                                                } catch (RuntimeException var46) {
                                                   var123 = var46;
                                                   var10001 = false;
                                                   break label479;
                                                } catch (Error var47) {
                                                   var122 = var47;
                                                   var10001 = false;
                                                   break label486;
                                                }
                                             }

                                             try {
                                                var116.removeFirst();
                                                var116.addFirst(new Integer(5));
                                                this.f$d = 3;
                                                var116.addFirst(new Integer(this.f$d));
                                                if (!var2.f$a()) {
                                                   return;
                                                }
                                             } catch (IOException var40) {
                                                var125 = var40;
                                                var10001 = false;
                                                break label481;
                                             } catch (r var41) {
                                                var124 = var41;
                                                var10001 = false;
                                                break label480;
                                             } catch (RuntimeException var42) {
                                                var123 = var42;
                                                var10001 = false;
                                                break label479;
                                             } catch (Error var43) {
                                                var122 = var43;
                                                var10001 = false;
                                                break label486;
                                             }
                                          }

                                          try {
                                             var10000 = this;
                                             break label474;
                                          } catch (IOException var20) {
                                             var125 = var20;
                                             var10001 = false;
                                             break label481;
                                          } catch (r var21) {
                                             var124 = var21;
                                             var10001 = false;
                                             break label480;
                                          } catch (RuntimeException var22) {
                                             var123 = var22;
                                             var10001 = false;
                                             break label479;
                                          } catch (Error var23) {
                                             var122 = var23;
                                             var10001 = false;
                                             break label486;
                                          }
                                       }

                                       try {
                                          var10000 = this;
                                          this.f$d = -1;
                                          break label474;
                                       } catch (IOException var80) {
                                          var125 = var80;
                                          var10001 = false;
                                          break label481;
                                       } catch (r var81) {
                                          var124 = var81;
                                          var10001 = false;
                                          break label480;
                                       } catch (RuntimeException var82) {
                                          var123 = var82;
                                          var10001 = false;
                                          break label479;
                                       } catch (Error var83) {
                                          var122 = var83;
                                          var10001 = false;
                                          break label486;
                                       }
                                    }

                                    try {
                                       var10000 = this;
                                       this.f$d = -1;
                                       break label474;
                                    } catch (IOException var76) {
                                       var125 = var76;
                                       var10001 = false;
                                       break label481;
                                    } catch (r var77) {
                                       var124 = var77;
                                       var10001 = false;
                                       break label480;
                                    } catch (RuntimeException var78) {
                                       var123 = var78;
                                       var10001 = false;
                                       break label479;
                                    } catch (Error var79) {
                                       var122 = var79;
                                       var10001 = false;
                                       break label486;
                                    }
                                 }

                                 try {
                                    var10000 = this;
                                    this.f$d = -1;
                                    break label474;
                                 } catch (IOException var72) {
                                    var125 = var72;
                                    var10001 = false;
                                    break label481;
                                 } catch (r var73) {
                                    var124 = var73;
                                    var10001 = false;
                                    break label480;
                                 } catch (RuntimeException var74) {
                                    var123 = var74;
                                    var10001 = false;
                                    break label479;
                                 } catch (Error var75) {
                                    var122 = var75;
                                    var10001 = false;
                                    break label486;
                                 }
                              }

                              try {
                                 var10000 = this;
                                 this.f$d = -1;
                              } catch (IOException var68) {
                                 var125 = var68;
                                 var10001 = false;
                                 break label481;
                              } catch (r var69) {
                                 var124 = var69;
                                 var10001 = false;
                                 break label480;
                              } catch (RuntimeException var70) {
                                 var123 = var70;
                                 var10001 = false;
                                 break label479;
                              } catch (Error var71) {
                                 var122 = var71;
                                 var10001 = false;
                                 break label486;
                              }
                           }

                           try {
                              if (var10000.f$d == -1) {
                                 throw new r(this.f$E(), 1, this.f$g);
                              }

                              if (this.f$g.f$g == -1) {
                                 break label482;
                              }
                           } catch (IOException var16) {
                              var125 = var16;
                              var10001 = false;
                              break label481;
                           } catch (r var17) {
                              var124 = var17;
                              var10001 = false;
                              break label480;
                           } catch (RuntimeException var18) {
                              var123 = var18;
                              var10001 = false;
                              break label479;
                           } catch (Error var19) {
                              var122 = var19;
                              var10001 = false;
                              break label486;
                           }
                        }

                        try {
                           throw new r(this.f$E(), 1, this.f$g);
                        } catch (IOException var12) {
                           var125 = var12;
                           var10001 = false;
                           break label481;
                        } catch (r var13) {
                           var124 = var13;
                           var10001 = false;
                           break label480;
                        } catch (RuntimeException var14) {
                           var123 = var14;
                           var10001 = false;
                           break label479;
                        } catch (Error var15) {
                           var122 = var15;
                           var10001 = false;
                           break label486;
                        }
                     }

                     try {
                        this.f$E();
                        if (this.f$g.f$g == -1) {
                           var2.f$E();
                           this.f$d = 6;
                           return;
                        }
                     } catch (IOException var8) {
                        var125 = var8;
                        var10001 = false;
                        break label481;
                     } catch (r var9) {
                        var124 = var9;
                        var10001 = false;
                        break label480;
                     } catch (RuntimeException var10) {
                        var123 = var10;
                        var10001 = false;
                        break label479;
                     } catch (Error var11) {
                        var122 = var11;
                        var10001 = false;
                        break label486;
                     }

                     try {
                        this.f$d = -1;
                        throw new r(this.f$E(), 1, this.f$g);
                     } catch (IOException var4) {
                        var125 = var4;
                        var10001 = false;
                        break label481;
                     } catch (r var5) {
                        var124 = var5;
                        var10001 = false;
                        break label480;
                     } catch (RuntimeException var6) {
                        var123 = var6;
                        var10001 = false;
                        break label479;
                     } catch (Error var7) {
                        var122 = var7;
                        var10001 = false;
                     }
                  }

                  int var118 = var122;
                  this.f$d = -1;
                  throw var118;
               }

               int var119 = var123;
               this.f$d = -1;
               throw var119;
            }

            int var120 = var124;
            this.f$d = -1;
            throw var120;
         }

         int var121 = var125;
         this.f$d = -1;
         throw var121;
      }

      this.f$d = -1;
      throw new r(this.f$E(), 1, this.f$g);
   }

   // $FF: synthetic method
   public void f$a() {
      this.f$g = null;
      this.f$d = 0;
      this.f$i = null;
   }
}
