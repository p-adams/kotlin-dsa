package org.example.strings

import junit.framework.TestCase

class StringDsaKtTest : TestCase() {
    fun testIsPalindrome() {
        assertEquals(true, isPalindrome("meow"))
    }
}