package com.intellij.navigation;
@SuppressWarnings("all")
public interface ItemPresentationProvider<T extends NavigationItem> {
    ItemPresentation getPresentation(T item);
}
