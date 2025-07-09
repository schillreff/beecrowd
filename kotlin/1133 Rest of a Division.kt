// Write a program that reads two integer numbers X and Y. Print all numbers
//  between X and Y which dividing it by 5 the rest is equal to 2 or equal to 3.

// Input
// The input file contains 2 any positive integers, not necessarily in ascending order.

// Output
// Print all numbers according to above description, always in ascending order.

// Input Sample	Output Sample
// 10
// 18

// 12
// 13
// 17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var x = reader.readLine().toInt()
    var y = reader.readLine().toInt()

    if (x > y) {
        val temp = x
        x = y
        y = temp
    }

    for (number in (x + 1) until y) {
        if (number % 5 == 2 || number % 5 == 3) {
            println(number)
        }
    }
}