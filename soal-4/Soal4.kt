package com.id124.androidbasic.tugas

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    println("Menghitung Umur Sekarang")
    println("Umur Anda: ${checkAge(1995)}")
}

fun checkAge(yearOfBirth: Int) : Int {
    val cal = Calendar.getInstance()
    val date = SimpleDateFormat("yyyy", Locale.getDefault())

    val yearNow = date.format(cal.time).toInt()

    return yearNow - yearOfBirth
}