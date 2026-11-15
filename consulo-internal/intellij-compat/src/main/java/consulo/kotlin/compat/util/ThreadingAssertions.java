package consulo.kotlin.compat.util;

import consulo.application.Application;

/** IntelliJ {@code com.intellij.util.concurrency.ThreadingAssertions}, on Consulo's application asserts. */
public final class ThreadingAssertions {
    private ThreadingAssertions() {
    }

    public static void assertWriteAccess() {
        Application.get().assertWriteAccessAllowed();
    }

    public static void assertReadAccess() {
        Application.get().assertReadAccessAllowed();
    }

    public static void assertEventDispatchThread() {
        Application.get().assertIsDispatchThread();
    }
}
