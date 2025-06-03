// Read an undetermined number of pairs of integer values. Write a message for
// each pair indicating if this two numbers are in ascending or descending order.

// Input
// The input file contains several test cases. Each test case contains two
// integer numbers X and Y. The input will finished when X = Y.

// Output
// For each test case print “Crescente”, if the values X and Y are in
//  ascending order, otherwise print “Decrescente”.

// Input Sample	Output Sample
// 5 4
// 7 2
// 3 8
// 2 2

// Decrescente
// Decrescente
// Crescente

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextInt()) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (x == y) {
        break;
      }

      String order = (x > y) ? "Decrescente" : "Crescente";

      System.out.println(order);
    }

    scanner.close();
  }
}