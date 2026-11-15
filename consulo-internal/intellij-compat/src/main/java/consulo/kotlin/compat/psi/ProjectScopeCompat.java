package consulo.kotlin.compat.psi;

import consulo.language.psi.scope.GlobalSearchScope;
import consulo.project.Project;
import consulo.project.content.scope.ProjectScopes;

/**
 * IntelliJ {@code ProjectScope}: Consulo's {@link ProjectScopes} declares {@code ProjectAwareSearchScope}, the scopes
 * themselves are global search scopes.
 */
public final class ProjectScopeCompat {
    private ProjectScopeCompat() {
    }

    public static GlobalSearchScope getAllScope(Project project) {
        return global(ProjectScopes.getAllScope(project));
    }

    public static GlobalSearchScope getProjectScope(Project project) {
        return global(ProjectScopes.getProjectScope(project));
    }

    public static GlobalSearchScope getLibrariesScope(Project project) {
        return global(ProjectScopes.getLibrariesScope(project));
    }

    public static GlobalSearchScope getContentScope(Project project) {
        return global(ProjectScopes.getContentScope(project));
    }

    public static GlobalSearchScope getEverythingScope(Project project) {
        return global(ProjectScopes.getEverythingScope(project));
    }

    private static GlobalSearchScope global(Object scope) {
        return (GlobalSearchScope) scope;
    }
}
