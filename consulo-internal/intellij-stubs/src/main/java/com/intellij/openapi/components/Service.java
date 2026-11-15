package com.intellij.openapi.components;

@SuppressWarnings("all")
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
public @interface Service {
    Level[] value() default {};

    enum Level { APP, PROJECT }
}
