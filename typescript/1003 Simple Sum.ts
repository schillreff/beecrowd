// Read two integer values, for variables A and B. Next, calculate the sum
// between them and assign it to the variable SOMA. Then print the value
// of this variable.

// Input
// The input file contains 2 integer values.

// Output
// Print the message "SOMA" in uppercase, with a space before and after
// the equals sign, followed by the corresponding value of A + B. As with
// all problems, do not forget to print a new line after the result,
// otherwise you will receive a "Presentation Error".

// Input Example   Output Example
// 30
// 10             // SOMA = 40

// -30
// 10             // SOMA = -20

// 0
// 0              // SOMA = 0

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

console.log(`SOMA = ${Number(lines[0]) + Number(lines[1])}`);