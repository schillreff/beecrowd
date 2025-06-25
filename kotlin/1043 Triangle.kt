// Read three point floating values (A, B and C) and verify if is possible
// to make a triangle with them. If it is possible, calculate the perimeter of the triangle and
// print the message:

// Perimetro = XX.X

// If it is not possible, calculate the area of the trapezium which basis
// A and B and C as height, and print the message:

// Area = XX.X

// Input
// The input file has tree floating point numbers.

// Output
// Print the result with one digit after the decimal point.

// Input Sample	Output Sample
// 6.0 4.0 2.0

// Area = 10.0

// 6.0 4.0 2.1

// Perimetro = 12.1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (valueA, valueB, valueC) = reader.readLine().split(" ").map { it.toDouble() }

    if (valueA + valueB > valueC && valueA + valueC > valueB && valueB + valueC > valueA) {
        val perimeter = valueA + valueB + valueC
        System.out.printf("Perimetro = %.1f%n", perimeter)
    } else {
        val area = ((valueA + valueB) * valueC) / 2.0
        System.out.printf("Area = %.1f%n", area)
    }
}
