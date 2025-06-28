// Write a program that reads 6 numbers. These numbers will only be positive or
//  negative (disregard null values). Print the total number of positive numbers.

// Input
// Six numbers, positive and/or negative.

// Output
// Print a message with the total number of positive numbers.

// Input Sample	Output Sample
// 7
// -5
// 6
// -3.4
// 4.6
// 12

// 4 valores positivos

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var positiveCount = 0

    repeat(6) {
        val number = reader.readLine().toDouble()
        if (number > 0) {
            positiveCount++
        }
    }

    println("$positiveCount valores positivos")
}
