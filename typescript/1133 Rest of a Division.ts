// Write a program that reads two integer numbers X and Y. Print all numbers
//  between X and Y which dividing it by 5 the rest is equal to 2 or equal to 3.

// Input
// The input file contains 2 any positive integers, not necessarily in ascending order.

// Output
// Print all numbers according to above description, always in ascending order.

// Input Sample	Output Sample
// 10
// 18

// 12
// 13
// 17

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let [x, y] = lines.map(Number);

if (x > y) {
  [x, y] = [y, x];
}

for (let number = x + 1; number < y; number++) {
  if (number % 5 === 2 || number % 5 === 3) {
    console.log(number);
  }
}
