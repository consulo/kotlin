package com.intellij.psi;

@SuppressWarnings("all")
public interface JavaCodeFragment extends com.intellij.psi.PsiImportHolder,com.intellij.psi.PsiCodeFragment {
  public abstract boolean importClass(com.intellij.psi.PsiClass p0);
  public abstract void forceResolveScope(com.intellij.psi.search.GlobalSearchScope p0);
  public abstract com.intellij.psi.search.GlobalSearchScope getForcedResolveScope();
  interface VisibilityChecker { VisibilityChecker EVERYTHING_VISIBLE = new VisibilityChecker() {}; }
  interface ExceptionHandler {}
  public abstract com.intellij.psi.PsiType getThisType();
  public abstract void setThisType(com.intellij.psi.PsiType p0);
  public abstract com.intellij.psi.PsiType getSuperType();
  public abstract void setSuperType(com.intellij.psi.PsiType p0);
  public abstract java.lang.String importsToString();
  public abstract void addImportsFromString(java.lang.String p0);
  public abstract void setVisibilityChecker(com.intellij.psi.JavaCodeFragment.VisibilityChecker p0);
  public abstract com.intellij.psi.JavaCodeFragment.VisibilityChecker getVisibilityChecker();
  public abstract void setExceptionHandler(com.intellij.psi.JavaCodeFragment.ExceptionHandler p0);
  public abstract com.intellij.psi.JavaCodeFragment.ExceptionHandler getExceptionHandler();
}
