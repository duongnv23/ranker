package com.duongnv.ranker.algorithms.warmup

import java.io.*
import java.math.*
import java.text.*
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */

    val localTime = LocalTime.parse(s, formatter)

    return toFormat.format(localTime)
}

val formatter = DateTimeFormatter.ofPattern("hh:mm:ssa")!!
val toFormat = DateTimeFormatter.ofPattern("HH:mm:ss")!!


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
