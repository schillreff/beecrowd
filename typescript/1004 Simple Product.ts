// Read two integer values. Next, calculate the product between these
// two values and assign this operation to the variable PROD. Then print
// the variable PROD with the corresponding message.

// Input
// The input file contains 2 integer values.

// Output
// Print the message "PROD" and the variable PROD as shown below, with
// a space before and after the equals sign. Do not forget to print a
// new line after the product, otherwise your program will display the
// message: "Presentation Error".

// Input Example   Output Example
// 3
// 9              // PROD = 27

// -30
// 10             // PROD = -300

// 0
// 9              // PROD = 0

import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

console.log(`PROD = ${Number(lines[0]) * Number(lines[1])}`);