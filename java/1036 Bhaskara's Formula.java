// Read 3 floating-point numbers. After, print the roots of bhaskara’s formula.
// If it's impossible to calculate the roots because a division by zero or a
// square root of a negative number, presents the message “Impossivel calcular”.

// Input
// Read 3 floating-point numbers (double) A, B and C.

// Output
// Print the result with 5 digits after the decimal point or the message
//  if it is impossible to calculate.

// Input Samples	Output Samples
// 10.0 20.1 5.1

// R1 = -0.29788
// R2 = -1.71212

// 0.0 20.0 5.0

// Impossivel calcular

// 10.3 203.0 5.0

// R1 = -0.02466
// R2 = -19.68408

// 10.0 3.0 5.0

// Impossivel calcular

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double A = scanner.nextDouble();
    double B = scanner.nextDouble();
    double C = scanner.nextDouble();

    double delta = B * B - 4 * A * C;

    if (A != 0 && delta >= 0) {
      double root1 = (-B + Math.sqrt(delta)) / (2 * A);
      double root2 = (-B - Math.sqrt(delta)) / (2 * A);
      System.out.println(String.format("R1 = %.5f", root1));
      System.out.println(String.format("R2 = %.5f", root2));
    } else {
      System.out.println("Impossivel calcular");
    }

    scanner.close();
  }
}
