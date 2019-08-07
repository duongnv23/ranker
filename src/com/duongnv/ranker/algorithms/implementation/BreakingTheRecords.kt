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

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = scores[0]
    var max = scores[0]
    var bMin = 0
    var bMax = 0
    scores.forEach {
        if (it < min) {
            min = it
            bMin++
            return@forEach
        }

        if (it > max) {
            max=it
            bMax++
            return@forEach
        }

    }

    return arrayOf(bMax, bMin)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    if (n < 1 || n > 1000) throw IllegalArgumentException("n must in range [1..1000]")

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    if (scores.any { it < 0 || it > 100_000_000 }) throw IllegalArgumentException("scores element must be in range [0..10^8]")

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
