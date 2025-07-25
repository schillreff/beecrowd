// In this problem, your task is to read an array A[100]. At the end, print all 
// array positions that store a number less or equal to 10 and the number stored in that position.

// Input
// The input contains 100 numbers. Each number can be integer, floating-point
// number, positive or negative.

// Output
// For each number of the array that is equal to 10 or less, print "A [i] = x", 
// where i is the position of the array and x is the number stored in the position, with one digit after the decimal point.

// Input Sample	Output Sample
// 0
// -5
// 63
// -8.5
// ...

// A[0] = 0.0
// A[1] = -5.0
// A[3] = -8.5
// ...

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            double num = scanner.nextDouble();
            if (num <= 10) {
                System.out.printf("A[%d] = %.1f%n", i, num);
            }
        }
    }
}