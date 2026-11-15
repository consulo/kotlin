package com.intellij.openapi.editor;

@SuppressWarnings("all")
public interface RangeMarker extends com.intellij.openapi.util.UserDataHolder, com.intellij.openapi.util.Segment {
    Document getDocument();
    int getStartOffset();
    int getEndOffset();
    boolean isValid();
    void setGreedyToLeft(boolean greedy);
    void setGreedyToRight(boolean greedy);
    boolean isGreedyToRight();
    boolean isGreedyToLeft();
    void dispose();
    // Added by consulo-internal/remap/genstub.py from consulo.document.RangeMarker
    public static final com.intellij.openapi.util.Key<com.intellij.openapi.editor.RangeMarker> KEY = null;
    public static final java.util.Comparator<? super com.intellij.openapi.editor.RangeMarker> BY_START_OFFSET = null;
    public long getId();
    public default com.intellij.openapi.util.TextRange getTextRange() { return null; }
}
