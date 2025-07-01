// Read an integer N. Print all numbers between 1 and 10000, which divided by N will give the rest = 2.

// Input
// The input is an integer N (N < 10000)

// Output
// Print all numbers between 1 and 10000, which divided by n will give the rest = 2, one per line.

// Input Sample	Output Sample
// 13

// 2
// 15
// 28
// 41
// ...

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val divisor = reader.readLine().toInt()

    for (i in 1 until 10000) {
        if (i % divisor == 2) {
            println(i)
        }
    }
}