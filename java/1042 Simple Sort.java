// Read three integers and sort them in ascending order. After, print these
// values in ascending order, a blank line and then the values in the sequence as they were readed.

// Input
// The input contains three integer numbers.

// Output
// Present the output as requested above.

// Input Sample	Output Sample
// 7 21 -14

// -14
// 7
// 21

// 7
// 21
// -14

// -14 21 7

// -14
// 7
// 21

// -14
// 21
// 7

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int[] values = { a, b, c };
    int[] sortedValues = Arrays.copyOf(values, values.length);
    Arrays.sort(sortedValues);

    System.out.println(sortedValues[0]);
    System.out.println(sortedValues[1]);
    System.out.println(sortedValues[2]);

    System.out.println();

    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2]);

    scanner.close();
  }
}
