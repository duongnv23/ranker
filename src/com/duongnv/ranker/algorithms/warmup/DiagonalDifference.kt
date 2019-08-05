package com.duongnv.ranker.algorithms.warmup

import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var left = 0
    var right = 0
    val last = arr.size - 1
    for (i in 0..last) {
        left += arr[i][i]
        right += arr[i][last - i]
    }
    return abs(left-right)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}