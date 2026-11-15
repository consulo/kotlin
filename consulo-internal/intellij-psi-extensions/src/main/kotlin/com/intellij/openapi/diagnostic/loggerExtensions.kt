package com.intellij.openapi.diagnostic

/** Get a Logger named after the calling class — matches IntelliJ's thisLogger(). */
inline fun <reified T : Any> T.thisLogger(): Logger = Logger.getInstance(T::class.java)

/** Matches IntelliJ's logger<T>(): a Logger named after T. */
inline fun <reified T : Any> logger(): Logger = Logger.getInstance(T::class.java)
