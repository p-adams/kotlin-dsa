package org.example.arrays

import junit.framework.TestCase

class ArrayDsaKtTest : TestCase() {
    private val numbs1 = listOf<Int>(1, 2, 3, 5, 5)
    private val numbs2 = listOf<Int>(5, 4, 3, 3, 1)
    private val numbs3 = listOf<Int>(1, 2, 3, 4, 5)

    fun testTwoSum() {
        assertEquals(true, twoSum(numbs1, 5))
    }

    fun testSortedTwoSum() {
        assertEquals(false, sortedTwoSum(numbs2, 5))
        assertEquals(true, sortedTwoSum(numbs3, 5))
    }
    fun testBinarySearchSortedTwoSum() {
        assertEquals(false, binarySearchSortedTwoSum(numbs1, 12))
        assertEquals(true, binarySearchSortedTwoSum(numbs1, 3))
    }

    fun testBinarySearch() {
        assertEquals(-1, binarySearch(numbs1, 4, 0))
        assertEquals(4, binarySearch(numbs1, 5, 0))
    }
    fun testTwoSumClass() {
        val twoSum = TwoSum()
        for(i in 1 until 10) {
            twoSum.add(i)
        }
        assertEquals(1 , twoSum.find(7))
    }
}