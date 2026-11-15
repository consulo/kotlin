package consulo.kotlin.compat.psi;

import consulo.language.psi.search.PsiSearchHelper;
import consulo.language.psi.PsiElement;
import consulo.content.scope.SearchScope;
import consulo.language.psi.scope.DelegatingGlobalSearchScope;
import consulo.language.psi.scope.GlobalSearchScope;

import java.util.Set;

/**
 * IntelliJ {@code GlobalSearchScopeUtil} scope flattening. Consulo exposes no intersection/union scope structure,
 * so every scope is a leaf: Kotlin's scope merge strategies then keep the scopes as they are.
 */
public final class SearchScopeCompat {
    private SearchScopeCompat() {
    }

    /**
     * IntelliJ {@code PsiSearchHelper.getCodeUsageScope(element)}: the use scope narrowed to code files. Consulo has only the
     * use scope, a superset.
     */
    public static SearchScope getCodeUsageScope(PsiSearchHelper helper, PsiElement element) {
        return helper.getUseScope(element);
    }

    /**
     * IntelliJ {@code DelegatingGlobalSearchScope.getDelegate()}. Consulo keeps the delegate in a protected field; only
     * IntelliJ's index asks for it (through VirtualFileEnumeration), which Consulo does not have.
     */
    public static GlobalSearchScope getDelegate(DelegatingGlobalSearchScope scope) {
        throw new UnsupportedOperationException("DelegatingGlobalSearchScope.getDelegate() is not available in Consulo: " + scope);
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
