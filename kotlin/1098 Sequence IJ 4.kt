// Make a program that prints the sequence like the following example.

// Input
// This problem doesn't have input.

// Output
// Print the sequence like the example below.

// Input Sample	Output Sample
// I=0 J=1
// I=0 J=2
// I=0 J=3
// I=0.2 J=1.2
// I=0.2 J=2.2
// I=0.2 J=3.2
// .....
// I=2 J=?
// I=2 J=?
// I=2 J=?

import kotlin.math.abs
import kotlin.math.round

fun main(args: Array<String>) {
    val epsilon = 1e-9

    var i = 0.0
    while (i <= 2.0 + epsilon) {
        for (j in 1..3) {
            if (abs(i - round(i)) < epsilon) {
                System.out.printf("I=%.0f J=%.0f\n", round(i), round(j + i))
            } else {
                System.out.printf("I=%.1f J=%.1f\n", i, (j + i))
            }
        }
        i += 0.2
    }
}