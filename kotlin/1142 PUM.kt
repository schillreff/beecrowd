// Write a program that reads an integer N. This N is the number of output lines printed by this program.

// Input
// The input file contains an integer N.

// Output
// Print the output according to the given example.

// Input Sample	Output Sample
// 7

// 1 2 3 PUM
// 5 6 7 PUM
// 9 10 11 PUM
// 13 14 15 PUM
// 17 18 19 PUM
// 21 22 23 PUM
// 25 26 27 PUM

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()

    var startNumber = 1

    for (i in 0 until n) {
        println("$startNumber ${startNumber + 1} ${startNumber + 2} PUM")
        startNumber += 4
    }
}