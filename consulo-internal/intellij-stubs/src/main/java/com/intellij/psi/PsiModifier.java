package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiModifier {
    String PUBLIC = "public";
    String PROTECTED = "protected";
    String PRIVATE = "private";
    String PACKAGE_LOCAL = "packageLocal";
    String STATIC = "static";
    String ABSTRACT = "abstract";
    String FINAL = "final";
    String NATIVE = "native";
    String SYNCHRONIZED = "synchronized";
    String STRICTFP = "strictfp";
    String TRANSIENT = "transient";
    String VOLATILE = "volatile";
    String DEFAULT = "default";
    String OPEN = "open";
    String TRANSITIVE = "transitive";
    String SEALED = "sealed";
    String NON_SEALED = "non-sealed";
    String[] MODIFIERS = {PUBLIC, PROTECTED, PRIVATE, STATIC, ABSTRACT, FINAL, NATIVE, SYNCHRONIZED, STRICTFP, TRANSIENT, VOLATILE, DEFAULT};
}
