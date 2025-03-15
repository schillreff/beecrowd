// Read two floating-point values of double precision A and B, corresponding
// to 2 grades of a student. Next, calculate the student's average, knowing
// that grade A has a weight of 3.5 and grade B has a weight of 7.5 (the sum
// of the weights is therefore 11). Assume that each grade can range from 0
// to 10.0, always with one decimal place.

// Input
// The input file contains 2 values, each with one decimal place.

// Output
// Print the message "MEDIA" and the student's average as shown below, with
// 5 digits after the decimal point and a space before and after the equals
// sign. Use double precision variables. As with all problems, do not forget
// to print a new line after the result, otherwise you will receive a
// "Presentation Error".

// Input Example   Output Example
// 5.0
// 7.1            // MEDIA = 6.43182

// 0.0
// 7.1            // MEDIA = 4.84091

// 10.0
// 10.0           // MEDIA = 10.00000

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

// Function to calculate the average
function calculateAverage(a: number, b: number): string {
  const average = (a * 3.5 + b * 7.5) / 11;
  return `MEDIA = ${average.toFixed(5)}`;
}

console.log(calculateAverage(Number(lines[0]), Number(lines[1])));