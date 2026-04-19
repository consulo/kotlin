package com.intellij.psi.impl.source.tree;

@SuppressWarnings("all")
public abstract class LeafElement extends TreeElement {
    public LeafElement(com.intellij.psi.tree.IElementType type, CharSequence text) { super(type); }
    public LeafElement findLeafElementAt(int offset) { return null; }
    public char[] textToCharArray() { return null; }
    public TreeElement getFirstChildNode() { return null; }
    public TreeElement getLastChildNode() { return null; }
    public int getCachedLength() { return 0; }
    public int getTextLength() { return 0; }
    protected int textMatches(CharSequence buffer, int start) { return 0; }
    public int hc() { return 0; }
    public void acceptTree(TreeElementVisitor visitor) {}
}
