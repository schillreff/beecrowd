// Write an algorithm to read a value A and a value N. Print the sum of N
//  numbers from A (inclusive). While N is negative or ZERO, a new N (only N)
// must be read. All input values are in the same line.

// Input
// The input contains only integer values, can be positive or negative.

// Output
// The output contains only an integer value.

// Input Sample	Output Sample
// 3 2

// 7

// 3 -1 0 -2 2

// 7

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val line = reader.readLine()
    val tokens = line.split(" ")

    val a = tokens[0].toInt()
    var n = 0

    for (i in 1 until tokens.size) {
        val currentNum = tokens[i].toInt()
        if (currentNum > 0) {
            n = currentNum
            break
        }
    }

    var result = 0
    for (i in 0 until n) {
        result += a + i
    }

    println(result)
}
