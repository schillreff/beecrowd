// Write an algorithm that reads two floating values (x && y), which should
// represent the coordinates of a point in a plane. Next, determine which quadrant
// the point belongs, or if you are at one of the Cartesian axes or the origin (x = y = 0).

// If the point is at the origin, write the message "Origem".

// If the point is at X axis write "Eixo X", else if the point is at Y axis write "Eixo Y".

// Input
// The input contains the coordinates of a point.

// Output
// The output should display the quadrant in which the point is.

// Input Sample	Output Sample
// 4.5 -2.2

// Q4

// 0.1 0.1

// Q1

// 0.0 0.0

// Origem

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    if (x == 0.0 && y == 0.0) {
      System.out.println("Origem");
    } else if (x == 0.0) {
      System.out.println("Eixo Y");
    } else if (y == 0.0) {
      System.out.println("Eixo X");
    } else if (y > 0.0 && x > 0.0) {
      System.out.println("Q1");
    } else if (y > 0.0 && x < 0.0) {
      System.out.println("Q2");
    } else if (y < 0.0 && x < 0.0) {
      System.out.println("Q3");
    } else {
      System.out.println("Q4");
    }

    scanner.close();
  }
}