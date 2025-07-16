// Write an algorithm to read an undeterminated number of data, each containing
// an individual's age. The final data, which will not enter in the calculations,
//  contains the value of a negative age. Calculate and print the average age of
// this group of individuals.

// Input
// The input contains an undetermined number of integers. The input will be
// stop when a negative value is read.

// Output
// The output contains a value corresponding to the average age of individuals.

// The average should be printed with two digits after the decimal point.

// Input Sample	Output Sample
// 34
// 56
// 44
// 23
// -2

// 39.25

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var totalSum = 0.0
    var numberOfAges = 0

    while (true) {
        val line = reader.readLine()
        if (line.isNullOrEmpty()) {
            break
        }
        val currentAge = line.toInt()

        if (currentAge < 0) {
            break
        }

        totalSum += currentAge
        numberOfAges++
    }

    if (numberOfAges == 0) {
        System.out.printf("%.2f%n", 0.0)
    } else {
        val average = totalSum / numberOfAges
        System.out.printf("%.2f%n", average)
    }
}
