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

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    if(grades.any{it < 0 || it >100}) throw IllegalArgumentException("grades's element must be in range [0..100]")

    return grades.map { roundGrade(it) }.toTypedArray()
}

fun roundGrade(it: Int):Int {
    return when {
        it < 38 -> it
        canBeRoundTo5(it) -> roundTo5(it)
        else -> it
    }

}

fun roundTo5(it: Int): Int {
    return (it/5+1)*5
}

fun canBeRoundTo5(it: Int): Boolean {
    return it%5 >2
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    if(gradesCount < 1 || gradesCount > 60) throw IllegalArgumentException("gradesCount must be in range [1..60]")

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
