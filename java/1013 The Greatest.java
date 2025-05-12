// Faça um programa que leia três valores e apresente o maior dos três valores
// lidos seguido da mensagem “eh o maior”.
// Utilize a fórmula:

// Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
//  Um segundo passo, portanto é necessário para chegar no resultado esperado.

// Entrada
// O arquivo de entrada contém três valores inteiros.

// Saída
// Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

// Exemplos de Entrada	Exemplos de Saída
// 7 14 106             // 106 eh o maior

// 217 14 6             // 217 eh o maior

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = Math.max(a, Math.max(b, c));

        System.out.println(maior + " eh o maior");

        scanner.close();
    }
}