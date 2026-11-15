package com.intellij.codeInsight.completion.impl;

// consulo.kotlin.compat.completion.CompletionSorterImpl
@SuppressWarnings("all")
public abstract class CompletionSorterImpl extends com.intellij.codeInsight.completion.CompletionSorter {
    private CompletionSorterImpl() {}
    public abstract CompletionSorterImpl withoutClassifiers(java.util.function.Predicate<? super com.intellij.codeInsight.lookup.ClassifierFactory<com.intellij.codeInsight.lookup.LookupElement>> removeCondition);
}
