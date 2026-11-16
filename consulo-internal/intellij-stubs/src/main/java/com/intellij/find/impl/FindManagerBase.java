package com.intellij.find.impl;

// consulo.find.FindManager; getFindUsagesManager() is consulo.kotlin.compat.find.FindCompat
@SuppressWarnings("all")
public abstract class FindManagerBase extends com.intellij.find.FindManager {
    public com.intellij.find.findUsages.FindUsagesManager getFindUsagesManager() { return null; }
}
