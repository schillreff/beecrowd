// Read four integer values A, B, C, and D. Next, calculate and show the
// difference between the product of A and B and the product of C and D
// according to the formula: DIFFERENCE = (A * B - C * D).

// Input
// The input file contains 4 integer values.

// Output
// Print the message "DIFERENCA" (DIFFERENCE in Portuguese) in uppercase,
// as shown below, with a space before and after the equals sign.

// Input Example   Output Example
// 5
// 6
// 7
// 8              // DIFERENCA = -26

// 0
// 0
// 7
// 8              // DIFERENCA = -56

// 5
// 6
// -7
// 8              // DIFERENCA = 86

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

// Function to calculate the difference
function calculateDifference(a: number, b: number, c: number, d: number): string {
  const difference = a * b - c * d;
  return `DIFERENCA = ${difference}`;
}

console.log(calculateDifference(Number(lines[0]), Number(lines[1]), Number(lines[2]), Number(lines[3])));