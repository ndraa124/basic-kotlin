package com.id124.androidbasic.tugas

fun main() {
    val angka = 595061958

    println("Angka Sebelum Di Sorting")
    println(angka)

    println()

    println("Angka Sesudah Di Sorting")
    println(divideAndSort(angka))
}

fun divideAndSort(angka: Int) : String {
    val temp = angka.toString().split("0")

    return when {
        temp.size == 1 -> {
            sort(temp[0])
        }
        temp.size <= 2 -> {
            sort(temp[0]) + sort(temp[1])
        }
        temp.size <= 3 -> {
            sort(temp[0]) + sort(temp[1]) + sort(temp[2])
        }
        else -> {
            "Error!"
        }
    }
}

fun sort(temp: String) : String {
    var result = ""

    val list = ArrayList<String>()
    for (i in temp) {
        list.add(i.toString())
    }

    val sort = list.sortedWith(compareBy { it })

    for (obj in sort.indices.sortedDescending()) {
        result = sort[obj] + result
    }

    return result
}