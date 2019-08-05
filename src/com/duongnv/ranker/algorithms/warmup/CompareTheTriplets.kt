package com.duongnv.ranker.algorithms.warmup

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

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aPoint = 0
    var bPoint = 0

    if (a.size - b.size != 0) throw IllegalArgumentException("2 arrays must have same size")

    a.indices.forEach { i -> run { if (a[i] > b[i]) aPoint += 1 else if (b[i] > a[i]) bPoint += 1 } }

    return arrayOf(aPoint, bPoint)
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
