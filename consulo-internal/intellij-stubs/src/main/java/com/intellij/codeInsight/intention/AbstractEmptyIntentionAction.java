package com.intellij.codeInsight.intention;

// consulo.kotlin.compat.intention.AbstractEmptyIntentionAction
@SuppressWarnings("all")
public abstract class AbstractEmptyIntentionAction implements IntentionAction {
    public final void invoke(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) { }
    public final boolean startInWriteAction() { return false; }
}
