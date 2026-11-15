package com.intellij.codeInsight.lookup

import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * IntelliJ's renderer that may suspend (in its read actions). Consulo calls [renderElement] on a background thread and
 * Consulo's read actions do not suspend, so the rendering runs to the end right there.
 */
abstract class SuspendingLookupElementRenderer<T : LookupElement> : LookupElementRenderer<T>() {
    abstract suspend fun renderElementSuspending(element: T, presentation: LookupElementPresentation)

    override fun renderElement(element: T, presentation: LookupElementPresentation) {
        var result: Result<Unit>? = null
        suspend { renderElementSuspending(element, presentation) }.startCoroutine(Continuation(EmptyCoroutineContext) { result = it })
        checkNotNull(result) { "$this suspended while rendering" }.getOrThrow()
    }
}
