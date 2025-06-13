// Write an algorithm to calculate and write the value of S, S being given by:
// S = 1 + 1/2 + 1/3 + … + 1/100

// Input
// There is no input in this problem.

// Output
// The output contains a value corresponding to the value of S.
// The value should be printed with two digits after the decimal point.

public class Main {

  public static double calculateHarmonicSum() {
    double harmonicSum = 0.0;
    for (int i = 1; i <= 100; i++) {
      harmonicSum += 1.0 / i;
    }
    return harmonicSum;
  }

  public static void main(String[] args) {
    double sumValue = calculateHarmonicSum();
    System.out.println(String.format("%.2f", sumValue));
  }
}
