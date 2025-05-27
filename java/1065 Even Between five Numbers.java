// Make a program that reads five integer values. Count how many of these
// values ​​are even and  print this information like the following example.

// Input
// The input will be 5 integer values.

// Output
// Print a message like the following example with all letters in lowercase,
// indicating how many even numbers were typed.

// Input Sample	Output Sample
// 7
// -5
// 6
// -4
// 12

// 3 valores pares

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int evenCount = 0;
    for (int i = 0; i < 5; i++) {
      int value = scanner.nextInt();
      if (value % 2 == 0) {
        evenCount++;
      }
    }

    System.out.println(evenCount + " valores pares");

    scanner.close();
  }
}