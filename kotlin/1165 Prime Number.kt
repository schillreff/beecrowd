// A Prime Number is a number that is divisible only by 1 (one) and by itself.
//  For example the number 7 is Prime, because it can be divided only by 1 and by 7.

// Input
// The input contains several test cases. The first contains the number of test
//  cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer
//  X (1 < X ≤ 107), that can be or not a prime number.

// Output
// For each test case print the message “X eh primo” (X is prime) or “X nao eh 
// primo” (X isn't prime) according with to above specification.

// Input Sample	Output Sample
// 3
// 8
// 51
// 7

// 8 nao eh primo
// 51 nao eh primo
// 7 eh primo

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()

    for (i in 0 until n) {
        val x = reader.readLine().toInt()

        if (x == 2) {
            println("$x eh primo")
            continue
        }
        if (x % 2 == 0 || x < 2) {
            println("$x nao eh primo")
            continue
        }

        var isPrime = true
        val sqrtX = sqrt(x.toDouble()).toInt()
        for (j in 3..sqrtX step 2) {
            if (x % j == 0) {
                isPrime = false
                break
            }
        }
        println("$x ${if (isPrime) "eh primo" else "nao eh primo"}")
    }
}