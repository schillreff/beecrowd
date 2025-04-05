// In mathematics, a perfect number is an integer for which the sum of all its own
//  positive divisors (excluding itself) is equal to the number itself. For example
//  the number 6 is perfect, because 1+2+3 is equal to 6. Your task is to write a
//  program that read integer numbers and print a message informing if these numbers
//  are perfect or are not perfect.

// Input
// The input contains several test cases. The first contains the number of test 
// cases N (1 ≤ N ≤ 100). Each one of the following N lines contains an integer
//  X (1 ≤ X ≤ 108), that can be or not a perfect number.

// Output
// For each test case print the message “X eh perfeito” (X is perfect) or “X nao
//  eh perfeito” (X isn't perfect) according with to above specification.

// Input Sample	Output Sample
// 3
// 6
// 5
// 28

// 6 eh perfeito
// 5 nao eh perfeito
// 28 eh perfeito

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

let n = parseInt(lines[0]);
for (let i = 1; i <= n; i++) {
    let x = parseInt(lines[i]);
    if (x === 1) {
        console.log(`${x} nao eh perfeito`);
        continue;
    }
    let sumDivisors = 1;
    let sqrtX = Math.floor(Math.sqrt(x));
    for (let j = 2; j <= sqrtX; j++) {
        if (x % j === 0) {
            sumDivisors += j;
            let counterpart = x / j;
            if (counterpart !== j) {
                sumDivisors += counterpart;
            }
        }
    }
    if (sumDivisors === x) {
        console.log(`${x} eh perfeito`);
    } else {
        console.log(`${x} nao eh perfeito`);
    }
}