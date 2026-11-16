package com.intellij.psi.impl;

// remap.xml redirects isIncompleteModel to consulo.kotlin.compat.util.UtilCompat
@SuppressWarnings("all")
public final class IncompleteModelUtil {
    private IncompleteModelUtil() { }
    public static boolean isIncompleteModel(com.intellij.psi.PsiElement element) { return false; }
}
