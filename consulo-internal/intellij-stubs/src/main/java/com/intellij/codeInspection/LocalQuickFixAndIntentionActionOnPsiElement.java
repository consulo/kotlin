package com.intellij.codeInspection;

// IntelliJ shape of consulo.language.editor.inspection.LocalQuickFixAndIntentionActionOnPsiElement
@SuppressWarnings("all")
public abstract class LocalQuickFixAndIntentionActionOnPsiElement extends com.intellij.codeInspection.LocalQuickFixOnPsiElement implements com.intellij.codeInsight.intention.IntentionAction {
    protected LocalQuickFixAndIntentionActionOnPsiElement(com.intellij.psi.PsiElement element) { super(element); }
    protected LocalQuickFixAndIntentionActionOnPsiElement(com.intellij.psi.PsiElement startElement, com.intellij.psi.PsiElement endElement) { super(startElement, endElement); }
    public final void invoke(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) { }
    public final boolean isAvailable(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) { return false; }
    public abstract void invoke(com.intellij.openapi.project.Project project, com.intellij.psi.PsiFile file, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiElement startElement, com.intellij.psi.PsiElement endElement);
    public void invoke(com.intellij.openapi.project.Project project, com.intellij.psi.PsiFile file, com.intellij.psi.PsiElement startElement, com.intellij.psi.PsiElement endElement) { }
    public boolean startInWriteAction() { return true; }
}
