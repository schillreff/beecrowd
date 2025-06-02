// Read an undetermined number of pairs values M and N (stop when any of these
//  values is less or equal to zero). For each pair, print the sequence from the
//  smallest to the biggest (including both) and the sum of consecutive integers between them (including both).

// Input
// The input file contains pairs of integer values M and N. The last line of
// the file contains a number zero or negative, or both.

// Output
// For each pair of numbers, print the sequence from the smallest to the
//  biggest and the sum of these values, as shown below.

// Input Sample	Output Sample
// 5 2
// 6 3
// 5 0

// 2 3 4 5 Sum=14
// 3 4 5 6 Sum=18

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextInt()) {
      int m = scanner.nextInt();
      int n = scanner.nextInt();

      if (m <= 0 || n <= 0) {
        break;
      }

      int start = Math.min(m, n);
      int end = Math.max(m, n);

      StringBuilder sequenceBuilder = new StringBuilder();
      int sum = 0;

      for (int i = start; i <= end; i++) {
        sequenceBuilder.append(i);
        sum += i;
        if (i < end) {
          sequenceBuilder.append(" ");
        }
      }

      System.out.println(sequenceBuilder.toString() + " Sum=" + sum);
    }

    scanner.close();
  }
}