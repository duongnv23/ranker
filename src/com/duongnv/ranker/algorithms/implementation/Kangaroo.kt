package com.duongnv.ranker.algorithms.implementation

import java.io.*
import java.lang.IllegalArgumentException
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    if (v1 <= v2) return "NO"

    var isMeet = false
    var exit = false
    var step = 1

    var k1 = 0
    var k2 = 0

    do {
        k1 = x1 + (v1 * step)
        k2 = x2 + (v2 * step)

        if (k1 == k2) {
            isMeet = true
            exit = true
        } else if (k1 > k2) {
            exit = true
        }

        step++
    } while (!exit)

    return if (isMeet) "YES" else "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    if (x1 < 0 || x1 >= x2 || x2 > 10_000) throw IllegalArgumentException("constrain '0 <= x1 < x2 <= 10_000' is violated")
    if (v1 < 1 || v1 > 10_000 || v2 < 1 || v2 > 10_000) throw IllegalArgumentException("v1, v1 must be in range [1..10_000]")

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
