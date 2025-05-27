// Read an integer value X and print the 6 consecutive odd numbers from X,
// a value per line, including X if it is the case.

// Input
// The input will be a positive integer value.

// Output
// The output will be a sequence of six odd numbers.

// Input Sample	Output Sample
// 8

// 9
// 11
// 13
// 15
// 17
// 19

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int startingNumber = scanner.nextInt();

    if (startingNumber % 2 == 0) {
      startingNumber++;
    }

    for (int i = 0; i < 6; i++) {
      System.out.println(startingNumber);
      startingNumber += 2;
    }

    scanner.close();
  }
}