// Read 6 values that can be floating point numbers. After, print how many of
//  them were positive. In the next line, print the average of all positive
// values typed, with one digit after the decimal point.

// Input
// The input consist in 6 numbers that can be integer or floating point values.
// At least one number will be positive.

// Output
// The first output value is the amount of positive numbers. The next line
// should show the average of the positive values ​typed.

// Input Sample	Output Sample
// 7
// -5
// 6
// -3.4
// 4.6
// 12

// 4 valores positivos
// 7.4

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int positiveCount = 0;
    double positiveSum = 0.0;

    for (int i = 0; i < 6; i++) {
      double number = scanner.nextDouble();
      if (number > 0) {
        positiveCount++;
        positiveSum += number;
      }
    }

    System.out.println(positiveCount + " valores positivos");

    if (positiveCount > 0) {
      double positiveAverage = positiveSum / positiveCount;
      System.out.println(String.format("%.1f", positiveAverage));
    }

    scanner.close();
  }
}
