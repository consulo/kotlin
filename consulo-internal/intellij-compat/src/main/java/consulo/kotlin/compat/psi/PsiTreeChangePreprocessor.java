package consulo.kotlin.compat.psi;

import consulo.annotation.component.ComponentScope;
import consulo.annotation.component.ExtensionAPI;

/**
 * Remap target of {@code com.intellij.psi.impl.PsiTreeChangePreprocessor}: sees every PSI change with its kind,
 * dispatched by {@link PsiTreeChangeDispatcher}.
 */
@ExtensionAPI(ComponentScope.PROJECT)
public interface PsiTreeChangePreprocessor {
    void treeChanged(PsiTreeChangeEventImpl event);
}
