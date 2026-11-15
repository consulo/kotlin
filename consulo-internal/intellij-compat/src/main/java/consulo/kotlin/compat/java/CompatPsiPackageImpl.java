package consulo.kotlin.compat.java;

import com.intellij.java.language.impl.psi.impl.file.PsiPackageImpl;
import com.intellij.java.language.psi.JavaPsiFacade;
import consulo.java.language.module.extension.JavaModuleExtension;
import consulo.language.psi.PsiManager;
import consulo.language.psi.PsiPackageManager;

/**
 * Remap target of {@code com.intellij.psi.impl.file.PsiPackageImpl}: IntelliJ's (manager, qualifiedName)
 * constructor, filled in the same way Consulo's NonClasspathClassFinder creates Java packages.
 * A null manager makes a sentinel package (KotlinJavaPsiFacade.NULL_PACKAGE).
 */
public class CompatPsiPackageImpl extends PsiPackageImpl {
    public CompatPsiPackageImpl(PsiManager manager, String qualifiedName) {
        super(manager,
            manager == null ? null : PsiPackageManager.getInstance(manager.getProject()),
            manager == null ? null : JavaPsiFacade.getInstance(manager.getProject()),
            JavaModuleExtension.class,
            qualifiedName);
    }
}
