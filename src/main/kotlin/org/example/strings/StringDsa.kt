package org.example.strings

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