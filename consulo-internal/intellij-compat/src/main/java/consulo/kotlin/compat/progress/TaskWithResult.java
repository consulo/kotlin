package consulo.kotlin.compat.progress;

import consulo.application.progress.ProgressIndicator;
import consulo.application.progress.ProgressManager;
import consulo.localize.LocalizeValue;
import consulo.project.Project;

/**
 * IntelliJ {@code Task.WithResult}: a modal task computing a value; {@link #queue()} runs it under a modal progress and
 * {@link #getResult()} returns the value (or rethrows the failure).
 */
public abstract class TaskWithResult<T, E extends Exception> {
    private final Project myProject;
    private final String myTitle;
    private final boolean myCanBeCancelled;
    private T myResult;
    private Throwable myError;

    protected TaskWithResult(Project project, String title, boolean canBeCancelled) {
        myProject = project;
        myTitle = title;
        myCanBeCancelled = canBeCancelled;
    }

    protected abstract T compute(ProgressIndicator indicator) throws E;

    public void queue() {
        ProgressManager.getInstance().runProcessWithProgressSynchronously(() -> {
            try {
                myResult = compute(ProgressManager.getInstance().getProgressIndicator());
            }
            catch (Throwable e) {
                myError = e;
            }
        }, LocalizeValue.of(myTitle), myCanBeCancelled, myProject);
    }

    @SuppressWarnings("unchecked")
    public T getResult() throws E {
        if (myError instanceof RuntimeException e) {
            throw e;
        }
        if (myError instanceof Error e) {
            throw e;
        }
        if (myError != null) {
            throw (E) myError;
        }
        return myResult;
    }
}
