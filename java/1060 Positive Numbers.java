// Write a program that reads 6 numbers. These numbers will only be positive or
//  negative (disregard null values). Print the total number of positive numbers.

// Input
// Six numbers, positive and/or negative.

// Output
// Print a message with the total number of positive numbers.

// Input Sample	Output Sample
// 7
// -5
// 6
// -3.4
// 4.6
// 12

// 4 valores positivos

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int positiveCount = 0;

    while (scanner.hasNextDouble()) {
      double number = scanner.nextDouble();
      if (number > 0) {
        positiveCount++;
      }
    }

    System.out.println(positiveCount + " valores positivos");

    scanner.close();
  }
}
