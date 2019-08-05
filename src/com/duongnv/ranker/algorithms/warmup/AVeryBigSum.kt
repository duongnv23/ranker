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

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>): Long {
    val invalid = ar.any { it < 0 || it > 10_000_000_000 }
    if(invalid) throw IllegalArgumentException("ar contains invalid value")

    return ar.sum()

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()
    if(arCount<0 || arCount>10) throw IllegalArgumentException("arCount must be in range [0..10]")

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()
    if(ar.size != arCount) throw IllegalArgumentException(" ar size not valid, check arCount")

    val result = aVeryBigSum(ar)

    println(result)
}
