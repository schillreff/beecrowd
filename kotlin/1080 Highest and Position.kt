// Read 100 integer numbers. Print the highest read value and the input position.

// Input
// The input file contains 100 distinct positive integer numbers.

// Output
// Print the highest number read and the input position of this value, according to the given example.

// Input Sample	Output Sample
// 2
// 113
// 45
// 34565
// 6
// ...
// 8

// 34565
// 4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var maxValue = -1
    var maxPosition = -1

    for (i in 1..100) {
        val number = reader.readLine().toInt()

        if (number > maxValue) {
            maxValue = number
            maxPosition = i
        }
    }

    println(maxValue)
    println(maxPosition)
}
