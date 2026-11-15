package consulo.kotlin.compat.util;

/**
 * IntelliJ {@code com.intellij.util.CachedValueBase}, used by Kotlin only to clear cached values eagerly. Consulo's is
 * internal, so no cached value is one of these and the values are left to their soft references.
 */
public abstract class CachedValueBase<T> {
    private CachedValueBase() {
    }

    public abstract void clear();
}
