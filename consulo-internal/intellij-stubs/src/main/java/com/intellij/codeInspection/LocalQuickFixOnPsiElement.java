package com.intellij.codeInspection;

// IntelliJ shape of consulo.language.editor.inspection.LocalQuickFixOnPsiElement: getText() is a string (bridge in remap.xml)
@SuppressWarnings("all")
public abstract class LocalQuickFixOnPsiElement implements com.intellij.codeInspection.LocalQuickFix {
    protected LocalQuickFixOnPsiElement(com.intellij.psi.PsiElement element) { }
    public LocalQuickFixOnPsiElement(com.intellij.psi.PsiElement startElement, com.intellij.psi.PsiElement endElement) { }
    public final java.lang.String getName() { return null; }
    public abstract java.lang.String getText();
    public boolean isAvailable(com.intellij.openapi.project.Project project, com.intellij.psi.PsiFile file, com.intellij.psi.PsiElement startElement, com.intellij.psi.PsiElement endElement) { return false; }
    public com.intellij.psi.PsiElement getStartElement() { return null; }
    public com.intellij.psi.PsiElement getEndElement() { return null; }
    public final void applyFix(com.intellij.openapi.project.Project project, com.intellij.codeInspection.ProblemDescriptor descriptor) { }
    public void applyFix() { }
    public abstract void invoke(com.intellij.openapi.project.Project project, com.intellij.psi.PsiFile file, com.intellij.psi.PsiElement startElement, com.intellij.psi.PsiElement endElement);
}
