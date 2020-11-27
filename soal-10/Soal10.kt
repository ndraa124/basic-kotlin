package com.id124.androidbasic.tugas

fun main() {
    println("Menampilkan Huruf Vokal dan Konsonan")
    printWords("ARKADEMY")
}

fun printWords(kata: String) {
    // Menentukan Huruf Vokal
    for (i in kata) {
        if (i == 'A' || i == 'I' || i == 'U' || i == 'E' || i == 'O') {
            println(i)
        }
    }

    // Menentukan Huruf Konsonan
    for (i in kata) {
        if (i == 'A' || i == 'I' || i == 'U' || i == 'E' || i == 'O') {
            continue
        } else {
            println(i)
        }
    }
}