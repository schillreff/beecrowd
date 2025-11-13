// Write a program that reads a number N. This N is the size of a array X[N]. 
// Next, read each of the numbers of X, find the smallest element of this array 
// and its position within the array, printing this information.

// Input
// The first line of input contains one integer N (1 < N <1000), indicating the
//  number of elements that should be read to an array X[N] of integer numbers. 
// The second row contains each of the N values, separated by a space. Remember
//  that no input will have repeated numbers.

// Output
// The first line displays the message “Menor valor:” followed by a space and
//  the lowest number read in the input. The second line displays the message 
// “Posicao:” followed by a space and the array position in which the lowest 
// number is, remembering that the array starts at the zero position.

// Input Sample	Output Sample
// 10
// 1 2 3 4 -5 6 7 8 9 10

// Menor valor: -5
// Posicao: 4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()

    val line = reader.readLine()

    val arrayX = line.trim().split(Regex("\\s+")).map { it.toInt() }

    var minValue = arrayX[0]
    var position = 0

    for (i in 1 until n) { 
        if (arrayX[i] < minValue) {
            minValue = arrayX[i]
            position = i
        }
    }

    println("Menor valor: $minValue")
    println("Posicao: $position")
}