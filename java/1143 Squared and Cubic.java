// Write a program that reads an integer N (1 < N < 1000). This N is the number
//  of output lines printed by this program.

// Input
// The input file contains an integer N.

// Output
// Print the output according to the given example.

// Input Sample	Output Sample
// 5

// 1 1 1
// 2 4 8
// 3 9 27
// 4 16 64
// 5 25 125

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      int square = i * i;
      int cube = i * i * i;
      System.out.println(i + " " + square + " " + cube);
    }

    scanner.close();
  }
}