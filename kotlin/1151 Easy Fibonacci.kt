// The following sequence of numbers 0 1 1 2 3 5 8 13 21 ... is known as the
// Fibonacci Sequence. Thereafter, each number after the first 2 is equal to
// the sum of the previous two numbers. Write an algorithm that reads an
// integer N (N < 46) and that print the first N numbers of this sequence.

// Input
// The input file contains an integer number N (0 < N < 46).

// Output
// The numbers should be printed on the same line, separated by a blank space.
// There is no space after the last number.

// Thanks to Cássio F.

// Input Sample	Output Sample
// 5

// 0 1 1 2 3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val sequenceLength = reader.readLine().toInt()

    val fibNumbers = generateFibonacci(sequenceLength)

    println(fibNumbers.joinToString(" "))
}

fun generateFibonacci(length: Int): IntArray {
    if (length <= 0) {
        return IntArray(0)
    }
    if (length == 1) {
        return intArrayOf(0)
    }

    val fibNumbers = IntArray(length)
    fibNumbers[0] = 0
    fibNumbers[1] = 1

    for (i in 2 until length) {
        fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2]
    }

    return fibNumbers
}
