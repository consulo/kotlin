package com.intellij.codeInspection;

// consulo.kotlin.compat.intention.SuppressIntentionAction (IntelliJ's string text)
@SuppressWarnings("all")
public abstract class SuppressIntentionAction implements com.intellij.codeInsight.intention.IntentionAction, com.intellij.openapi.util.Iconable {
    public static com.intellij.codeInspection.SuppressIntentionAction[] EMPTY_ARRAY;
    public SuppressIntentionAction() { }
    public javax.swing.Icon getIcon(int flags) { return null; }
    public java.lang.String getText() { return null; }
    public boolean startInWriteAction() { return true; }
    public final void invoke(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) throws com.intellij.util.IncorrectOperationException { }
    public abstract void invoke(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiElement element) throws com.intellij.util.IncorrectOperationException;
    public final boolean isAvailable(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) { return false; }
    public abstract boolean isAvailable(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiElement element);
}
