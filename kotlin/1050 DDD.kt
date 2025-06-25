// Read an integer number that is the code number for phone dialing. Then,
// print the destination according to the following table:

// If the input number isn’t found in the above table, the output must be:
// DDD nao cadastrado
// That means “DDD not found” in Portuguese language.

// Input
// The input consists in a unique integer number.

// Output
// Print the city name corresponding to the input DDD. Print DDD nao cadastrado
//  if doesn't exist corresponding DDD to the typed number.

// Input Sample	Output Sample
// 11

// Sao Paulo

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val dddCode = reader.readLine().toInt()

    val dddMap =
        mapOf(
            61 to "Brasilia",
            71 to "Salvador",
            11 to "Sao Paulo",
            21 to "Rio de Janeiro",
            32 to "Juiz de Fora",
            19 to "Campinas",
            27 to "Vitoria",
            31 to "Belo Horizonte"
        )

    val city = dddMap[dddCode]

    if (city != null) {
        println(city)
    } else {
        println("DDD nao cadastrado")
    }
}
