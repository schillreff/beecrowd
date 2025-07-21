// Read an array X[10]. After, replace every null or negative number of X ​by 1. Print all numbers stored in the array X.

// Input
// The input contains 10 integer numbers. These numbers ​​can be positive or negative.

// Output
// For each position of the array, print "X [i] = x", where i is the position of the array and x is the number stored in that position.

// Input Sample	Output Sample
// 0
// -5
// 63
// 0
// ...

// X[0] = 1
// X[1] = 1
// X[2] = 63
// X[3] = 1
// ...

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    for (i in 0 until 10) {
        var x = reader.readLine().toInt()
        if (x <= 0) {
            x = 1
        }
        println("X[$i] = $x")
    }
}