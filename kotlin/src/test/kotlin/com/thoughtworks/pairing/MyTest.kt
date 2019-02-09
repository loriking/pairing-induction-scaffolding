package com.thoughtworks.pairing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class MyTest {

    @Test
    fun `my first test`() {
        val x = MyClass()
        assertEquals(5, x.sum(3, 2))
    }

}
