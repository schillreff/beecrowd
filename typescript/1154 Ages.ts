// Write an algorithm to read an undeterminated number of data, each containing
// an individual's age. The final data, which will not enter in the calculations,
//  contains the value of a negative age. Calculate and print the average age of
// this group of individuals.

// Input
// The input contains an undetermined number of integers. The input will be
// stop when a negative value is read.

// Output
// The output contains a value corresponding to the average age of individuals.

// The average should be printed with two digits after the decimal point.

// Input Sample	Output Sample
// 34
// 56
// 44
// 23
// -2

// 39.25

import * as fs from "fs";

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let ages: number[] = [];
while (true) {
  let age = Number(lines.shift());
  if (age < 0) {
    break;
  }
  ages.push(age);
}

if (ages.length === 0) {
  console.log(0);
}

let total = ages.reduce((acc, age) => acc + age, 0);
let average = total / ages.length;
console.log(average.toFixed(2));
