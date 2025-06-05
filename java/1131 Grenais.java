// The Federação Gaúcha de Futebol invited you to write a program to present a
// statistical result of several GRENAIS. Write a program that read the number
// of goals scored by Inter and the number of goals scored by Gremio in a GRENAL.
// Write the message "Novo grenal (1-sim 2-nao)" and request a response.
// If the answer is 1, two new numbers must be read (another input case) asking
//  the number of goals scored by the teams in a new departure, otherwise the
// program must be finished, printing:

// - How many GRENAIS were part of the statistics.
// - The number of victories of Inter.
// - The number of victories of Gremio.
// - The number of Draws.
// - A message indicating the team that won the largest number of GRENAIS
//  (or the message: "Não houve vencedor" if both team won the same quantity of GRENAIS).

// Input
// The input contains two integer values​​, corresponding to the goals scored by
// both teams. Then there is an integer (1 or 2), corresponding to the repetition of the algorithm.

// Output
// After each reading of the goals it must be printed the message "Novo grenal
// (1-sim 2-nao)". When the program is finished, the program must print the statistics as the example below.

// Input Sample	Output Sample
// 3 2
// 1
// 2 3
// 1
// 3 1
// 2

// Novo grenal (1-sim 2-nao)
// Novo grenal (1-sim 2-nao)
// Novo grenal (1-sim 2-nao)
// 3 grenais
// Inter:2
// Gremio:1
// Empates:0
// Inter venceu mais

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int matches = 0;
    int interWins = 0;
    int gremioWins = 0;
    int draws = 0;

    while (true) {
      int interGoals = scanner.nextInt();
      int gremioGoals = scanner.nextInt();

      matches++;

      if (interGoals > gremioGoals) {
        interWins++;
      } else if (gremioGoals > interGoals) {
        gremioWins++;
      } else {
        draws++;
      }

      System.out.println("Novo grenal (1-sim 2-nao)");
      int response = scanner.nextInt();

      if (response == 2) {
        break;
      }
    }

    System.out.println(matches + " grenais");
    System.out.println("Inter:" + interWins);
    System.out.println("Gremio:" + gremioWins);
    System.out.println("Empates:" + draws);

    if (interWins > gremioWins) {
      System.out.println("Inter venceu mais");
    } else if (gremioWins > interWins) {
      System.out.println("Gremio venceu mais");
    } else {
      System.out.println("Não houve vencedor");
    }

    scanner.close();
  }
}