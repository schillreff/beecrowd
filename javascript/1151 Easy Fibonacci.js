// The following sequence of numbers 0 1 1 2 3 5 8 13 21 ... is known as the
// Fibonacci Sequence. Thereafter, each number after the first 2 is equal to
// the sum of the previous two numbers. Write an algorithm that reads an
// integer N (N < 46) and that print the first N numbers of this sequence.

// Input
// The input file contains an integer number N (0 < N < 46).

// Output
// The numbers ​​should be printed on the same line, separated by a blank space.
// There is no space after the last number.

// Thanks to Cássio F.

// Input Sample	Output Sample
// 5

// 0 1 1 2 3

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

function fibonacciSequence(n) {
  if (n === 1) return [0];
  if (n === 2) return [0, 1];

  let fibSeq = [0, 1];
  for (let i = 2; i < n; i++) {
    let nextNumber = fibSeq[i - 1] + fibSeq[i - 2];
    fibSeq.push(nextNumber);
  }

  return fibSeq;
}

const n = parseInt(lines.shift());
const fibSequence = fibonacciSequence(n);
console.log(fibSequence.join(" "));
