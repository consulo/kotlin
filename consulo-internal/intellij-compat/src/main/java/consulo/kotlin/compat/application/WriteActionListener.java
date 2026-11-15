package consulo.kotlin.compat.application;

/** Remap target of {@code com.intellij.openapi.application.WriteActionListener}. */
public interface WriteActionListener {
    default void beforeWriteActionStart(Class<?> action) {
    }

    default void writeActionStarted(Class<?> action) {
    }

    default void writeActionFinished(Class<?> action) {
    }

    default void afterWriteActionFinished(Class<?> action) {
    }
}
