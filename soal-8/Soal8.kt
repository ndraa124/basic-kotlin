package com.id124.androidbasic.tugas

fun main() {
    val mtk = 80
    val bahasaIndonesia = 90
    val bahasaInggris = 89
    val ipa = 69

    // Menghitung Rerata
    val rerata = (mtk + bahasaIndonesia + bahasaInggris + ipa) / 4

    // Menentukan Grade
    val grade: String
    when (rerata) {
        in 90..100 -> {
            grade = "A"
        }
        in 80..89 -> {
            grade = "B"
        }
        in 70..79 -> {
            grade = "C"
        }
        in 60..69 -> {
            grade = "D"
        }
        else -> {
            grade = "E"
        }
    }

    println("Rata-rata: $rerata")
    println("Grade: $grade")
}