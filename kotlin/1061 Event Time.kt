// Peter is organizing an event in his University. The event will be in April
// month, beginning and finishing within April month. The problem is: Peter
// wants to calculate the event duration in seconds, knowing obviously the
// begin and the end time of the event.

// You know that the event can take from few seconds to some days, so, you
// must help Peter to compute the total time corresponding to duration of the event.

// Input
// The first line of the input contains information about the beginning day
// of the event in the format: “Dia xx”. The next line contains the start
// time of the event in the format presented in the sample input. Follow
// 2 input lines with same format, corresponding to the end of the event.

// Output
// Your program must print the following output, one information by line,
// considering that if any information is null for example, the number 0
// must be printed in place of W, X, Y or Z:

// W dia(s)
// X hora(s)
// Y minuto(s)
// Z segundo(s)

// Obs: Consider that the event of the test case have the minimum duration
// of one minute. “dia” means day, “hora” means hour, “minuto” means minute
// and “Segundo” means second in Portuguese.

// Input Sample	Output Sample
// Dia 5
// 08 : 12 : 23
// Dia 9
// 06 : 13 : 23

// 3 dia(s)
// 22 hora(s)
// 1 minuto(s)
// 0 segundo(s)

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val startDay = reader.readLine().split(" ")[1].toInt()
    val startTimeParts = reader.readLine().split(" : ").map { it.toInt() }
    val startTime = startTimeParts[0]
    val startMinute = startTimeParts[1]
    val startSecond = startTimeParts[2]

    val endDay = reader.readLine().split(" ")[1].toInt()
    val endTimeParts = reader.readLine().split(" : ").map { it.toInt() }
    val endTime = endTimeParts[0]
    val endMinute = endTimeParts[1]
    val endSecond = endTimeParts[2]

    val startTotalSeconds = startDay * 86400 + startTime * 3600 + startMinute * 60 + startSecond
    val endTotalSeconds = endDay * 86400 + endTime * 3600 + endMinute * 60 + endSecond

    var duration = endTotalSeconds - startTotalSeconds

    val days = duration / 86400
    duration %= 86400
    val hours = duration / 3600
    duration %= 3600
    val minutes = duration / 60
    val seconds = duration % 60

    println("$days dia(s)")
    println("$hours hora(s)")
    println("$minutes minuto(s)")
    println("$seconds segundo(s)")
}
