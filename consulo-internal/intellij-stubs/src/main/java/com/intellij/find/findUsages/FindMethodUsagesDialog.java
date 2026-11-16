package com.intellij.find.findUsages;

// consulo.kotlin.compat.find.FindMethodUsagesDialog
@SuppressWarnings("all")
public class FindMethodUsagesDialog extends com.intellij.find.findUsages.JavaFindUsagesDialog<com.intellij.find.findUsages.JavaMethodFindUsagesOptions> {
    public FindMethodUsagesDialog(com.intellij.psi.PsiElement element, com.intellij.openapi.project.Project project, com.intellij.find.findUsages.FindUsagesOptions findUsagesOptions, boolean toShowInNewTab, boolean mustOpenInNewTab, boolean isSingleFile, com.intellij.find.findUsages.FindUsagesHandler handler) { super(element, project, findUsagesOptions, toShowInNewTab, mustOpenInNewTab, isSingleFile, handler); }
    public javax.swing.JComponent getPreferredFocusedControl() { return null; }
    public void calcFindUsagesOptions(com.intellij.find.findUsages.JavaMethodFindUsagesOptions options) { }
    protected javax.swing.JPanel createFindWhatPanel() { return null; }
    protected void update() { }
    protected boolean noSpecificOptions(com.intellij.psi.PsiElement element) { return false; }
    protected boolean canSearchForOverridingMethods(com.intellij.psi.PsiElement element) { return false; }
    protected boolean canSearchForImplementingMethods(com.intellij.psi.PsiElement element) { return false; }
    protected boolean canSearchForBaseMethod(com.intellij.psi.PsiElement element) { return false; }
    // Inherited abstract members (genstub.py)
    public boolean canBeHidden() { return false; }
    public boolean isToBeShown() { return false; }
    public boolean shouldSaveOptionsOnCancel() { return false; }
    public void setToBeShown(boolean p0, int p1) { }
}
