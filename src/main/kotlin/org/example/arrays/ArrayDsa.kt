package org.example.arrays

fun twoSum(numbs: List<Int>, target: Int): Boolean {
    val seen = mutableMapOf<Int, Int>()
    for(n in numbs.iterator()) {
        if(seen.containsKey(target - n)) {
            return true
        }
        seen[n] = 0
    }
    return false;
}