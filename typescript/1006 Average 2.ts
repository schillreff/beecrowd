// Read 3 values, for variables A, B, and C, which are the three grades of
// a student. Next, calculate the student's average, knowing that grade A
// has a weight of 2, grade B has a weight of 3, and grade C has a weight
// of 5. Assume that each grade can range from 0 to 10.0, always with one
// decimal place.

// Input
// The input file contains 3 values, each with one decimal place, of double
// precision (double).

// Output
// Print the message "MEDIA" and the student's average as shown below, with
// 1 digit after the decimal point and a space before and after the equals
// sign. As with all problems, do not forget to print a new line after the
// result, otherwise you will receive a "Presentation Error".

// Input Example   Output Example
// 5.0
// 6.0
// 7.0            // MEDIA = 6.3

// 5.0
// 10.0
// 10.0           // MEDIA = 9.0

// 10.0
// 10.0
// 5.0            // MEDIA = 7.5

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

// Function to calculate the average
function calculateAverage(a: number, b: number, c: number): string {
  const average = (a * 2 + b * 3 + c * 5) / 10;
  return `MEDIA = ${average.toFixed(1)}`;
}

console.log(calculateAverage(Number(lines[0]), Number(lines[1]), Number(lines[2])));