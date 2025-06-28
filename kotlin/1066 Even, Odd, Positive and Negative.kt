// Make a program that reads five integer values. Count how many   of these
// values are even, odd, positive and negative. Print these information like following example.

// Input
// The input will be 5 integer values.

// Output
// Print a message like the following example with all letters in lowercase,
//  indicating how many of these values ​​are even, odd, positive and negative.

// Input Sample	Output Sample
// -5
// 0
// -3
// -4
// 12

// 3 valor(es) par(es)
// 2 valor(es) impar(es)
// 1 valor(es) positivo(s)
// 3 valor(es) negativo(s)

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var evenCount = 0
    var oddCount = 0
    var positiveCount = 0
    var negativeCount = 0

    for (i in 0 until 5) {
        val number = reader.readLine().toInt()
        if (number % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }

        if (number > 0) {
            positiveCount++
        } else if (number < 0) {
            negativeCount++
        }
    }

    println("$evenCount valor(es) par(es)")
    println("$oddCount valor(es) impar(es)")
    println("$positiveCount valor(es) positivo(s)")
    println("$negativeCount valor(es) negativo(s)")
}
