// The following sequence of numbers 0 1 1 2 3 5 8 13 21 ... is known as the
// Fibonacci Sequence. Thereafter, each number after the first 2 is equal to
// the sum of the previous two numbers. Write an algorithm that reads an
// integer N (N < 46) and that print the first N numbers of this sequence.

// Input
// The input file contains an integer number N (0 < N < 46).

// Output
// The numbers ​​should be printed on the same line, separated by a blank space.
// There is no space after the last number.

// Thanks to Cássio F.

// Input Sample	Output Sample
// 5

// 0 1 1 2 3

import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

  public static int[] generateFibonacci(int length) {
    if (length <= 0) {
      return new int[0];
    }
    if (length == 1) {
      return new int[] { 0 };
    }

    int[] fibNumbers = new int[length];
    fibNumbers[0] = 0;
    fibNumbers[1] = 1;

    for (int i = 2; i < length; i++) {
      fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
    }

    return fibNumbers;
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int sequenceLength = scanner.nextInt();

    int[] fibNumbers = generateFibonacci(sequenceLength);

    StringJoiner joiner = new StringJoiner(" ");
    for (int number : fibNumbers) {
      joiner.add(String.valueOf(number));
    }
    System.out.println(joiner.toString());

    scanner.close();
  }
}
