package com.intellij.util.messages;

@SuppressWarnings("all")
public class Topic<L> {
  public enum BroadcastDirection { TO_CHILDREN, TO_PARENT, NONE }
  public Topic(java.lang.String p0, java.lang.Class<L> p1) { throw new UnsupportedOperationException("stub"); }
  public Topic(java.lang.Class<L> p0) { throw new UnsupportedOperationException("stub"); }
  public Topic(java.lang.Class<L> p0, com.intellij.util.messages.Topic.BroadcastDirection p1) { throw new UnsupportedOperationException("stub"); }
  public Topic(java.lang.Class<L> p0, com.intellij.util.messages.Topic.BroadcastDirection p1, boolean p2) { throw new UnsupportedOperationException("stub"); }
  public Topic(java.lang.String p0, java.lang.Class<L> p1, com.intellij.util.messages.Topic.BroadcastDirection p2) { throw new UnsupportedOperationException("stub"); }
  public java.lang.String getDisplayName() { return null; }
  public java.lang.Class<L> getListenerClass() { return null; }
  public java.lang.String toString() { return null; }
  public static <L> com.intellij.util.messages.Topic<L> create(java.lang.String p0, java.lang.Class<L> p1) { return null; }
  public static <L> com.intellij.util.messages.Topic<L> create(java.lang.String p0, java.lang.Class<L> p1, com.intellij.util.messages.Topic.BroadcastDirection p2) { return null; }
  public com.intellij.util.messages.Topic.BroadcastDirection getBroadcastDirection() { return null; }
  public boolean isImmediateDelivery() { return false; }
}
