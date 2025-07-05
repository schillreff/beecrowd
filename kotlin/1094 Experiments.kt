// Maria has just started as graduate student in a medical school and she's
// needing your help to organize a laboratory experiment which she is responsible
// about. She wants to know, at the end of the year, how many animals were used
//  in this laboratory and the percentage of each type of animal is used at all.

// This laboratory uses in particular three types of animals: frogs, rats and
//  rabbits. To obtain this information, it knows exactly the number of
//  experiments that were performed, the type and quantity of each animal is used in each experiment.

// Input
// The first line of input contains an integer N indicating the number of
//  test cases that follows. Each test case contains an integer Amount
// (1 ≤ Amount ≤ 15) which represents the amount of animal used and a character
//  Type ('C', 'R' or 'S'), indicating the type of animal:
// - C: Coelho (rabbit in portuguese)
// - R: Rato (rat  in portuguese)
// - S: Sapo (frog in portuguese)

// Output
// Print the total of animals used, the total of each type of animal and the
// percentual of each one in relation of the total of animals used. The
//  percentual must be printed with 2 digits after the decimal point.

// Input Sample	Output Sample
// 10
// 10 C
// 6 R
// 15 S
// 5 C
// 14 R
// 9 C
// 6 R
// 8 S
// 5 C
// 14 R

// Total: 92 cobaias
// Total de coelhos: 29
// Total de ratos: 40
// Total de sapos: 23
// Percentual de coelhos: 31.52 %
// Percentual de ratos: 43.48 %
// Percentual de sapos: 25.00 %

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = reader.readLine().toInt()

    var totalAnimals = 0
    var totalRabbits = 0
    var totalRats = 0
    var totalFrogs = 0

    for (i in 0 until n) {
        val line = reader.readLine().split(" ")
        val amount = line[0].toInt()
        val type = line[1]

        totalAnimals += amount

        when (type) {
            "C" -> totalRabbits += amount
            "R" -> totalRats += amount
            "S" -> totalFrogs += amount
        }
    }

    println("Total: $totalAnimals cobaias")
    println("Total de coelhos: $totalRabbits")
    println("Total de ratos: $totalRats")
    println("Total de sapos: $totalFrogs")

    val percentRabbits = if (totalAnimals == 0) 0.0 else totalRabbits.toDouble() / totalAnimals * 100.0
    val percentRats = if (totalAnimals == 0) 0.0 else totalRats.toDouble() / totalAnimals * 100.0
    val percentFrogs = if (totalAnimals == 0) 0.0 else totalFrogs.toDouble() / totalAnimals * 100.0

    System.out.printf("Percentual de coelhos: %.2f %%\n", percentRabbits)
    System.out.printf("Percentual de ratos: %.2f %%\n", percentRats)
    System.out.printf("Percentual de sapos: %.2f %%\n", percentFrogs)
}