package com.id124.androidbasic.tugas

fun main() {
    println("Mengecek Tahun Kabisat")
    cekKabisat(2020)
}

fun cekKabisat(tahun: Int) {
    if (tahun % 400 == 0 || tahun % 4 == 0) {
        println("Tahun $tahun Merupakan Tahun Kabisat")
    } else {
        println("Tahun $tahun Bukan Tahun Kabisat")
    }
}