package consulo.kotlin.compat.extensions;

import consulo.component.ComponentManager;
import consulo.project.Project;

import java.util.List;

/** IntelliJ {@code com.intellij.openapi.extensions.ProjectExtensionPointName}. */
public final class ProjectExtensionPointName<T> {
    private final String myName;

    public ProjectExtensionPointName(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public List<T> getExtensions(Project project) {
        return getExtensionList(project);
    }

    public List<T> getExtensionList(Project project) {
        return new NamedExtensionPoint<T>(myName, project).getExtensionList();
    }

    public ExtensionPoint<T> getPoint(ComponentManager area) {
        return new NamedExtensionPoint<>(myName, area);
    }
}
