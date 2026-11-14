package com.intellij.util.messages;

@SuppressWarnings("all")
public class Topic<L> {
    public Topic(String name, Class<L> listenerClass) {}
    public Topic(Class<L> listenerClass) {}
    public Topic(Class<L> listenerClass, BroadcastDirection direction) {}
    public Topic(Class<L> listenerClass, BroadcastDirection direction, boolean immediateDelivery) {}
    public String getDisplayName() { return null; }
    public Class<L> getListenerClass() { return null; }
    public static <L> Topic<L> create(String name, Class<L> listenerClass) { return new Topic<L>(name, listenerClass); }
    public enum BroadcastDirection { NONE, TO_PARENT, TO_CHILDREN, TO_DIRECT_CHILDREN }
}
