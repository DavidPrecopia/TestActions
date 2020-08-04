package com.precopia.data

import org.junit.Assert
import org.junit.jupiter.api.Test

internal class RepoTestFive {
    @Test
    fun `this is five`() {
        Assert.assertEquals(
            Repo().doubleNumber(2),
            4
        )
    }
}