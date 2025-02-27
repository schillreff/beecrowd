// Read an integer N that is the number of test cases. Each test case is a line
// containing two integer numbers X and Y. Print the sum of all odd values between them, not including X and Y.

// Input
// The first line of input is an integer N that is the number of test cases
// that follow. Each test case is a line containing two integer X and Y.

// Output
// Print the sum of all odd numbers between X and Y.

// Input Sample	Output Sample
// 7

// 4 5

// 13 10

// 6 4

// 3 3

// 3 5

// 3 4

// 3 8

// 0

// 11

// 5

// 0

// 0

// 0

// 12

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const n = parseInt(lines.shift());

for (let i = 1; i <= n; i++) {
  const [x, y] = lines.shift().split(" ").map(Number);

  const start = Math.min(x, y) + 1;
  const end = Math.max(x, y);

  let sumOdd = 0;

  for (let i = start; i < end; i++) {
    if (i % 2 !== 0) {
      sumOdd += i;
    }
  }
  console.log(sumOdd);
}
