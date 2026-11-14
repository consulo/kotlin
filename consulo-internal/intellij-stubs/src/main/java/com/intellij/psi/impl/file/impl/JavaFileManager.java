package com.intellij.psi.impl.file.impl;

@SuppressWarnings("all")
public interface JavaFileManager {
    com.intellij.psi.PsiPackage findPackage(String packageName);
    com.intellij.psi.PsiClass findClass(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope);
    com.intellij.psi.PsiClass[] findClasses(String qualifiedName, com.intellij.psi.search.GlobalSearchScope scope);
    java.util.Collection<String> getNonTrivialPackagePrefixes();
    com.intellij.psi.PsiJavaModule findModule(String moduleName, com.intellij.psi.search.GlobalSearchScope scope);
    java.util.Collection<com.intellij.psi.PsiJavaModule> findModules(String moduleName, com.intellij.psi.search.GlobalSearchScope scope);
}
