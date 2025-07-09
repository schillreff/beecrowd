// Write a program that reads an integer N (1 < N < 1000). This N is the number
//  of output lines printed by this program.

// Input
// The input file contains an integer N.

// Output
// Print the output according to the given example.

// Input Sample	Output Sample
// 5

// 1 1 1
// 2 4 8
// 3 9 27
// 4 16 64
// 5 25 125

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()

    for (i in 1..n) {
        val square = i * i
        val cube = i * i * i
        println("$i $square $cube")
    }
}