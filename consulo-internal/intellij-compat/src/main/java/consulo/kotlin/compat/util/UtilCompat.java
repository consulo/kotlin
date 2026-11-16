package consulo.kotlin.compat.util;

import consulo.util.lang.function.Condition;
import consulo.language.Language;
import consulo.util.collection.ConcurrentList;
import consulo.util.collection.Lists;
import consulo.ui.image.Image;
import consulo.application.progress.ProgressIndicator;
import consulo.application.util.matcher.NameUtil;
import consulo.application.util.matcher.NameUtilCore;
import consulo.content.scope.SearchScope;
import consulo.application.util.function.Computable;
import consulo.application.progress.ProgressManager;
import consulo.localize.LocalizeValue;
import consulo.project.Project;
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

    /** IntelliJ {@code NameUtilCore.nameToWordList}. */
    public static java.util.List<String> nameToWordList(String name) {
        return java.util.Arrays.asList(NameUtilCore.nameToWords(name));
    }

    /** IntelliJ {@code NameUtil.splitNameIntoWordList}. */
    public static java.util.List<String> splitNameIntoWordList(String name) {
        return java.util.Arrays.asList(NameUtil.splitNameIntoWords(name));
    }

    /** IntelliJ {@code SearchScope.toFullString()}: a description of the scope, for messages. */
    public static String toFullString(SearchScope scope) {
        return scope.toString();
    }

    /** IntelliJ {@code ActionUtil.underModalProgress}: computes under a modal progress. */
    public static <T> T underModalProgress(Project project, String progressTitle, Computable<T> computable) {
        return ProgressManager.getInstance().runProcessWithProgressSynchronously(
            (consulo.util.lang.function.ThrowableSupplier<T, RuntimeException>) computable::compute, LocalizeValue.of(progressTitle), true, project);
    }

    /** IntelliJ {@code ProgressIndicator.getText()}: a string; Consulo's is a LocalizeValue. */
    public static String getText(ProgressIndicator indicator) {
        return indicator.getText().get();
    }

    /** IntelliJ {@code ProgressIndicator.getText2()}: a string; Consulo's is a LocalizeValue. */
    public static String getText2(ProgressIndicator indicator) {
        return indicator.getText2().get();
    }

    /** IntelliJ {@code Application.runWriteAction(Computable)}: Consulo takes the Supplier it extends. */
    public static <T> T runWriteAction(Application application, Computable<T> computation) {
        return application.runWriteAction((java.util.function.Supplier<T>) computation);
    }

    /** IntelliJ {@code Application.invokeLater(runnable, expired)} with a Condition; Consulo takes a BooleanSupplier. */
    public static void invokeLater(Application application, Runnable runnable, Condition<?> expired) {
        application.invokeLater(runnable, () -> expired.test(null));
    }

    /** IntelliJ {@code Language.getDisplayName()}: a string. */
    public static String getDisplayName(Language language) {
        return language.getDisplayName().get();
    }

    /** IntelliJ {@code ContainerUtil.createConcurrentList()}. */
    public static <T> ConcurrentList<T> createConcurrentList() {
        return Lists.newLockFreeCopyOnWriteList();
    }

    /** IntelliJ {@code ContainerUtil.newHashSet(elements)}. */
    @SafeVarargs
    public static <T> java.util.HashSet<T> newHashSet(T... elements) {
        return new java.util.HashSet<>(java.util.Arrays.asList(elements));
    }

    /** IntelliJ {@code StringUtil.isNumeric(text)}: non-empty, digits only. */
    public static boolean isNumeric(CharSequence text) {
        if (text == null || text.length() == 0) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /** IntelliJ {@code StringUtil.unescapeXmlEntities}. */
    public static String unescapeXmlEntities(String text) {
        return StringUtil.unescapeXml(text);
    }

    /** IntelliJ {@code Icon.getIconWidth()} of an icon that is a Consulo image here. */
    public static int getIconWidth(Image image) {
        return image.getWidth();
    }

    /** IntelliJ {@code Icon.getIconHeight()} of an icon that is a Consulo image here. */
    public static int getIconHeight(Image image) {
        return image.getHeight();
    }

    /** IntelliJ {@code ExperimentalUI.isNewUI()}: the plugin shows the new UI icons. */
    public static boolean isNewUI() {
        return true;
    }

    /** IntelliJ {@code IncompleteModelUtil.isIncompleteModel(element)}: Consulo has no incomplete project model state. */
    public static boolean isIncompleteModel(Object element) {
        return false;
    }
}
