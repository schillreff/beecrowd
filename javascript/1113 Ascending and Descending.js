// Read an undetermined number of pairs of integer values. Write a message for
// each pair indicating if this two numbers are in ascending or descending order.

// Input
// The input file contains several test cases. Each test case contains two
// integer numbers X and Y. The input will finished when X = Y.

// Output
// For each test case print “Crescente”, if the values X and Y are in
//  ascending order, otherwise print “Decrescente”.

// Input Sample	Output Sample
// 5 4
// 7 2
// 3 8
// 2 2

// Decrescente
// Decrescente
// Crescente

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

while (true) {
  const [x, y] = lines.shift().split(" ").map(Number);

  if (x === y) {
    break;
  }

  const order = x > y ? "Decrescente" : "Crescente";

  console.log(order);
}
