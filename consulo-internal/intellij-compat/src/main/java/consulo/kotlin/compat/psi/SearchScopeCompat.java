package consulo.kotlin.compat.psi;

import consulo.language.psi.scope.GlobalSearchScope;

import java.util.Set;

/**
 * IntelliJ {@code GlobalSearchScopeUtil} scope flattening. Consulo exposes no intersection/union scope structure,
 * so every scope is a leaf: Kotlin's scope merge strategies then keep the scopes as they are.
 */
public final class SearchScopeCompat {
    private SearchScopeCompat() {
    }

    public static boolean isIntersectionScope(GlobalSearchScope scope) {
        return false;
    }

    public static boolean isUnionScope(GlobalSearchScope scope) {
        return false;
    }

    public static Set<GlobalSearchScope> flattenIntersectionScope(GlobalSearchScope scope) {
        return Set.of(scope);
    }

    public static Set<GlobalSearchScope> flattenUnionScope(GlobalSearchScope scope) {
        return Set.of(scope);
    }
}
