package io.github.impactdevelopment.simpletweaker.transform;

import org.objectweb.asm.tree.ClassNode;

public interface ITransformer {
   void transform(ClassNode var1);

   default boolean isTarget(String className) {
      return true;
   }
}
