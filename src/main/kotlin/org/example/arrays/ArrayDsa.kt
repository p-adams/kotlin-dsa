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
    for (index in sortedNumbs.indices) {
        val result = binarySearch(sortedNumbs, target - sortedNumbs[index], index + 1 )
        if(result != -1) {
            return true
        }
    }
    return false
}

// binary search helper
fun binarySearch(n: List<Int>, target: Int, start: Int): Int {
    var start = start
    var end = n.size - 1
    while(start < end) {
        val mid = (start + end) / 2
        when {
            target < n[mid] -> {
                end = mid - 1
            }
            else -> {
                start = mid + 1
            }
        }
    }
    return if(start == end && n[start] == target) start else -1
}

// two sum: data structure design
// design TwoSum class that supports find(target): Int and add(el): Unit
class TwoSum() {
    private val nums = mutableListOf<Int>()
    fun find(target: Int): Int {
        return -1
    }
    fun add(el: Int) {
        nums.add(el)
    }
}