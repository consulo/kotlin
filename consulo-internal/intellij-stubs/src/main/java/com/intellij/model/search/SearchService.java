package com.intellij.model.search;

// consulo.kotlin.compat.search.SearchService
@SuppressWarnings("all")
public final class SearchService {
    private SearchService() {}
    public static SearchService getInstance() { return null; }
    public <R> com.intellij.util.Query<R> searchParameters(SearchParameters<R> parameters) { return null; }
}
