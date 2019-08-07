package com.duongnv.ranker.algorithms.implementation

import java.lang.IllegalArgumentException
import java.math.BigInteger
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

TODO("still has error")
    if (a.any { it < 1 || it > 100 }) throw IllegalArgumentException("a's element must be in range [1..100]")
    if (b.any { it < 1 || it > 100 }) throw IllegalArgumentException("b's element must be in range [1..100]")

    a.sort()
    val aMax = a[a.size - 1]
    b.sort()
    val bMin = b[0]

    val aLcm = lcm(a)

    val candidates = ArrayList<Int>()
    val num = ArrayList<Int>()

    for (i in aMax until  bMin) {
        if (i % aLcm == 0) candidates.add(i)
    }

    var count = 0
    for (i in candidates) {
        count = 0
        for (j in b) {
            if (j % i == 0) count++
        }
        if (count == b.size)
            num.add(i)
    }

    return num.size
}

fun gcd(a: Int, b: Int): Int {
    return a.toBigInteger().gcd(b.toBigInteger()).intValueExact()
}

fun gcd(a: Array<Int>): Int {
    var result = a[0]

    for (i in a) {
        result = gcd(i, result)
    }
    return result
}

fun lcm(a: Array<Int>): Int {
    var mul: Long = 1
    a.forEach { mul *= it }
    return (mul / gcd(a)).toInt()

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    if (n < 1 || n > 10 || m < 1 || m > 10) throw IllegalArgumentException("m,n must be in range [1..10]")

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
