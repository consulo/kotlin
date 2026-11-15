package com.intellij.openapi.util.registry

/** IntelliJ's registry service, on [Registry] (whose keys default to the plugin's declarations, see RegistryCompat). */
class RegistryManager private constructor() {
    fun `is`(key: String): Boolean = Registry.`is`(key)

    fun intValue(key: String): Int = Registry.intValue(key)

    companion object {
        private val INSTANCE = RegistryManager()

        @JvmStatic
        fun getInstance(): RegistryManager = INSTANCE
    }
}
