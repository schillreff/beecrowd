// Write a program that read two numbers X and Y and print the result of dividing
// the X by Y. If it's not possible, print the message "divisao impossivel".

// Input
// The input contains an integer number N. This N is the quantity of pairs of
//  integer numbers X and Y read (dividend and divisor).

// Output
// For each test case print the result of this division with one digit after
//  the decimal point, or “divisao impossivel” if it isn't possible to perform the calculation.

// Obs.: Be carefull. The division between two integers in some languages
//  generates another integer. Use cast:)

// Input Sample	Output Sample
// 3
// 3 -2
// -8 0
// 0 8

// -1.5
// divisao impossivel
// 0.0

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      double x = scanner.nextDouble();
      double y = scanner.nextDouble();

      if (y == 0) {
        System.out.println("divisao impossivel");
      } else {
        System.out.println(String.format("%.1f", (x / y)));
      }
    }

    scanner.close();
  }
}
