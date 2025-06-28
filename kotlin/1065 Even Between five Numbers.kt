// Make a program that reads five integer values. Count how many of these
// values ​​are even and  print this information like the following example.

// Input
// The input will be 5 integer values.

// Output
// Print a message like the following example with all letters in lowercase,
// indicating how many even numbers were typed.

// Input Sample	Output Sample
// 7
// -5
// 6
// -4
// 12

// 3 valores pares

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var evenCount = 0

    for (i in 0 until 5) {
        val value = reader.readLine().toInt()
        if (value % 2 == 0) {
            evenCount++
        }
    }

    println("$evenCount valores pares")
}