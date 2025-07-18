// Write a program to read the coordinates (X, Y) of an indeterminate number of
// points in Cartesian system. For each point write the quadrant to which it belongs.
//  The program finish when at least one of two coordinates is NULL
//  (in this situation without writing any message).

// Input
// The input contains several tests cases. Each test case contains two integer numbers.

// Output
// For each test case, print the corresponding quadrant which these
// coordinates belong, as in the example.

// Input Sample	Output Sample
// 2 2
// 3 -2
// -8 -1
// -7 1
// 0 2

// primeiro
// quarto
// terceiro
// segundo

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val line = reader.readLine()
        if (line.isNullOrEmpty()) {
            break
        }

        val parts = line.split(" ")
        val x = parts[0].toInt()
        val y = parts[1].toInt()

        if (x == 0 || y == 0) {
            break
        }

        when {
            x > 0 && y > 0 -> println("primeiro")
            x < 0 && y > 0 -> println("segundo")
            x < 0 && y < 0 -> println("terceiro")
            x > 0 && y < 0 -> println("quarto")
        }
    }
}
