// Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from
//  1 to X, each one in a line, including X if is the case.

// Input
// The input will be an integer value.

// Output
// Print all odd values between 1 and X, including X if is the case.

// Input Sample	Output Sample
// 8

// 1
// 3
// 5
// 7

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int limit = scanner.nextInt();

    for (int number = 1; number <= limit; number++) {
      if (number % 2 != 0) {
        System.out.println(number);
      }
    }

    scanner.close();
  }
}
