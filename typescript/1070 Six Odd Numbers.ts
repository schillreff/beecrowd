// Read an integer value X and print the 6 consecutive odd numbers from X,
// a value per line, including X if it is the case.

// Input
// The input will be a positive integer value.

// Output
// The output will be a sequence of six odd numbers.

// Input Sample	Output Sample
// 8

// 9
// 11
// 13
// 15
// 17
// 19

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let x = Number(lines.shift());

if (x % 2 === 0) {
  x += 1;
}

for (let num = 1; num <= 6; num++) {
  console.log(x);
  x += 2;
}
