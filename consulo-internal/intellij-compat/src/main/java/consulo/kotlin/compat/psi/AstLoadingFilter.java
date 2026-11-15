package consulo.kotlin.compat.psi;

import consulo.application.util.function.ThrowableComputable;
import consulo.language.psi.PsiFile;
import consulo.util.lang.function.ThrowableRunnable;
import consulo.virtualFileSystem.VirtualFile;

import java.util.function.Supplier;

/**
 * Remap target of {@code com.intellij.util.AstLoadingFilter}. Consulo's filter is internal (not exported to plugins);
 * the filter only asserts against unwanted AST loading, so here it just runs the code.
 */
public final class AstLoadingFilter {
    private AstLoadingFilter() {
    }

    public static <T, E extends Throwable> T forceAllowTreeLoading(PsiFile file, ThrowableComputable<T, E> computable) throws E {
        return computable.compute();
    }

    public static <T, E extends Throwable> T forceAllowTreeLoading(PsiFile file, Supplier<T> computable) {
        return computable.get();
    }

    public static <E extends Throwable> void forceAllowTreeLoading(PsiFile file, ThrowableRunnable<E> runnable) throws E {
        runnable.run();
    }

    public static <T, E extends Throwable> T disallowTreeLoading(ThrowableComputable<T, E> computable) throws E {
        return computable.compute();
    }

    public static <T, E extends Throwable> T disallowTreeLoading(ThrowableComputable<T, E> computable, Supplier<String> message) throws E {
        return computable.compute();
    }

    public static void assertTreeLoadingAllowed(VirtualFile file) {
    }
}
