// Escreva um programa que leia três valores com ponto flutuante de dupla
// precisão: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

// Entrada
// O arquivo de entrada contém três valores com um dígito após o ponto decimal.

// Saída
// O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde
// a uma das áreas descritas acima, sempre com mensagem correspondente e um
//  espaço entre os dois pontos e o valor. O valor calculado deve ser
// apresentado com 3 dígitos após o ponto decimal.

// Exemplos de Entrada	Exemplos de Saída
// 3.0 4.0 5.2

// TRIANGULO: 7.800
// CIRCULO: 84.949
// TRAPEZIO: 18.200
// QUADRADO: 16.000
// RETANGULO: 12.000

// 12.7 10.4 15.2

// TRIANGULO: 96.520
// CIRCULO: 725.833
// TRAPEZIO: 175.560
// QUADRADO: 108.160
// RETANGULO: 132.080

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        final double PI = 3.14159;

        double areaTriangulo = (A * C) / 2.0;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));

        scanner.close();
    }
}
