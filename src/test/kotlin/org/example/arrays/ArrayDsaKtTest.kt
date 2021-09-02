package org.example.arrays

import junit.framework.TestCase

class ArrayDsaKtTest : TestCase() {
    private val numbs1 = listOf<Int>(1, 2, 3, 5, 5)

    fun testTwoSum() {
        assertEquals(true, twoSum(numbs1, 5))
    }
}