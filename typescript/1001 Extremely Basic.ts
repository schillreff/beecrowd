// Read 2 integer values and store them in variables A and B. 
// Perform the sum of A and B, assigning the result to variable X.
// Print X as shown below. Do not print any additional messages
// beyond what is specified, and remember to print a new line after
// the result, otherwise you will receive a "Presentation Error".

// Input
// The input contains 2 integer values.

// Output
// Print the message "X = " (uppercase X) followed by the value of X
// and a new line. Ensure there is a space before and after the equals sign,
// as shown in the example below.

// Input Example   Output Example
// 10
// 9              // X = 19

// -10
// 4              // X = -6

// 15
// -7             // X = 8
import * as fs from 'fs';

let input = fs.readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

console.log(`X = ${Number(lines[0]) + Number(lines[1])}`);