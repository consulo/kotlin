package com.intellij.codeInsight.intention.preview;

// consulo.kotlin.compat.intention.IntentionPreviewUtils
@SuppressWarnings("all")
public final class IntentionPreviewUtils {
    private IntentionPreviewUtils() { }
    public static boolean isIntentionPreviewActive() { return false; }
    public static boolean prepareElementForWrite(com.intellij.psi.PsiElement element) { return false; }
    public static com.intellij.psi.PsiFile getOriginalFile(com.intellij.psi.PsiFile file) { return null; }
}
