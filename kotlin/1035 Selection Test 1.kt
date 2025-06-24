// Read 4 integer values A, B, C and D. Then if B is greater than C
// and D is greater than A and if the sum of C and D is greater
// than the sum of A and B and if C and D were positives values and if A is even,
// write the message “Valores aceitos” (Accepted values). Otherwise, write the
// message “Valores nao aceitos” (Values not accepted).

// Input
// Four integer numbers A, B, C and D.

// Output
// Show the corresponding message after the validation of the values​​.

// Input Sample	Output Sample
// 5 6 7 8

// Valores nao aceitos

// 2 3 2 6

// Valores aceitos

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (valueA, valueB, valueC, valueD) = reader.readLine().split(" ").map { it.toInt() }

    if (valueB > valueC &&
        valueD > valueA &&
        (valueC + valueD) > (valueA + valueB) &&
        valueC > 0 &&
        valueD > 0 &&
        valueA % 2 == 0
    ) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }
}
