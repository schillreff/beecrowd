// Read a value of floating point with two decimal places. This represents a
// monetary value. After this, calculate the smallest possible number of notes
// and coins on which the value can be decomposed. The considered notes are of
//  100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05
// and 0.01. Print the message “NOTAS:” followed by the list of notes and the
// message “MOEDAS:” followed by the list of coins.

// Input
// The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

// Output
// Print the minimum quantity of banknotes and coins necessary to change the
// initial value, as the given example.

// Input Sample	Output Sample
// 576.73

// NOTAS:
// 5 nota(s) de R$ 100.00
// 1 nota(s) de R$ 50.00
// 1 nota(s) de R$ 20.00
// 0 nota(s) de R$ 10.00
// 1 nota(s) de R$ 5.00
// 0 nota(s) de R$ 2.00
// MOEDAS:
// 1 moeda(s) de R$ 1.00
// 1 moeda(s) de R$ 0.50
// 0 moeda(s) de R$ 0.25
// 2 moeda(s) de R$ 0.10
// 0 moeda(s) de R$ 0.05
// 3 moeda(s) de R$ 0.01

// 4.00

// NOTAS:
// 0 nota(s) de R$ 100.00
// 0 nota(s) de R$ 50.00
// 0 nota(s) de R$ 20.00
// 0 nota(s) de R$ 10.00
// 0 nota(s) de R$ 5.00
// 2 nota(s) de R$ 2.00
// MOEDAS:
// 0 moeda(s) de R$ 1.00
// 0 moeda(s) de R$ 0.50
// 0 moeda(s) de R$ 0.25
// 0 moeda(s) de R$ 0.10
// 0 moeda(s) de R$ 0.05
// 0 moeda(s) de R$ 0.01

// 91.01

// NOTAS:
// 0 nota(s) de R$ 100.00
// 1 nota(s) de R$ 50.00
// 2 nota(s) de R$ 20.00
// 0 nota(s) de R$ 10.00
// 0 nota(s) de R$ 5.00
// 0 nota(s) de R$ 2.00
// MOEDAS:
// 1 moeda(s) de R$ 1.00
// 0 moeda(s) de R$ 0.50
// 0 moeda(s) de R$ 0.25
// 0 moeda(s) de R$ 0.10
// 0 moeda(s) de R$ 0.05
// 1 moeda(s) de R$ 0.01

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const notes = [100, 50, 20, 10, 5, 2];
const coins = [50, 25, 10, 5, 1];

let [reais, cents] = lines[0].split(".").map((value) => parseInt(value));

console.log("NOTAS:");
notes.forEach((note) => {
  console.log(
    `${Math.floor(reais / note).toFixed(0)} nota(s) de R$ ${note.toFixed(2)}`
  );
  reais %= note;
});

console.log("MOEDAS:");
console.log(`${reais} moeda(s) de R$ 1.00`);
coins.forEach((coin) => {
  console.log(
    `${Math.floor(cents / coin).toFixed(0)} moeda(s) de R$ ${(
      coin / 100
    ).toFixed(2)}`
  );
  cents %= coin;
});
