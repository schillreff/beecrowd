// Read an integer number between 1 and 12, including. Corresponding to this
// number, you must print the month of the year, in english, with the first letter in uppercase.

// Input
// The input contains only an integer number.

// Output
// Print the name of the month according to the input number, with the first letter in uppercase.

// Input Sample	Output Sample
// 4

// April

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val monthNumber = reader.readLine().toInt()

    val monthsMap = mapOf(
        1 to "January",
        2 to "February",
        3 to "March",
        4 to "April",
        5 to "May",
        6 to "June",
        7 to "July",
        8 to "August",
        9 to "September",
        10 to "October",
        11 to "November",
        12 to "December"
    )

    println(monthsMap[monthNumber])
}
