// Read two integer values (A and B). After, the program should print the
//  message "Sao Multiplos" (are multiples) or "Nao sao Multiplos"
// (aren’t multiples), corresponding to the read values.

// Input
// The input has two integer numbers.

// Output
// Print the relative message to the input as stated above.

// Input Sample	Output Sample
// 6 24

// Sao Multiplos

// 6 25

// Nao sao Multiplos

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var (valueA, valueB) = reader.readLine().split(" ").map { it.toInt() }

    if (valueA > valueB) {
        val temp = valueA
        valueA = valueB
        valueB = temp
    }

    if (valueB % valueA == 0) {
        println("Sao Multiplos")
    } else {
        println("Nao sao Multiplos")
    }
}
