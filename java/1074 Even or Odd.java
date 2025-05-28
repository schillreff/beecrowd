// Read an integer value N. After, read these N values and print a message for
// each value saying if this value is odd, even, positive or negative. In case
//  of zero (0), although the correct description would be "EVEN NULL", because
//  by definition zero is even, your program must print only "NULL", without quotes.

// Input
// The first line of input is an integer N (N < 10000), that indicates the total
//  number of test cases. Each case is a integer number X (-107 < X <107)..

// Output
// For each test case, print a corresponding message, according to the below
// example. All messages must be printed in uppercase letters and always will
// have one space between two words in the same line.

// Input Sample	Output Sample
// 4
// -5
// 0
// 3
// -4

// ODD NEGATIVE
// NULL
// ODD POSITIVE
// EVEN NEGATIVE

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      int x = scanner.nextInt();

      if (x == 0) {
        System.out.println("NULL");
      } else {
        String parity = (x % 2 == 0) ? "EVEN" : "ODD";
        String sign = (x > 0) ? "POSITIVE" : "NEGATIVE";
        System.out.println(parity + " " + sign);
      }
    }

    scanner.close();
  }
}