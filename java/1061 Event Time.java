// Peter is organizing an event in his University. The event will be in April
// month, beginning and finishing within April month. The problem is: Peter
// wants to calculate the event duration in seconds, knowing obviously the
// begin and the end time of the event.

// You know that the event can take from few seconds to some days, so, you
// must help Peter to compute the total time corresponding to duration of the event.

// Input
// The first line of the input contains information about the beginning day
// of the event in the format: “Dia xx”. The next line contains the start
// time of the event in the format presented in the sample input. Follow
// 2 input lines with same format, corresponding to the end of the event.

// Output
// Your program must print the following output, one information by line,
// considering that if any information is null for example, the number 0
// must be printed in place of W, X, Y or Z:

// W dia(s)
// X hora(s)
// Y minuto(s)
// Z segundo(s)

// Obs: Consider that the event of the test case have the minimum duration
// of one minute. “dia” means day, “hora” means hour, “minuto” means minute
// and “Segundo” means second in Portuguese.

// Input Sample	Output Sample
// Dia 5
// 08 : 12 : 23
// Dia 9
// 06 : 13 : 23

// 3 dia(s)
// 22 hora(s)
// 1 minuto(s)
// 0 segundo(s)

import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static long toTotalSeconds(int day, int hour, int minute, int second) {
    return day * 86400L + hour * 3600L + minute * 60L + second;
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    scanner.next();
    int startDay = scanner.nextInt();
    int startHour = scanner.nextInt();
    scanner.next();
    int startMinute = scanner.nextInt();
    scanner.next();
    int startSecond = scanner.nextInt();

    scanner.next();
    int endDay = scanner.nextInt();
    int endHour = scanner.nextInt();
    scanner.next();
    int endMinute = scanner.nextInt();
    scanner.next();
    int endSecond = scanner.nextInt();

    long startTotalSeconds = toTotalSeconds(startDay, startHour, startMinute, startSecond);
    long endTotalSeconds = toTotalSeconds(endDay, endHour, endMinute, endSecond);

    long durationSeconds = endTotalSeconds - startTotalSeconds;

    long days = durationSeconds / 86400L;
    durationSeconds %= 86400L;
    long hours = durationSeconds / 3600L;
    durationSeconds %= 3600L;
    long minutes = durationSeconds / 60L;
    long seconds = durationSeconds % 60L;

    System.out.println(days + " dia(s)");
    System.out.println(hours + " hora(s)");
    System.out.println(minutes + " minuto(s)");
    System.out.println(seconds + " segundo(s)");

    scanner.close();
  }
}
