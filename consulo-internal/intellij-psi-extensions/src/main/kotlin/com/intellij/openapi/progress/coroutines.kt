package com.intellij.openapi.progress

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking

/**
 * Matches IntelliJ's runBlockingCancellable { }: runs [action] and waits for it. Only the parallel Kotlin completion
 * runner uses it, which is off (kotlin.k2.parallel.completion.enabled): Consulo's read actions do not join coroutines.
 */
fun <T> runBlockingCancellable(action: suspend CoroutineScope.() -> T): T = runBlocking { action() }
