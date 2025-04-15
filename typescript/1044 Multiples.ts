// Read two integer values (A and B). After, the program should print the
//  message "Sao Multiplos" (are multiples) or "Nao sao Multiplos"
// (aren’t multiples), corresponding to the read values.

// Input
// The input has two integer numbers.

// Output
// Print the relative message to the input as stated above.

// Input Sample	Output Sample
// 6 24

// Sao Multiplos

// 6 25

// Nao sao Multiplos

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let [A, B] = (lines.shift() ?? "").split(" ").map(Number);

if (A > B) {
  [A, B] = [B, A];
}
B % A === 0 ? console.log("Sao Multiplos") : console.log("Nao sao Multiplos");
