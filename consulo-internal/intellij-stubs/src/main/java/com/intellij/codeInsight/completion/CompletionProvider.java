package com.intellij.codeInsight.completion;

// consulo.kotlin.compat.completion.CompletionProvider
@SuppressWarnings("all")
public abstract class CompletionProvider<V extends com.intellij.codeInsight.completion.CompletionParameters> {
    public CompletionProvider() { }
    public abstract void addCompletions(V parameters, com.intellij.util.ProcessingContext context, com.intellij.codeInsight.completion.CompletionResultSet result);
}
