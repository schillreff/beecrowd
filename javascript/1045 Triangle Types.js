// Read 3 double numbers (A, B and C) representing the sides of a triangle and
//  arrange them in decreasing order, so that the side A is the biggest of the
// three sides. Next, determine the type of triangle that they can make, based
// on the following cases always writing an appropriate message:

// if A ≥ B + C, write the message: NAO FORMA TRIANGULO
// if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
// if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
// if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
// if the three sides are the same size, write the message: TRIANGULO EQUILATERO
// if only two sides are the same and the third one is different,
//  write the message: TRIANGULO ISOSCELES
// Input
// The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

// Output
// Print all the classifications of the triangle presented in the input.

// Input Samples	Output Samples
// 7.0 5.0 7.0

// TRIANGULO ACUTANGULO
// TRIANGULO ISOSCELES

// 6.0 6.0 10.0

// TRIANGULO OBTUSANGULO
// TRIANGULO ISOSCELES

// 6.0 6.0 6.0

// TRIANGULO ACUTANGULO
// TRIANGULO EQUILATERO

// 5.0 7.0 2.0

// NAO FORMA TRIANGULO

// 6.0 8.0 10.0

// TRIANGULO RETANGULO

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [a, b, c] = lines
  .shift()
  .split(" ")
  .map(Number)
  .sort((x, y) => y - x);

if (a >= b + c) {
  console.log("NAO FORMA TRIANGULO");
} else {
  if (a ** 2 === b ** 2 + c ** 2) {
    console.log("TRIANGULO RETANGULO");
  }
  if (a ** 2 > b ** 2 + c ** 2) {
    console.log("TRIANGULO OBTUSANGULO");
  }
  if (a ** 2 < b ** 2 + c ** 2) {
    console.log("TRIANGULO ACUTANGULO");
  }
  if (a === b && b === c) {
    console.log("TRIANGULO EQUILATERO");
  } else if (a === b || b === c || a === c) {
    console.log("TRIANGULO ISOSCELES");
  }
}
