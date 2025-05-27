// Read an integer N. This N will be the number of integer numbers X that will be read.

// Print how many these numbers X are in the interval [10,20] and how many values are out of this interval.

// Input
// The first line of input is an integer N (N < 10000), that indicates the total number of test cases.
// Each case is an integer number X (-107 < X < 107).

// Output
// For each test case, print how many numbers are in and how many values are out of the interval.

// Input Sample	Output Sample
// 4
// 14
// 123
// 10
// -25

// 2 in
// 2 out

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int inCount = 0;
    int outCount = 0;

    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt();
      if (x >= 10 && x <= 20) {
        inCount++;
      } else {
        outCount++;
      }
    }

    System.out.println(inCount + " in");
    System.out.println(outCount + " out");

    scanner.close();
  }
}