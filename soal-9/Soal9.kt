package com.id124.androidbasic.tugas

fun main() {
    val nilai = 5

    println("Mencetak Segitiga")

    for (i in nilai downTo 1) {
        for (j in 1..i) {
            print("$j ")
        }

        println()
    }
}