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
// C strstr: Returns a pointer to the first occurrence of str2 in str1,
// or a null pointer if str2 is not part of str1.
fun strStr(str1: String, str2: String): Int {
    return -1
}