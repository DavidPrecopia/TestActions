package com.precopia.testactions

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }



    @Test
    fun test() {
        val number = 10
        val answer = number * 2

        assertEquals(MainLogic().doubleNumber(number), answer)
    }
}