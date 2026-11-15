package com.intellij.lang.jvm;
@SuppressWarnings("all")
public interface JvmModifiersOwner extends JvmElement {
    default boolean hasModifier(JvmModifier modifier) { return false; }
}
