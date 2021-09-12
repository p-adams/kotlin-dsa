package org.example.strings

import java.lang.StringBuilder

fun isPalindrome(s: String): Boolean {
    var start = 0
    var finish = s.length - 1
    while(start < finish) {
        // skip non letter/digit in string
        while(start < finish && !s[start].isLetterOrDigit()) start++
        while(start < finish && !s[finish].isLetterOrDigit()) finish--
        if(s[start].lowercase() != s[finish].lowercase()) {
            return false
        }
        start++
        finish--

    }
    return true;
}
// C strstr: Returns a pointer to the first occurrence of str2 in str1,
// or a null pointer if str2 is not part of str1.
fun strStr(str1: String, str2: String): Int {
    var i = 0
    var j = 0
    while(true) {
        i++
        while(true){
            if (j == str2.length) {
                return i
            }
            if (i + j == str1.length) {
                return -1
            }
            if (str2[j] != str1[i + j]) {
                break
            }
            j++
        }
    }
}
// reverse words in sentence by doing two passes
// O(n2) runtime, O(n) space // allocates new array and does two passes (split counts as one)
fun wordReverse1(str: String): String {
    var result = ""
    var strs = str.split(" ")
    for(s in strs.size - 1 downTo 0) {
        result += strs[s] + if(s != 0) {
            " "
        } else {
            ""
        }
    }

    return result

}

// reverse words in sentence in single pass
// O(n) runtime, O(n) space // single pass but allocates result string
fun wordReverse2(s: String): String {
    var result = StringBuilder()
    val start = 0
    // optimistically set end to sentence entire length
    // this may be updated in the loop
    var end = s.length
    for(ss in s.length - 1 downTo 0) {
        // if we reach whitespace, that means we've reached the end of a word
        // So we reset end to point to the index of the white space
        if(s[ss] == ' ') {
            end = ss
            // if we reached the end of the sentence
            // Or if previous char is whitespace
        } else if(ss == 0 || s[ss - 1] == ' ') {
            if (result.isNotEmpty()) {
                // append whitespace to result string
                result.append(' ')
            }
            result.append(s.subSequence(ss, end))
        }
    }
    return result.toString()
}

// reverse words in-place
// O(n) runtime, O(1) space
fun wordReverse3(s: Array<Char>){
    // reverse entire sentence
    reverseHelper(s, 0, s.size)
    var i = 0
    var j = 0
    while(j < s.size) {
        if(j == s.size || s[j] == ' ') {
            reverseHelper(s, i, j)
            i = j + 1
        }
        j++
    }
}

fun reverseHelper(s: Array<Char>, start: Int, end: Int) {
    for(i in 0 until (end - start) / 2) {
        val swap = s[start + i]
        s[start + i] = s[end - i - 1]
        s[end - i - 1] = swap
    }
}

