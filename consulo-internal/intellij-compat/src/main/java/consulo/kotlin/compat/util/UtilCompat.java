package consulo.kotlin.compat.util;

import consulo.application.Application;
import consulo.application.util.CachedValueProvider;
import consulo.application.util.CachedValuesManager;
import consulo.application.util.LowMemoryWatcher;
import consulo.application.util.function.Computable;
import consulo.content.scope.SearchScope;
import consulo.disposer.Disposable;
import consulo.language.psi.PsiElement;
import consulo.language.psi.scope.GlobalSearchScope;
import consulo.language.psi.scope.LocalSearchScope;
import consulo.project.DumbService;
import consulo.util.lang.StringUtil;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * IntelliJ utility API that Consulo lacks or names differently. Calls are redirected here by remap.xml.
 */
public final class UtilCompat {
    private UtilCompat() {
    }

    public static String escapeStringCharacters(String s) {
        StringBuilder buffer = new StringBuilder(s.length());
        StringUtil.escapeStringCharacters(s.length(), s, "\"", buffer);
        return buffer.toString();
    }

    public static String unescapeStringCharacters(String s) {
        StringBuilder buffer = new StringBuilder(s.length());
        StringUtil.unescapeStringCharacters(s.length(), s, buffer);
        return buffer.toString();
    }

    public static <K, V> V cacheOrGet(ConcurrentMap<K, V> map, K key, V defaultValue) {
        V prev = map.putIfAbsent(key, defaultValue);
        return prev == null ? defaultValue : prev;
    }

    public static boolean isEmptyScope(SearchScope scope) {
        return scope == GlobalSearchScope.EMPTY_SCOPE || scope == LocalSearchScope.EMPTY;
    }

    /** IntelliJ static {@code CachedValuesManager.getCachedValue(PsiElement, provider)}. */
    public static <T> T getCachedValue(PsiElement element, CachedValueProvider<T> provider) {
        return CachedValuesManager.getManager(element.getProject()).getCachedValue(element, provider);
    }

    public static <T> T runReadAction(Application application, Computable<T> computation) {
        return application.runReadAction((Supplier<T>) computation::compute);
    }

    /** Consulo's variant returns nothing; IntelliJ callers that keep the watcher get {@code null}. */
    public static LowMemoryWatcher register(Runnable runnable, Disposable parentDisposable) {
        LowMemoryWatcher.register(runnable, parentDisposable);
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> filterByDumbAwareness(DumbService service, List<T> collection) {
        return service.filterByDumbAwareness((Collection<T>) collection);
    }
}
