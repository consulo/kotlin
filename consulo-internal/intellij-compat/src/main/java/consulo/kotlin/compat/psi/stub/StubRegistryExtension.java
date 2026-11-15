package consulo.kotlin.compat.psi.stub;

import consulo.annotation.component.ComponentScope;
import consulo.annotation.component.ExtensionAPI;
/** IntelliJ {@code com.intellij.psi.stubs.StubRegistryExtension}. */
@ExtensionAPI(ComponentScope.APPLICATION)
public interface StubRegistryExtension {
    void register(StubRegistry registry);
}
