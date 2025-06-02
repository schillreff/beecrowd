// Make a program that prints the sequence like the following exemple.

// Input
// This problem doesn't have input.

// Output
// Print the sequence like the example below.

// Input Sample	Output Sample
// I=1 J=7
// I=1 J=6
// I=1 J=5
// I=3 J=7
// I=3 J=6
// I=3 J=5
// ...
// I=9 J=7
// I=9 J=6
// I=9 J=5

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 9; i += 2) {
      for (int j = 7; j >= 5; j--) {
        System.out.println("I=" + i + " J=" + j);
      }
    }
  }
}