// Make a program that reads five integer values. Count how many of these
// values ​​are even and  print this information like the following example.

// Input
// The input will be 5 integer values.

// Output
// Print a message like the following example with all letters in lowercase,
// indicating how many even numbers were typed.

// Input Sample	Output Sample
// 7
// -5
// 6
// -4
// 12

// 3 valores pares

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let evenCount = 0;
for (let i = 0; i < 5; i++) {
  let value = parseInt(lines.shift());
  if (value % 2 === 0) {
    evenCount++;
  }
}
console.log(`${evenCount} valores pares`);
