// Write an algorithm to read a value A and a value N. Print the sum of N
//  numbers from A (inclusive). While N is negative or ZERO, a new N (only N)
// must be read. All input values are in the same line.

// Input
// The input contains only integer values, ​​can be positive or negative.

// Output
// The output contains only an integer value.

// Input Sample	Output Sample
// 3 2

// 7

// 3 -1 0 -2 2

// 7

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const numbers = (lines.shift() ?? "").split(" ").map(Number);
const a = numbers.shift() ?? 0;
const n = numbers.find((n) => n > 0) ?? 0;

let result = 0;
for (let i = 0; i < n; i++) {
  result += a + i;
}

console.log(result);
