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

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var result =0

    for(i in 0 until n){
        for(j in i+1 until  n){
            if((ar[i]+ar[j])%k==0){
                result++
            }
        }
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()
    if(n<2 || n>100) throw IllegalArgumentException("n must in range [2..100]")

    val k = nk[1].trim().toInt()
    if(k<1||k>100) throw IllegalArgumentException("k must in range [1..100]")

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    if(ar.any{it<1||it>100}) throw IllegalArgumentException("ar's element must be in range [1..100]")

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
