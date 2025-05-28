// Read an integer N, which represents the number of following test cases.
// Each test case consists of three floating-point numbers, each one with
// one digit after the decimal point. Print the weighted average for each
// of these sets of three numbers, considering that the first number has weight 2,
//  the second number has weight 3 and the third number has weight 5.

// Input
// The input file contains an integer number N in the first line. Each
// N following line is a test case with three float-point numbers, each
// one with one digit after the decimal point.

// Output
// For each test case, print the weighted average according with below example.

// Input Sample	Output Sample
// 3
// 6.5 4.3 6.2
// 5.1 4.2 8.1
// 8.0 9.0 10.0

// 5.7
// 6.3
// 9.3

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      double number1 = scanner.nextDouble();
      double number2 = scanner.nextDouble();
      double number3 = scanner.nextDouble();

      double average = (number1 * 2 + number2 * 3 + number3 * 5) / 10.0;

      System.out.println(String.format("%.1f", average));
    }

    scanner.close();
  }
}