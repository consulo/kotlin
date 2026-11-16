package com.intellij.ui

import javax.swing.JSpinner
import javax.swing.SpinnerNumberModel

/** IntelliJ's spinner of an int within [minValue]..[maxValue]. */
open class JBIntSpinner(value: Int, minValue: Int, maxValue: Int, stepSize: Int = 1) :
    JSpinner(SpinnerNumberModel(value, minValue, maxValue, stepSize)) {
    var number: Int
        get() = (value as Number).toInt()
        set(number) {
            value = number
        }
}
