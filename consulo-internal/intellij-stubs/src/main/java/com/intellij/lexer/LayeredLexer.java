package com.intellij.lexer;

@SuppressWarnings("all")
public class LayeredLexer extends DelegateLexer {
    public LayeredLexer(Lexer p0) { super(p0); }
    public void registerSelfStoppingLayer(Lexer p0, com.intellij.psi.tree.IElementType[] p1, com.intellij.psi.tree.IElementType[] p2) {}
    public void registerLayer(Lexer p0, com.intellij.psi.tree.IElementType... p1) {}
}
