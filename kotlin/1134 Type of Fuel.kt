// A gas station wants to determine which of their products is the preference
// of their customers. Write a program to read the type of fuel supplied
// (coded as follows: 1. Alcohol 2. Gasoline 3. Diesel 4. End). If you enter
//  an invalid code (outside the range of 1 to 4) a new code must be requested.
// The program will end when the inserted code is the number 4.

// Input
// The input contains only integer and positive values.

// Output
// It should be written the message: "MUITO OBRIGADO" and the amount of
// customers who fueled each fuel type, as an example.

// Input Sample	Output Sample
// 8
// 1
// 7
// 2
// 2
// 4

// MUITO OBRIGADO
// Alcool: 1
// Gasolina: 2
// Diesel: 0

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var alcoholCount = 0
    var gasolineCount = 0
    var dieselCount = 0

    loop@ while (true) {
        val code = reader.readLine().toInt()

        when (code) {
            1 -> alcoholCount++
            2 -> gasolineCount++
            3 -> dieselCount++
            4 -> break@loop
        }
    }

    println("MUITO OBRIGADO")
    println("Alcool: $alcoholCount")
    println("Gasolina: $gasolineCount")
    println("Diesel: $dieselCount")
}