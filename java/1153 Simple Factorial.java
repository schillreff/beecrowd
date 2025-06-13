// Read a value N. Calculate and write its corresponding factorial.
// Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.

// Input
// The input contains an integer value N (0 < N < 13).

// Output
// The output contains an integer value corresponding to the factorial of N.

// Input Sample	Output Sample
// 4

// 24

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static long calculateFactorial(int number) {
    long factorialResult = 1;
    for (int i = 1; i <= number; i++) {
      factorialResult *= i;
    }
    return factorialResult;
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    System.out.println(calculateFactorial(inputNumber));
    scanner.close();
  }
}
