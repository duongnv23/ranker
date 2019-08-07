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

// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    if (apples.any { it < -100_000 || it > 100_000 }) throw IllegalArgumentException("apples element must be in range [-10^5..10^5")
    if (oranges.any { it < -100_000 || it > 100_000 }) throw IllegalArgumentException("oranges element must be in range [-10^5..10^5")

    val ap = apples.map { it + a }.filter { it in s..t }.count()
    println(ap)
    val or = oranges.map { it + b }.filter { it in s..t }.count()
    print(or)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    if (s < 1 || t < 1 || s > 100_000 || t > 100_000) throw IllegalArgumentException("s, t must in range [1..10^5]")

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    if (a < 1 || b < 1 || a > 100_000 || b > 100_000) throw IllegalArgumentException("a, b must in range [1..10^5]")
    if (a >= s || s >= t || t >= b) throw IllegalArgumentException("Constraint violation: 'a < s < t < b'")

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    if (m < 1 || n < 1 || m > 100_000 || n > 100_000) throw IllegalArgumentException("m, n must in range [1..10^5]")

    val apples = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
