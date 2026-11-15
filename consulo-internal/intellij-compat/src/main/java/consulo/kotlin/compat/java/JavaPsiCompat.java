package consulo.kotlin.compat.java;

import com.intellij.java.language.impl.psi.impl.compiled.ClsFieldImpl;
import com.intellij.java.language.impl.psi.impl.compiled.ClsParameterImpl;
import com.intellij.java.language.impl.psi.impl.java.stubs.PsiFieldStub;
import com.intellij.java.language.impl.psi.impl.java.stubs.PsiParameterStub;
import com.intellij.java.language.psi.PsiAnnotationOwner;
import com.intellij.java.language.psi.PsiClassType;
import com.intellij.java.language.psi.PsiJavaPackage;
import com.intellij.java.language.psi.PsiTypeParameter;

/**
 * IntelliJ Java PSI signatures that differ in Consulo's Java plugin (mostly covariant overrides it lacks).
 */
public final class JavaPsiCompat {
    private JavaPsiCompat() {
    }

    public static PsiFieldStub getStub(ClsFieldImpl field) {
        return (PsiFieldStub) field.getStub();
    }

    public static PsiParameterStub getStub(ClsParameterImpl parameter) {
        return (PsiParameterStub) parameter.getStub();
    }

    /** IntelliJ {@code PsiTypeParameter.getBounds()}: the extends list types. */
    public static PsiClassType[] getBounds(PsiTypeParameter parameter) {
        return parameter.getExtendsListTypes();
    }

    public static PsiAnnotationOwner getAnnotationList(PsiJavaPackage aPackage) {
        return aPackage.getAnnotationList();
    }
}
