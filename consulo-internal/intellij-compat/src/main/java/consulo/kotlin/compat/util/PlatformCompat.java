package consulo.kotlin.compat.util;

import consulo.application.util.CachedValuesManager;
import consulo.component.util.Iconable;
import consulo.container.boot.ContainerPathManager;
import consulo.content.scope.SearchScope;
import consulo.disposer.Disposable;
import consulo.language.ast.IElementType;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiModificationTracker;
import consulo.language.psi.scope.GlobalSearchScope;
import consulo.language.psi.scope.LocalSearchScope;
import consulo.language.psi.util.PsiTreeUtil;
import consulo.project.Project;
import consulo.ui.image.Image;
import consulo.util.collection.ContainerUtil;
import consulo.util.collection.HashingStrategy;
import consulo.util.lang.StringUtil;
import consulo.util.lang.function.Condition;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/** IntelliJ platform calls whose Consulo counterparts differ in signature. Calls are redirected here by remap.xml. */
public final class PlatformCompat {
    private PlatformCompat() {
    }

    /** {@code Disposer.newDisposable()} */
    public static Disposable newDisposable() {
        return Disposable.newDisposable();
    }

    /** {@code Disposer.newDisposable(String)} */
    public static Disposable newDisposable(String debugName) {
        return Disposable.newDisposable(debugName);
    }

    /** {@code Application.assertWriteIntentLockAcquired()}: Consulo has no write-intent lock. */
    public static void assertWriteIntentLockAcquired(consulo.application.Application application) {
    }

    /** {@code CachedValuesManager.getManager(Project)} */
    public static CachedValuesManager getCachedValuesManager(Project project) {
        return CachedValuesManager.getManager(project);
    }

    /** {@code GlobalSearchScope.isEmptyScope(SearchScope)} */
    public static boolean isEmptyScope(SearchScope scope) {
        return scope == GlobalSearchScope.EMPTY_SCOPE || scope == LocalSearchScope.EMPTY;
    }

    /** {@code GlobalSearchScope.union(Collection)} */
    public static GlobalSearchScope union(Collection<? extends GlobalSearchScope> scopes) {
        return GlobalSearchScope.union(scopes.toArray(GlobalSearchScope[]::new));
    }

    /** {@code PsiTreeUtil.findFirstParent(PsiElement, boolean, Condition)} */
    public static PsiElement findFirstParent(PsiElement element, boolean strict, Condition<? super PsiElement> condition) {
        return PsiTreeUtil.findFirstParent(element, strict, condition::value);
    }

    /** {@code PsiTreeUtil.findFirstContext(PsiElement, boolean, Condition)}: like findFirstParent, along contexts. */
    public static PsiElement findFirstContext(PsiElement element, boolean strict, Condition<? super PsiElement> condition) {
        PsiElement current = strict && element != null ? element.getContext() : element;
        while (current != null) {
            if (condition.value(current)) {
                return current;
            }
            current = current.getContext();
        }
        return null;
    }

    /** {@code ContainerUtil.createConcurrentWeakKeySoftValueMap()} */
    public static <K, V> ConcurrentMap<K, V> createConcurrentWeakKeySoftValueMap() {
        return ContainerUtil.createConcurrentWeakKeySoftValueMap(100, 0.75f, Runtime.getRuntime().availableProcessors(), HashingStrategy.canonical());
    }

    /** {@code ContainerUtil.exists(Iterable, Condition)} */
    public static <T> boolean exists(Iterable<? extends T> iterable, Condition<? super T> condition) {
        return ContainerUtil.exists(iterable, condition::value);
    }

    /** {@code ContainerUtil.quickSort(List, Comparator)} */
    public static <T> void quickSort(List<T> list, Comparator<? super T> comparator) {
        list.sort(comparator);
    }

    /** {@code StringUtil.escapeCharCharacters(String)} */
    public static String escapeCharCharacters(String s) {
        return StringUtil.escapeCharCharacters(s);
    }

    /** {@code IElementType.getDebugName()}: Consulo's element types print their debug name. */
    public static String getDebugName(IElementType type) {
        return type.toString();
    }

    /** {@code PsiModificationTracker.MODIFICATION_COUNT} as a cached value dependency */
    public static Object modificationCount() {
        return MODIFICATION_COUNT;
    }

    // read reflectively: remap.xml redirects reads of this field to modificationCount()
    private static final Object MODIFICATION_COUNT;

    static {
        try {
            MODIFICATION_COUNT = PsiModificationTracker.class.getField("MODIFICATION_COUNT").get(null);
        }
        catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /** {@code getIcon(int)} of a PSI element: Consulo PSI elements are not necessarily {@link Iconable}. */
    public static Image getIcon(PsiElement element, int flags) {
        if (!(element instanceof Iconable iconable)) {
            return null;
        }
        // a method reference: remap.xml redirects direct getIcon(int) calls here
        java.util.function.IntFunction<Image> getIcon = iconable::getIcon;
        return getIcon.apply(flags);
    }

    /** {@code PathManager.getLogDir()} */
    public static Path getLogDir() {
        return ContainerPathManager.get().getLogPath().toPath();
    }
}
