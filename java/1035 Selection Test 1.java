// Read 4 integer values A, B, C and D. Then if B is greater than C
// and D is greater than A and if the sum of C and D is greater
// than the sum of A and B and if C and D were positives values and if A is even,
// write the message “Valores aceitos” (Accepted values). Otherwise, write the
// message “Valores nao aceitos” (Values not accepted).

// Input
// Four integer numbers A, B, C and D.

// Output
// Show the corresponding message after the validation of the values​​.

// Input Sample	Output Sample
// 5 6 7 8

// Valores nao aceitos

// 2 3 2 6

// Valores aceitos

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();

    if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
      System.out.println("Valores aceitos");
    } else {
      System.out.println("Valores nao aceitos");
    }

    scanner.close();
  }
}