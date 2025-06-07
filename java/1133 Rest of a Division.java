// Write a program that reads two integer numbers X and Y. Print all numbers
//  between X and Y which dividing it by 5 the rest is equal to 2 or equal to 3.

// Input
// The input file contains 2 any positive integers, not necessarily in ascending order.

// Output
// Print all numbers according to above description, always in ascending order.

// Input Sample	Output Sample
// 10
// 18

// 12
// 13
// 17

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

    for (int number = x + 1; number < y; number++) {
      if (number % 5 == 2 || number % 5 == 3) {
        System.out.println(number);
      }
    }

    scanner.close();
  }
}