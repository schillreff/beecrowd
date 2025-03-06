// Write a program that reads two integer numbers X and Y and calculate the
// sum of all number not divisible by 13 between them, including both.

// Input
// The input file contains 2 integer numbers X and Y without any order.

// Output
// Print the sum of all numbers between X and Y not divisible by 13, including
// them if it is the case.

// Input Sample	Output Sample
// 100
// 200

// 13954

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let [x, y] = lines.map(Number);

if (x > y) {
  [x, y] = [y, x];
}

let totalSum = 0;

for (let number = x; number <= y; number++) {
  if (number % 13 !== 0) {
    totalSum += number;
  }
}

console.log(totalSum);
