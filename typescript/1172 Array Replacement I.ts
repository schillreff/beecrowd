// Read an array X[10]. After, replace every null or negative number of X ​by 1.
//  Print all numbers stored in the array X.

// Input
// The input contains 10 integer numbers. These numbers ​​can be positive or negative.

// Output
// For each position of the array, print "X [i] = x", where i is the position of 
// the array and x is the number stored in that position.

// Input Sample	Output Sample
// 0
// -5
// 63
// 0
// ...

// X[0] = 1
// X[1] = 1
// X[2] = 63
// X[3] = 1
// ...

import * as fs from 'fs';

const input = fs.readFileSync("/dev/stdin", "utf8");
const lines = input.split("\n");

for (let i = 0; i < 10; i++) {
    let x = parseInt(lines.shift() || "0");
    if (x <= 0) {
        x = 1;
    }
    console.log(`X[${i}] = ${x}`);
}