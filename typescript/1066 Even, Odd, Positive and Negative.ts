// Make a program that reads five integer values. Count how many   of these
// values are even, odd, positive and negative. Print these information like following example.

// Input
// The input will be 5 integer values.

// Output
// Print a message like the following example with all letters in lowercase,
//  indicating how many of these values ​​are even, odd, positive and negative.

// Input Sample	Output Sample
// -5
// 0
// -3
// -4
// 12

// 3 valor(es) par(es)
// 2 valor(es) impar(es)
// 1 valor(es) positivo(s)
// 3 valor(es) negativo(s)

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let evenCount = 0,
  oddCount = 0,
  positiveCount = 0,
  negativeCount = 0;

for (let i = 0; i < 5; i++) {
  let num = parseInt(lines.shift() || "");
  if (num % 2 === 0) {
    evenCount++;
  } else {
    oddCount++;
  }

  if (num > 0) {
    positiveCount++;
  } else if (num < 0) {
    negativeCount++;
  }
}

console.log(`${evenCount} valor(es) par(es)`);
console.log(`${oddCount} valor(es) impar(es)`);
console.log(`${positiveCount} valor(es) positivo(s)`);
console.log(`${negativeCount} valor(es) negativo(s)`);
