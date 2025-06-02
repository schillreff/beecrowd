// Read an integer N that is the number of test cases. Each test case is a line
// containing two integer numbers X and Y. Print the sum of all odd values between them, not including X and Y.

// Input
// The first line of input is an integer N that is the number of test cases
// that follow. Each test case is a line containing two integer X and Y.

// Output
// Print the sum of all odd numbers between X and Y.

// Input Sample	Output Sample
// 7

// 4 5

// 13 10

// 6 4

// 3 3

// 3 5

// 3 4

// 3 8

// 0

// 11

// 5

// 0

// 0

// 0

// 12

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int k = 0; k < n; k++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      int start = Math.min(x, y) + 1;
      int end = Math.max(x, y);

      int sumOdd = 0;

      for (int i = start; i < end; i++) {
        if (i % 2 != 0) {
          sumOdd += i;
        }
      }
      System.out.println(sumOdd);
    }

    scanner.close();
  }
}