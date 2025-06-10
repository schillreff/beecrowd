// Write an algorithm to read a value A and a value N. Print the sum of N
//  numbers from A (inclusive). While N is negative or ZERO, a new N (only N)
// must be read. All input values are in the same line.

// Input
// The input contains only integer values, ​​can be positive or negative.

// Output
// The output contains only an integer value.

// Input Sample	Output Sample
// 3 2

// 7

// 3 -1 0 -2 2

// 7

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    String line = scanner.nextLine();
    String[] tokens = line.split(" ");

    int a = Integer.parseInt(tokens[0]);
    int n = 0;

    for (int i = 1; i < tokens.length; i++) {
      int currentNum = Integer.parseInt(tokens[i]);
      if (currentNum > 0) {
        n = currentNum;
        break;
      }
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
      result += a + i;
    }

    System.out.println(result);

    scanner.close();
  }
}
