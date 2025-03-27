// Read an integer N and compute all its divisors.

// Input
// The input file contains an integer value.

// Output
// Write all positive divisors of N, one value per line.

// Input Sample	Output Sample
// 6

// 1
// 2
// 3
// 6

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

function computeDivisors(n) {
  let divisors = [];
  for (let i = 1; i <= n; i++) {
    if (n % i === 0) {
      divisors.push(i);
    }
  }
  return divisors;
}

const n = parseInt(lines.shift());
const divisors = computeDivisors(n);
divisors.forEach((divisor) => console.log(divisor));
 