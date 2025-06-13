// A Prime Number is a number that is divisible only by 1 (one) and by itself.
//  For example the number 7 is Prime, because it can be divided only by 1 and by 7.

// Input
// The input contains several test cases. The first contains the number of test
//  cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer
//  X (1 < X ≤ 107), that can be or not a prime number.

// Output
// For each test case print the message “X eh primo” (X is prime) or “X nao eh 
// primo” (X isn't prime) according with to above specification.

// Input Sample	Output Sample
// 3
// 8
// 51
// 7

// 8 nao eh primo
// 51 nao eh primo
// 7 eh primo

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x == 2) {
                System.out.println(x + " eh primo");
                continue;
            }
            if (x % 2 == 0 || x < 2) {
                System.out.println(x + " nao eh primo");
                continue;
            }

            boolean isPrime = true;
            int sqrtX = (int) Math.sqrt(x);
            for (int j = 3; j <= sqrtX; j += 2) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(x + (isPrime ? " eh primo" : " nao eh primo"));
        }

        scanner.close();
    }
}