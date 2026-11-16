package com.intellij.find.findUsages;

// consulo.kotlin.compat.find.JavaFindUsagesDialog
@SuppressWarnings("all")
public abstract class JavaFindUsagesDialog<T extends com.intellij.find.findUsages.JavaFindUsagesOptions> extends com.intellij.find.findUsages.CommonFindUsagesDialog {
    protected com.intellij.ui.StateRestoringCheckBox myCbIncludeOverloadedMethods;
    protected JavaFindUsagesDialog(com.intellij.psi.PsiElement element, com.intellij.openapi.project.Project project, com.intellij.find.findUsages.FindUsagesOptions findUsagesOptions, boolean toShowInNewTab, boolean mustOpenInNewTab, boolean isSingleFile, com.intellij.find.findUsages.FindUsagesHandler handler) { super(element, project, findUsagesOptions, toShowInNewTab, mustOpenInNewTab, isSingleFile, handler); }
    public boolean isIncludeOverloadedMethodsAvailable() { return false; }
    public void calcFindUsagesOptions(T options) { }
    public void calcFindUsagesOptions(com.intellij.find.findUsages.FindUsagesOptions options) { }
    protected void addUsagesOptions(javax.swing.JPanel optionsPanel) { }
    protected void addDefaultOptions(javax.swing.JPanel optionsPanel) { }
    protected final com.intellij.psi.PsiElement getPsiElement() { return null; }
    protected T getFindUsagesOptions() { return null; }
}
