package org.example.arrays

import junit.framework.TestCase

class ArrayDsaKtTest : TestCase() {
    private val numbs1 = listOf<Int>(1, 2, 3, 5, 5)
    private val numbs2 = listOf<Int>(5, 4, 3, 3, 1)

    fun testTwoSum() {
        assertEquals(true, twoSum(numbs1, 5))
    }

    fun testSortedTwoSum() {
        assertEquals(false, sortedTwoSum(numbs2, 5))
    }
}