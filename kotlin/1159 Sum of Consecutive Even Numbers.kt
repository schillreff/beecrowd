// The program must read an integer X indefinite times (stop when X=0). For
// each X, print the sum of five consecutive even numbers from X, including it
//  if X is even. If the input number is 4, for example, the output must be 40,
// that is the result of the operation: 4+6+8+10+12. If the input number is 11,
// for example, the output must be 80, that is the result of 12+14+16+18+20.

// Input
// The input file contains many integer numbers. The last one is zero.

// Output
// Print the output according to the example below.

// Input Sample	Output Sample
// 4
// 11
// 0

// 40
// 80

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val line = reader.readLine()
        if (line.isNullOrEmpty()) {
            break
        }
        var inputNumber = line.toInt()
        if (inputNumber == 0) {
            break
        }

        if (inputNumber % 2 != 0) {
            inputNumber++
        }

        var sumOfEvens = 0
        for (j in 0 until 5) {
            sumOfEvens += inputNumber
            inputNumber += 2
        }
        println(sumOfEvens)
    }
}