// Read an integer N and compute all its divisors.

// Input
// The input file contains an integer value.

// Output
// Write all positive divisors of N, one value per line.

// Input Sample	Output Sample
// 6

// 1
// 2
// 3
// 6

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void printDivisors(int number) {
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    printDivisors(inputNumber);
    scanner.close();
  }
}
