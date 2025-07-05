// Make a program that prints the sequence like the following example.

// Input
// This problem doesn't have input.

// Output
// Print the sequence like the example below.

// Input Sample	Output Sample
// I=1 J=60
// I=4 J=55
// I=7 J=50
// ...
// I=? J=0

fun main(args: Array<String>) {
    var iValue = 1
    var jValue = 60

    while (jValue >= 0) {
        println("I=$iValue J=$jValue")
        iValue += 3
        jValue -= 5
    }
}