// Write a program that reads two integer numbers X and Y and calculate the
// sum of all number not divisible by 13 between them, including both.

// Input
// The input file contains 2 integer numbers X and Y without any order.

// Output
// Print the sum of all numbers between X and Y not divisible by 13, including
// them if it is the case.

// Input Sample	Output Sample
// 100
// 200

// 13954

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.max

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val x = reader.readLine().toInt()
    val y = reader.readLine().toInt()

    val start = min(x, y)
    val end = max(x, y)

    var totalSum = 0

    for (number in start..end) {
        if (number % 13 != 0) {
            totalSum += number
        }
    }

    println(totalSum)
}
