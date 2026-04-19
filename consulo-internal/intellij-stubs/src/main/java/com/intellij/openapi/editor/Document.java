package com.intellij.openapi.editor;

@SuppressWarnings("all")
public interface Document extends com.intellij.openapi.util.UserDataHolder {
  public default java.lang.String getText() { return null; }
  public default java.lang.String getText(com.intellij.openapi.util.TextRange p0) { return null; }
  public default java.lang.CharSequence getCharsSequence() { return null; }
  public abstract java.lang.CharSequence getImmutableCharSequence();
  public default char[] getChars() { return null; }
  public default int getTextLength() { return 0; }
  public abstract int getLineCount();
  public abstract int getLineNumber(int p0);
  public abstract int getLineStartOffset(int p0);
  public abstract int getLineEndOffset(int p0);
  public default boolean isLineModified(int p0) { return false; }
  public abstract void insertString(int p0, java.lang.CharSequence p1);
  public abstract void deleteString(int p0, int p1);
  public abstract void replaceString(int p0, int p1, java.lang.CharSequence p2);
  public abstract boolean isWritable();
  public abstract long getModificationStamp();
  public default void fireReadOnlyModificationAttempt() {}
  public default void addDocumentListener(com.intellij.openapi.editor.event.DocumentListener p0) {}
  public default void addDocumentListener(com.intellij.openapi.editor.event.DocumentListener p0, com.intellij.openapi.Disposable p1) {}
  public default void removeDocumentListener(com.intellij.openapi.editor.event.DocumentListener p0) {}
  public default com.intellij.openapi.editor.RangeMarker createRangeMarker(int p0, int p1) { return null; }
  public abstract com.intellij.openapi.editor.RangeMarker createRangeMarker(int p0, int p1, boolean p2);
  public default void addPropertyChangeListener(java.beans.PropertyChangeListener p0) {}
  public default void removePropertyChangeListener(java.beans.PropertyChangeListener p0) {}
  public default void setReadOnly(boolean p0) {}
  public abstract com.intellij.openapi.editor.RangeMarker createGuardedBlock(int p0, int p1);
  public default void removeGuardedBlock(com.intellij.openapi.editor.RangeMarker p0) {}
  public default com.intellij.openapi.editor.RangeMarker getOffsetGuard(int p0) { return null; }
  public default com.intellij.openapi.editor.RangeMarker getRangeGuard(int p0, int p1) { return null; }
  public default void startGuardedBlockChecking() {}
  public default void stopGuardedBlockChecking() {}
  public default void setCyclicBufferSize(int p0) {}
  public abstract void setText(java.lang.CharSequence p0);
  public default com.intellij.openapi.editor.RangeMarker createRangeMarker(com.intellij.openapi.util.TextRange p0) { return null; }
  public default int getLineSeparatorLength(int p0) { return 0; }
  public default boolean isInBulkUpdate() { return false; }
  public default void setInBulkUpdate(boolean p0) {}
}
