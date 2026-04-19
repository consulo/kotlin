package com.intellij.psi.util;

@SuppressWarnings("all")
public class PsiTreeUtil {
  public PsiTreeUtil() { throw new UnsupportedOperationException("stub"); }
  public static boolean isAncestor(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, boolean p2) { return false; }
  public static boolean isContextAncestor(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, boolean p2) { return false; }
  public static com.intellij.psi.PsiElement findCommonParent(java.util.List<? extends com.intellij.psi.PsiElement> p0) { return null; }
  public static com.intellij.psi.PsiElement findCommonParent(com.intellij.psi.PsiElement... p0) { return null; }
  public static com.intellij.psi.PsiElement findCommonParent(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
  public static int getDepth(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return 0; }
  public static com.intellij.psi.PsiElement findCommonContext(java.util.Collection<? extends com.intellij.psi.PsiElement> p0) { return null; }
  public static com.intellij.psi.PsiElement findCommonContext(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findChildOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findChildOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, boolean p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findChildOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, boolean p2, java.lang.Class<? extends com.intellij.psi.PsiElement> p3) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findChildOfAnyType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findChildOfAnyType(com.intellij.psi.PsiElement p0, boolean p1, java.lang.Class<? extends T>... p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.Collection<T> findChildrenOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.Collection<T> findChildrenOfAnyType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.Collection<T> findChildrenOfAnyType(com.intellij.psi.PsiElement p0, boolean p1, java.lang.Class<? extends T>... p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getChildOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static com.intellij.psi.PsiElement findFirstParent(com.intellij.psi.PsiElement p0, com.intellij.openapi.util.Condition<? super com.intellij.psi.PsiElement> p1) { return null; }
  public static com.intellij.psi.PsiElement findFirstParent(com.intellij.psi.PsiElement p0, boolean p1, com.intellij.openapi.util.Condition<? super com.intellij.psi.PsiElement> p2) { return null; }
  public static com.intellij.psi.PsiElement findFirstContext(com.intellij.psi.PsiElement p0, boolean p1, com.intellij.openapi.util.Condition<? super com.intellij.psi.PsiElement> p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getRequiredChildOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static int countChildrenOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends com.intellij.psi.PsiElement> p1) { return 0; }
  public static <T extends com.intellij.psi.PsiElement> T[] getChildrenOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.List<T> getChildrenOfAnyType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.List<T> getChildrenOfTypeAsList(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T> p1) { return null; }
  public static java.util.List<com.intellij.psi.PsiElement> getElementsOfRange(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getStubChildOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.List<T> getStubChildrenOfTypeAsList(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T> p1) { return null; }
  public static boolean instanceOf(java.lang.Object p0, java.lang.Class<?>... p1) { return false; }
  public static <T extends com.intellij.psi.PsiElement> T getChildOfAnyType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getNextSiblingOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getPrevSiblingOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getTopmostParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1) { return null; }
  public static com.intellij.psi.PsiElement getStubOrPsiParent(com.intellij.psi.PsiElement p0) { return null; }
  public static <E extends com.intellij.psi.PsiElement> E getStubOrPsiParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<E> p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getContextOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, boolean p2, java.lang.Class<? extends com.intellij.psi.PsiElement>... p3) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getContextOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T> p1, boolean p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getContextOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getContextOfType(com.intellij.psi.PsiElement p0, boolean p1, java.lang.Class<? extends T>... p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, boolean p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, boolean p2, int p3) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, boolean p2, java.lang.Class<? extends com.intellij.psi.PsiElement>... p3) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.List<T> collectParents(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T> p1, boolean p2, java.util.function.Predicate<? super com.intellij.psi.PsiElement> p3) { return null; }
  public static com.intellij.psi.PsiElement findSiblingForward(com.intellij.psi.PsiElement p0, com.intellij.psi.tree.IElementType p1, com.intellij.util.Consumer<? super com.intellij.psi.PsiElement> p2) { return null; }
  public static com.intellij.psi.PsiElement findSiblingForward(com.intellij.psi.PsiElement p0, com.intellij.psi.tree.IElementType p1, boolean p2, com.intellij.util.Consumer<? super com.intellij.psi.PsiElement> p3) { return null; }
  public static com.intellij.psi.PsiElement findSiblingBackward(com.intellij.psi.PsiElement p0, com.intellij.psi.tree.IElementType p1, com.intellij.util.Consumer<? super com.intellij.psi.PsiElement> p2) { return null; }
  public static com.intellij.psi.PsiElement findSiblingBackward(com.intellij.psi.PsiElement p0, com.intellij.psi.tree.IElementType p1, boolean p2, com.intellij.util.Consumer<? super com.intellij.psi.PsiElement> p3) { return null; }
  public static com.intellij.psi.PsiElement skipSiblingsForward(com.intellij.psi.PsiElement p0, java.lang.Class<? extends com.intellij.psi.PsiElement>... p1) { return null; }
  public static com.intellij.psi.PsiElement skipWhitespacesForward(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement skipWhitespacesAndCommentsForward(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement skipSiblingsBackward(com.intellij.psi.PsiElement p0, java.lang.Class<? extends com.intellij.psi.PsiElement>... p1) { return null; }
  public static com.intellij.psi.PsiElement skipWhitespacesBackward(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement skipWhitespacesAndCommentsBackward(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement skipParentsOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends com.intellij.psi.PsiElement>... p1) { return null; }
  public static com.intellij.psi.PsiElement skipMatching(com.intellij.psi.PsiElement p0, java.util.function.Function<? super com.intellij.psi.PsiElement, ? extends com.intellij.psi.PsiElement> p1, java.util.function.Predicate<? super com.intellij.psi.PsiElement> p2) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getNonStrictParentOfType(com.intellij.psi.PsiElement p0, java.lang.Class<? extends T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T getParentOfType(com.intellij.psi.PsiElement p0, boolean p1, java.lang.Class<? extends T>... p2) { return null; }
  public static com.intellij.psi.PsiElement[] collectElements(com.intellij.psi.PsiElement p0, com.intellij.psi.util.PsiElementFilter p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> java.util.Collection<T> collectElementsOfType(com.intellij.psi.PsiElement p0, java.lang.Class<T>... p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> boolean processElements(com.intellij.psi.PsiElement p0, java.lang.Class<T> p1, com.intellij.psi.search.PsiElementProcessor<? super T> p2) { return false; }
  public static boolean processElements(com.intellij.psi.PsiElement p0, com.intellij.psi.search.PsiElementProcessor<? super com.intellij.psi.PsiElement> p1) { return false; }
  public static boolean processElements(com.intellij.psi.search.PsiElementProcessor<? super com.intellij.psi.PsiElement> p0, com.intellij.psi.PsiElement... p1) { return false; }
  public static void mark(com.intellij.psi.PsiElement p0, java.lang.Object p1) {}
  public static java.lang.Object mark(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement releaseMark(com.intellij.psi.PsiElement p0, java.lang.Object p1) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findElementOfClassAtOffset(com.intellij.psi.PsiFile p0, int p1, java.lang.Class<T> p2, boolean p3) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findElementOfClassAtOffsetWithStopSet(com.intellij.psi.PsiFile p0, int p1, java.lang.Class<T> p2, boolean p3, java.lang.Class<? extends com.intellij.psi.PsiElement>... p4) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findElementOfClassAtRange(com.intellij.psi.PsiFile p0, int p1, int p2, java.lang.Class<T> p3) { return null; }
  public static com.intellij.psi.PsiElement getDeepestFirst(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement getDeepestLast(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement prevLeaf(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement nextLeaf(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement lastChild(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement firstChild(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement prevLeaf(com.intellij.psi.PsiElement p0, boolean p1) { return null; }
  public static com.intellij.psi.PsiElement prevVisibleLeaf(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement nextVisibleLeaf(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement prevCodeLeaf(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement nextCodeLeaf(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement nextLeaf(com.intellij.psi.PsiElement p0, boolean p1) { return null; }
  public static boolean hasErrorElements(com.intellij.psi.PsiElement p0) { return false; }
  public static com.intellij.psi.PsiElement[] filterAncestors(com.intellij.psi.PsiElement[] p0) { return null; }
  public static boolean treeWalkUp(com.intellij.psi.scope.PsiScopeProcessor p0, com.intellij.psi.PsiElement p1, com.intellij.psi.PsiElement p2, com.intellij.psi.ResolveState p3) { return false; }
  public static boolean treeWalkUp(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1, com.intellij.util.PairProcessor<? super com.intellij.psi.PsiElement, ? super com.intellij.psi.PsiElement> p2) { return false; }
  public static com.intellij.psi.PsiElement findPrevParent(com.intellij.psi.PsiElement p0, com.intellij.psi.PsiElement p1) { return null; }
  public static java.util.List<com.intellij.psi.PsiElement> getInjectedElements(com.intellij.psi.templateLanguages.OuterLanguageElement p0) { return null; }
  public static com.intellij.psi.PsiElement getDeepestVisibleFirst(com.intellij.psi.PsiElement p0) { return null; }
  public static com.intellij.psi.PsiElement getDeepestVisibleLast(com.intellij.psi.PsiElement p0) { return null; }
  public static <T extends com.intellij.psi.PsiElement> T findSameElementInCopy(T p0, com.intellij.psi.PsiFile p1) throws java.lang.IllegalStateException { return null; }
}
