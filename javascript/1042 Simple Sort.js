// Read three integers and sort them in ascending order. After, print these
// values in ascending order, a blank line and then the values in the sequence as they were readed.

// Input
// The input contains three integer numbers.

// Output
// Present the output as requested above.

// Input Sample	Output Sample
// 7 21 -14

// -14
// 7
// 21

// 7
// 21
// -14

// -14 21 7

// -14
// 7
// 21

// -14
// 21
// 7

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const values = lines
  .shift()
  .split(" ")
  .map((value) => parseInt(value));

const ascendingOrder = [...values].sort((a, b) => a - b);

ascendingOrder.forEach((element) => {
  console.log(element);
});
console.log();
values.forEach((element) => {
  console.log(element);
});
