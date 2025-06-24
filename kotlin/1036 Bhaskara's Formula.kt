// Read 3 floating-point numbers. After, print the roots of bhaskara’s formula.
// If it's impossible to calculate the roots because a division by zero or a
// square root of a negative number, presents the message “Impossivel calcular”.

// Input
// Read 3 floating-point numbers (double) A, B and C.

// Output
// Print the result with 5 digits after the decimal point or the message
//  if it is impossible to calculate.

// Input Samples	Output Samples
// 10.0 20.1 5.1

// R1 = -0.29788
// R2 = -1.71212

// 0.0 20.0 5.0

// Impossivel calcular

// 10.3 203.0 5.0

// R1 = -0.02466
// R2 = -19.68408

// 10.0 3.0 5.0

// Impossivel calcular

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (valueA, valueB, valueC) = reader.readLine().split(" ").map { it.toDouble() }

    val delta = valueB.pow(2.0) - 4 * valueA * valueC

    if (valueA != 0.0 && delta >= 0) {
        val root1 = (-valueB + sqrt(delta)) / (2 * valueA)
        val root2 = (-valueB - sqrt(delta)) / (2 * valueA)
        System.out.printf("R1 = %.5f%n", root1)
        System.out.printf("R2 = %.5f%n", root2)
    } else {
        println("Impossivel calcular")
    }
}
