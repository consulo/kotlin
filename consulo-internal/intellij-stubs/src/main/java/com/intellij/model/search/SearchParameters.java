package com.intellij.model.search;

// consulo.kotlin.compat.search.SearchParameters
@SuppressWarnings("all")
public interface SearchParameters<T> {
    com.intellij.openapi.project.Project getProject();
    boolean areValid();
}
