package com.intellij.openapi.components

import com.intellij.openapi.application.ApplicationManager

/** Matches IntelliJ's ComponentManager.service(); inlines to getService(Class). */
inline fun <reified T : Any> ComponentManager.service(): T =
    getService(T::class.java) ?: throw IllegalStateException("Cannot find service ${T::class.java.name}")

/** Matches IntelliJ's ComponentManager.serviceOrNull(); inlines to getService(Class). */
inline fun <reified T : Any> ComponentManager.serviceOrNull(): T? = getService(T::class.java)

/** Matches IntelliJ's top-level service(): an application service. */
inline fun <reified T : Any> service(): T = ApplicationManager.getApplication().service()

/** Matches IntelliJ's top-level serviceOrNull(): an application service, or null. */
inline fun <reified T : Any> serviceOrNull(): T? = ApplicationManager.getApplication().serviceOrNull()
