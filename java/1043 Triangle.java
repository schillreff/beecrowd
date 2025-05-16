// Read three point floating values (A, B and C) and verify if is possible
// to make a triangle with them. If it is possible, calculate the perimeter of the triangle and print the message:

// Perimetro = XX.X

// If it is not possible, calculate the area of the trapezium which basis
// A and B and C as height, and print the message:

// Area = XX.X

// Input
// The input file has tree floating point numbers.

// Output
// Print the result with one digit after the decimal point.

// Input Sample	Output Sample
// 6.0 4.0 2.0

// Area = 10.0

// 6.0 4.0 2.1

// Perimetro = 12.1

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double A = scanner.nextDouble();
    double B = scanner.nextDouble();
    double C = scanner.nextDouble();

    if (A + B > C && A + C > B && B + C > A) {
      double perimetro = A + B + C;
      System.out.println(String.format("Perimetro = %.1f", perimetro));
    } else {
      double area = ((A + B) * C) / 2.0;
      System.out.println(String.format("Area = %.1f", area));
    }

    scanner.close();
  }
}
