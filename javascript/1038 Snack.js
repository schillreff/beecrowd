// Using the following table, write a program that reads a code and the amount
// of an item. After, print the value to pay. This is a very simple program with
//  the only intention of practice of selection commands.

// Input
// The input file contains two integer numbers X and Y. X is the product code
// and Y is the quantity of this item according to the above table.

// Output
// The output must be a message "Total: R$ " followed by the total value to be
//  paid, with 2 digits after the decimal point.

// Input Sample	Output Sample
// 3 2

// Total: R$ 10.00

// 4 3

// Total: R$ 6.00

// 2 3

// Total: R$ 13.50

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [x, y] = lines[0].split(" ").map((value) => parseInt(value));

const price = [4.0, 4.5, 5.0, 2.0, 1.5];

const total = price[x - 1] * y;

console.log(`Total: R$ ${total.toFixed(2)}`);