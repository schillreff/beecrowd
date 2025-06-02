// Make a program that prints the sequence like the following example.

// Input
// This problem doesn't have input.

// Output
// Print the sequence like the example below.

// Input Sample	Output Sample
// I=1 J=60
// I=4 J=55
// I=7 J=50
// ...
// I=? J=0

public class Main {

  public static void main(String[] args) {
    int iValue = 1;
    int jValue = 60;

    while (jValue >= 0) {
      System.out.println("I=" + iValue + " J=" + jValue);
      iValue += 3;
      jValue -= 5;
    }
  }
}