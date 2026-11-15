package com.intellij.util

/** Applies [block] to this value if [condition] holds, otherwise returns it unchanged. */
inline fun <T> T.applyIf(condition: Boolean, block: T.() -> T): T = if (condition) block() else this

/** Matches IntelliJ's currentJavaVersion(): the version of the running JVM. */
fun currentJavaVersion(): com.intellij.util.lang.JavaVersion = com.intellij.util.lang.JavaVersion.parse(System.getProperty("java.version"))

/** Matches IntelliJ's Any?.asSafely(): this cast to T, or null. */
inline fun <reified T> Any?.asSafely(): T? = this as? T

/** Matches IntelliJ's Query.filteringIsInstance(): the results that are R. */
inline fun <reified R> Query<*>.filteringIsInstance(): Query<R> {
    @Suppress("UNCHECKED_CAST")
    return (this as Query<Any?>).filtering { it is R }.mapping { it as R }
}

/** Matches IntelliJ's Query.mappingNotNull(f): the non-null results of [f]. */
fun <T, R : Any> Query<T>.mappingNotNull(f: (T) -> R?): Query<R> {
    @Suppress("UNCHECKED_CAST")
    return (mapping { f(it) } as Query<R?>).filtering { it != null } as Query<R>
}
