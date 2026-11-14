package com.intellij.util;

@SuppressWarnings("all")
public class AstLoadingFilter {
    public static <T, E extends Throwable> T forceAllowTreeLoading(com.intellij.psi.PsiFile file, com.intellij.openapi.util.ThrowableComputable<T, E> computable) throws E { return computable.compute(); }
    public static <T, E extends Throwable> T forceAllowTreeLoading(com.intellij.psi.PsiFile file, java.util.function.Supplier<T> computable) { return computable.get(); }
    public static <E extends Throwable> void forceAllowTreeLoading(com.intellij.psi.PsiFile file, com.intellij.openapi.util.ThrowableRunnable<E> runnable) throws E { runnable.run(); }
    public static <T, E extends Throwable> T disallowTreeLoading(com.intellij.openapi.util.ThrowableComputable<T, E> computable) throws E { return computable.compute(); }
    public static <T, E extends Throwable> T disallowTreeLoading(com.intellij.openapi.util.ThrowableComputable<T, E> computable, java.util.function.Supplier<String> msg) throws E { return computable.compute(); }
    public static void assertTreeLoadingAllowed(com.intellij.openapi.vfs.VirtualFile file) {}
}
