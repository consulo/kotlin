package com.intellij.psi.tree;

@SuppressWarnings("all")
public class IElementType {
  public interface Predicate {
    boolean matches(IElementType type);
  }
  public static final com.intellij.psi.tree.IElementType[] EMPTY_ARRAY = null;
  public static final com.intellij.util.ArrayFactory<com.intellij.psi.tree.IElementType> ARRAY_FACTORY = null;
  public static final com.intellij.psi.tree.IElementType.Predicate TRUE = null;
  public static final short FIRST_TOKEN_INDEX = 0;
  public static void unregisterElementTypes(java.lang.ClassLoader p0, com.intellij.openapi.extensions.PluginDescriptor p1) {}
  public static void unregisterElementTypes(com.intellij.lang.Language p0, com.intellij.openapi.extensions.PluginDescriptor p1) {}
  public IElementType(java.lang.String p0, com.intellij.lang.Language p1) { throw new UnsupportedOperationException("stub"); }
  protected IElementType(java.lang.String p0, com.intellij.lang.Language p1, boolean p2) { throw new UnsupportedOperationException("stub"); }
  public com.intellij.lang.Language getLanguage() { return null; }
  public final short getIndex() { return 0; }
  public int hashCode() { return 0; }
  public java.lang.String toString() { return null; }
  public java.lang.String getDebugName() { return null; }
  public boolean isLeftBound() { return false; }
  public static com.intellij.psi.tree.IElementType find(short p0) { return null; }
  public static com.intellij.psi.tree.IElementType[] enumerate(com.intellij.psi.tree.IElementType.Predicate p0) { return null; }
  public static <R> java.util.List<R> mapNotNull(java.util.function.Function<com.intellij.psi.tree.IElementType, ? extends R> p0) { return null; }
}
