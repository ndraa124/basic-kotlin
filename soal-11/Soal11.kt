package com.id124.androidbasic.tugas

fun main() {
    val kata = "kasur rusak"

    if (isPalindrom(kata)) {
        println("$kata adalah Palindrom")
    } else {
        println("$kata bukan Palindrom")
    }
}

fun isPalindrom(kata: String) : Boolean {
    val sb = StringBuilder(kata)

    //reverse kata
    val reverseKata = sb.reverse().toString()

    //bandingkan kata dengan kata yang di reverse
    return kata.equals(reverseKata, true)
}