package consulo.kotlin.compat.java;

import com.intellij.java.language.impl.psi.impl.compiled.ClsFieldImpl;
import com.intellij.java.language.impl.psi.impl.compiled.ClsParameterImpl;
import com.intellij.java.language.impl.psi.impl.java.stubs.PsiFieldStub;
import com.intellij.java.language.impl.psi.impl.java.stubs.PsiParameterStub;
import com.intellij.java.language.psi.PsiAnnotationOwner;
import com.intellij.java.language.psi.PsiArrayType;
import com.intellij.java.language.psi.PsiClass;
import com.intellij.java.language.psi.PsiClassType;
import com.intellij.java.language.psi.PsiMethod;
import com.intellij.java.language.psi.PsiParameter;
import com.intellij.java.language.psi.PsiPrimitiveType;
import com.intellij.java.language.psi.PsiType;
import com.intellij.java.language.psi.util.ClassUtil;
import com.intellij.java.language.psi.util.TypeConversionUtil;
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

    /** IntelliJ {@code ClassUtil.getAsmMethodSignature(PsiMethod)}: the JVM descriptor of the erased method. */
    public static String getAsmMethodSignature(PsiMethod method) {
        StringBuilder signature = new StringBuilder("(");
        for (PsiParameter parameter : method.getParameterList().getParameters()) {
            signature.append(descriptor(parameter.getType()));
        }
        PsiType returnType = method.getReturnType();
        return signature.append(')').append(returnType == null ? "V" : descriptor(returnType)).toString();
    }

    private static String descriptor(PsiType type) {
        PsiType erased = TypeConversionUtil.erasure(type);
        if (erased instanceof PsiArrayType arrayType) {
            return "[" + descriptor(arrayType.getComponentType());
        }
        if (erased instanceof PsiPrimitiveType) {
            return switch (erased.getCanonicalText()) {
                case "boolean" -> "Z";
                case "byte" -> "B";
                case "char" -> "C";
                case "short" -> "S";
                case "int" -> "I";
                case "long" -> "J";
                case "float" -> "F";
                case "double" -> "D";
                default -> "V";
            };
        }
        if (erased instanceof PsiClassType classType) {
            PsiClass psiClass = classType.resolve();
            String name = psiClass == null ? null : ClassUtil.getJVMClassName(psiClass);
            return "L" + (name == null ? classType.getCanonicalText() : name).replace('.', '/') + ";";
        }
        return "Ljava/lang/Object;";
    }
}
