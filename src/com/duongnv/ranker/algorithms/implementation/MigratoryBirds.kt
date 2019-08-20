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

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {

    val groupBy = arr.groupBy { it }
    val mapValues = groupBy.mapValues { it.value.size }.toSortedMap()

    val maxBy = mapValues.maxBy { it.value }
    return maxBy?.key!!

}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    if(arrCount < 5 || arrCount > 200000) throw IllegalArgumentException("array count must be in range [5 .. 2x10^5]")

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}