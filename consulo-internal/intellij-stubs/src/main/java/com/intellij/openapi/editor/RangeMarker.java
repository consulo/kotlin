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
}
