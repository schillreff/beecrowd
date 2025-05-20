// Read an integer number between 1 and 12, including. Corresponding to this
// number, you must print the month of the year, in english, with the first letter in uppercase.

// Input
// The input contains only an integer number.

// Output
// Print the name of the month according to the input number, with the first letter in uppercase.

// Input Sample	Output Sample
// 4

// April

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int monthNumber = scanner.nextInt();

    HashMap<Integer, String> monthsMap = new HashMap<>();
    monthsMap.put(1, "January");
    monthsMap.put(2, "February");
    monthsMap.put(3, "March");
    monthsMap.put(4, "April");
    monthsMap.put(5, "May");
    monthsMap.put(6, "June");
    monthsMap.put(7, "July");
    monthsMap.put(8, "August");
    monthsMap.put(9, "September");
    monthsMap.put(10, "October");
    monthsMap.put(11, "November");
    monthsMap.put(12, "December");

    System.out.println(monthsMap.get(monthNumber));

    scanner.close();
  }
}
