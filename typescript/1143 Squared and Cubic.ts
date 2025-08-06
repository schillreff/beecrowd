// Write a program that reads an integer N (1 < N < 1000). This N is the number
//  of output lines printed by this program.

// Input
// The input file contains an integer N.

// Output
// Print the output according to the given example.

// Input Sample	Output Sample
// 5

// 1 1 1
// 2 4 8
// 3 9 27
// 4 16 64
// 5 25 125

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const n = Number(lines.shift());

for (let i = 1; i <= n; i++) {
  console.log(`${i} ${i ** 2} ${i ** 3}`);
}
