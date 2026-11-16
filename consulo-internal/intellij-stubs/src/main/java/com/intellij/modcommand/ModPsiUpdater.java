package com.intellij.modcommand;

// consulo.kotlin.compat.modcommand.ModPsiUpdater
@SuppressWarnings("all")
public interface ModPsiUpdater {
    default <E extends com.intellij.psi.PsiElement> E getWritable(E element) { return element; }
    default void moveCaretTo(int offset) { }
    default void moveCaretTo(com.intellij.psi.PsiElement element) { }
}
