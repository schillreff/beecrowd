// Read two integer values X and Y. Print the sum of all odd values between them.

// Input
// The input file contain two integer values.

// Output
// The program must print an integer number. This number is the sum off all odd
// values between both input values that must fit in an integer number.

// Sample Input	Sample Output
// 6
// -5

// 5

// 15
// 12

// 13

// 12
// 12

// 0

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let [x, y] = input.split("\n").map(Number);

const start = Math.min(x, y) + 1;
const end = Math.max(x, y);

let sumOdd = 0;

for (let i = start; i < end; i++) {
  if (i % 2 !== 0) {
    sumOdd += i;
  }
}

console.log(sumOdd);
