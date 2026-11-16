package com.intellij.find.findUsages;

// consulo.find.FindManager (which provides the handlers in Consulo)
@SuppressWarnings("all")
public abstract class FindUsagesManager {
    public com.intellij.find.findUsages.FindUsagesHandler getFindUsagesHandler(com.intellij.psi.PsiElement element, boolean forHighlightUsages) { return null; }
}
