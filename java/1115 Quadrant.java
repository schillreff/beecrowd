// Write a program to read the coordinates (X, Y) of an indeterminate number of
// points in Cartesian system. For each point write the quadrant to which it belongs.
//  The program finish when at least one of two coordinates is NULL
//  (in this situation without writing any message).

// Input
// The input contains several tests cases. Each test case contains two integer numbers.

// Output
// For each test case, print the corresponding quadrant which these
// coordinates belong, as in the example.

// Input Sample	Output Sample
// 2 2
// 3 -2
// -8 -1
// -7 1
// 0 2

// primeiro
// quarto
// terceiro
// segundo

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextInt()) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (x == 0 || y == 0) {
        break;
      }

      if (x > 0 && y > 0) {
        System.out.println("primeiro");
      } else if (x < 0 && y > 0) {
        System.out.println("segundo");
      } else if (x < 0 && y < 0) {
        System.out.println("terceiro");
      } else if (x > 0 && y < 0) {
        System.out.println("quarto");
      }
    }

    scanner.close();
  }
}
