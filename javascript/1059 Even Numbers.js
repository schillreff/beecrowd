// Write a program that prints all even numbers between 1 and 100, including them if it is the case.

// Input
// In this extremely simple problem there is no input.

// Output
// Print all even numbers between 1 and 100, including them, one by row.

// Input Sample	Output Sample
// 2
// 4
// 6
// ...
// 100

// let input = require('fs').readFileSync('/dev/stdin', 'utf8');
// let lines = input.split('\n');

for (let i = 2; i <= 100; i += 2) {
  console.log(i);
}
