package com.id124.androidbasic.tugas

fun main() {
    var x = 10
    var y = 20
    val z: Int

    println("Nilai Sebelum Ditukar")
    println("Nilai x: $x")
    println("Nilai y: $y")

    // Proses Pertukaran Nilai
    z = x
    x = y
    y = z

    println("Nilai Sesudah Ditukar")
    println("Nilai x: $x")
    println("Nilai y: $y")
}