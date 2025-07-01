// Read two integer values X and Y. Print the sum of all odd values between them.

// Input
// The input file contain two integer values.

// Output
// The program must print an integer number. This number is the sum off all odd
// values between both input values that must fit in an integer number.

// Sample Input	Sample Output
// 6
// -5

// 5

// 15
// 12

// 13

// 12
// 12

// 0

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.max

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val num1 = reader.readLine().toInt()
    val num2 = reader.readLine().toInt()

    val start = min(num1, num2) + 1
    val end = max(num1, num2)

    var sumOdd = 0

    for (i in start until end) {
        if (i % 2 != 0) {
            sumOdd += i
        }
    }

    println(sumOdd)
}
