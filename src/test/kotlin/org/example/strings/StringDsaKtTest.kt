package org.example.strings

import junit.framework.TestCase

class StringDsaKtTest : TestCase() {
    fun testIsPalindrome() {
        val p1 = "anna"
        val p2 = "kayak"
        val p3 = "madam"
        val p4 = "race a car"
        val p5 = "A man, a plan, a canal: Panama"
        assertEquals(false, isPalindrome("meow"))
        assertEquals(true, isPalindrome(p1))
        assertEquals(true, isPalindrome(p2))
        assertEquals(true, isPalindrome(p3))
        assertEquals(false, isPalindrome(p4))
        assertEquals(true, isPalindrome(p5))
    }

    fun testStrStr() {
        assertEquals(0, strStr("anna", "ann"))
        assertEquals(0, strStr("kayak", "kaya"))
    }
}