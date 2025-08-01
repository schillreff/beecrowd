// Write an program to read two scores of a student. Calculate and print the
//  semester average. The program must accept only valid scores (a score must
// fit in the range [0.10]). Each score must be validated separately.

// The program must print a message "novo calculo (1-sim 2-nao)" that means
//  "new calculate (1-yes 2-no)". After, the input will be (1 or 2).
//  1 means a new calculation, 2 means that the execution must be finished.

// Input
// The input file contains several positive or negative floating-point
// (double) values​. After the input of 2 valid scores, an integer number
// X will be read. Your program must stop when X = 2.

// Output
// If an invalid score is read, must be printed the message "nota invalida".
// When two valid scores are read, the message "media = " must be printed
// folowed by the average between these 2 scores. The message "novo calculo
// (1-sim 2-nao)" must be printed after reading X. This message should be
// displayed again if the standard input number for X is less than 1 or
// greater than 2, as example below.

// The output average must be printed with 2 digits after the decimal point.

// Input Sample	Output Sample
// -3.5
// 3.5
// 11.0
// 10.0
// 4
// 1
// 8.0
// 9.0
// 2

// nota invalida
// nota invalida
// media = 6.75
// novo calculo (1-sim 2-nao)
// novo calculo (1-sim 2-nao)
// media = 8.50
// novo calculo (1-sim 2-nao)

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

function main() {
  while (true) {
    let scores: number[] = [];

    while (scores.length < 2) {
      let score = Number(lines.shift());

      if (score >= 0 && score <= 10) {
        scores.push(score);
      } else {
        console.log("nota invalida");
      }
    }

    let average = (scores[0] + scores[1]) / 2;
    console.log(`media = ${average.toFixed(2)}`);

    while (true) {
      console.log("novo calculo (1-sim 2-nao)");
      let choice = lines.shift();

      if (choice === "1") {
        break;
      } else if (choice === "2") {
        return;
      }
    }
  }
}

main();
