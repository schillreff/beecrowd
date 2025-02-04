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

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [word1, word2, word3] = lines;

const animals = {
  vertebrado: {
    ave: {
      carnivoro: "aguia",
      onivoro: "pomba",
    },
    mamifero: {
      onivoro: "homem",
      herbivoro: "vaca",
    },
  },
  invertebrado: {
    inseto: {
      hematofago: "pulga",
      herbivoro: "lagarta",
    },
    anelideo: {
      hematofago: "sanguessuga",
      onivoro: "minhoca",
    },
  },
};

console.log(animals[word1][word2][word3]);
