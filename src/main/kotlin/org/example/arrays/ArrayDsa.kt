package org.example.arrays

// hash table solution: O(n) runtime, O(n) space
fun twoSum(numbs: List<Int>, target: Int): Boolean {
    val sums = mutableMapOf<Int, Int>()
    for(n in numbs.iterator()) {
        if(sums.containsKey(target - n)) {
            return true
        }
        sums[n] = 0
    }
    return false;
}