package com.intellij.util.containers

/** Adds [element] to this collection if it is non-null. */
fun <T : Any> MutableCollection<T>.addIfNotNull(element: T?) {
    if (element != null) add(element)
}
