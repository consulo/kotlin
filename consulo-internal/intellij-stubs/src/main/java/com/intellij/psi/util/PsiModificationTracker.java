package com.intellij.psi.util;

@SuppressWarnings("all")
public interface PsiModificationTracker extends com.intellij.openapi.util.ModificationTracker {
    long getModificationCount();
}
