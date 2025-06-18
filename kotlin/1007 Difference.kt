// Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
// diferença do produto de A e B pelo produto de C e D segundo a fórmula:
//  DIFERENCA = (A * B - C * D).

// Entrada
// O arquivo de entrada contém 4 valores inteiros.

// Saída
// Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme
// exemplo abaixo, com um espaço em branco antes e depois da igualdade.

// Exemplos de Entrada	Exemplos de Saída
// 5
// 6
// 7
// 8                    // DIFERENCA = -26

// 0
// 0
// 7
// 8                    // DIFERENCA = -56

// 5
// 6
// -7
// 8                    // DIFERENCA = 86

import java.io.BufferedReader
import java.io.InputStreamReader

fun calculateDifference(valueA: Int, valueB: Int, valueC: Int, valueD: Int): Int {
    return valueA * valueB - valueC * valueD
}

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val valueA = reader.readLine().toInt()
    val valueB = reader.readLine().toInt()
    val valueC = reader.readLine().toInt()
    val valueD = reader.readLine().toInt()

    val difference = calculateDifference(valueA, valueB, valueC, valueD)

    println("DIFERENCA = $difference")
}
