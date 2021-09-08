package org.example.strings

import junit.framework.TestCase

class StringDsaKtTest : TestCase() {
    fun testIsPalindrome() {
        val p1 = "anna"
        val p2 = "kayak"
        val p3 = "madam"
        assertEquals(false, isPalindrome("meow"))
        assertEquals(true, isPalindrome(p1))
        assertEquals(true, isPalindrome(p2))
        assertEquals(true, isPalindrome(p3))
    }
}