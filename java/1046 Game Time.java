// Read the start time and end time of a game, in hours. Then calculate the
// duration of the game, knowing that the game can begin in a day and finish
// in another day, with a maximum duration of 24 hours. The message must be
// printed in portuguese “O JOGO DUROU X HORA(S)” that means “THE GAME LASTED X HOUR(S)”

// Input
// Two integer numbers representing the start and end time of a game.

// Output
// Print the duration of the game as in the sample output.

// Input Sample	Output Sample
// 16 2

// O JOGO DUROU 10 HORA(S)

// 0 0

// O JOGO DUROU 24 HORA(S)

// 2 16

// O JOGO DUROU 14 HORA(S)

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int startTime = scanner.nextInt();
    int endTime = scanner.nextInt();

    int duration;

    if (startTime == endTime) {
      duration = 24;
    } else if (startTime > endTime) {
      duration = 24 - startTime + endTime;
    } else {
      duration = endTime - startTime;
    }

    System.out.println("O JOGO DUROU " + duration + " HORA(S)");

    scanner.close();
  }
}