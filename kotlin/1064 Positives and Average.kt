// Read 6 values that can be floating point numbers. After, print how many of
//  them were positive. In the next line, print the average of all positive
// values typed, with one digit after the decimal point.

// Input
// The input consist in 6 numbers that can be integer or floating point values.
// At least one number will be positive.

// Output
// The first output value is the amount of positive numbers. The next line
// should show the average of the positive values ​typed.

// Input Sample	Output Sample
// 7
// -5
// 6
// -3.4
// 4.6
// 12

// 4 valores positivos
// 7.4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var positiveCount = 0
    var positiveSum = 0.0

    for (i in 0 until 6) {
        val number = reader.readLine().toDouble()
        if (number > 0) {
            positiveCount++
            positiveSum += number
        }
    }

    println("$positiveCount valores positivos")

    if (positiveCount > 0) {
        val positiveAverage = positiveSum / positiveCount
        System.out.printf("%.1f%n", positiveAverage)
    }
}
