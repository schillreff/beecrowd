// Write a program that reads an employee's number, their number of hours worked,
// the amount they receive per hour, and calculates that employee's salary.
// Next, print the employee's number and salary, with two decimal places.

// Input
// The input file contains 2 integer numbers and 1 floating-point number,
// representing the employee's number, the number of hours worked, and the
// amount they receive per hour, respectively.

// Output
// Print the employee's number and salary, as shown in the example, with a
// space before and after the equals sign. For the salary, there must also
// be a space after the $.

// Input Example   Output Example
// 25
// 100
// 5.50           // NUMBER = 25
//                // SALARY = U$ 550.00

// 1
// 200
// 20.50          // NUMBER = 1
//                // SALARY = U$ 4100.00

// 6
// 145
// 15.55          // NUMBER = 6
//                // SALARY = U$ 2254.75

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const [number, hours, valuePerHour] = lines;
console.log(`NUMBER = ${number}`);
console.log(`SALARY = U$ ${(Number(hours) * Number(valuePerHour)).toFixed(2)}`);