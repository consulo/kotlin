package com.intellij.util.concurrency.annotations;

@SuppressWarnings("all")
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface RequiresReadLock {
    boolean generateAssertion() default true;
}
