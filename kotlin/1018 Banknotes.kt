// In this problem you have to read an integer value and calculate the
// smallest possible number of banknotes in which the value may be decomposed.
// The possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read
// value and the list of banknotes.

// Input
// The input file contains an integer value N (0 < N < 1000000).

// Output
// Print the read number and the minimum quantity of each necessary banknotes
// in Portuguese language, as the given example. Do not forget to print the
// end of line after each line, otherwise you will receive “Presentation Error”.

// Input Sample	Output Sample
// 576

// 576
// 5 nota(s) de R$ 100,00
// 1 nota(s) de R$ 50,00
// 1 nota(s) de R$ 20,00
// 0 nota(s) de R$ 10,00
// 1 nota(s) de R$ 5,00
// 0 nota(s) de R$ 2,00
// 1 nota(s) de R$ 1,00

// 11257

// 11257
// 112 nota(s) de R$ 100,00
// 1 nota(s) de R$ 50,00
// 0 nota(s) de R$ 20,00
// 0 nota(s) de R$ 10,00
// 1 nota(s) de R$ 5,00
// 1 nota(s) de R$ 2,00
// 0 nota(s) de R$ 1,00

// 503

// 503
// 5 nota(s) de R$ 100,00
// 0 nota(s) de R$ 50,00
// 0 nota(s) de R$ 20,00
// 0 nota(s) de R$ 10,00
// 0 nota(s) de R$ 5,00
// 1 nota(s) de R$ 2,00
// 1 nota(s) de R$ 1,00

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var amount = reader.readLine().toInt()

    println(amount)

    println("${amount / 100} nota(s) de R$ 100,00")
    amount %= 100
    println("${amount / 50} nota(s) de R$ 50,00")
    amount %= 50
    println("${amount / 20} nota(s) de R$ 20,00")
    amount %= 20
    println("${amount / 10} nota(s) de R$ 10,00")
    amount %= 10
    println("${amount / 5} nota(s) de R$ 5,00")
    amount %= 5
    println("${amount / 2} nota(s) de R$ 2,00")
    amount %= 2
    println("$amount nota(s) de R$ 1,00")
}
