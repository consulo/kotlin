package com.intellij.openapi.application;
@SuppressWarnings("all")
public class ModalityState {
    public static final ModalityState NON_MODAL = null;
    public static ModalityState defaultModalityState() { return null; }
    public static ModalityState any() { return null; }
}
