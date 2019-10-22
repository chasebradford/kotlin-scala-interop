The kotlin_lib defines an argument class named Inn that's a static nested class of cbradford.Outer.
JavaConsumer and KotlinConsumer both define use() methods that accept an argument of type Outer.Inn.
The scala_app depends on the prebuilt classes from kotlin_lib.
It declares a single Outer.Inn instance, and attempts to call JavaConsumer.use(arg) and KotlinConsumer.use(arg).

The JavaConsumer.use(arg) call compiles fine.  However, KotlinConsumer.use(arg) fails to compile with the error
```
/workspace/kotlin-scala-interop/scala_app/src/main/scala/cbradford/ScalaApp.scala:7: type mismatch;
 found   : cbradford.Outer.Inn
 required: cbradford.cbradford.
    new KotlinConsumer().use(arg)
                             ^
one error found
```

This seems related to https://youtrack.jetbrains.com/issue/KT-14069
