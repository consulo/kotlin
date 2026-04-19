package com.intellij.util.diff;

@SuppressWarnings("all")
public interface FlyweightCapableTreeStructure<T> {
  public abstract T getRoot();
  public abstract T getParent(T p0);
  public abstract int getChildren(T p0, com.intellij.openapi.util.Ref<T[]> p1);
  public abstract void disposeChildren(T[] p0, int p1);
  public abstract java.lang.CharSequence toString(T p0);
  public abstract int getStartOffset(T p0);
  public abstract int getEndOffset(T p0);
}
