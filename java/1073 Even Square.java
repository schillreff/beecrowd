// Read an integer N. Print the square of each one of the even values
// from 1 to N including N if it is the case.

// Input
// The input contains an integer N (5 < N < 2000).

// Output
// Print the square of each one of the even values from 1 to N, as the given example.

// Be carefull! Some language automaticly print 1e+006 instead 1000000.
// Please configure your program to print the correct format setting the output precision.

// Input Sample	Output Sample
// 6

// 2^2 = 4
// 4^2 = 16
// 6^2 = 36

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int limit = scanner.nextInt();

    for (int i = 2; i <= limit; i += 2) {
      int square = i * i;
      System.out.println(i + "^2 = " + square);
    }

    scanner.close();
  }
}
