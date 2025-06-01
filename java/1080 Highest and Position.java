// Read 100 integer numbers. Print the highest read value and the input position.

// Input
// The input file contains 100 distinct positive integer numbers.

// Output
// Print the highest number read and the input position of this value, according to the given example.

// Input Sample	Output Sample
// 2
// 113
// 45
// 34565
// 6
// ...
// 8

// 34565
// 4

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int maxValue = -1;
    int maxPosition = -1;

    for (int i = 1; i <= 100; i++) {
      int number = scanner.nextInt();

      if (number > maxValue) {
        maxValue = number;
        maxPosition = i;
      }
    }

    System.out.println(maxValue);
    System.out.println(maxPosition);

    scanner.close();
  }
}
