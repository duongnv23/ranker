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

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    if (m > s.size) return 0

    var count = 0

    var sum: Int
    for (i in 0 .. s.size - m) {
        sum = 0

        for (j in 0 until m) {
            sum += s[i + j]
        }

        if (sum == d) {
            count++
        }
    }

    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    if (n < 1 || n > 100) throw IllegalArgumentException("n must in range [1..100]")

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    if (s.size != n) throw IllegalArgumentException("array size must be $n")
    if (s.any { it < 1 || it > 5 }) throw IllegalArgumentException("array's element must be in range [1..5]")

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()
    if (d < 1 || d > 31) throw IllegalArgumentException("d must be in range [1..31]")

    val m = dm[1].toInt()
    if (m < 1 || m > 12) throw IllegalArgumentException("m must be in range [1..12]")

    val result = birthday(s, d, m)

    println(result)
}
