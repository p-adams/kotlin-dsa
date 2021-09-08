package org.example.strings

fun isPalindrome(s: String): Boolean {
    // TODO: handle case-sensitivity, whitespace, and punctuation
    var start = 0
    var finish = s.length - 1
    while(start < finish) {
        if(s[start] != s[finish]) {
            return false
        }
        start++
        finish--

    }
    return true;
}