// Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from
//  1 to X, each one in a line, including X if is the case.

// Input
// The input will be an integer value.

// Output
// Print all odd values between 1 and X, including X if is the case.

// Input Sample	Output Sample
// 8

// 1
// 3
// 5
// 7

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const x = Number(lines.shift());

for (let num = 1; num <= x; num++) {
  if (num % 2 !== 0) {
    console.log(num);
  }
}
