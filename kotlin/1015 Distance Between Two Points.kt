// Read the four values corresponding to the x and y axes of two points in
// the plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance between
// them, showing four decimal places, according to the formula:

// Distance =

// Input
// The input file contains two lines of data. The first one contains two double
//  values: x1 y1 and the second one also contains two double values with one
//  digit after the decimal point: x2 y2.

// Output
// Calculate and print the distance value using the provided formula, with
// 4 decimal places.

// Input Sample	Output Sample
// 1.0 7.0
// 5.0 9.0      // 4.4721

// -2.5 0.4
// 12.1 7.3     // 16.1484

// 2.5 -0.4
// -12.2 7.0    // 16.4575

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val (x1, y1) = reader.readLine().split(" ").map { it.toDouble() }
    val (x2, y2) = reader.readLine().split(" ").map { it.toDouble() }

    val distance = sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))

    System.out.printf("%.4f%n", distance)
}
