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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    if(arr.size !=5)throw IllegalArgumentException("array size must be 5")

    val any = arr.any { it < 1 || it > 1_000_000_000 }
    if(any){
        throw IllegalArgumentException("array element must be in range [1..10^9]")
    }

    arr.sort()

    var total:Long =0
    arr.forEach {total+=it }

    print(total-arr[arr.size-1])
    print(" ")
    print(total-arr[0])

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
