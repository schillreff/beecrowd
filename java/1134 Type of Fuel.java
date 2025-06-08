// A gas station wants to determine which of their products is the preference
// of their customers. Write a program to read the type of fuel supplied
// (coded as follows: 1. Alcohol 2. Gasoline 3. Diesel 4. End). If you enter
//  an invalid code (outside the range of 1 to 4) a new code must be requested.
// The program will end when the inserted code is the number 4.

// Input
// The input contains only integer and positive values.

// Output
// It should be written the message: "MUITO OBRIGADO" and the amount of
// customers who fueled each fuel type, as an example.

// Input Sample	Output Sample
// 8
// 1
// 7
// 2
// 2
// 4

// MUITO OBRIGADO
// Alcool: 1
// Gasolina: 2
// Diesel: 0

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int alcoholCount = 0;
    int gasolineCount = 0;
    int dieselCount = 0;

    while (true) {
      int code = scanner.nextInt();

      if (code == 1) {
        alcoholCount++;
      } else if (code == 2) {
        gasolineCount++;
      } else if (code == 3) {
        dieselCount++;
      } else if (code == 4) {
        break;
      }
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcoholCount);
    System.out.println("Gasolina: " + gasolineCount);
    System.out.println("Diesel: " + dieselCount);

    scanner.close();
  }
}