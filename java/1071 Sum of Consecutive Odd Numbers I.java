// Read two integer values X and Y. Print the sum of all odd values between them.

// Input
// The input file contain two integer values.

// Output
// The program must print an integer number. This number is the sum off all odd
// values between both input values that must fit in an integer number.

// Sample Input	Sample Output
// 6
// -5

// 5

// 15
// 12

// 13

// 12
// 12

// 0

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int start = Math.min(num1, num2) + 1;
    int end = Math.max(num1, num2);

    int sumOdd = 0;

    for (int i = start; i < end; i++) {
      if (i % 2 != 0) {
        sumOdd += i;
      }
    }

    System.out.println(sumOdd);

    scanner.close();
  }
}
