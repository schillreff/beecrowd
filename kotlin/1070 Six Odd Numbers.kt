// Read an integer value X and print the 6 consecutive odd numbers from X,
// a value per line, including X if it is the case.

// Input
// The input will be a positive integer value.

// Output
// The output will be a sequence of six odd numbers.

// Input Sample	Output Sample
// 8

// 9
// 11
// 13
// 15
// 17
// 19

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var startingNumber = reader.readLine().toInt()

    if (startingNumber % 2 == 0) {
        startingNumber++
    }

    for (i in 0 until 6) {
        println(startingNumber)
        startingNumber += 2
    }
}