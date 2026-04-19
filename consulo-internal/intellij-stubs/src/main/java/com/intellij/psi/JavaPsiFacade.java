package com.intellij.psi;

@SuppressWarnings("all")
public abstract class JavaPsiFacade {
  public JavaPsiFacade() { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.JavaPsiFacade getInstance(com.intellij.openapi.project.Project p0) { return null; }
  public static com.intellij.psi.PsiElementFactory getElementFactory(com.intellij.openapi.project.Project p0) { return null; }
  public abstract com.intellij.psi.PsiClass findClass(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1);
  public abstract com.intellij.psi.PsiClass[] findClasses(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1);
  public abstract boolean hasClass(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1);
  public abstract com.intellij.psi.PsiPackage findPackage(java.lang.String p0);
  public abstract com.intellij.psi.PsiJavaModule findModule(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1);
  public abstract java.util.Collection<com.intellij.psi.PsiJavaModule> findModules(java.lang.String p0, com.intellij.psi.search.GlobalSearchScope p1);
  public abstract com.intellij.psi.PsiElementFactory getElementFactory();
  public abstract com.intellij.psi.PsiJavaParserFacade getParserFacade();
  public abstract com.intellij.psi.PsiResolveHelper getResolveHelper();
  public abstract com.intellij.psi.PsiNameHelper getNameHelper();
  public abstract com.intellij.psi.PsiConstantEvaluationHelper getConstantEvaluationHelper();
  public abstract boolean isPartOfPackagePrefix(java.lang.String p0);
  public abstract boolean isInPackage(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiPackage p1);
  public abstract boolean arePackagesTheSame(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1);
  public abstract com.intellij.openapi.project.Project getProject();
  public abstract boolean isConstantExpression(com.intellij.psi.PsiExpression p0);
}
