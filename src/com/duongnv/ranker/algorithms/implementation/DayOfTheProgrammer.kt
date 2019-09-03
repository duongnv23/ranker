package com.duongnv.ranker.algorithms.implementation

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {

    if (year < 1700 || year > 2700) {
        throw IllegalArgumentException("year must be in range [1700..2700]")
    }

    var day = 13
    var month = 9

    if (year == 1918) {
        day = 26
    } else if (year < 1918) {
        if (year % 4 == 0) {
            day = 12
        }
    } else {
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
            day = 12
        }
    }


    return String.format("%02d.%02d.%d", day, month, year)

}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
