// In this problem, your job is to read three Portuguese words. These words
// define an animal according to the table below, from left to right. After,
//  print the chosen animal defined by these three words.

// Input
// The input contains 3 words, one by line, that will be used to identify
// the animal, according to the above table, with all letters in lowercase.

// Output
// Print the animal name according to the given input.

// Input Samples	Output Samples
// vertebrado
// mamifero
// onivoro

// homem

// vertebrado
// ave
// carnivoro

// aguia

// invertebrado
// anelideo
// onivoro

// minhoca

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val characteristic1 = reader.readLine()
    val characteristic2 = reader.readLine()
    val characteristic3 = reader.readLine()

    val animals =
        mapOf(
            "vertebrado" to
                    mapOf(
                        "ave" to mapOf("carnivoro" to "aguia", "onivoro" to "pomba"),
                        "mamifero" to mapOf("onivoro" to "homem", "herbivoro" to "vaca")
                    ),
            "invertebrado" to
                    mapOf(
                        "inseto" to
                                mapOf("hematofago" to "pulga", "herbivoro" to "lagarta"),
                        "anelideo" to
                                mapOf(
                                    "hematofago" to "sanguessuga",
                                    "onivoro" to "minhoca"
                                )
                    )
        )

    val result = animals[characteristic1]?.get(characteristic2)?.get(characteristic3)
    println(result)
}
