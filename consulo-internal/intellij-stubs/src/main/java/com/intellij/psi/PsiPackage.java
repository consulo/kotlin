package com.intellij.psi;

@SuppressWarnings("all")
public interface PsiPackage extends com.intellij.psi.PsiCheckedRenameElement,com.intellij.navigation.NavigationItem,com.intellij.psi.PsiJvmModifiersOwner,com.intellij.psi.PsiDirectoryContainer,com.intellij.psi.PsiQualifiedNamedElement,com.intellij.lang.jvm.JvmPackage {
  public abstract java.lang.String getQualifiedName();
  public abstract com.intellij.psi.PsiPackage getParentPackage();
  public abstract com.intellij.psi.PsiPackage[] getSubPackages();
  public abstract com.intellij.psi.PsiPackage[] getSubPackages(com.intellij.psi.search.GlobalSearchScope p0);
  public abstract com.intellij.psi.PsiClass[] getClasses();
  public abstract com.intellij.psi.PsiClass[] getClasses(com.intellij.psi.search.GlobalSearchScope p0);
  public abstract com.intellij.psi.PsiFile[] getFiles(com.intellij.psi.search.GlobalSearchScope p0);
  public abstract com.intellij.psi.PsiModifierList getAnnotationList();
  public abstract void handleQualifiedNameChange(java.lang.String p0);
  public abstract com.intellij.openapi.vfs.VirtualFile[] occursInPackagePrefixes();
  public abstract java.lang.String getName();
  public abstract boolean containsClassNamed(java.lang.String p0);
  public abstract com.intellij.psi.PsiClass[] findClassByShortName(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1);
  public default boolean hasClassWithShortName(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1) { return false; }
}
