package com.intellij.configurationStore;

// IntelliJ's settings serialization hints: annotations only, never read in Consulo
@SuppressWarnings("all")
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Property {
    String externalName() default "";
    boolean ignore() default false;
}
