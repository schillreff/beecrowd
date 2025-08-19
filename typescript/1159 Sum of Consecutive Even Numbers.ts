// The program must read an integer X indefinite times (stop when X=0). For
// each X, print the sum of five consecutive even numbers from X, including it
//  if X is even. If the input number is 4, for example, the output must be 40,
// that is the result of the operation: 4+6+8+10+12. If the input number is 11,
// for example, the output must be 80, that is the result of 12+14+16+18+20.

// Input
// The input file contains many integer numbers. The last one is zero.

// Output
// Print the output according to the example below.

// Input Sample	Output Sample
// 4
// 11
// 0

// 40
// 80

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

while (true) {
  let x = Number(lines.shift());
  if (x === 0) {
    break;
  }

  if (x % 2 !== 0) {
    x++;
  }

  let total = 0;
  for (let j = 0; j < 5; j++) {
    total += x;
    x += 2;
  }

  console.log(total);
}
