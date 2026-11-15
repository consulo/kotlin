package com.intellij.model.search;

// consulo.kotlin.compat.search.Searcher
@SuppressWarnings("all")
public interface Searcher<P extends SearchParameters<R>, R> {
    default java.util.Collection<? extends com.intellij.util.Query<? extends R>> collectSearchRequests(P parameters) { return null; }
    default com.intellij.util.Query<? extends R> collectSearchRequest(P parameters) { return null; }
}
