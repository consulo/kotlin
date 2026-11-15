package consulo.kotlin.compat.search;

import com.intellij.java.indexing.search.searches.OverridingMethodsSearch;

/**
 * IntelliJ's parameters of an inheritor search started by a Java overriding methods search. Consulo's Java plugin does
 * not start such searches, so there are none.
 */
public final class ClassInheritanceSearchFromJavaOverridingMethodsParameters {
    private ClassInheritanceSearchFromJavaOverridingMethodsParameters() {
    }

    /** The overriding methods search that started the inheritor search. */
    public OverridingMethodsSearch.SearchParameters getOriginalParameters() {
        throw new UnsupportedOperationException();
    }
}
