package consulo.kotlin.compat.application;

import consulo.application.ApplicationManager;

/** Remap target of {@code com.intellij.openapi.application.ex.ApplicationManagerEx} (Consulo's is internal). */
public final class ApplicationManagerEx {
    private ApplicationManagerEx() {
    }

    public static ApplicationEx getApplicationEx() {
        return new ApplicationEx(ApplicationManager.getApplication());
    }
}
