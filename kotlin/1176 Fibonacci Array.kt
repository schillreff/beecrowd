// Write a program that reads a number and print the Fibonacci number corresponding 
// to this read number. Remember that the first elements of the Fibonacci series are 0 
// and 1 and each next term is the sum of the two preceding it. All the Fibonacci numbers 
// calculated in this program must fit in a unsigned 64 bits number.

// Input
// The first line of the input contains a single integer T, indicating the number
//  of test cases. Each test case contains a single integer N (0 ≤ N ≤ 60), corresponding to the N-th term of the Fibonacci series.

// Output
// For each test case in the input, print the message "Fib(N) = X", where X is the N-th term of the Fibonacci series.

// Input Sample	Output Sample
// 3
// 0
// 4
// 2

// Fib(0) = 0
// Fib(4) = 3
// Fib(2) = 1


import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val fibonacci = LongArray(61)
    fibonacci[0] = 0
    fibonacci[1] = 1

    for (i in 2..60) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    val testCases = reader.readLine().toInt()

    for (i in 0 until testCases) {
        val n = reader.readLine().toInt()
        println("Fib($n) = ${fibonacci[n]}")
    }
}