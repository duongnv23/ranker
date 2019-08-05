package com.duongnv.ranker.algorithms.warmup

import java.io.*
import java.lang.IllegalArgumentException
import java.lang.StringBuilder
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

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    val sb = StringBuilder()
    for (i in 1..n) {
        sb.clear()

        sb.append(" ".repeat(n-i)).append("#".repeat(i))

        println(sb.toString())
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    if (n < 1 || n > 100) throw IllegalArgumentException("n must be in range [1..100]")
    staircase(n)
}
