// Read an integer value corresponding to a person's age (in days) and print
// it in years, months and days, followed by its respective message “ano(s)”,
//  “mes(es)”, “dia(s)”.

// Note: only to facilitate the calculation, consider the whole year with 365
// days and 30 days every month. In the cases of test there will never be a
// situation that allows 12 months and some days, like 360, 363 or 364. This
// is just an exercise for the purpose of testing simple mathematical reasoning.

// Input
// The input file contains 1 integer value.

// Output
// Print the output, like the following example.

// Input Sample	Output Sample
// 400

// 1 ano(s)
// 1 mes(es)
// 5 dia(s)

// 800

// 2 ano(s)
// 2 mes(es)
// 10 dia(s)

// 30

// 0 ano(s)
// 1 mes(es)
// 0 dia(s)

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var totalDays = reader.readLine().toInt()

    val years = totalDays / 365
    totalDays %= 365
    val months = totalDays / 30
    val remainingDays = totalDays % 30

    println("$years ano(s)")
    println("$months mes(es)")
    println("$remainingDays dia(s)")
}
