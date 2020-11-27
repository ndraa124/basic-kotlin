package com.id124.androidbasic.tugas

fun main() {
    println("Menghitung Luas Segitiga")
    println("Hasil Luas Segitiga: ${luasSegitiga(10, 8)}")
}

fun luasSegitiga(alas: Int, tinggi: Int) : Int {
    return (0.5 * alas * tinggi).toInt()
}