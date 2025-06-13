// Write an algorithm to calculate and write the value of S, S being given by:
// S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

// Input
// There is no input in this problem.

// Output
// The output contains a value corresponding to the value of S.
// The value should be printed with two digits after the decimal point.

public class Main {

  public static double calculateSeriesSum() {
    double currentNumerator = 1.0;
    double currentDenominator = 1.0;
    double seriesSum = 0.0;

    while (currentNumerator <= 39.0) {
      seriesSum += currentNumerator / currentDenominator;
      currentNumerator += 2.0;
      currentDenominator *= 2.0;
    }
    return seriesSum;
  }

  public static void main(String[] args) {
    double sumValue = calculateSeriesSum();
    System.out.println(String.format("%.2f", sumValue));
  }
}
