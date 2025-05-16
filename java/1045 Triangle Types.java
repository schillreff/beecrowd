// Read 3 double numbers (A, B and C) representing the sides of a triangle and
//  arrange them in decreasing order, so that the side A is the biggest of the
// three sides. Next, determine the type of triangle that they can make, based
// on the following cases always writing an appropriate message:

// if A ≥ B + C, write the message: NAO FORMA TRIANGULO
// if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
// if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
// if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
// if the three sides are the same size, write the message: TRIANGULO EQUILATERO
// if only two sides are the same and the third one is different,
//  write the message: TRIANGULO ISOSCELES
// Input
// The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

// Output
// Print all the classifications of the triangle presented in the input.

// Input Samples	Output Samples
// 7.0 5.0 7.0

// TRIANGULO ACUTANGULO
// TRIANGULO ISOSCELES

// 6.0 6.0 10.0

// TRIANGULO OBTUSANGULO
// TRIANGULO ISOSCELES

// 6.0 6.0 6.0

// TRIANGULO ACUTANGULO
// TRIANGULO EQUILATERO

// 5.0 7.0 2.0

// NAO FORMA TRIANGULO

// 6.0 8.0 10.0

// TRIANGULO RETANGULO

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double side1 = scanner.nextDouble();
    double side2 = scanner.nextDouble();
    double side3 = scanner.nextDouble();

    double[] sides = { side1, side2, side3 };
    Arrays.sort(sides);

    double c = sides[0];
    double b = sides[1];
    double a = sides[2];

    double epsilon = 1e-9;

    if (a >= b + c) {
      System.out.println("NAO FORMA TRIANGULO");
    } else {
      if (Math.abs(a * a - (b * b + c * c)) < epsilon) {
        System.out.println("TRIANGULO RETANGULO");
      }
      if (a * a > b * b + c * c + epsilon) {
        System.out.println("TRIANGULO OBTUSANGULO");
      }
      if (a * a < b * b + c * c - epsilon) {
        System.out.println("TRIANGULO ACUTANGULO");
      }

      if (Math.abs(a - b) < epsilon && Math.abs(b - c) < epsilon) {
        System.out.println("TRIANGULO EQUILATERO");
      } else if (Math.abs(a - b) < epsilon || Math.abs(b - c) < epsilon || Math.abs(a - c) < epsilon) {
        System.out.println("TRIANGULO ISOSCELES");
      }
    }

    scanner.close();
  }
}
