// Read an integer N that is the number of test cases that follows. Each test
// case contains two integers X and Y. Print one output line for each test case
//  that is the sum of Y odd numbers from X including it if is the case. For example:
// for the input 4 5, the output must be 45, that is: 5 + 7 + 9 + 11 + 13
// for the input 7 4, the output must be 40, that is: 7 + 9 + 11 + 13

// Input
// The first line of the input is an integer N that is the number of test cases
//  that follow. Each test case is a line containing two integer X and Y.

// Output
// Print the sum of all consecutive odd numbers from X.

// Input Sample	Output Sample
// 2
// 4 3
// 11 2

// 21
// 24

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int numberOfTestCases = scanner.nextInt();

    for (int i = 0; i < numberOfTestCases; i++) {
      int firstNumber = scanner.nextInt();
      int termsToSum = scanner.nextInt();

      if (firstNumber % 2 == 0) {
        firstNumber++;
      }

      int currentSum = 0;
      for (int j = 0; j < termsToSum; j++) {
        currentSum += firstNumber;
        firstNumber += 2;
      }
      System.out.println(currentSum);
    }

    scanner.close();
  }
}