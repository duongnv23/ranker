package com.duongnv.ranker.algorithms.implementation

import java.lang.IllegalArgumentException
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

    if (a.any { it < 1 || it > 100 }) throw IllegalArgumentException("a's element must be in range [1..100]")
    if (b.any { it < 1 || it > 100 }) throw IllegalArgumentException("b's element must be in range [1..100]")

    a.sort()
    val aMax = a[a.size - 1]
    b.sort()
    val bMin = b[0]

    if (aMax > bMin) return 0

    val nums = ArrayList<Int>()
    var pass: Boolean
    for (i in aMax..bMin) {
        pass = true
        for (j in a) {
            if (i % j != 0) {
                pass = false
                break
            }
        }

        if (!pass) {
            continue
        }

        for (j in b) {
            if (j % i !== 0) {
                pass = false
                break
            }
        }
        if (pass) {
            nums.add(i)
        }
    }

    return nums.size
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
