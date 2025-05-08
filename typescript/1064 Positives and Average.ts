// Read 6 values that can be floating point numbers. After, print how many of
//  them were positive. In the next line, print the average of all positive
// values typed, with one digit after the decimal point.

// Input
// The input consist in 6 numbers that can be integer or floating point values.
// At least one number will be positive.

// Output
// The first output value is the amount of positive numbers. The next line
// should show the average of the positive values ​typed.

// Input Sample	Output Sample
// 7
// -5
// 6
// -3.4
// 4.6
// 12

// 4 valores positivos
// 7.4

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let positiveNumbers = lines.map(Number).filter((num) => num > 0);

let positiveCount = positiveNumbers.length;

let positiveAverage =
  positiveNumbers.reduce((sum, num) => sum + num, 0) / positiveCount;

console.log(`${positiveCount} valores positivos`);
console.log(positiveAverage.toFixed(1));
