package com.intellij.util

/** Applies [block] to this value if [condition] holds, otherwise returns it unchanged. */
inline fun <T> T.applyIf(condition: Boolean, block: T.() -> T): T = if (condition) block() else this

/** Matches IntelliJ's currentJavaVersion(): the version of the running JVM. */
fun currentJavaVersion(): com.intellij.util.lang.JavaVersion = com.intellij.util.lang.JavaVersion.parse(System.getProperty("java.version"))

/** Matches IntelliJ's Any?.asSafely(): this cast to T, or null. */
inline fun <reified T> Any?.asSafely(): T? = this as? T
