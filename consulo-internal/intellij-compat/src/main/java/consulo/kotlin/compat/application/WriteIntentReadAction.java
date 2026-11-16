package consulo.kotlin.compat.application;

import java.util.function.Supplier;

/**
 * IntelliJ's {@code WriteIntentReadAction}: code on the UI thread that may start a write action. Consulo has no
 * write-intent lock; the UI thread runs it as it is.
 */
public final class WriteIntentReadAction {
    private WriteIntentReadAction() {
    }

    public static void run(Runnable action) {
        action.run();
    }

    public static <T> T compute(Supplier<T> action) {
        return action.get();
    }
}
