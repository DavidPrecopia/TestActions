package com.precopia.testactions

import org.junit.Test

import org.junit.Assert.*

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