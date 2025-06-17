// Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de
// um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem
//  peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada
// nota pode ir de 0 até 10.0, sempre com uma casa decimal.

// Entrada
// O arquivo de entrada contém 3 valores com uma casa decimal, de dupla
// precisão (double).

// Saída
// Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo,
//  com 1 dígito após o ponto decimal e com um espaço em branco antes e
//  depois da igualdade. Assim como todos os problemas, não esqueça de
// imprimir o fim de linha após o resultado, caso contrário,
// você receberá "Presentation Error".

// Exemplos de Entrada	Exemplos de Saída
// 5.0
// 6.0
// 7.0                  // MEDIA = 6.3

// 5.0
// 10.0
// 10.0                 // MEDIA = 9.0

// 10.0
// 10.0
// 5.0                  // MEDIA = 7.5

import java.io.BufferedReader
import java.io.InputStreamReader

fun calculateAverage(valueA: Double, valueB: Double, valueC: Double): String {
    val average = (valueA * 2.0 + valueB * 3.0 + valueC * 5.0) / 10.0
    return "MEDIA = %.1f".format(average)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val valueA = reader.readLine().toDouble()
    val valueB = reader.readLine().toDouble()
    val valueC = reader.readLine().toDouble()

    println(calculateAverage(valueA, valueB, valueC))
}
