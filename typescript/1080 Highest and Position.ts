// Read 100 integer numbers. Print the highest read value and the input position.

// Input
// The input file contains 100 distinct positive integer numbers.

// Output
// Print the highest number read and the input position of this value, according to the given example.

// Input Sample	Output Sample
// 2
// 113
// 45
// 34565
// 6
// ...
// 8

// 34565
// 4

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let maxValue = -1;
let maxPosition = -1;

for (let i = 1; i <= 100; i++) {
  let num = Number(lines.shift());

  if (num > maxValue) {
    maxValue = num;
    maxPosition = i;
  }
}

console.log(maxValue);
console.log(maxPosition);
