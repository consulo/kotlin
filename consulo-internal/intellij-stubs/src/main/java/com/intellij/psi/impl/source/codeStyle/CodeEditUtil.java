package com.intellij.psi.impl.source.codeStyle;

@SuppressWarnings("all")
public final class CodeEditUtil {
  public static void addChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2) {}
  public static void removeChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1) {}
  public static com.intellij.lang.ASTNode addChildren(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2, com.intellij.lang.ASTNode p3) { return null; }
  public static void saveWhitespacesInfo(com.intellij.lang.ASTNode p0) {}
  public static int getOldIndentation(com.intellij.lang.ASTNode p0) { return 0; }
  public static void removeChildren(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2) {}
  public static void replaceChild(com.intellij.lang.ASTNode p0, com.intellij.lang.ASTNode p1, com.intellij.lang.ASTNode p2) {}
  public static void markToReformatBefore(com.intellij.lang.ASTNode p0, boolean p1) {}
  public static boolean isNodeGenerated(com.intellij.lang.ASTNode p0) { return false; }
  public static void setNodeGenerated(com.intellij.lang.ASTNode p0, boolean p1) {}
  public static void setNodeGeneratedRecursively(com.intellij.lang.ASTNode p0, boolean p1) {}
  public static void setOldIndentation(com.intellij.psi.impl.source.tree.TreeElement p0, int p1) {}
  public static boolean isMarkedToReformatBefore(com.intellij.psi.impl.source.tree.TreeElement p0) { return false; }
  public static com.intellij.psi.PsiElement createLineFeed(com.intellij.psi.PsiManager p0) { return null; }
  public static boolean isMarkedToReformat(com.intellij.lang.ASTNode p0) { return false; }
  public static void markToReformat(com.intellij.lang.ASTNode p0, boolean p1) {}
  public static void allowToMarkNodesForPostponedFormatting(boolean p0) {}
  public static boolean isSuspendedNodesReformattingAllowed() { return false; }
  public static void setAllowSuspendNodesReformatting(boolean p0) {}
  public static void setNodeReformatStrategy(com.intellij.util.NotNullFunction<? super com.intellij.lang.ASTNode, java.lang.Boolean> p0) {}
}
