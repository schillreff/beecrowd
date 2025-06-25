// Read 3 double numbers (A, B and C) representing the sides of a triangle and
//  arrange them in decreasing order, so that the side A is the biggest of the
// three sides. Next, determine the type of triangle that they can make, based
// on the following cases always writing an appropriate message:

// if A ≥ B + C, write the message: NAO FORMA TRIANGULO
// if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
// if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
// if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
// if the three sides are the same size, write the message: TRIANGULO EQUILATERO
// if only two sides are the same and the third one is different,
//  write the message: TRIANGULO ISOSCELES
// Input
// The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

// Output
// Print all the classifications of the triangle presented in the input.

// Input Samples	Output Samples
// 7.0 5.0 7.0

// TRIANGULO ACUTANGULO
// TRIANGULO ISOSCELES

// 6.0 6.0 10.0

// TRIANGULO OBTUSANGULO
// TRIANGULO ISOSCELES

// 6.0 6.0 6.0

// TRIANGULO ACUTANGULO
// TRIANGULO EQUILATERO

// 5.0 7.0 2.0

// NAO FORMA TRIANGULO

// 6.0 8.0 10.0

// TRIANGULO RETANGULO

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.pow

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (side1, side2, side3) = reader.readLine().split(" ").map { it.toDouble() }

    val sides = doubleArrayOf(side1, side2, side3)
    sides.sort()

    val c = sides[0]
    val b = sides[1]
    val a = sides[2]

    val epsilon = 1e-9

    if (a >= b + c) {
        println("NAO FORMA TRIANGULO")
    } else {
        if (abs(a.pow(2.0) - (b.pow(2.0) + c.pow(2.0))) < epsilon) {
            println("TRIANGULO RETANGULO")
        }
        if (a.pow(2.0) > b.pow(2.0) + c.pow(2.0) + epsilon) {
            println("TRIANGULO OBTUSANGULO")
        }
        if (a.pow(2.0) < b.pow(2.0) + c.pow(2.0) - epsilon) {
            println("TRIANGULO ACUTANGULO")
        }

        if (abs(a - b) < epsilon && abs(b - c) < epsilon) {
            println("TRIANGULO EQUILATERO")
        } else if (abs(a - b) < epsilon || abs(b - c) < epsilon || abs(a - c) < epsilon) {
            println("TRIANGULO ISOSCELES")
        }
    }
}
