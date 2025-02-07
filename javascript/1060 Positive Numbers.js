// Write a program that reads 6 numbers. These numbers will only be positive or
//  negative (disregard null values). Print the total number of positive numbers.

// Input
// Six numbers, positive and/or negative.

// Output
// Print a message with the total number of positive numbers.

// Input Sample	Output Sample
// 7
// -5
// 6
// -3.4
// 4.6
// 12

// 4 valores positivos

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const result = lines.map(Number).reduce((count, num) => {
  return num > 0 ? count + 1 : count;
}, 0);
console.log(`${result} valores positivos`);
