package consulo.kotlin.compat.search;

import consulo.annotation.component.ComponentScope;
import consulo.annotation.component.ExtensionAPI;
import consulo.application.util.query.Query;

import java.util.Collection;
import java.util.List;

/**
 * IntelliJ {@code com.intellij.model.search.Searcher}: contributes results for one kind of {@link SearchParameters},
 * the type argument of the implementation (IntelliJ registers it with {@code forClass}).
 */
@ExtensionAPI(ComponentScope.APPLICATION)
public interface Searcher<P extends SearchParameters<R>, R> {
    default Collection<? extends Query<? extends R>> collectSearchRequests(P parameters) {
        Query<? extends R> request = collectSearchRequest(parameters);
        return request == null ? List.of() : List.of(request);
    }

    default Query<? extends R> collectSearchRequest(P parameters) {
        throw new UnsupportedOperationException(getClass().getName() + " implements neither collectSearchRequest nor collectSearchRequests");
    }
}
