// Write a program that reads a number N. This N is the size of a array X[N]. 
// Next, read each of the numbers of X, find the smallest element of this array 
// and its position within the array, printing this information.

// Input
// The first line of input contains one integer N (1 < N <1000), indicating the
//  number of elements that should be read to an array X[N] of integer numbers. 
// The second row contains each of the N values, separated by a space. Remember
//  that no input will have repeated numbers.

// Output
// The first line displays the message “Menor valor:” followed by a space and
//  the lowest number read in the input. The second line displays the message 
// “Posicao:” followed by a space and the array position in which the lowest 
// number is, remembering that the array starts at the zero position.

// Input Sample	Output Sample
// 10
// 1 2 3 4 -5 6 7 8 9 10

// Menor valor: -5
// Posicao: 4

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // Verifica a condição 1 < N < 1000
        if (N > 1 && N < 1000) {

            int[] arrayX = new int[N];

            // Leitura dos N números inteiros para o array
            for (int i = 0; i < N; i++) {
                arrayX[i] = scanner.nextInt();
            }

            int minValue = arrayX[0];
            int position = 0;

            // Encontra o menor valor e sua posição
            for (int i = 1; i < N; i++) {
                if (arrayX[i] < minValue) {
                    minValue = arrayX[i];
                    position = i;
                }
            }

            System.out.println("Menor valor: " + minValue);
            System.out.println("Posicao: " + position);
        }

        scanner.close();
    }
}