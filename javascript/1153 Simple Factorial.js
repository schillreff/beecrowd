// Read a value N. Calculate and write its corresponding factorial.
// Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.

// Input
// The input contains an integer value N (0 < N < 13).

// Output
// The output contains an integer value corresponding to the factorial of N.

// Input Sample	Output Sample
// 4

// 24

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

function factorial(n) {
  let result = 1;
  for (let i = 1; i <= n; i++) {
    result *= i;
  }
  return result;
}

const n = parseInt(lines.shift());
console.log(factorial(n));
