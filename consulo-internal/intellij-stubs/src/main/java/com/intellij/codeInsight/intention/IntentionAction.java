package com.intellij.codeInsight.intention;

// consulo.kotlin.compat.intention.IntentionAction (getText is renamed to getIntentionText by remap.xml)
@SuppressWarnings("all")
public interface IntentionAction extends com.intellij.codeInsight.intention.CommonIntentionAction, com.intellij.lang.editor.inspection.FileModifier {
    public static final com.intellij.codeInsight.intention.IntentionAction[] EMPTY_ARRAY = null;
    java.lang.String getText();
    java.lang.String getFamilyName();
    boolean isAvailable(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file);
    void invoke(com.intellij.openapi.project.Project project, com.intellij.openapi.editor.Editor editor, com.intellij.psi.PsiFile file) throws com.intellij.util.IncorrectOperationException;
    boolean startInWriteAction();
}
