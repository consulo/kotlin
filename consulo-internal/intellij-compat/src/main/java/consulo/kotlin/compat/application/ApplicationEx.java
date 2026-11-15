package consulo.kotlin.compat.application;

import consulo.application.Application;
import consulo.application.event.ApplicationListener;
import consulo.disposer.Disposable;

/** Remap target of {@code com.intellij.openapi.application.ex.ApplicationEx}: the parts used, on the public API. */
public final class ApplicationEx {
    private final Application myApplication;

    ApplicationEx(Application application) {
        myApplication = application;
    }

    public void addWriteActionListener(WriteActionListener listener, Disposable parentDisposable) {
        myApplication.addApplicationListener(new ApplicationListener() {
            @Override
            public void beforeWriteActionStart(Object action) {
                listener.beforeWriteActionStart(action.getClass());
            }

            @Override
            public void writeActionStarted(Object action) {
                listener.writeActionStarted(action.getClass());
            }

            @Override
            public void writeActionFinished(Object action) {
                listener.writeActionFinished(action.getClass());
            }

            @Override
            public void afterWriteActionFinished(Object action) {
                listener.afterWriteActionFinished(action.getClass());
            }
        }, parentDisposable);
    }
}
