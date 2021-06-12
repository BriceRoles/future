package net.futureclient.client;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult.Type;

public class fH extends GA {
   // $FF: synthetic method
   public String f$E() {
      return null;
   }

   // $FF: synthetic method
   public fH() {
      String[] var10001 = new String[4];
      boolean var10003 = true;
      var10001[0] = BG.f$E("9A\fO");
      var10001[1] = ni.f$E(")D\u0018J");
      var10001[2] = BG.f$E("9A\fO\fV");
      var10001[3] = ni.f$E("r\u0011T\u0015J\u001cS)D\u001cJ");
      super(var10001);
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      ItemStack var10000;
      label45: {
         ItemStack var5;
         if ((var5 = Pg.f$E(ItemShulkerBox.class)) == null) {
            if (this.f$d.field_71476_x.field_72313_a == Type.ENTITY) {
               Entity var2;
               if ((var2 = this.f$d.field_71476_x.field_72308_g) instanceof EntityItem) {
                  EntityItem var3;
                  var5 = (var3 = (EntityItem)var2).func_92059_d();
               } else if (var2 instanceof EntityItemFrame) {
                  EntityItemFrame var8;
                  var5 = (var8 = (EntityItemFrame)var2).func_82335_i();
               } else if (var2 instanceof EntityLivingBase) {
                  EntityLivingBase var9;
                  var5 = Pg.f$E(var9 = (EntityLivingBase)var2, ItemShulkerBox.class);
               }
            } else if (this.f$d.field_71476_x.field_72313_a == Type.BLOCK) {
               BlockPos var6 = this.f$d.field_71476_x.func_178782_a();
               Iterator var10 = this.f$d.field_71441_e.func_72872_a(EntityItem.class, new AxisAlignedBB(var6, var6.func_177982_a(1, 2, 1))).iterator();

               while(var10.hasNext()) {
                  ItemStack var4;
                  if ((var4 = ((EntityItem)var10.next()).func_92059_d()).func_77973_b() instanceof ItemShulkerBox) {
                     var10000 = var4;
                     break label45;
                  }
               }
            }
         }

         var10000 = var5;
      }

      ItemStack var7 = var10000;
      if (var7 != null && var7.func_77973_b() instanceof ItemShulkerBox) {
         if (var7.func_77978_p() != null) {
            kH.f$E().f$E().f$a(new jD(this, var7));
            return BG.f$E("k\u0019A\u0007A\r\u0004\u001aL\u001cH\u0002A\u001b\u0004\u000bK\u0011\n");
         } else {
            return ni.f$E("<L\tU\u0000\u0001\nI\fM\u0012D\u000b\u0001\u001bN\u0001\u000f");
         }
      } else {
         return BG.f$E("'KIW\u0001Q\u0005O\fVIF\u0006\\IB\u0006Q\u0007@IM\u0007\u0004\u0001E\u0007@IK\u001b\u0004\nV\u0006W\u001aL\bM\u001b\n");
      }
   }

   // $FF: synthetic method
   public static Minecraft f$E(fH var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a(fH var0) {
      return var0.f$d;
   }
}
