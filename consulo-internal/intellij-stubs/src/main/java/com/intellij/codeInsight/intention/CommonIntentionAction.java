package com.intellij.codeInsight.intention;

// consulo.language.editor.intention.IntentionAction
@SuppressWarnings("all")
public interface CommonIntentionAction {
    default com.intellij.codeInsight.intention.IntentionAction asIntention() { return null; }
}
