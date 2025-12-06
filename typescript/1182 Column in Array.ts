// Your job in this problem is to read a number that is a column of an array where an operation 
// will be performed, an uppercase character, indicating the operation to be performed and all 
// elements of a bidimentional array M[12][12]. Then, you have to calculate and print the sum or
//  average of all elements within the green area according to the case. The following figure 
// illustrates the case when is entered the number 5 to the array column, showing all elements 
// that must be considered in the operation.




// Input
// The first line of the input contains a simple integer C (0 ≤ C ≤ 11) indicating the column
//  to be considered in the operation. The second line of the input contains a single uppercase
//  character T ('S' or 'M'), indicating the operation Sum or Average (Média in portuguese) 
// to be performed with the elements of the array. Follow 144 floating-point numbers of the array.

// Output
// Print the calculated result (sum or average), with one digit after the decimal point.

// Input Sample	Output Sample
// 5
// S
// 1.0
// -3.5
// 2.5
// 4.1
// ...

// 12.6

import * as fs from 'fs';

const input: string = fs.readFileSync("/dev/stdin", "utf8");
let lines: string[] = input.split("\n");

let C: number = parseInt(lines.shift() as string);
let T: string = (lines.shift() as string).trim();

let total: number = 0.0;

for (let i: number = 0; i < 12; i++) {
    for (let j: number = 0; j < 12; j++) {
        let value: number = parseFloat(lines.shift() as string);

        if (j === C) {
            total += value;
        }
    }
}

if (T === "M") {
    total /= 12.0;
}

console.log(total.toFixed(1));