// Read an integer N. Print the square of each one of the even values
// from 1 to N including N if it is the case.

// Input
// The input contains an integer N (5 < N < 2000).

// Output
// Print the square of each one of the even values from 1 to N, as the given example.

// Be carefull! Some language automaticly print 1e+006 instead 1000000.
// Please configure your program to print the correct format setting the output precision.

// Input Sample	Output Sample
// 6

// 2^2 = 4
// 4^2 = 16
// 6^2 = 36

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val limit = reader.readLine().toInt()

    for (i in 2..limit step 2) {
        val square = i * i
        println("$i^2 = $square")
    }
}