// Make a program that prints the sequence like the following example.

// Input
// This problem doesn't have input.

// Output
// Print the sequence like the example below.

// Input Sample	Output Sample
// I=0 J=1
// I=0 J=2
// I=0 J=3
// I=0.2 J=1.2
// I=0.2 J=2.2
// I=0.2 J=3.2
// .....
// I=2 J=?
// I=2 J=?
// I=2 J=?

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    double epsilon = 1e-9;

    for (double i = 0.0; i <= 2.0 + epsilon; i += 0.2) {
      for (int j = 1; j <= 3; j++) {
        if (Math.abs(i - Math.round(i)) < epsilon) {
          System.out.println(String.format("I=%.0f J=%.0f", (double) Math.round(i), (double) Math.round(j + i)));
        } else {
          System.out.println(String.format("I=%.1f J=%.1f", i, (j + i)));
        }
      }
    }
  }
}