package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiJavaModule extends com.intellij.psi.PsiElement, com.intellij.psi.PsiModifierListOwner, com.intellij.psi.NavigatablePsiElement, com.intellij.psi.PsiNameIdentifierOwner, com.intellij.psi.PsiJavaDocumentedElement {
    String MODULE_INFO_FILE = "module-info.java";
    String MODULE_INFO_CLASS = "module-info";
    String MODULE_INFO_CLS_FILE = "module-info.class";
    String JAVA_BASE = "java.base";
    String getName();
    com.intellij.psi.PsiIdentifier getNameIdentifier();
    // Added by consulo-internal/remap/genstub.py from com.intellij.java.language.psi.PsiJavaModule
    public static final java.util.Set<java.lang.String> UPGRADEABLE = null;
    public java.lang.Iterable<com.intellij.psi.PsiRequiresStatement> getRequires();
    public java.lang.Iterable<com.intellij.psi.PsiPackageAccessibilityStatement> getExports();
    public java.lang.Iterable<com.intellij.psi.PsiPackageAccessibilityStatement> getOpens();
    public java.lang.Iterable<com.intellij.psi.PsiUsesStatement> getUses();
    public java.lang.Iterable<com.intellij.psi.PsiProvidesStatement> getProvides();
    public default boolean doNotResolveByDefault() { return false; }
    public default boolean warnDeprecated() { return false; }
    public default boolean warnDeprecatedForRemoval() { return false; }
    public default boolean warnIncubating() { return false; }
}
