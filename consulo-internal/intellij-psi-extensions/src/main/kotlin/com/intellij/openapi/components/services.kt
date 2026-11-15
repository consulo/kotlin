package com.intellij.openapi.components

/** Matches IntelliJ's ComponentManager.service(); inlines to getService(Class). */
inline fun <reified T : Any> ComponentManager.service(): T =
    getService(T::class.java) ?: throw IllegalStateException("Cannot find service ${T::class.java.name}")

/** Matches IntelliJ's ComponentManager.serviceOrNull(); inlines to getService(Class). */
inline fun <reified T : Any> ComponentManager.serviceOrNull(): T? = getService(T::class.java)
