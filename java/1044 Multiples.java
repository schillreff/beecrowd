// Read two integer values (A and B). After, the program should print the
//  message "Sao Multiplos" (are multiples) or "Nao sao Multiplos"
// (aren’t multiples), corresponding to the read values.

// Input
// The input has two integer numbers.

// Output
// Print the relative message to the input as stated above.

// Input Sample	Output Sample
// 6 24

// Sao Multiplos

// 6 25

// Nao sao Multiplos

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    if (A > B) {
      int temp = A;
      A = B;
      B = temp;
    }

    if (B % A == 0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }

    scanner.close();
  }
}
