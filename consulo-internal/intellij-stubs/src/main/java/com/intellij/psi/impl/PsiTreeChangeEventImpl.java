package com.intellij.psi.impl;

@SuppressWarnings("all")
public class PsiTreeChangeEventImpl extends com.intellij.psi.PsiTreeChangeEvent {
    public enum PsiEventType {
        BEFORE_CHILD_ADDITION, BEFORE_CHILD_REMOVAL, BEFORE_CHILD_REPLACEMENT, BEFORE_CHILD_MOVEMENT, BEFORE_CHILDREN_CHANGE,
        BEFORE_PROPERTY_CHANGE, CHILD_ADDED, CHILD_REMOVED, CHILD_REPLACED, CHILD_MOVED, CHILDREN_CHANGED, PROPERTY_CHANGED
    }

    protected PsiTreeChangeEventImpl() { super(null); }
    public PsiEventType getCode() { return null; }
    public boolean isGenericChange() { return false; }
}
