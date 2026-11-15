package com.intellij.util.containers

/** Adds [element] to this collection if it is non-null. */
fun <T> MutableCollection<T>.addIfNotNull(element: T?) {
    if (element != null) add(element)
}

/** Matches IntelliJ's Map.without(key): a copy of this map without [key]. */
fun <K, V> Map<K, V>.without(key: K): Map<K, V> = if (key in this) this - key else this
