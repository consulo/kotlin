package consulo.kotlin.compat.search;

import consulo.project.Project;

/** IntelliJ {@code com.intellij.model.search.SearchParameters}: what a {@link Searcher} searches for. */
public interface SearchParameters<T> {
    Project getProject();

    boolean areValid();
}
