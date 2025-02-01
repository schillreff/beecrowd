// Read three point floating values (A, B and C) and verify if is possible
// to make a triangle with them. If it is possible, calculate the perimeter of the triangle and print the message:

// Perimetro = XX.X

// If it is not possible, calculate the area of the trapezium which basis
// A and B and C as height, and print the message:

// Area = XX.X

// Input
// The input file has tree floating point numbers.

// Output
// Print the result with one digit after the decimal point.

// Input Sample	Output Sample
// 6.0 4.0 2.0

// Area = 10.0

// 6.0 4.0 2.1

// Perimetro = 12.1

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [A, B, C] = lines.shift().split(" ").map(Number);

if (A + B > C && A + C > B && B + C > A) {
  const perimetro = A + B + C;
  console.log(`Perimetro = ${perimetro.toFixed(1)}`);
} else {
  const area = ((A + B) * C) / 2;
  console.log(`Area = ${area.toFixed(1)}`);
}
