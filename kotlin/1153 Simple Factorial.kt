// Read a value N. Calculate and write its corresponding factorial.
// Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.

// Input
// The input contains an integer value N (0 < N < 13).

// Output
// The output contains an integer value corresponding to the factorial of N.

// Input Sample	Output Sample
// 4

// 24

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val inputNumber = reader.readLine().toInt()
    println(calculateFactorial(inputNumber))
}

fun calculateFactorial(number: Int): Long {
    var factorialResult: Long = 1
    for (i in 1..number) {
        factorialResult *= i
    }
    return factorialResult
}