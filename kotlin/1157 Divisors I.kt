// Read an integer N and compute all its divisors.

// Input
// The input file contains an integer value.

// Output
// Write all positive divisors of N, one value per line.

// Input Sample	Output Sample
// 6

// 1
// 2
// 3
// 6

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val inputNumber = reader.readLine().toInt()
    printDivisors(inputNumber)
}

fun printDivisors(number: Int) {
    for (i in 1..number) {
        if (number % i == 0) {
            println(i)
        }
    }
}