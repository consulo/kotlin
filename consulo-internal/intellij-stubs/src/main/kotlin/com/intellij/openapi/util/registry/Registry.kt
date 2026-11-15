package com.intellij.openapi.util.registry

/**
 * IntelliJ's Registry is Kotlin, so its callers may name arguments (`Registry.is(key, defaultValue = true)`); the
 * @JvmStatic members compile to static calls, which remap.xml maps onto Consulo's Registry.
 */
@Suppress("unused", "UNUSED_PARAMETER")
object Registry {
    @JvmStatic
    fun get(key: String): RegistryValue = throw UnsupportedOperationException("stub")

    @JvmStatic
    fun `is`(key: String): Boolean = false

    @JvmStatic
    fun `is`(key: String, defaultValue: Boolean): Boolean = defaultValue

    @JvmStatic
    fun intValue(key: String): Int = 0

    @JvmStatic
    fun intValue(key: String, defaultValue: Int): Int = defaultValue

    @JvmStatic
    fun intValue(key: String, defaultValue: Int, minValue: Int, maxValue: Int): Int = defaultValue

    @JvmStatic
    fun doubleValue(key: String): Double = 0.0

    @JvmStatic
    fun doubleValue(key: String, defaultValue: Double): Double = defaultValue

    @JvmStatic
    fun stringValue(key: String): String = ""
}
