// Write an algorithm to calculate and write the value of S, S being given by:
// S = 1 + 1/2 + 1/3 + … + 1/100

// Input
// There is no input in this problem.

// Output
// The output contains a value corresponding to the value of S.
// The value should be printed with two digits after the decimal point.

import java.io.IOException

fun main(args: Array<String>) {
    val sumValue = calculateHarmonicSum()
    System.out.printf("%.2f%n", sumValue)
}

fun calculateHarmonicSum(): Double {
    var harmonicSum = 0.0
    for (i in 1..100) {
        harmonicSum += 1.0 / i
    }
    return harmonicSum
}
