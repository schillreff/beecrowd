// Read an integer N. Print all numbers between 1 and 10000, which divided by N will give the rest = 2.

// Input
// The input is an integer N (N < 10000)

// Output
// Print all numbers between 1 and 10000, which divided by n will give the rest = 2, one per line.

// Input Sample	Output Sample
// 13

// 2
// 15
// 28
// 41
// ...

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int divisor = scanner.nextInt();

    for (int i = 1; i < 10000; i++) {
      if (i % divisor == 2) {
        System.out.println(i);
      }
    }

    scanner.close();
  }
}