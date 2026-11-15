package consulo.kotlin.compat.java;

import com.intellij.java.language.impl.psi.impl.light.LightParameterListBuilder;
import com.intellij.java.language.psi.PsiParameter;
import com.intellij.java.language.psi.PsiType;

/** IntelliJ Java PSI calls whose Consulo counterparts differ in signature. Calls are redirected here by remap.xml. */
public final class JavaTypeCompat {
    private JavaTypeCompat() {
    }

    /** {@code PsiType.createArrayType()}: Consulo declares PsiArrayType as the result */
    public static PsiType createArrayType(PsiType type) {
        return type.createArrayType();
    }

    /** {@code LightParameterListBuilder.addParameter(PsiParameter)}: IntelliJ returns the builder */
    public static LightParameterListBuilder addParameter(LightParameterListBuilder builder, PsiParameter parameter) {
        builder.addParameter(parameter);
        return builder;
    }
}
