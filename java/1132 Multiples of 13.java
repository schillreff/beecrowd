// Write a program that reads two integer numbers X and Y and calculate the
// sum of all number not divisible by 13 between them, including both.

// Input
// The input file contains 2 integer numbers X and Y without any order.

// Output
// Print the sum of all numbers between X and Y not divisible by 13, including
// them if it is the case.

// Input Sample	Output Sample
// 100
// 200

// 13954

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();
    int y = scanner.nextInt();

    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }

    int totalSum = 0;

    for (int number = x; number <= y; number++) {
      if (number % 13 != 0) {
        totalSum += number;
      }
    }

    System.out.println(totalSum);

    scanner.close();
  }
}
