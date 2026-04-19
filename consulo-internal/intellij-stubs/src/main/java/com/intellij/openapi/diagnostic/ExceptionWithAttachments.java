package com.intellij.openapi.diagnostic;

@SuppressWarnings("all")
public interface ExceptionWithAttachments {
  public abstract com.intellij.openapi.diagnostic.Attachment[] getAttachments();
}
