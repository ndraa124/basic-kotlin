package com.id124.androidbasic.tugas

fun main() {
    val kata = "Saya belajar Kotlin"

    println(reverseWords(kata))
}

fun reverseWords(str: String): String {
    val temp = str.split(" ")
    var result = ""

    for (i in temp.indices) {
        if (i == temp.size - 1) {
            result = temp[i] + result
        }  else {
            result = " " + temp[i] + result
        }
    }

    return result
}