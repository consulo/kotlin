package com.intellij.util

import javax.swing.Icon

/**
 * IntelliJ's IconUtil is a Kotlin object, so its callers read properties (`IconUtil.addPackageIcon`); the @JvmStatic
 * members compile to static calls, which remap.xml maps onto Consulo's IconUtil (or IconUtilCompat for missing icons).
 */
@Suppress("unused", "UNUSED_PARAMETER")
object IconUtil {
    @JvmStatic
    val defaultNodeIconSize: Int get() = 0

    @JvmStatic
    val addIcon: Icon get() = throw UnsupportedOperationException("stub")

    @JvmStatic
    val removeIcon: Icon get() = throw UnsupportedOperationException("stub")

    @JvmStatic
    val moveUpIcon: Icon get() = throw UnsupportedOperationException("stub")

    @JvmStatic
    val moveDownIcon: Icon get() = throw UnsupportedOperationException("stub")

    @JvmStatic
    val editIcon: Icon get() = throw UnsupportedOperationException("stub")

    @JvmStatic
    val addPackageIcon: Icon get() = throw UnsupportedOperationException("stub")
}
