// Write a program that reads two scores of a student. Calculate and print
// the average of these scores. Your program must accept just valid scores
//  [0..10]. Each score must be validated separately.

// Input
// The input file contains many floating-point numbers​​, positive or negative.
// The program execution will be finished after the input of two valid scores.

// Output
// When an invalid score is read, you should print the message "nota invalida".
// After the input of two valid scores, the message "media = " must be printed
// followed by the average of the student. The average must be printed with 2 numbers after the decimal point.

// Input Sample	Output Sample
// -3.5
// 3.5
// 11.0
// 10.0

// nota invalida
// nota invalida
// media = 6.75

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    List<Double> validScores = new ArrayList<>();

    while (validScores.size() < 2) {
      double score = scanner.nextDouble();

      if (score >= 0 && score <= 10) {
        validScores.add(score);
      } else {
        System.out.println("nota invalida");
      }
    }

    double average = (validScores.get(0) + validScores.get(1)) / 2.0;
    System.out.println(String.format("media = %.2f", average));

    scanner.close();
  }
}
