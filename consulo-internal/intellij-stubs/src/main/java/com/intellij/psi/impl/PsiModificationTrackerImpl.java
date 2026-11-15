package com.intellij.psi.impl;

@SuppressWarnings("all")
public final class PsiModificationTrackerImpl {
    public static boolean canAffectPsi(com.intellij.psi.impl.PsiTreeChangeEventImpl event) { return false; }
}
