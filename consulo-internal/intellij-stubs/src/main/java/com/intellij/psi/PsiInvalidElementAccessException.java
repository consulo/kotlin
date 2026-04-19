package com.intellij.psi;

@SuppressWarnings("all")
public final class PsiInvalidElementAccessException extends java.lang.RuntimeException implements com.intellij.openapi.diagnostic.ExceptionWithAttachments {
  public PsiInvalidElementAccessException(com.intellij.psi.PsiElement p0) { throw new UnsupportedOperationException("stub"); }
  public PsiInvalidElementAccessException(com.intellij.psi.PsiElement p0, java.lang.String p1) { throw new UnsupportedOperationException("stub"); }
  public PsiInvalidElementAccessException(com.intellij.psi.PsiElement p0, java.lang.Throwable p1) { throw new UnsupportedOperationException("stub"); }
  public PsiInvalidElementAccessException(com.intellij.psi.PsiElement p0, java.lang.String p1, java.lang.Throwable p2) { throw new UnsupportedOperationException("stub"); }
  public static com.intellij.psi.PsiInvalidElementAccessException createByNode(com.intellij.lang.ASTNode p0, java.lang.String p1) { return null; }
  public java.lang.String getMessage() { return null; }
  public com.intellij.openapi.diagnostic.Attachment[] getAttachments() { return null; }
  public static java.lang.Object findInvalidationTrace(com.intellij.lang.ASTNode p0) { return null; }
  public static java.lang.String findOutInvalidationReason(com.intellij.psi.PsiElement p0) { return null; }
  public static void setInvalidationTrace(com.intellij.openapi.util.UserDataHolder p0, java.lang.Object p1) {}
  public static java.lang.Object getInvalidationTrace(com.intellij.openapi.util.UserDataHolder p0) { return null; }
  public static boolean isTrackingInvalidation() { return false; }
  public com.intellij.psi.PsiElement getPsiElement() { return null; }
}
