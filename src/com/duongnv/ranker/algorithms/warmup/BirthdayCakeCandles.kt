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

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {

    val any = ar.any { it < 1 || it > 10_000_000 }
    if(any){
        throw IllegalArgumentException("array elements must be in range [1..10^7]")
    }

    val maxEntity = ar.asSequence().groupBy { it }.maxBy { it.key }
    return maxEntity?.value?.size ?: 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()
    if(arCount<1|| arCount> 100_000) throw IllegalArgumentException("arCount must be in range [1..10^5]")

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
