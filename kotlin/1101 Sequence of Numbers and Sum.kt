// Read an undetermined number of pairs values M and N (stop when any of these
//  values is less or equal to zero). For each pair, print the sequence from the
//  smallest to the biggest (including both) and the sum of consecutive integers between them (including both).

// Input
// The input file contains pairs of integer values M and N. The last line of
// the file contains a number zero or negative, or both.

// Output
// For each pair of numbers, print the sequence from the smallest to the
//  biggest and the sum of these values, as shown below.

// Input Sample	Output Sample
// 5 2
// 6 3
// 5 0

// 2 3 4 5 Sum=14
// 3 4 5 6 Sum=18

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.max

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val line = reader.readLine() ?: break
        val parts = line.split(" ")

        if (parts.size < 2) break

        val m = parts[0].toIntOrNull() ?: break
        val n = parts[1].toIntOrNull() ?: break

        if (m <= 0 || n <= 0) {
            break
        }

        val start = min(m, n)
        val end = max(m, n)

        val sequence = (start..end).joinToString(" ")
        val sum = (start..end).sum()

        println("$sequence Sum=$sum")
    }
}