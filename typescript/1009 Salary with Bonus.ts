// Write a program that reads a seller's name, their fixed salary, and the
// total sales they made during the month (in money). Knowing that this seller
// earns 15% commission on their sales, calculate the total amount they will
// receive at the end of the month, with two decimal places.

// Input
// The input file contains a text (the seller's first name) and 2 floating-point
// values (double precision) with two decimal places, representing the seller's
// fixed salary and the total sales they made, respectively.

// Output
// Print the total amount the seller will receive, as shown in the example.

// Input Example   Output Example
// JOAO
// 500.00
// 1230.30        // TOTAL = R$ 684.54

// PEDRO
// 700.00
// 0.00           // TOTAL = R$ 700.00

// MANGOJATA
// 1700.00
// 1230.50        // TOTAL = R$ 1884.58

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [name, salary, totalSales] = lines;
const totalAmount = parseFloat(salary) + parseFloat(totalSales) * 0.15;
console.log(`TOTAL = R$ ${totalAmount.toFixed(2)}`);