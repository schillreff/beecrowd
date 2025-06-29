// Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from
//  1 to X, each one in a line, including X if is the case.

// Input
// The input will be an integer value.

// Output
// Print all odd values between 1 and X, including X if is the case.

// Input Sample	Output Sample
// 8

// 1
// 3
// 5
// 7

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val limit = reader.readLine().toInt()

    for (number in 1..limit step 2) {
        println(number)
    }
}
