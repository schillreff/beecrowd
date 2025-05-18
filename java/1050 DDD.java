// Read an integer number that is the code number for phone dialing. Then,
// print the destination according to the following table:

// If the input number isn’t found in the above table, the output must be:
// DDD nao cadastrado
// That means “DDD not found” in Portuguese language.

// Input
// The input consists in a unique integer number.

// Output
// Print the city name corresponding to the input DDD. Print DDD nao cadastrado
//  if doesn't exist corresponding DDD to the typed number.

// Input Sample	Output Sample
// 11

// Sao Paulo

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int dddCode = scanner.nextInt();

        HashMap<Integer, String> dddMap = new HashMap<>();
        dddMap.put(61, "Brasilia");
        dddMap.put(71, "Salvador");
        dddMap.put(11, "Sao Paulo");
        dddMap.put(21, "Rio de Janeiro");
        dddMap.put(32, "Juiz de Fora");
        dddMap.put(19, "Campinas");
        dddMap.put(27, "Vitoria");
        dddMap.put(31, "Belo Horizonte");

        String city = dddMap.get(dddCode);

        if (city != null) {
            System.out.println(city);
        } else {
            System.out.println("DDD nao cadastrado");
        }

        scanner.close();
    }
}
