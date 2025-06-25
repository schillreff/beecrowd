// Read three integers and sort them in ascending order. After, print these
// values in ascending order, a blank line and then the values in the sequence as they were readed.

// Input
// The input contains three integer numbers.

// Output
// Present the output as requested above.

// Input Sample	Output Sample
// 7 21 -14

// -14
// 7
// 21

// 7
// 21
// -14

// -14 21 7

// -14
// 7
// 21

// -14
// 21
// 7

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (valueA, valueB, valueC) = reader.readLine().split(" ").map { it.toInt() }

    val originalValues = intArrayOf(valueA, valueB, valueC)
    val sortedValues = originalValues.sortedArray()

    println(sortedValues[0])
    println(sortedValues[1])
    println(sortedValues[2])

    println()

    println(originalValues[0])
    println(originalValues[1])
    println(originalValues[2])
}
