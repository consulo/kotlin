package com.intellij.openapi.diagnostic

/** Get a Logger named after the calling class — matches IntelliJ's thisLogger(). */
inline fun <reified T : Any> T.thisLogger(): Logger = Logger.getInstance(T::class.java)

/** Matches IntelliJ's logger<T>(): a Logger named after T. */
inline fun <reified T : Any> logger(): Logger = Logger.getInstance(T::class.java)

/** Matches IntelliJ's Logger.trace { }: the message is built only when tracing is enabled. */
inline fun Logger.trace(lazyMessage: () -> String) {
    if (isTraceEnabled) trace(lazyMessage())
}

/** Matches IntelliJ's Result.getOrLogException(): the value, or null after logging the failure (control flow is rethrown). */
fun <T> Result<T>.getOrLogException(logger: Logger): T? =
    onFailure { e -> if (e is ControlFlowException || e is com.intellij.openapi.progress.ProcessCanceledException) throw e else logger.error(e) }.getOrNull()
