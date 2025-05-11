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

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static int calcularDiferenca(int a, int b, int c, int d) {
    return a * b - c * d;
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int valorA = scanner.nextInt();
    int valorB = scanner.nextInt();
    int valorC = scanner.nextInt();
    int valorD = scanner.nextInt();

    int diferenca = calcularDiferenca(valorA, valorB, valorC, valorD);

    System.out.println("DIFERENCA = " + diferenca);

    scanner.close();
  }
}
