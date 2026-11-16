package com.intellij.modcommand;

// consulo.kotlin.compat.modcommand.PsiUpdateModCommandQuickFix
@SuppressWarnings("all")
public abstract class PsiUpdateModCommandQuickFix implements com.intellij.codeInspection.LocalQuickFix {
    public abstract java.lang.String getFamilyName();
    public java.lang.String getName() { return null; }
    public final void applyFix(com.intellij.openapi.project.Project project, com.intellij.codeInspection.ProblemDescriptor descriptor) { }
    protected abstract void applyFix(com.intellij.openapi.project.Project project, com.intellij.psi.PsiElement element, com.intellij.modcommand.ModPsiUpdater updater);
}
