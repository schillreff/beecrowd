// Read an undetermined number of pairs values M and N (stop when any of these
//  values is less or equal to zero). For each pair, print the sequence from the
//  smallest to the biggest (including both) and the sum of consecutive integers between them (including both).

// Input
// The input file contains pairs of integer values M and N. The last line of
// the file contains a number zero or negative, or both.

// Output
// For each pair of numbers, print the sequence from the smallest to the
//  biggest and the sum of these values, as shown below.

// Input Sample	Output Sample
// 5 2
// 6 3
// 5 0

// 2 3 4 5 Sum=14
// 3 4 5 6 Sum=18

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

while (true) {
  const line = lines.shift();
  if (!line) continue;
  const [m, n] = line.split(" ").map(Number);

  if (m <= 0 || n <= 0) {
    break;
  }

  const start = Math.min(m, n);
  const end = Math.max(m, n);

  let sequence = [];
  let sum = 0;

  for (let i = start; i <= end; i++) {
    sequence.push(i);
    sum += i;
  }

  console.log(`${sequence.join(" ")} Sum=${sum}`);
}
