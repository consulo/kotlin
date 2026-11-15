package consulo.kotlin.compat.search;

import com.intellij.java.indexing.search.searches.DirectClassInheritorsSearch;
import consulo.application.util.function.Processor;

import java.util.function.Predicate;

/** IntelliJ search API that Consulo lacks; calls are redirected here by remap.xml. */
public final class SearchCompat {
    private SearchCompat() {
    }

    @SuppressWarnings("unchecked")
    static <T> Processor<T> asProcessor(Predicate<? super T> predicate) {
        return predicate instanceof Processor<?> processor ? (Processor<T>) processor : predicate::test;
    }

    /**
     * IntelliJ {@code DirectClassInheritorsSearch.SearchParameters.getOriginalParameters()}: the search that started this
     * one; Consulo's parameters do not keep it.
     */
    public static Object getOriginalParameters(DirectClassInheritorsSearch.SearchParameters parameters) {
        return null;
    }
}
