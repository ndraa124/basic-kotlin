package com.id124.androidbasic.tugas

import kotlin.math.ceil

fun main() {
    println("Menghitung Luas Lingkaran")
    println("Hasil Luas Lingkaran: ${luasLingkaran((7))}")
}

fun luasLingkaran(r: Int) : Int {
    return ceil((Math.PI * r * r)).toInt()
}