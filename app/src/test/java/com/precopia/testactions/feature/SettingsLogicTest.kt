package com.precopia.testactions.feature

import org.junit.Test

import org.junit.Assert.*

class SettingsLogicTest {
    @Test
    fun isNightModeEnabled() {
        assertEquals(SettingsLogic().isNightModeEnabled(), true)
    }
}
