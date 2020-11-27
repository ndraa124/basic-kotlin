package com.id124.androidbasic.tugas

fun main() {
    var x = 10
    var y = 20

    println("Nilai Sebelum Ditukar")
    println("Nilai x: $x")
    println("Nilai y: $y")

    // Proses Pertukaran Nilai
    x = y - x
    y -= x
    x += y

    println("Nilai Sesudah Ditukar")
    println("Nilai x: $x")
    println("Nilai y: $y")
}