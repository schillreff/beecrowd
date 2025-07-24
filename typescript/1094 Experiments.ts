// Maria has just started as graduate student in a medical school and she's
// needing your help to organize a laboratory experiment which she is responsible
// about. She wants to know, at the end of the year, how many animals were used
//  in this laboratory and the percentage of each type of animal is used at all.

// This laboratory uses in particular three types of animals: frogs, rats and
//  rabbits. To obtain this information, it knows exactly the number of
//  experiments that were performed, the type and quantity of each animal is used in each experiment.

// Input
// The first line of input contains an integer N indicating the number of
//  test cases that follows. Each test case contains an integer Amount
// (1 ≤ Amount ≤ 15) which represents the amount of animal used and a character
//  Type ('C', 'R' or 'S'), indicating the type of animal:
// - C: Coelho (rabbit in portuguese)
// - R: Rato (rat  in portuguese)
// - S: Sapo (frog in portuguese)

// Output
// Print the total of animals used, the total of each type of animal and the
// percentual of each one in relation of the total of animals used. The
//  percentual must be printed with 2 digits after the decimal point.

// Input Sample	Output Sample
// 10
// 10 C
// 6 R
// 15 S
// 5 C
// 14 R
// 9 C
// 6 R
// 8 S
// 5 C
// 14 R

// Total: 92 cobaias
// Total de coelhos: 29
// Total de ratos: 40
// Total de sapos: 23
// Percentual de coelhos: 31.52 %
// Percentual de ratos: 43.48 %
// Percentual de sapos: 25.00 %

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const n = Number(lines.shift());

let totalAnimals = 0;
let totalRabbits = 0;
let totalRats = 0;
let totalFrogs = 0;

for (let i = 1; i <= n; i++) {
  const line = lines.shift();
  if (!line) continue;
  const [amount, type] = line.split(" ");
  const amountInt = Number(amount);

  totalAnimals += amountInt;

  if (type === "C") {
    totalRabbits += amountInt;
  } else if (type === "R") {
    totalRats += amountInt;
  } else if (type === "S") {
    totalFrogs += amountInt;
  }
}

const percentRabbits = (totalRabbits / totalAnimals) * 100;
const percentRats = (totalRats / totalAnimals) * 100;
const percentFrogs = (totalFrogs / totalAnimals) * 100;

console.log(`Total: ${totalAnimals} cobaias`);
console.log(`Total de coelhos: ${totalRabbits}`);
console.log(`Total de ratos: ${totalRats}`);
console.log(`Total de sapos: ${totalFrogs}`);
console.log(`Percentual de coelhos: ${percentRabbits.toFixed(2)} %`);
console.log(`Percentual de ratos: ${percentRats.toFixed(2)} %`);
console.log(`Percentual de sapos: ${percentFrogs.toFixed(2)} %`);
