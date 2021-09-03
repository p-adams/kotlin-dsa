package org.example.arrays

// hash table solution: O(n) runtime, O(n) space
// takes an unsorted list and returns true if any two numbers sum equal
// target; false, otherwise.
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
// two sum sorted list solution: O(n) runtime, O(1) space
fun sortedTwoSum(sortedNumbs: List<Int>, target: Int): Boolean {
    for(n in 0 until sortedNumbs.size - 1) {
        if(sortedNumbs[n] + sortedNumbs[n + 1] == target) {
            return true
        }
    }
    return false
}
// two sum sorted list: O(log n) runtime, O(1) space
fun binarySearchSortedTwoSum(sortedNumbs: List<Int>, target: Int): Boolean {
    return false
}

// binary search helper
fun binarySearch(n: List<Int>, target: Int, start: Int): Int {
    return -1;
}