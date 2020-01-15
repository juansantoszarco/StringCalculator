package com.juan.stringcalculator


class StringCalculator {

    fun calculateString(parameters: String): Int {
        if (parameters.isBlank()) return 0
        return getIntValueFromString(parameters)
    }

    fun getIntValueFromString(parameters: String): Int {
        var returnValue = 0
        val values: List<String> = parameters.split(",","/n")
        values.forEach {
            val item = it.toIntOrNull()
            if (item is Int) {
                returnValue += item.toInt()
            }
        }
        return returnValue
    }

}