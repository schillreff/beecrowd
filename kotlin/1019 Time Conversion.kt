// Read an integer value, which is the duration in seconds of a certain event in a factory, and
// inform it expressed in hours:minutes:seconds.

// Input
// The input file contains an integer N.

// Output
// Print the read time in the input file (seconds) converted in hours:minutes:seconds like the
// following example.

// Input Sample	Output Sample
// 556

// 0:9:16

// 1

// 0:0:1

// 140153

// 38:55:53

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var totalSeconds = reader.readLine().toInt()

    val hours = totalSeconds / 3600
    totalSeconds %= 3600
    val minutes = totalSeconds / 60
    val remainingSeconds = totalSeconds % 60

    println("$hours:$minutes:$remainingSeconds")
}
