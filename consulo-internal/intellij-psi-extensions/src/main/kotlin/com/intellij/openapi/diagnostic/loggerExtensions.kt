package com.intellij.openapi.diagnostic

/** Get a Logger named after the calling class — matches IntelliJ's thisLogger(). */
inline fun <reified T : Any> T.thisLogger(): Logger = Logger.getInstance(T::class.java)
