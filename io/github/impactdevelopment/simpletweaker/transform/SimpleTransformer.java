package io.github.impactdevelopment.simpletweaker.transform;

import io.github.impactdevelopment.simpletweaker.SimpleTweaker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class SimpleTransformer implements IClassTransformer {
   private static SimpleTransformer instance;
   private final List<ITransformer> transformers = new ArrayList();

   public SimpleTransformer() {
      instance = this;
   }

   public final byte[] transform(String name, String transformedName, byte[] basicClass) {
      if (basicClass == null) {
         return null;
      } else {
         List<ITransformer> transformers = this.getTransformers(transformedName);
         if (!transformers.isEmpty()) {
            try {
               ClassNode cn = new ClassNode();
               ClassReader cr = new ClassReader(basicClass);
               cr.accept(cn, 0);
               transformers.forEach((transformer) -> {
                  transformer.transform(cn);
               });
               ClassWriter cw = new ClassWriter(cr, 3);
               cn.accept(cw);
               return cw.toByteArray();
            } catch (Exception var8) {
               SimpleTweaker.LOGGER.error("An exception occurred while transforming class", var8);
            }
         }

         return basicClass;
      }
   }

   public final void registerAll(String... transformers) {
      Stream var10000 = Arrays.stream(transformers).map(this::createTransformer).filter(Objects::nonNull);
      List var10001 = this.transformers;
      var10000.forEach(var10001::add);
   }

   public final void registerAll(ITransformer... transformers) {
      this.transformers.addAll(Arrays.asList(transformers));
   }

   private List<ITransformer> getTransformers(String name) {
      return (List)this.transformers.stream().filter((transformer) -> {
         return transformer.isTarget(name);
      }).collect(Collectors.toList());
   }

   private ITransformer createTransformer(String clazz) {
      try {
         return (ITransformer)Class.forName(clazz).newInstance();
      } catch (Exception var3) {
         SimpleTweaker.LOGGER.error("Unable to instantiate Transformer", var3);
         return null;
      }
   }

   public static SimpleTransformer getInstance() {
      return instance;
   }
}
