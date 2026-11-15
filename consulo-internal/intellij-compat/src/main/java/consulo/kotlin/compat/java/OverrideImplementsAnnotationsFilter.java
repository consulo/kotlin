package consulo.kotlin.compat.java;

import com.intellij.java.impl.codeInsight.generation.OverrideImplementsAnnotationsHandler;
import consulo.language.psi.PsiFile;

/**
 * IntelliJ {@code OverrideImplementsAnnotationsFilter}: whether an overriding member keeps an annotation of the member
 * it overrides. Consulo's Java plugin answers with its {@link OverrideImplementsAnnotationsHandler}s.
 */
public final class OverrideImplementsAnnotationsFilter {
    private OverrideImplementsAnnotationsFilter() {
    }

    public static boolean keepAnnotationOnOverrideMember(String fqName, PsiFile file) {
        for (OverrideImplementsAnnotationsHandler handler : OverrideImplementsAnnotationsHandler.EP_NAME.getExtensionList()) {
            for (String annotation : handler.getAnnotations(file.getProject())) {
                if (annotation.equals(fqName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
