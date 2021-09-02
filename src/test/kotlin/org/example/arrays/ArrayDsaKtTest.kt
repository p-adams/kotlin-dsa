package org.example.arrays

import junit.framework.TestCase

class ArrayDsaKtTest : TestCase() {

    public override fun setUp() {
        super.setUp()
    }

    public override fun tearDown() {}

    fun testTwoSum() {
        val numbs = listOf(1, 2, 3, 5, 5)
        assertEquals(true, twoSum(numbs, 5))
    }
}