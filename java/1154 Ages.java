// Write an algorithm to read an undeterminated number of data, each containing
// an individual's age. The final data, which will not enter in the calculations,
//  contains the value of a negative age. Calculate and print the average age of
// this group of individuals.

// Input
// The input contains an undetermined number of integers. The input will be
// stop when a negative value is read.

// Output
// The output contains a value corresponding to the average age of individuals.

// The average should be printed with two digits after the decimal point.

// Input Sample	Output Sample
// 34
// 56
// 44
// 23
// -2

// 39.25

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double totalSum = 0;
    int numberOfAges = 0;

    while (scanner.hasNextInt()) {
      int currentAge = scanner.nextInt();

      if (currentAge < 0) {
        break;
      }

      totalSum += currentAge;
      numberOfAges++;
    }

    if (numberOfAges == 0) {
      System.out.println(String.format("%.2f", 0.0));
    } else {
      double average = totalSum / numberOfAges;
      System.out.println(String.format("%.2f", average));
    }

    scanner.close();
  }
}
