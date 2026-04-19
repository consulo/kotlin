package com.intellij.lang;

@SuppressWarnings("all")
public interface SyntaxTreeBuilder {
    CharSequence getOriginalText();
    int getCurrentOffset();
    SyntaxTreeBuilder.Marker mark();
    boolean eof();
    com.intellij.psi.tree.IElementType getTokenType();
    String getTokenText();
    void advanceLexer();
    void remapCurrentToken(com.intellij.psi.tree.IElementType type);
    void error(String messageText);

    interface Marker {
        void done(com.intellij.psi.tree.IElementType type);
        void collapse(com.intellij.psi.tree.IElementType type);
        void drop();
        void rollbackTo();
        Marker precede();
        void error(String message);
        void setCustomEdgeTokenBinders(WhitespacesAndCommentsBinder left, WhitespacesAndCommentsBinder right);
    }

    interface Production {
        com.intellij.psi.tree.IElementType getTokenType();
        int getStartOffset();
        int getEndOffset();
    }
}
