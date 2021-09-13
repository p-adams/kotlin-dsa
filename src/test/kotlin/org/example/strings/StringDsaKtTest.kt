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
        assertEquals(1, strStr("anna", "nn"))
        assertEquals(2, strStr("kayak", "yak"))
        assertEquals(4, strStr("javascript", "script"))
        assertEquals(3, strStr("conformity", "form"))
        assertEquals(-1, strStr("cheetah", "hat"))
    }

    fun testWordReverse1() {
        assertEquals("World Hello", wordReverse1("Hello World"))
        assertEquals("dog lazy the over jumps fox brown quick The", wordReverse1("The quick brown fox jumps over the lazy dog"))
    }

    fun testWordReverse2() {
        assertEquals("World Hello", wordReverse2("Hello World"))
        assertEquals("dog lazy the over jumps fox brown quick The", wordReverse2("The quick brown fox jumps over the lazy dog"))
    }

    fun testSSplit() {
        assertEquals("bar foo", wordReverseSSplit("foo bar"))
        assertEquals("baz bar foo", wordReverseSSplit("foo bar baz"))
    }

    fun testAtoi() {
        assertEquals(0, atoi(""))
        assertEquals(10304, atoi("10304"))
        assertEquals(-10304, atoi("-10304"))
        assertEquals(2147483647, atoi("1030410304103041030410304103041030410304"))
    }

    fun testIsNumeric() {
        assertEquals(true, isNumeric("11"))
        assertEquals(true, isNumeric("1.1"))
        assertEquals(true, isNumeric(".1"))
        assertEquals(false, isNumeric("IV"))
        assertEquals(false, isNumeric("1 1"))
    }
}