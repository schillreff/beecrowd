// Read an integer N that is the number of test cases. Each test case is a line
// containing two integer numbers X and Y. Print the sum of all odd values between them, not including X and Y.

// Input
// The first line of input is an integer N that is the number of test cases
// that follow. Each test case is a line containing two integer X and Y.

// Output
// Print the sum of all odd numbers between X and Y.

// Input Sample	Output Sample
// 7

// 4 5

// 13 10

// 6 4

// 3 3

// 3 5

// 3 4

// 3 8

// 0

// 11

// 5

// 0

// 0

// 0

// 12

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.max

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()

    for (k in 0 until n) {
        val (x, y) = reader.readLine().split(" ").map { it.toInt() }

        val start = min(x, y) + 1
        val end = max(x, y)

        var sumOdd = 0

        for (i in start until end) {
            if (i % 2 != 0) {
                sumOdd += i
            }
        }
        println(sumOdd)
    }
}