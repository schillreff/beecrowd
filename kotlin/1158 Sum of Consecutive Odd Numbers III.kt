// Read an integer N that is the number of test cases that follows. Each test
// case contains two integers X and Y. Print one output line for each test case
//  that is the sum of Y odd numbers from X including it if is the case. For example:
// for the input 4 5, the output must be 45, that is: 5 + 7 + 9 + 11 + 13
// for the input 7 4, the output must be 40, that is: 7 + 9 + 11 + 13

// Input
// The first line of the input is an integer N that is the number of test cases
//  that follow. Each test case is a line containing two integer X and Y.

// Output
// Print the sum of all consecutive odd numbers from X.

// Input Sample	Output Sample
// 2
// 4 3
// 11 2

// 21
// 24

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val numberOfTestCases = reader.readLine().toInt()

    for (i in 0 until numberOfTestCases) {
        val (firstNumberInput, termsToSum) = reader.readLine().split(" ").map { it.toInt() }

        var firstNumber = firstNumberInput

        if (firstNumber % 2 == 0) {
            firstNumber++
        }

        var currentSum = 0
        for (j in 0 until termsToSum) {
            currentSum += firstNumber
            firstNumber += 2
        }
        println(currentSum)
    }
}