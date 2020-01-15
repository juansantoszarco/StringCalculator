package com.juan.stringcalculator

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {

    private val stringCalculator =  StringCalculator()

    @Test
    fun returnsZeroWhenTheStringIsEmpty () {
        Assert.assertEquals(0, stringCalculator.calculateString(""))
    }

    @Test
    fun returnsTheSameNumberWhenTheStringsContainsOneValue() {
        val result = stringCalculator.calculateString("1")
        assertEquals(1,result)
    }

    @Test
    fun returnsTheSumOfTwoValuesSeparatedWithComa() {
        val result = stringCalculator.calculateString("1,2")
        assertEquals(3,result)
    }

    @Test
    fun returnsTheSumOfSomeValuesSeparatedWithComa() {
        val result = stringCalculator.calculateString("1,2,3,4,5")
        assertEquals(15,result)
    }

    @Test
    fun returnsZeroWhenUserInsertsANotNumber() {
        val result = stringCalculator.calculateString("a")
        assertEquals(0,result)
    }

    @Test
    fun returnsTheSumOfSomeValuesSeparatedWithComaOrJump() {
        val result = stringCalculator.calculateString("1/n2/n3/n4/n5")
        assertEquals(15,result)
    }

    @Test
    fun returnsTheSumOfMultipleInputSeparators() {
        val result = stringCalculator.calculateString("1/n2/n3/n4/n5,6")
        assertEquals(21,result)
    }

}