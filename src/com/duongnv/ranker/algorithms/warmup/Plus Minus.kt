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
import kotlin.test.todo
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    val invalid = arr.any { it < -100 || it > 100 }
    if (invalid) throw IllegalArgumentException("array has invalid element, out of range [-100..100]")
    val size = arr.size

    val groupBy = arr.map { getType(it) }.groupBy { it }.mapValues { it.value.size }.mapValues { toFraction(it.value, size) }

    printvalue(groupBy, 1)
    printvalue(groupBy, -1)
    printvalue(groupBy, 0)
}

private fun printvalue(groupBy: Map<Int, BigDecimal>, key: Int) {
    val value = groupBy.getOrElse(key, { BigDecimal.valueOf(0.toLong(), 5) })
    println(value)
}

fun toFraction(t: Int, m:Int):BigDecimal {
    val tb = BigDecimal.valueOf(t.toLong(),6)
    val mb = BigDecimal.valueOf(m.toLong(), 6)
    return tb.divide(mb,RoundingMode.HALF_UP)
}

fun getType(it: Int): Int {
    return when {
        it == 0 -> 0
        it < 0 -> -1
        else -> 1
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    if (n <= 0 || n > 100) throw IllegalArgumentException("n must in range[1..100]")

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
