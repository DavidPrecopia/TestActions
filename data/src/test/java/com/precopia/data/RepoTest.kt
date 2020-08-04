package com.precopia.data

import org.junit.Assert.assertEquals
import org.junit.Test

class RepoTest {
    @Test
    fun foo() {
        assertEquals(
            Repo().doubleNumber(2),
            4
        )
    }
}