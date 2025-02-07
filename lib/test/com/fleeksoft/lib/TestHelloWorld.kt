package com.fleeksoft.lib

import kotlin.test.Test
import kotlin.test.assertEquals


class TestHelloWorld {
    @Test
    fun testGet() {
        assertEquals(HelloWorld().get(), "Hello World!")
    }
}