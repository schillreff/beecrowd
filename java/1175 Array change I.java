// Write a program that reads an array N [20]. After, change the first element 
// by the last, the second element by the last but one, etc.., Up to change the
//  10th to the 11th. print the modified array.

// Input
// The input contains 20 integer numbers, positive or negative.

// Output
// For each position of the array N print "N[i] = Y", where i is the array position 
// and Y is the number stored in that position.

// Input Sample	Output Sample
// 0
// -5
// ...
// 63
// 230

// N[0] = 230
// N[1] = 63
// ...
// N[18] = -5
// N[19] = 0

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arrayN = new int[20];

        for (int i = 0; i < 20; i++) {
            arrayN[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int temp = arrayN[i];
            arrayN[i] = arrayN[19 - i];
            arrayN[19 - i] = temp;
        }

        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d%n", i, arrayN[i]);
        }

        scanner.close();
    }
}