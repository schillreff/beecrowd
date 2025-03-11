// Write a program that reads an integer N. N * 2 lines must be printed by this
//  program according to the example below. For numbers with more than 6 digits,
//  all digits must be printed (no cientific notation allowed).

// Input
// The input file contains an integer N (1 < N < 1000).

// Output
// Print the output according to the given example.

// Input Sample	Output Sample
// 5

// 1 1 1
// 1 2 2
// 2 4 8
// 2 5 9
// 3 9 27
// 3 10 28
// 4 16 64
// 4 17 65
// 5 25 125
// 5 26 126

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const n = parseInt(lines.shift());

for (let i = 1; i <= n; i++) {
  console.log(`${i} ${i ** 2} ${i ** 3}`);
  console.log(`${i} ${i ** 2 + 1} ${i ** 3 + 1}`);
}
