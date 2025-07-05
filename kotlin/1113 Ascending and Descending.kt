// Read an undetermined number of pairs of integer values. Write a message for
// each pair indicating if this two numbers are in ascending or descending order.

// Input
// The input file contains several test cases. Each test case contains two
// integer numbers X and Y. The input will finished when X = Y.

// Output
// For each test case print “Crescente”, if the values X and Y are in
//  ascending order, otherwise print “Decrescente”.

// Input Sample	Output Sample
// 5 4
// 7 2
// 3 8
// 2 2

// Decrescente
// Decrescente
// Crescente

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

        if (x == y) {
            break
        }

        val order = if (x > y) "Decrescente" else "Crescente"
        println(order)
    }
}