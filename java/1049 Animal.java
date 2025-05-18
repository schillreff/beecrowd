// In this problem, your job is to read three Portuguese words. These words
// define an animal according to the table below, from left to right. After,
//  print the chosen animal defined by these three words.

// Input
// The input contains 3 words, one by line, that will be used to identify
// the animal, according to the above table, with all letters in lowercase.

// Output
// Print the animal name according to the given input.

// Input Samples	Output Samples
// vertebrado
// mamifero
// onivoro

// homem

// vertebrado
// ave
// carnivoro

// aguia

// invertebrado
// anelideo
// onivoro

// minhoca

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    String characteristic1 = scanner.nextLine();
    String characteristic2 = scanner.nextLine();
    String characteristic3 = scanner.nextLine();

    HashMap<String, HashMap<String, HashMap<String, String>>> animals = new HashMap<>();

    HashMap<String, HashMap<String, String>> vertebrate = new HashMap<>();
    HashMap<String, String> bird = new HashMap<>();
    bird.put("carnivoro", "aguia");
    bird.put("onivoro", "pomba");
    vertebrate.put("ave", bird);
    HashMap<String, String> mammal = new HashMap<>();
    mammal.put("onivoro", "homem");
    mammal.put("herbivoro", "vaca");
    vertebrate.put("mamifero", mammal);
    animals.put("vertebrado", vertebrate);

    HashMap<String, HashMap<String, String>> invertebrate = new HashMap<>();
    HashMap<String, String> insect = new HashMap<>();
    insect.put("hematofago", "pulga");
    insect.put("herbivoro", "lagarta");
    invertebrate.put("inseto", insect);
    HashMap<String, String> annelid = new HashMap<>();
    annelid.put("hematofago", "sanguessuga");
    annelid.put("onivoro", "minhoca");
    invertebrate.put("anelideo", annelid);
    animals.put("invertebrado", invertebrate);

    System.out.println(animals.get(characteristic1).get(characteristic2).get(characteristic3));

    scanner.close();
  }
}