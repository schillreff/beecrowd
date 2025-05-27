// Make a program that reads five integer values. Count how many   of these
// values are even, odd, positive and negative. Print these information like following example.

// Input
// The input will be 5 integer values.

// Output
// Print a message like the following example with all letters in lowercase,
//  indicating how many of these values ​​are even, odd, positive and negative.

// Input Sample	Output Sample
// -5
// 0
// -3
// -4
// 12

// 3 valor(es) par(es)
// 2 valor(es) impar(es)
// 1 valor(es) positivo(s)
// 3 valor(es) negativo(s)

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int evenCount = 0;
    int oddCount = 0;
    int positiveCount = 0;
    int negativeCount = 0;

    for (int i = 0; i < 5; i++) {
      int number = scanner.nextInt();
      if (number % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }

      if (number > 0) {
        positiveCount++;
      } else if (number < 0) {
        negativeCount++;
      }
    }

    System.out.println(evenCount + " valor(es) par(es)");
    System.out.println(oddCount + " valor(es) impar(es)");
    System.out.println(positiveCount + " valor(es) positivo(s)");
    System.out.println(negativeCount + " valor(es) negativo(s)");

    scanner.close();
  }
}
