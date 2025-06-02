// Maria has just started as graduate student in a medical school and she's
// needing your help to organize a laboratory experiment which she is responsible
// about. She wants to know, at the end of the year, how many animals were used
//  in this laboratory and the percentage of each type of animal is used at all.

// This laboratory uses in particular three types of animals: frogs, rats and
//  rabbits. To obtain this information, it knows exactly the number of
//  experiments that were performed, the type and quantity of each animal is used in each experiment.

// Input
// The first line of input contains an integer N indicating the number of
//  test cases that follows. Each test case contains an integer Amount
// (1 ≤ Amount ≤ 15) which represents the amount of animal used and a character
//  Type ('C', 'R' or 'S'), indicating the type of animal:
// - C: Coelho (rabbit in portuguese)
// - R: Rato (rat  in portuguese)
// - S: Sapo (frog in portuguese)

// Output
// Print the total of animals used, the total of each type of animal and the
// percentual of each one in relation of the total of animals used. The
//  percentual must be printed with 2 digits after the decimal point.

// Input Sample	Output Sample
// 10
// 10 C
// 6 R
// 15 S
// 5 C
// 14 R
// 9 C
// 6 R
// 8 S
// 5 C
// 14 R

// Total: 92 cobaias
// Total de coelhos: 29
// Total de ratos: 40
// Total de sapos: 23
// Percentual de coelhos: 31.52 %
// Percentual de ratos: 43.48 %
// Percentual de sapos: 25.00 %

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int totalAnimals = 0;
    int totalRabbits = 0;
    int totalRats = 0;
    int totalFrogs = 0;

    for (int i = 0; i < n; i++) {
      int amount = scanner.nextInt();
      String type = scanner.next();

      totalAnimals += amount;

      if (type.equals("C")) {
        totalRabbits += amount;
      } else if (type.equals("R")) {
        totalRats += amount;
      } else if (type.equals("S")) {
        totalFrogs += amount;
      }
    }

    System.out.println(String.format("Total: %d cobaias", totalAnimals));
    System.out.println(String.format("Total de coelhos: %d", totalRabbits));
    System.out.println(String.format("Total de ratos: %d", totalRats));
    System.out.println(String.format("Total de sapos: %d", totalFrogs));

    double percentRabbits = (totalAnimals == 0) ? 0.0 : (double) totalRabbits / totalAnimals * 100.0;
    double percentRats = (totalAnimals == 0) ? 0.0 : (double) totalRats / totalAnimals * 100.0;
    double percentFrogs = (totalAnimals == 0) ? 0.0 : (double) totalFrogs / totalAnimals * 100.0;

    System.out.println(String.format("Percentual de coelhos: %.2f %%", percentRabbits));
    System.out.println(String.format("Percentual de ratos: %.2f %%", percentRats));
    System.out.println(String.format("Percentual de sapos: %.2f %%", percentFrogs));

    scanner.close();
  }
}