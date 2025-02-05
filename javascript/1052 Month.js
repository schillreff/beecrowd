// Read an integer number between 1 and 12, including. Corresponding to this
// number, you must print the month of the year, in english, with the first letter in uppercase.

// Input
// The input contains only an integer number.

// Output
// Print the name of the month according to the input number, with the first letter in uppercase.

// Input Sample	Output Sample
// 4

// April

let input = require("fs").readFileSync("/dev/stdin", "utf8");
let lines = input.split("\n");

const months = {
  1: "January",
  2: "February",
  3: "March",
  4: "April",
  5: "May",
  6: "June",
  7: "July",
  8: "August",
  9: "September",
  10: "October",
  11: "November",
  12: "December",
};

const month = parseInt(lines.shift());

console.log(months[month]);
